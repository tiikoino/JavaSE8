import java.util.Comparator;

class LengthComparator implements Comparator<String> { 

	// Comparator インターフェースを実装して、compare メソッドを定義
	public int compare(String first, String second) { 
		// Integer.compare(int x, int y):2つのint値を数値的に比較
		// x == y → 0 / x < y → 0より小さい数 / x > y → 0より大きい数 を返却
		return Integer.compare(first.length(), second.length()); 
	} 

	public static void main(String[] args){

		// 実装された LengthComparator クラスをインスタンス化
		LengthComparator comp = new LengthComparator();
		// メソッドの呼び出し
		System.out.println("結果：" + comp.compare("Hello","World!"));
	}

}
