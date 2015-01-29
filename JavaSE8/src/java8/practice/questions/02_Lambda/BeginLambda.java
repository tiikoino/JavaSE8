import java.util.Comparator;
import java.util.Date;
import java.util.concurrent.Callable;

public class BeginLambda {

	public static void main(String[] args) {

		// Q1.�ȉ��̓����N���X��Lambda���ŋL�q���Ă݂܂��傤
		Comparator<Integer> com1 = new Comparator<Integer>() {
			@Override
			public int compare(Integer x, Integer y) {
				return  x - y;
			}
		};

		// A1.answer


		// Q2. �ȉ��̓����N���X�� Lambda���ŋL�q���Ă݂܂��傤
		Callable<Date> callable = new Callable<Date>(){
			@Override
			public Date call() throws Exception {
			   return new Date();
			}
		};

		// A2.answer


		// Q3. �ȉ��̓����N���X��Lambda���ŋL�q���Ă݂܂��傤
		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				doSomething();
			}
		};

		// A3.answer


	}

	private static void doSomething(){
		System.out.println("Q3 : doSomething");
	}

}
