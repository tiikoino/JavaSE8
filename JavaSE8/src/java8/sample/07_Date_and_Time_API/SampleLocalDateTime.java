import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

public class SampleLocalDateTime {
	public static void main(String[] args) {
		
		// 現在の日時
		LocalDateTime now = LocalDateTime.now();
		System.out.println("現在の日時：" + now);
		
		// 指定した日時
		LocalDateTime lastDayOfYear = LocalDateTime.of(2014, Month.DECEMBER, 31 , 23, 59);
		LocalDate christmasDay = LocalDate.of(2014, Month.DECEMBER, 25);
		LocalTime pertyTime = LocalTime.of(20, 30);
		LocalDateTime christmasPerty = LocalDateTime.of(christmasDay,pertyTime);

		System.out.println("2014年大晦日：" + lastDayOfYear);
		System.out.println("2014年クリスマスパーティ：" + christmasPerty);

		System.out.println(christmasPerty + " の過去日チェック -- " + christmasPerty.isBefore(now));
		System.out.println(christmasPerty + " は何曜日？  -- " + christmasPerty.getDayOfWeek());
		System.out.println(christmasPerty + " から1ヵ月後は？  -- " + christmasPerty.plusMonths(1));
		System.out.println(christmasPerty + " から次の火曜日は？  -- " + christmasPerty.with(TemporalAdjusters.next(DayOfWeek.TUESDAY)));
		System.out.println(christmasPerty + " の最終日は？  -- " + christmasPerty.with(TemporalAdjusters.lastDayOfMonth()));

		LocalDateTime trainingStart = LocalDateTime.of(2015, 4, 1, 9, 0);
		LocalDateTime trainingEnd = LocalDateTime.of(2015, 10, 1, 9, 0);
		System.out.println("新入社員研修の期間は " + trainingStart.until(trainingEnd,ChronoUnit.MONTHS) + "ヶ月" );
		System.out.println("新入社員研修の期間は " + trainingStart.until(trainingEnd,ChronoUnit.DAYS) + "日");

	}
}
