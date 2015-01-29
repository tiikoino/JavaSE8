import java.time.chrono.JapaneseDate;

public class JapaneseDateSample {
	public static void main(String...args) {
		JapaneseDate date1 = JapaneseDate.now();
		System.out.println(date1);

		JapaneseDate date2 = JapaneseDate.of(1982, 8, 10);
		System.out.println(date2);

	}
}