package utils;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {

    private static Properties prop;

    public static String getProperty(String key) {
        try {
            if (prop == null) {
                prop = new Properties();
                FileInputStream fis =
                        new FileInputStream("src/test/resources/config.properties");
                prop.load(fis);
            }
        } catch (Exception e) {
            throw new RuntimeException("Config file not found");
        }
        return prop.getProperty(key);
    }
}
