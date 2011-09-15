package ch.demo.properties;

import java.io.IOException;

public class PropertiesHolderDemo {

	public static void main(String[] args) {
		PropertiesHolder.setFilePath("");
		PropertiesHolder.setFileName("config.properties");
		try {
			PropertiesHolder.loadPropertiesFile();
			System.out.println(PropertiesHolder.getProperties().getProperty("test"));
			PropertiesHolder.getProperties().put("test", "TestProperty");
			PropertiesHolder.saveProperiesFile();
			PropertiesHolder.loadPropertiesFile();
			System.out.println(PropertiesHolder.getProperties().getProperty("test"));
		} catch (NullPointerException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
