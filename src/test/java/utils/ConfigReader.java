package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    static Properties prop;
    //this method will read any property file:
    public static Properties readProperties(String filePath){
        //read the data from the file:
        try {
            FileInputStream fis = new FileInputStream(filePath);//locate the file and fetch the data
            prop = new Properties(); //initialize the properties obj
            prop.load(fis); //data that we are going to read will be holding under this and loaded
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
        return prop;
    }
    //this method get single value based on the key:
    public static String getPropertyValue(String key){
       return prop.getProperty(key);

    }
}
