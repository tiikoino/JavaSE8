import java.util.function.BiFunction;

public class FunctionPractice {

	public static void main(String[] args) {
		// 以下のメソッド呼び出しを、
		// 関数インターフェースとLambda式を用いて記載しなさい。
		double resultBmi = calcBmi(129.3, 129.3);
		System.out.println("BMI : " + resultBmi);

	}

	public static double calcBmi(double height, double weight) {
		height = height / 100;
		Double bmi = weight / height / height;
		return bmi;
	}
}
