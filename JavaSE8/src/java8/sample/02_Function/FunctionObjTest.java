import java.util.function.Function;

public class FunctionObjTest { 
	public static void main(String[] args){ 
		Function<Integer,Character> f = i -> "Hello,Java8".charAt(i); 
		System.out.println(f.apply(4)); 
	} 
}