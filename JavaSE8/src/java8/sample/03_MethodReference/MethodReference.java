import java.util.function.Function;

public class MethodReference {
	public static void main(String[] args) {

//		Function<Integer,Character> method = i -> "Hello,Java8".charAt(i);	// Lambda��
		Function<Integer,Character> method = "Hello,Java8"::charAt;		// ���\�b�h�Q��
		System.out.println(method.apply(4));

//		Function<String,Double> method2 = i -> Double.parseDouble(i);		// Lambda��
		Function<String,Double> method2 = Double::parseDouble;			// ���\�b�h�Q��
		double d = method2.apply("10.0");
		System.out.println(d);
	}
}
