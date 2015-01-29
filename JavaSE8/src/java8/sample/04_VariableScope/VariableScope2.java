public class VariableScope2 {
	public static void main(String[] args) {
		repeatMessage("text", 5);
	}

	public static void repeatMessage(String text, int count) {
		Runnable r = () -> {
			while (count > 0) {
				count--;//コンパイルエラー
				System.out.println(text);
				Thread.yield();
			}
		};
		new Thread(r).start();
	}
}
