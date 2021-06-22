package fr.diginamic.singleton;

import java.util.ResourceBundle;

public class Configuration {

    public final String DB_URL;
    public final String DB_USER;
    public final String DB_PASSWORD;

    private Configuration(){
        ResourceBundle bundle = ResourceBundle.getBundle("configuration");
        DB_URL = bundle.getString("db.url");
        DB_USER = bundle.getString("db.user");
        DB_PASSWORD = bundle.getString("db.password");
    }

    private static class SingletonHolder{
        private final static Configuration INSTANCE = new Configuration();
    }

    public static Configuration getInstance(){
        return SingletonHolder.INSTANCE;
    }

}
