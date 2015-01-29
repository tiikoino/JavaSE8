import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class SampleLocalTime {
	public static void main(String[] args) {
		// 現在の時刻
		LocalTime now = LocalTime.now();
		System.out.println("現在の時間：" + now);
		
		// 指定した時刻
		LocalTime wakeUp = LocalTime.of(6, 30 , 15);
		LocalTime lunch = LocalTime.of(12, 00);
		LocalTime goodNigh = LocalTime.of(21, 00);
		
		System.out.println("起床時間：" + wakeUp);
		System.out.println("昼食時間：" + lunch);
		System.out.println("就寝時間：" + goodNigh);

		System.out.println(wakeUp + " の過去時間チェック -- " + wakeUp.isBefore(now));
		System.out.println(wakeUp + " から1時間半後 -- " + wakeUp.plusHours(1).plusMinutes(30));
		System.out.println(wakeUp + " ミリ秒表示なし -- " + wakeUp.truncatedTo(ChronoUnit.MINUTES));
		System.out.println(wakeUp + " から " + lunch + "まで何分ですか？ -- " + wakeUp.until(goodNigh, ChronoUnit.MINUTES));
		System.out.println(now + " から " + goodNigh + "まで何時間ですか？ -- " + now.until(goodNigh, ChronoUnit.HOURS));

	}
}
