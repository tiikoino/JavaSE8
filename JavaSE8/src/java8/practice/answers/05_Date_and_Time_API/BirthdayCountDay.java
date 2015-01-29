import java.time.LocalDate;
import java.time.chrono.JapaneseDate;
import java.time.temporal.ChronoUnit;

public class BirthdayCountDay {

	public static void main(String[] args) {

		// ‡@ ¡‚Ü‚Å¶‚«‚Ä‚«‚½”N”/Œ”/“ú”‚Ì•\¦
		LocalDate birthday = LocalDate.of(1983, 1, 3);
		LocalDate today = LocalDate.now();

		System.out.println("¡“ú‚Ü‚Å¶‚«‚Ä‚«‚½”N” = " + birthday.until(today ,ChronoUnit.YEARS));
		System.out.println("¡“ú‚Ü‚Å¶‚«‚Ä‚«‚½Œ” = " + birthday.until(today ,ChronoUnit.MONTHS));
		System.out.println("¡“ú‚Ü‚Å¶‚«‚Ä‚«‚½“ú” = " + birthday.until(today ,ChronoUnit.DAYS));

		// ‡A JapaneseDate‚Ö‚Ì•ÏŠ·
		System.out.println(JapaneseDate.from(birthday));
		
	}
	
}
