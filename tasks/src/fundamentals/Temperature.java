package fundamentals;

public class Temperature {
	public static void main(String[] args) {
		// (°F - 32) * 5/9 = °C
		final double FACTOR = 5.0 / 9.0;
		final int ADJUST = 32;

		double fahren = 86;
		double celsius = (fahren - ADJUST) * FACTOR;

		System.out.println(celsius + " °C");
		
		fahren = 1000; 
		celsius = (fahren - ADJUST) * FACTOR;
		
		System.out.println(celsius + " °C");

	}
}
