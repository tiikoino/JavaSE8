import java.util.function.BiFunction;

public class FunctionPractice {

	public static void main(String[] args) {
		// �ȉ��̃��\�b�h�Ăяo�����A
		// �֐��C���^�[�t�F�[�X��Lambda����p���ċL�ڂ��Ȃ����B
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
