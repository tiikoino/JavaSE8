import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.GregorianCalendar;

public class ChangeDateAndTimeAPI {

	public static void main(String[] args) {
		// LocalDateTime Å® ZonedDateTime Å® GregorianCalendar
		LocalDateTime ldt = LocalDateTime.now();
		ZonedDateTime zdt = ZonedDateTime.of(ldt, ZoneId.of("Asia/Tokyo"));
		GregorianCalendar cal = GregorianCalendar.from(zdt);
		// GregorianCalendar Å® ZonedDateTime Å® LocalDateTime
		ZonedDateTime zdt2 = cal.toZonedDateTime();
		LocalDateTime ldt2 = zdt2.toLocalDateTime();
	}
}
