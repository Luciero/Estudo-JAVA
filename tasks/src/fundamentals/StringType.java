package fundamentals;

public class StringType {
	
	public static void main(String[] args) {
		System.out.println("Hi everyone".charAt(10));
		
		
		String s = "Good afternoon";
		System.out.println(s + "!!");
		System.out.println(s.startsWith("Good"));
		System.out.println(s.startsWith("G"));
		System.out.println(s.endsWith("ooon"));
		System.out.println(s.length());
		System.out.println(s.equals("Good morning"));
		System.out.println(s.equalsIgnoreCase("GOOD AFTERNOON"));
		System.out.println(s.toLowerCase().contains("good"));
		System.out.println(s.substring(0,7));
		
		var name = "Pedro";
		var lastName = "Henrique";
		var age = 22;
		var salary = 851.02;
		
		System.out.printf("\n\n%s %s tem %d e ganha R$%.2f", 
				name, lastName, age, salary );
				
	}

}
