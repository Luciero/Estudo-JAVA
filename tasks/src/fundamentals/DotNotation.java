package fundamentals;

public class DotNotation {
	public static void main(String[] args) {
		
		String s = "Good morning X";
		s = s.replace("X", "sir");		
		s = s.toUpperCase();
		s = s.concat("!");
		System.out.println(s);
		
		
		String x = "Good morning Y"
				.replace("Y","Peter")
				.toUpperCase()
				.concat("!");	
		System.out.println(x);
		
		// Primitive types don't have a dot operator "."
		
	}

}
