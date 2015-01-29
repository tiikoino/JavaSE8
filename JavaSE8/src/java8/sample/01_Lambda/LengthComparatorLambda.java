import java.util.Comparator;

class LengthComparatorLambda { 
	public static void main(String[] args){
		// Comparator �C���^�[�t�F�[�X�̎����� Lambda���Œ�`
		Comparator<String> comp = (String first, String second) 
			-> Integer.compare(first.length(), second.length());
		// Integer.compare(int x, int y):2��int�l�𐔒l�I�ɔ�r
		// x == y �� 0 / x < y �� 0��菬������ / x > y �� 0���傫���� ��ԋp

		// ���\�b�h�̌Ăяo��
		System.out.println("���ʁF" + comp.compare("Hello","World!"));
	}
}
