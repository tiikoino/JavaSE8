import java.util.Comparator;
import java.util.Date;
import java.util.concurrent.Callable;

public class BeginLambda {

	public static void main(String[] args) throws Exception{

		// Q1.以下の内部クラスを Lambda式で記述してみましょう
		Comparator<Integer> com1 = new Comparator<Integer>() {
			@Override
			public int compare(Integer x, Integer y) {
				return  x - y;
			}
		};

		// A1. answer 以下どれでもOK
		Comparator<Integer> com2 = (Integer x, Integer y) -> { return  x - y;};
		Comparator<Integer> com3 = (Integer x, Integer y) -> x - y;
		Comparator<Integer> com4 = ( x, y) ->  x - y ;
		
		// メソッドの実行
		System.out.println("Q1 : " + com2.compare(3, 2));
		System.out.println("Q1 : " + com3.compare(3, 2));
		System.out.println("Q1 : " + com4.compare(3, 2));

		// Q2.以下の内部クラスを Lambda式で記述してみましょう
		Callable<Date> callable = new Callable<Date>(){
			@Override
			public Date call() throws Exception {
			   return new Date();
			}
		};
		// A2. answer 以下どれでもOK
		Callable<Date> callable2 = () -> { return new Date(); };
		Callable<Date> callable3 = () -> new Date();

		// メソッドの実行
		System.out.println("Q2 : " + callable2.call());
		System.out.println("Q2 : " + callable3.call());

		// Q3.以下の内部クラスを Lambda式で記述してみましょう
		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				doSomething();
			}
		};
		// A3. answer
		Runnable runnable2 = () -> { doSomething(); };
		// メソッドの実行
		runnable2.run();
	}

	private static void doSomething(){
		System.out.println("Q3 : doSomething");
	}

}
