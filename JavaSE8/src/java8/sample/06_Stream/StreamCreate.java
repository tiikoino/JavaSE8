import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class StreamCreate {

	public static void main(String[] args) {
		// 配列 → Stream
		int[] intArray =  {1, 2,3,4,5,6,7,8,9,10};
		int sum = Arrays.stream(intArray).sum();
		System.out.println("配列からStreamの生成 ： " + sum);

		// n から m までの間
		int sum2 = IntStream.rangeClosed(1, 10).sum();
		System.out.println("IntStream.rangeClosed() 利用 ： " + sum2);

		// n から m-1 までの間
		int sum3 = IntStream.range(1, 11).sum();
		System.out.println("IntStream.rang() 利用 ： " + sum3);

		// 文字数のカウント
		String str = "Hello World!";
		long count = str.chars().count();
		System.out.println("str.chars() : " + count);

		// 0～10までのランダムな整数
		Random r = new Random();
		System.out.println("0-10までのランダムな整数：");
		r.ints(0,10)					// 0～10までのランダムな整数Stream
			.filter(i -> i%2 == 0)			// 偶数だけ取り出して、
			.limit(5)				// 条件に合致した10件を
			.sorted()				// ソートして
			.forEach(i -> System.out.println(i));	// 表示する
	}
}
