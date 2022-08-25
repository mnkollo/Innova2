package utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigurationReader {

    private static Properties configFile;

    static {

        try {
            String path = "configuration.properties";
            FileInputStream input = new FileInputStream(path);

            configFile = new Properties();
            configFile.load(input);

            input.close();
        } catch (Exception e) {
            e.printStackTrace();

        }
    }

    public static String getProperty(String keyName) {
        return configFile.getProperty(keyName);
    }
    public static String getUsername()
    {
        return getProperty("Username");
    }
    public static String getPassword()
    {
        return configFile.getProperty("Password");
    }
}


