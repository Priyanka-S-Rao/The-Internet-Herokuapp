package com.automation.utility;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigDataProvider {
	Properties prop;

	public ConfigDataProvider() {
		File src = new File("./Config/Config.properties");
		try {
			FileInputStream fis = new FileInputStream(src);
			prop = new Properties();
			prop.load(fis);
		} catch (Exception e) {
			System.out.println("Not able to load config file " + e.getMessage());
		}
	}

	public String getDataFromConfig(String key) {
		return prop.getProperty(key);
	}

	public String getBrowser() {
		return prop.getProperty("Browser");
	}

	public String getTinymceURL() {
		return prop.getProperty("tinymceURL");
	}

	public String getShadowdomURL() {
		return prop.getProperty("shadowdomURL");
	}
}