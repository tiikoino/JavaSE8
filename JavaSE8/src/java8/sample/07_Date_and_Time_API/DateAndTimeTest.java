import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateAndTimeTest {
	public static void main(String[] args){
		// ���t
		LocalDate date = LocalDate.now();
		System.out.println(date);
		// ����
		LocalTime time = LocalTime.now();
		System.out.println(time);
		// ����
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println(localDateTime);
	}
}
