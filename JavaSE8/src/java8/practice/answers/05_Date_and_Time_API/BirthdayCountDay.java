import java.time.LocalDate;
import java.time.chrono.JapaneseDate;
import java.time.temporal.ChronoUnit;

public class BirthdayCountDay {

	public static void main(String[] args) {

		// �@ 今まで生きてきた年数/月数/日数の表示
		LocalDate birthday = LocalDate.of(1983, 1, 3);
		LocalDate today = LocalDate.now();

		System.out.println("今日まで生きてきた年数 = " + birthday.until(today ,ChronoUnit.YEARS));
		System.out.println("今日まで生きてきた月数 = " + birthday.until(today ,ChronoUnit.MONTHS));
		System.out.println("今日まで生きてきた日数 = " + birthday.until(today ,ChronoUnit.DAYS));

		// �A JapaneseDateへの変換
		System.out.println(JapaneseDate.from(birthday));
		
	}
	
}
