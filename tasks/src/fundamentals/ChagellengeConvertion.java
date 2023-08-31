package fundamentals;

import java.util.Scanner;

public class ChagellengeConvertion {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite o primeiro salario: ");
		String salary1 = input.nextLine().replace(",", ".");
		
		System.out.print("\nDigite o segundo salario: ");
		String salary2 = input.nextLine().replace(",", ".");
		
		System.out.print("\nDigite o terceiro salario: ");
		String salary3 = input.nextLine().replace(",", ".");
		
		Double salario1 = Double.parseDouble(salary1);
		Double salario2 = Double.parseDouble(salary2);
		Double salario3 = Double.parseDouble(salary3);
		
		Double media = (salario1 + salario2 + salario3) / 3;
		System.out.printf("\nMedia: %.2f", media);
		
		input.close();
	}

}
