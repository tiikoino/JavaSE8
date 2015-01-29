import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamPractice {
	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("Java","JavaScript","C","Scala","Java");
		
		// 1. 重複した要素を排除した、配列の件数を取得
		long count = list.stream().distinct().count();
		System.out.println("Q1 : " + count);
		
		// 2. listの要素を順に表示
		list.stream().forEach(s -> System.out.println("Q2 : " + s));

		// 3.「J」で始まる要素のみフィルタリングして表示
		list.stream()
			.filter(s -> s.startsWith("J"))
			.forEach(s -> System.out.println("Q3 : " + s));
		
		// 4.「a」で終わる要素のみフィルタリングして、コレクションに変換して表示
		List aList = list.stream()		// Stream生成
			.filter(s -> s.endsWith("a"))	// 「a」で終わる要素をフィルタリング
			.collect(Collectors.toList());	// フィルタリング結果をListに変換
		System.out.println("Q4 : " + aList);
		
		// 5. リストの要素の長さを求めて、それぞれの長さを足し合わせた結果を表示
		Integer result = list.stream()
			.map(s -> s.length())
			.reduce(0, (x , y ) -> x+y);
		System.out.println("Q5 : " + result);

	}
}
