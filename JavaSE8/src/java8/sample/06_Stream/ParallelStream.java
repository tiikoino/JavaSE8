import java.util.ArrayList;
import java.util.List;

public class ParallelStream {

	public static void main(String[] args) {
		// personList�̒�`
		List<Person> personList = new ArrayList<>();
		personList.add(new Person("�A���X", 10));
		personList.add(new Person("�{�u", 20));
		personList.add(new Person("Duke1", 10));
		personList.add(new Person("Duke2", 20));

		// Person ���X�g���疼�O���o��
		personList.stream() 		// List �� Stream �֕ϊ�
			.map(p -> p.getName())	// Stream ���疼�O�������o
			.forEach(p -> System.out.println("���O�\��(��������)�F" + p));	// ���o���ꂽ���O���X�g��\��

		// Person ���X�g���疼�O���o��
		personList.parallelStream()	// List ����s�����p Stream�֕ϊ�
			.map(p -> p.getName())	// Stream���疼�O�������o
			.forEach(p -> System.out.println("���O�\��(���񏈗�)�F" + p));	// ���o���ꂽ���O���X�g��\��
	}
}
