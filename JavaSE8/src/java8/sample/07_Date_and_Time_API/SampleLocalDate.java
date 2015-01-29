import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.TemporalAdjusters;

public class SampleLocalDate {
	public static void main(String[] args) {
		// ���݂̓��t
		LocalDate now = LocalDate.now();
		System.out.println("���݂̎��ԁF" + now);
		
		// �w�肵�����t
		LocalDate christmas = LocalDate.of(2014, Month.DECEMBER, 25);
		LocalDate newYear = LocalDate.of(2015, 1, 1);

		System.out.println("2014�N�̃N���X�}�X�F" + christmas);
		System.out.println("2015�N�̂������F" + newYear);

		System.out.println(newYear + " �̉ߋ����`�F�b�N -- " + newYear.isBefore(now));
		System.out.println(newYear + " �͂��邤�N�H -- " + newYear.isLeapYear());
		System.out.println(newYear + " �͉��j���H  -- " + newYear.getDayOfWeek());
		System.out.println(newYear + " ����1������́H  -- " + newYear.plusMonths(1));
		System.out.println(newYear + " ���玟�̉Ηj���́H  -- " + newYear.with(TemporalAdjusters.next(DayOfWeek.TUESDAY)));
		System.out.println(newYear + " �̍ŏI���́H  -- " + newYear.with(TemporalAdjusters.lastDayOfMonth()));
		
	}
}