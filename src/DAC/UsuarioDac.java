package DAC;

import Framework.AppConfiguration;

public class UsuarioDac extends SQLiteDataHelper {

    public UsuarioDac(String dbPathConnection) {
        super(AppConfiguration.getDBPathConnection());
    }
    
    
}
