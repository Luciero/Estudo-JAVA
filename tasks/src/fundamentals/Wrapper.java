package fundamentals;


public class Wrapper {
	public static void main(String[] args) {

		// byte
		Byte b = 100;
		Short s = 10000;

		// integer
		// Integer i = Integer.parseInt(input.next()); // int
		Integer i = 10000;
		Long l = 1_000_000_000_000_000_000L;

		System.out.println(b.byteValue());
		System.out.println(s.toString());
		System.out.println(i * 321);
		System.out.println(l / 300);

		Boolean bo = Boolean.parseBoolean("true");
		System.out.println(bo);

		Character c = '#'; // char
		System.out.println(c + "...");

	}

}