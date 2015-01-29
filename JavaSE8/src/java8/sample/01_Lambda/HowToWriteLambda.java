import java.util.Comparator;

public class HowToWriteLambda {

	public static void main(String[] args) {

		// �������Ȃ��ꍇ
		Runnable r = () -> System.out.println("Hello!");
		r.run();

		// �����s�ɂ܂�����ꍇ
		Comparator<String> comp = (String first, String second) -> {
			if (first.length() < second.length()) return -1;
			else if (first.length() > second.length()) return 1; 
			else return 0;
		};
		// ���\�b�h�̎��s
		System.out.println("����:" + comp.compare("First", "Second") );

		// �ȗ���������Ɠǂ݂ɂ����Ȃ�
//		Comparator<String> compStr = (x, y) -> { return x + y; };	// ���ۂ̓R���p�C���G���[
//		System.out.println("����:" + compStr.compare("First", "Second") );

		Comparator<Integer> compInt = (x, y) -> { return x + y; };
		System.out.println("����:" + compInt.compare(10, 20) );
	}
}
