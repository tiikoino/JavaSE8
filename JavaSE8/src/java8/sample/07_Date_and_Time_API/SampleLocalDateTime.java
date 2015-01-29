import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

public class SampleLocalDateTime {
	public static void main(String[] args) {
		
		// ���݂̓���
		LocalDateTime now = LocalDateTime.now();
		System.out.println("���݂̓����F" + now);
		
		// �w�肵������
		LocalDateTime lastDayOfYear = LocalDateTime.of(2014, Month.DECEMBER, 31 , 23, 59);
		LocalDate christmasDay = LocalDate.of(2014, Month.DECEMBER, 25);
		LocalTime pertyTime = LocalTime.of(20, 30);
		LocalDateTime christmasPerty = LocalDateTime.of(christmasDay,pertyTime);

		System.out.println("2014�N��A���F" + lastDayOfYear);
		System.out.println("2014�N�N���X�}�X�p�[�e�B�F" + christmasPerty);

		System.out.println(christmasPerty + " �̉ߋ����`�F�b�N -- " + christmasPerty.isBefore(now));
		System.out.println(christmasPerty + " �͉��j���H  -- " + christmasPerty.getDayOfWeek());
		System.out.println(christmasPerty + " ����1������́H  -- " + christmasPerty.plusMonths(1));
		System.out.println(christmasPerty + " ���玟�̉Ηj���́H  -- " + christmasPerty.with(TemporalAdjusters.next(DayOfWeek.TUESDAY)));
		System.out.println(christmasPerty + " �̍ŏI���́H  -- " + christmasPerty.with(TemporalAdjusters.lastDayOfMonth()));

		LocalDateTime trainingStart = LocalDateTime.of(2015, 4, 1, 9, 0);
		LocalDateTime trainingEnd = LocalDateTime.of(2015, 10, 1, 9, 0);
		System.out.println("�V���Ј����C�̊��Ԃ� " + trainingStart.until(trainingEnd,ChronoUnit.MONTHS) + "����" );
		System.out.println("�V���Ј����C�̊��Ԃ� " + trainingStart.until(trainingEnd,ChronoUnit.DAYS) + "��");

	}
}
