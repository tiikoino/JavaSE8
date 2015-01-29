import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamPractice {
	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("Java","JavaScript","C","Scala","Java");
		
		// 1. �d�������v�f��r�������A�z��̌������擾
		long count = list.stream().distinct().count();
		System.out.println("Q1 : " + count);
		
		// 2. list�̗v�f�����ɕ\��
		list.stream().forEach(s -> System.out.println("Q2 : " + s));

		// 3.�uJ�v�Ŏn�܂�v�f�̂݃t�B���^�����O���ĕ\��
		list.stream()
			.filter(s -> s.startsWith("J"))
			.forEach(s -> System.out.println("Q3 : " + s));
		
		// 4.�ua�v�ŏI���v�f�̂݃t�B���^�����O���āA�R���N�V�����ɕϊ����ĕ\��
		List aList = list.stream()		// Stream����
			.filter(s -> s.endsWith("a"))	// �ua�v�ŏI���v�f���t�B���^�����O
			.collect(Collectors.toList());	// �t�B���^�����O���ʂ�List�ɕϊ�
		System.out.println("Q4 : " + aList);
		
		// 5. ���X�g�̗v�f�̒��������߂āA���ꂼ��̒����𑫂����킹�����ʂ�\��
		Integer result = list.stream()
			.map(s -> s.length())
			.reduce(0, (x , y ) -> x+y);
		System.out.println("Q5 : " + result);

	}
}
