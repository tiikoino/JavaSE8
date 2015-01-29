import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.TemporalAdjusters;

public class SampleLocalDate {
	public static void main(String[] args) {
		// 現在の日付
		LocalDate now = LocalDate.now();
		System.out.println("現在の時間：" + now);
		
		// 指定した日付
		LocalDate christmas = LocalDate.of(2014, Month.DECEMBER, 25);
		LocalDate newYear = LocalDate.of(2015, 1, 1);

		System.out.println("2014年のクリスマス：" + christmas);
		System.out.println("2015年のお正月：" + newYear);

		System.out.println(newYear + " の過去日チェック -- " + newYear.isBefore(now));
		System.out.println(newYear + " はうるう年？ -- " + newYear.isLeapYear());
		System.out.println(newYear + " は何曜日？  -- " + newYear.getDayOfWeek());
		System.out.println(newYear + " から1ヵ月後は？  -- " + newYear.plusMonths(1));
		System.out.println(newYear + " から次の火曜日は？  -- " + newYear.with(TemporalAdjusters.next(DayOfWeek.TUESDAY)));
		System.out.println(newYear + " の最終日は？  -- " + newYear.with(TemporalAdjusters.lastDayOfMonth()));
		
	}
}