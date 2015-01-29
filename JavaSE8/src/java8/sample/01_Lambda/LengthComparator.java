import java.util.Comparator;

class LengthComparator implements Comparator<String> { 

	// Comparator �C���^�[�t�F�[�X���������āAcompare ���\�b�h���`
	public int compare(String first, String second) { 
		// Integer.compare(int x, int y):2��int�l�𐔒l�I�ɔ�r
		// x == y �� 0 / x < y �� 0��菬������ / x > y �� 0���傫���� ��ԋp
		return Integer.compare(first.length(), second.length()); 
	} 

	public static void main(String[] args){

		// �������ꂽ LengthComparator �N���X���C���X�^���X��
		LengthComparator comp = new LengthComparator();
		// ���\�b�h�̌Ăяo��
		System.out.println("���ʁF" + comp.compare("Hello","World!"));
	}

}
