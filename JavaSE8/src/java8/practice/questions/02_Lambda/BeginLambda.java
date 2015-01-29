import java.util.Comparator;
import java.util.Date;
import java.util.concurrent.Callable;

public class BeginLambda {

	public static void main(String[] args) {

		// Q1.以下の内部クラスをLambda式で記述してみましょう
		Comparator<Integer> com1 = new Comparator<Integer>() {
			@Override
			public int compare(Integer x, Integer y) {
				return  x - y;
			}
		};

		// A1.answer


		// Q2. 以下の内部クラスを Lambda式で記述してみましょう
		Callable<Date> callable = new Callable<Date>(){
			@Override
			public Date call() throws Exception {
			   return new Date();
			}
		};

		// A2.answer


		// Q3. 以下の内部クラスをLambda式で記述してみましょう
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
