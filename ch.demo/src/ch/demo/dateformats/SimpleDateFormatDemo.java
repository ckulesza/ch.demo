package ch.demo.dateformats;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Ein Beispielprogramm, mit dem verschiedene Datumsausgaben, welche mit der
 * SimpleDateFormat Klasse möglich sind, ausgegeben werden.
 * 
 * @author Christof Kulesza
 * 
 */
public class SimpleDateFormatDemo {

	/**
	 * Durchläuft alle Wert der SimpleDateFormatPattern Enumeration und gibt für
	 * das aktuelle Datum alle Formate, die in der Enumeration abgelegt sind, in
	 * der Konsole aus.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Date date = new Date();
		System.out.println("Datum: \t\t" + date);
		for (SimpleDateFormatPattern p : SimpleDateFormatPattern.values()) {
			SimpleDateFormat sdfTime = new SimpleDateFormat(p.getPattern());
			System.out.println(p.name() + ": \t\t" + sdfTime.format(date)
					+ " \t\tPattern: " + p.getPattern());
		}
	}
}
