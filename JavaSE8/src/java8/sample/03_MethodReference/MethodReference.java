import java.util.function.Function;

public class MethodReference {
	public static void main(String[] args) {

//		Function<Integer,Character> method = i -> "Hello,Java8".charAt(i);	// Lambda式
		Function<Integer,Character> method = "Hello,Java8"::charAt;		// メソッド参照
		System.out.println(method.apply(4));

//		Function<String,Double> method2 = i -> Double.parseDouble(i);		// Lambda式
		Function<String,Double> method2 = Double::parseDouble;			// メソッド参照
		double d = method2.apply("10.0");
		System.out.println(d);
	}
}
