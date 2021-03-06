package org.craigslist.configuration;

import lombok.SneakyThrows;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertiesConfiguration {
    private static final String CONFIG_FILE_PATH = "src/test/resources/config.properties";

    private static Properties prop = new Properties();

    private PropertiesConfiguration() {}

    public static String getHomeBaseUrl() { return getProperty("home.base.url"); }

    public static String getHousingPagePath() { return getProperty("housing.page.path"); }

    @SneakyThrows
    private static String getProperty(String property) {
        prop.load(new FileInputStream(CONFIG_FILE_PATH));
        return prop.getProperty(property);
    }
}