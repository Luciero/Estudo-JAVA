package fundamentals;

public class PrimitiveNumbersTypesConvertion {
	
	public static void main(String[] args) {
		double a = 1;  //implict
		System.out.println(a);
		
		float b = (float) 1.123123;  //explicit (CAST)
		System.out.println(b);
		
		int c  = 3;
		byte d = (byte) c; // (CAST)
		System.out.println(d);
		
		double e = 1.9999;
		int f = (int) e; // (CAST)
		System.out.println(f);
	}

}
