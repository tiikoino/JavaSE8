import java.util.Calendar;

public class CaseCalender {
	public static void main(String[] args) {
		System.out.println("-----Calendar-----");
		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar.getTime());
		System.out.println(calendar.get(Calendar.YEAR));
		System.out.println(calendar.get(Calendar.MONTH));
		System.out.println(calendar.get(Calendar.DATE));
	}
}
