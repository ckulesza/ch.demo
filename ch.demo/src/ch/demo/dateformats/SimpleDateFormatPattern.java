package ch.demo.dateformats;

/**
 * In dieser Enumeration werden verschiedene Patterns unter einem bestimmten
 * Namen abgespeichert.
 * 
 * @author Christof Kulesza
 * 
 */
public enum SimpleDateFormatPattern {

	TIME("HH:mm:ss:SSS"), DATE("dd.MM.yyyy");

	private String pattern;

	SimpleDateFormatPattern(String pattern) {
		this.pattern = pattern;
	}

	/**
	 * Gibt das Pattern für die Zeitbezeichnung zurück.
	 * 
	 * @return the pattern
	 */
	public String getPattern() {
		return pattern;
	}

	/**
	 * Setzt das Pattern für die Zeitbezeichnung.
	 * 
	 * @param pattern
	 *            the pattern to set
	 */
	public void setPattern(String pattern) {
		this.pattern = pattern;
	}
}