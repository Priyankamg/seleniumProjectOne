package com.Priyanka.util;

import java.io.*;
import java.util.Properties;

/**
 * Created by Priyanka on 7/11/2016.
 */
public class propertyManager {
    /*
    The properties class represents a persistent set of properties.
    The properties can be saved to a stream or loaded from a stream.
    Each key and its corresponding value in the property list is a string.

    A property list can contain another property list as its defaults. This second
    property list is searched if the property key is not found in the original
    property list.
     */
    private Properties prop = new Properties();
    private InputStream input = null;

    private String emailAddress;
    private String password;
    private String userName;
    private String webAppUrl;

    public propertyManager(){
        try {
            /*
            A fileInputStream obtains input bytes from a file in a file system.
            FileInputStream is meant for reading streams of raw bytes.

            Constructor:
            FileInputStream(String name)
            Creates a FileInputStream by opening a connection to an actual file, the file named by the path name 'name' in the file system
             */
            input = new FileInputStream("src/main/java/com/Priyanka/properties/parameter.properties");
            prop.load(input); // Load - Reads a property list (key and element pairs) from the input byte stream
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public void setWebAppUrl(String webAppUrl) {
        this.webAppUrl = webAppUrl;
    }

    public String getWebAppUrl() {
        return webAppUrl;
    }

    public void setProperties() {
        setWebAppUrl(prop.getProperty("webapp.url"));
        setEmailAddress(prop.getProperty("emailAddress"));
        setPassword(prop.getProperty("password"));
        setUserName(prop.getProperty("username"));
    }
}
