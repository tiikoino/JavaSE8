import java.util.function.BiFunction;

public class BiFunctionObjTest {
	public static void main(String[] args){
		BiFunction<String,String,Integer> biFunction =
			 (String first, String second) -> Integer.compare(first.length(), second.length());

		// ���\�b�h�̌Ăяo��
		System.out.println("���ʁF" + biFunction.apply("Hello","World!"));
	}
}
