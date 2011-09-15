package ch.demo.properties;

import java.io.IOException;

public class PropertiesHolderDemo {

	public static void main(String[] args) {
		PropertiesHolder.setFilePath("");
		PropertiesHolder.setFileName("config.properties");
		PropertiesHolder.getProperties().put("test", "TestPropertie");
		
		try {
			PropertiesHolder.loadPropertiesFile();
		} catch (NullPointerException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
