package ch.demo.properties;

import java.io.IOException;

public class PropertiesHolderDemo {

	public static void main(String[] args) {
		PropertiesHolder.setFilePath("");
		PropertiesHolder.setFileName("config.properties");
		try {
			PropertiesHolder.loadPropertiesFile();
		} catch (NullPointerException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
