import java.util.Comparator;

class LengthComparatorLambda { 
	public static void main(String[] args){
		// Comparator インターフェースの実装を Lambda式で定義
		Comparator<String> comp = (String first, String second) 
			-> Integer.compare(first.length(), second.length());
		// Integer.compare(int x, int y):2つのint値を数値的に比較
		// x == y → 0 / x < y → 0より小さい数 / x > y → 0より大きい数 を返却

		// メソッドの呼び出し
		System.out.println("結果：" + comp.compare("Hello","World!"));
	}
}
