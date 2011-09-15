package ch.demo.properties;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * @author Christof Kulesza
 * 
 */
public class PropertiesHolder {

	private static String fileName;
	private static String filePath;
	private static Properties properties;

	/**
	 * Lädt die Properties aus der Properydatei.
	 * 
	 * @throws IOException
	 */
	public static void loadPropertiesFile() throws IOException,
			NullPointerException {
		FileInputStream fis = new FileInputStream(fileName);
		properties = new Properties();
		properties.load(fis);
	}

	/**
	 * Speichert die Properties in die Propertydatei.
	 * 
	 * @throws IOException
	 * @throws NullPointerException
	 */
	public static void saveProperiesFile() throws IOException,
			NullPointerException {
		FileOutputStream fos = new FileOutputStream(fileName);
		properties.store(fos, "Kommentar");
	}

	/**
	 * Gibt den Namen der Datei, in der sich die Properties befinden, zurück.
	 * 
	 * @return the fileName - der Dateiname
	 */
	public static String getFileName() {
		return fileName;
	}

	/**
	 * Setzt den Dateinamen der Datei, in der sich die Properties befinden.
	 * 
	 * @param fileName
	 *            - der Dateiname
	 */
	public static void setFileName(String fileName) {
		PropertiesHolder.fileName = fileName;
	}

	/**
	 * Gibt das Verzeichnis, in dem sich die Datei mit den Properties befindet,
	 * zurück.
	 * 
	 * @return the filePath - das Verzeichnis der Datei
	 */
	public static String getFilePath() {
		return filePath;
	}

	/**
	 * Setzt das Verzeichnis, in der sich die Propertiesdatei befindet.
	 * 
	 * @param filePath
	 *            - das Verzeichnis der Datei
	 */
	public static void setFilePath(String filePath) {
		PropertiesHolder.filePath = filePath;
	}

	/**
	 * Gibt das Objekt mit den Properties zurück.
	 * 
	 * @return the properties
	 */
	public static Properties getProperties() {
		return properties;
	}

	/**
	 * Setzt das Objekt mit den Properties.
	 * 
	 * @param properties
	 *            the properties to set
	 */
	public static void setProperties(Properties properties) {
		PropertiesHolder.properties = properties;
	}
}