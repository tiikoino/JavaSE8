import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SampleStream {
	public static void main(String[] args) {
		// 1～10のうち、偶数を出力
		IntStream.rangeClosed(0, 10)	// 引数を2つ受け取り、1から10までの数列Streamを生成
			.filter(n -> n%2 ==0)   // 数列Streamから偶数だけをフィルタリング
			.forEach(n -> System.out.println("整数表示：" + n));   // フィルタリングされた値を表示

		// ﾌｧｲﾙから数理列を読み込み、最大値を求める
		Path path = new File("C:\\java8\\sample\\06_Stream\\test\\test.txt").toPath();
		try(Stream<String> s = Files.lines(path)){
			int max = s.mapToInt(l -> Integer.parseInt(l))
				.reduce(0, (n ,m )-> Integer.max(m, m));

			System.out.println("ファイル内の最大値：" + max);

		} catch (IOException ex) {
			Logger.getLogger(SampleStream.class.getName()).log(Level.SEVERE, null, ex);
		}
	}
}
