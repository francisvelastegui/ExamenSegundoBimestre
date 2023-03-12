package DAC;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class SQLiteDataHelper {
    
    Connection cn;

    private static final String CONFIG_FILE = "config.properties";
    private static final String PROP_DB_DRIVER = "db.driver";
    private static final String PROP_DB_URL = "db.url";
    private static final String PROP_DB_USERNAME = "db.username";
    private static final String PROP_DB_PASSWORD = "db.password";

    static {
        try {
            Class.forName(getProperty(PROP_DB_DRIVER));
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }

    public Connection getCn() throws SQLException {
        if (cn == null || cn.isClosed()) {
            cn = DriverManager.getConnection(getProperty(PROP_DB_URL),
                    getProperty(PROP_DB_USERNAME), getProperty(PROP_DB_PASSWORD));
        }
        return cn;
    }

    private static String getProperty(String propertyName) {
        Properties props = new Properties();
        try (InputStream inputStream = SQLiteDataHelper.class.getClassLoader()
                .getResourceAsStream(CONFIG_FILE)) {
            if (inputStream != null) {
                props.load(inputStream);
            } else {
                throw new RuntimeException("Archivo de configuración no encontrado: " + CONFIG_FILE);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        String propertyValue = props.getProperty(propertyName);
        if (propertyValue == null) {
            throw new RuntimeException("Propiedad no encontrada en archivo de configuración: " + propertyName);
        }
        return propertyValue;
    }
}
