import java.util.function.BiFunction;

public class BiFunctionObjTest {
	public static void main(String[] args){
		BiFunction<String,String,Integer> biFunction =
			 (String first, String second) -> Integer.compare(first.length(), second.length());

		// メソッドの呼び出し
		System.out.println("結果：" + biFunction.apply("Hello","World!"));
	}
}
