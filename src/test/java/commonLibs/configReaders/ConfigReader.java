package commonLibs.configReaders;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {
    Properties properties;


    public ConfigReader() {
        try {
           String workingDir = System.getProperty("user.dir");
           String datafile = workingDir;

           FileInputStream fis = new FileInputStream(workingDir+ "\\config\\Dev_env.properties");
           properties = new Properties();
           properties.load(fis);
        } catch (Exception e) {

        }
    }

    public String getUrl() {

        return properties.getProperty("baseURL");
    }

}
