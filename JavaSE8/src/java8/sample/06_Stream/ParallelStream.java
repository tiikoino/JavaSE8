import java.util.ArrayList;
import java.util.List;

public class ParallelStream {

	public static void main(String[] args) {
		// personListの定義
		List<Person> personList = new ArrayList<>();
		personList.add(new Person("アリス", 10));
		personList.add(new Person("ボブ", 20));
		personList.add(new Person("Duke1", 10));
		personList.add(new Person("Duke2", 20));

		// Person リストから名前を出力
		personList.stream() 		// List を Stream へ変換
			.map(p -> p.getName())	// Stream から名前だけ抽出
			.forEach(p -> System.out.println("名前表示(順次処理)：" + p));	// 抽出された名前リストを表示

		// Person リストから名前を出力
		personList.parallelStream()	// List を並行処理用 Streamへ変換
			.map(p -> p.getName())	// Streamから名前だけ抽出
			.forEach(p -> System.out.println("名前表示(並列処理)：" + p));	// 抽出された名前リストを表示
	}
}
