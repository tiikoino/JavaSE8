public class DoubleOparatorMain{

	public static void main(String[] args){

		// 1. �����N���X�錾�� DoubleOparator�C���^�[�t�F�[�X���������Ă�������
		DoubleOparator doubleOpp = new DoubleOparator() {
			@Override
			public double applay(double x, double y) {
				return x + y;
			}
		};

		// 2. �����N���X�錾��Lambda���֏C�����Ă�������
		DoubleOparator doubleOpp2 = (double x, double y) -> { return x + y;};
		DoubleOparator doubleOpp3 = (double x, double y) -> x + y;
		DoubleOparator doubleOpp4 = (x , y) -> x + y;
	
		// ���\�b�h�̎��s
		System.out.println("���ʁF" + doubleOpp2.applay(1.0 , 3.0));
		System.out.println("���ʁF" + doubleOpp3.applay(1.0 , 3.0));
		System.out.println("���ʁF" + doubleOpp4.applay(1.0 , 3.0));

	}
}