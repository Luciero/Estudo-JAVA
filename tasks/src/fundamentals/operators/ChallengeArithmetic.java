package fundamentals.operators;

public class ChallengeArithmetic {
	public static void main(String[] args) {
		
		int a = 3 * 4 - 10;
		int b = (int) Math.pow(a, 3);
		System.out.println(b);
		
		// Quebrando o desafio <-- meu jeito
		
		int firt = 6 * (3 + 2);
		firt = (int) Math.pow(firt, 2);
		firt /= (3 * 2);
		
		int second = (1 - 5) * (2 - 7) / 2;
		second = (int) Math.pow(second, 2);
		
		int result = (int) Math.pow(firt - second, 3);
		result /= (int) Math.pow(10, 3);
		
		System.out.println(result);
		
		
		// Prof 
		
		double numA = Math.pow(6* (3 + 2), 2);
		double denA = 3 * 2;
		
		double numB = (1 - 5) * (2 - 7);
		double denB = 2;
		
		double superiorA = numA / denA;
		double superiorB = Math.pow(numB / denB, 2);
		
		double superior = Math.pow(superiorA - superiorB, 3);
		double inferior = Math.pow(10, 3);
		
		double resultado = superior / inferior;
		System.out.println(resultado);
		
	}

}
