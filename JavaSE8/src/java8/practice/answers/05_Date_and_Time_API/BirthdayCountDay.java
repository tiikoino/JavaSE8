import java.time.LocalDate;
import java.time.chrono.JapaneseDate;
import java.time.temporal.ChronoUnit;

public class BirthdayCountDay {

	public static void main(String[] args) {

		// �@ ���܂Ő����Ă����N��/����/�����̕\��
		LocalDate birthday = LocalDate.of(1983, 1, 3);
		LocalDate today = LocalDate.now();

		System.out.println("�����܂Ő����Ă����N�� = " + birthday.until(today ,ChronoUnit.YEARS));
		System.out.println("�����܂Ő����Ă������� = " + birthday.until(today ,ChronoUnit.MONTHS));
		System.out.println("�����܂Ő����Ă������� = " + birthday.until(today ,ChronoUnit.DAYS));

		// �A JapaneseDate�ւ̕ϊ�
		System.out.println(JapaneseDate.from(birthday));
		
	}
	
}
