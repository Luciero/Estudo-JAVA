package fundamentals;

public class PrimitiveTypes {
	public static void main(String[] args) {
		
		// int numbers
		byte companyYears = 40;
		short numberOfflights = 567;
		int id = 220116070;
		long accumulatedPoints = 908_239_103_810L;
		//                Use L to put the literal int (default) as long
		
		// float numbers
		float salary = 51_123.23F;// Use F to put the literal double (default) as float
		double comulativeSales = 87_987_135_324.98;
		
		// boolean type
		boolean vacation = false;
		
		// char type
		char status = 'A';
	
		
		// company days
		System.out.println(companyYears * 365);
		// number of travelling
		System.out.println(numberOfflights / 2);
		// accumulated points
		System.out.println(accumulatedPoints / comulativeSales);
		System.out.println(id + ": earns = " + salary );
		System.out.println("Vacation? " + vacation);
		System.out.println("Status: " + status);
		
		
	}
}
