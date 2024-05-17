package ex4;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {
	String pattern;

	/** Constructor
	 * @param pattern
	 */
	public DateUtils(String pattern) {
		this.pattern = pattern;
	}
	
	DateUtils formatDefaut = new DateUtils("dd/MM/yyyy HH:mm:ss");

	public String format(Date date) {
		SimpleDateFormat formateur = new SimpleDateFormat(this.pattern);
		return formateur.format(date);
	}
}
