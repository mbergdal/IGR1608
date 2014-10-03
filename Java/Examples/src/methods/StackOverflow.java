package methods;

public class StackOverflow {

	public static void main(String[] args) {
		//while(true){
			doSomething();
		//}

	}

	private static void doSomething() {
		System.out.println("HelloWorld!");
		doSomething();
	}
}
