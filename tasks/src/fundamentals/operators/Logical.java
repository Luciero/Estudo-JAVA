package fundamentals.operators;

public class Logical {

	public static void main(String[] args) {
		
		boolean condition1 = true;
		boolean condition2 = 3 > 7;
		
		System.out.println(condition1 && !condition2); // and not
		System.out.println(condition1 || condition2); // or
		System.out.println(condition1 ^ condition2); // Xor
	}
}
