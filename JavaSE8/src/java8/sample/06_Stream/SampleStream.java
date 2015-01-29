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
		// 1�`10�̂����A�������o��
		IntStream.rangeClosed(0, 10)	// ������2�󂯎��A1����10�܂ł̐���Stream�𐶐�
			.filter(n -> n%2 ==0)   // ����Stream��������������t�B���^�����O
			.forEach(n -> System.out.println("�����\���F" + n));   // �t�B���^�����O���ꂽ�l��\��

		// ̧�ق��琔�����ǂݍ��݁A�ő�l�����߂�
		Path path = new File("C:\\java8\\sample\\06_Stream\\test\\test.txt").toPath();
		try(Stream<String> s = Files.lines(path)){
			int max = s.mapToInt(l -> Integer.parseInt(l))
				.reduce(0, (n ,m )-> Integer.max(m, m));

			System.out.println("�t�@�C�����̍ő�l�F" + max);

		} catch (IOException ex) {
			Logger.getLogger(SampleStream.class.getName()).log(Level.SEVERE, null, ex);
		}
	}
}
