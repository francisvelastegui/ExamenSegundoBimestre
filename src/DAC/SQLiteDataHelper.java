package DAC;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class SQLiteDataHelper {
    
    Connection vvCn;

    private static final String VVCONFIG_FILE = "config.properties";
    private static final String VVPROP_DB_DRIVER = "db.driver";
    private static final String VVPROP_DB_URL = "db.url";
    private static final String VVPROP_DB_USERNAME = "db.username";
    private static final String VVPROP_DB_PASSWORD = "db.password";

    static {
        try {
            Class.forName(getProperty(VVPROP_DB_DRIVER));
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }

    public Connection getCn() throws SQLException {
        if (vvCn == null || vvCn.isClosed()) {
            vvCn = DriverManager.getConnection(getProperty(VVPROP_DB_URL),
                    getProperty(VVPROP_DB_USERNAME), getProperty(VVPROP_DB_PASSWORD));
        }
        return vvCn;
    }

    private static String getProperty(String propertyName) {
        Properties props = new Properties();
        try (InputStream inputStream = SQLiteDataHelper.class.getClassLoader()
                .getResourceAsStream(VVCONFIG_FILE)) {
            if (inputStream != null) {
                props.load(inputStream);
            } else {
                throw new RuntimeException("Archivo de configuración no encontrado: " + VVCONFIG_FILE);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        String vvPropertyValue = props.getProperty(propertyName);
        if (vvPropertyValue == null) {
            throw new RuntimeException("Propiedad no encontrada en archivo de configuración: " + propertyName);
        }
        return vvPropertyValue;
    }
}
