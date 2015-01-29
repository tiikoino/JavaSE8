public class VariableScope {
	public static void main(String[] args) {
		repeatMessage("text", 5);
	}

	public static void repeatMessage(String text, int count) {
		Runnable r = () -> {
			for (int i = 0; i < count; i++) {
				System.out.println(i + " : " + text);
			}
			Thread.yield();
		};
		new Thread(r).start();
	}
}
