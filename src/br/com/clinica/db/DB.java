package br.com.clinica.db;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class DB {
        private static Properties loadproperties(){
        try (FileInputStream fs = new FileInputStream("db.properties")){
            Properties props = new Properties();
            props.load(fs);

            return props;
        }
        catch (IOException e){
            throw new DbException(e.getMessage());
        }
    }
}
