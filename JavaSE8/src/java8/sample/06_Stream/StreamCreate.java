import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class StreamCreate {

	public static void main(String[] args) {
		// �z�� �� Stream
		int[] intArray =  {1, 2,3,4,5,6,7,8,9,10};
		int sum = Arrays.stream(intArray).sum();
		System.out.println("�z�񂩂�Stream�̐��� �F " + sum);

		// n ���� m �܂ł̊�
		int sum2 = IntStream.rangeClosed(1, 10).sum();
		System.out.println("IntStream.rangeClosed() ���p �F " + sum2);

		// n ���� m-1 �܂ł̊�
		int sum3 = IntStream.range(1, 11).sum();
		System.out.println("IntStream.rang() ���p �F " + sum3);

		// �������̃J�E���g
		String str = "Hello World!";
		long count = str.chars().count();
		System.out.println("str.chars() : " + count);

		// 0�`10�܂ł̃����_���Ȑ���
		Random r = new Random();
		System.out.println("0-10�܂ł̃����_���Ȑ����F");
		r.ints(0,10)					// 0�`10�܂ł̃����_���Ȑ���Stream
			.filter(i -> i%2 == 0)			// �����������o���āA
			.limit(5)				// �����ɍ��v����10����
			.sorted()				// �\�[�g����
			.forEach(i -> System.out.println(i));	// �\������
	}
}
