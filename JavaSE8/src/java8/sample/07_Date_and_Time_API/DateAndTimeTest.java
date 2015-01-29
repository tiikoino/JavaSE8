import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateAndTimeTest {
	public static void main(String[] args){
		// “ú•t
		LocalDate date = LocalDate.now();
		System.out.println(date);
		// ŽžŠÔ
		LocalTime time = LocalTime.now();
		System.out.println(time);
		// “úŽž
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println(localDateTime);
	}
}
