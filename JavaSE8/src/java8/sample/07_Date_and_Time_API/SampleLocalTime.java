import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class SampleLocalTime {
	public static void main(String[] args) {
		// ���݂̎���
		LocalTime now = LocalTime.now();
		System.out.println("���݂̎��ԁF" + now);
		
		// �w�肵������
		LocalTime wakeUp = LocalTime.of(6, 30 , 15);
		LocalTime lunch = LocalTime.of(12, 00);
		LocalTime goodNigh = LocalTime.of(21, 00);
		
		System.out.println("�N�����ԁF" + wakeUp);
		System.out.println("���H���ԁF" + lunch);
		System.out.println("�A�Q���ԁF" + goodNigh);

		System.out.println(wakeUp + " �̉ߋ����ԃ`�F�b�N -- " + wakeUp.isBefore(now));
		System.out.println(wakeUp + " ����1���Ԕ��� -- " + wakeUp.plusHours(1).plusMinutes(30));
		System.out.println(wakeUp + " �~���b�\���Ȃ� -- " + wakeUp.truncatedTo(ChronoUnit.MINUTES));
		System.out.println(wakeUp + " ���� " + lunch + "�܂ŉ����ł����H -- " + wakeUp.until(goodNigh, ChronoUnit.MINUTES));
		System.out.println(now + " ���� " + goodNigh + "�܂ŉ����Ԃł����H -- " + now.until(goodNigh, ChronoUnit.HOURS));

	}
}
