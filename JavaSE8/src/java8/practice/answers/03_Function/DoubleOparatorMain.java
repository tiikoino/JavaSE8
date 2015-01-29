public class DoubleOparatorMain{

	public static void main(String[] args){

		// 1. 内部クラス宣言で DoubleOparatorインターフェースを実装してください
		DoubleOparator doubleOpp = new DoubleOparator() {
			@Override
			public double applay(double x, double y) {
				return x + y;
			}
		};

		// 2. 内部クラス宣言をLambda式へ修正してください
		DoubleOparator doubleOpp2 = (double x, double y) -> { return x + y;};
		DoubleOparator doubleOpp3 = (double x, double y) -> x + y;
		DoubleOparator doubleOpp4 = (x , y) -> x + y;
	
		// メソッドの実行
		System.out.println("結果：" + doubleOpp2.applay(1.0 , 3.0));
		System.out.println("結果：" + doubleOpp3.applay(1.0 , 3.0));
		System.out.println("結果：" + doubleOpp4.applay(1.0 , 3.0));

	}
}