import java.util.Comparator;

public class HowToWriteLambda {

	public static void main(String[] args) {

		// 引数がない場合
		Runnable r = () -> System.out.println("Hello!");
		r.run();

		// 複数行にまたがる場合
		Comparator<String> comp = (String first, String second) -> {
			if (first.length() < second.length()) return -1;
			else if (first.length() > second.length()) return 1; 
			else return 0;
		};
		// メソッドの実行
		System.out.println("結果:" + comp.compare("First", "Second") );

		// 省略しすぎると読みにくくなる
//		Comparator<String> compStr = (x, y) -> { return x + y; };	// 実際はコンパイルエラー
//		System.out.println("結果:" + compStr.compare("First", "Second") );

		Comparator<Integer> compInt = (x, y) -> { return x + y; };
		System.out.println("結果:" + compInt.compare(10, 20) );
	}
}
