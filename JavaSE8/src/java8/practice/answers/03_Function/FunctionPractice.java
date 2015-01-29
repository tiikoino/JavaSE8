import java.util.function.BiFunction;

public class FunctionPractice {

	public static void main(String[] args) {
		// 以下のメソッド呼び出しを、
		// 関数インターフェースとLambda式を用いて記載しなさい。
		BiFunction<Double, Double, Double> calcBmi =
		 (Double height, Double weight) -> {
			height = height / 100;
			Double bmi = weight / height / height;
			return bmi;
		};

		double resultBmi = calcBmi.apply(129.3, 129.3);
		System.out.println("BMI : " + resultBmi);

	}
}
