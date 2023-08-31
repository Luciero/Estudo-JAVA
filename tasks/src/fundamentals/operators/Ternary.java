package fundamentals.operators;

public class Ternary {
	public static void main(String[] args) {
		
		double average = 3.5;
		
		String partialResult = average >= 5.0 ? "In Recovery" : "Dissaproved";
		String finalResult = average >= 7.0 ? "Approved" : partialResult;
		System.out.println("Student " + finalResult);
		
		
		
	}

}
