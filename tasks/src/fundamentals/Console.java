package fundamentals;

import java.util.Scanner;

public class Console {
	public static void main(String[] args) {

		System.out.print("Bom dia!");
		System.out.println("Bom");
		System.out.println("dia");

		System.out.printf("Megasena %d %d %d %d %d %d %n", 1, 2, 3, 4, 5, 6);
		System.out.printf("Salario: %.1f%n", 123.456);

		Scanner input = new Scanner(System.in);// <----
		System.out.print("Digite seu nome: ");
		String nome = input.nextLine();

		System.out.print("Digite seu Sobrenome: ");
		String sobrenome = input.nextLine();

		System.out.printf("Nome: %s %s", nome, sobrenome);

		input.close(); // Necessario para finalizar o scanner (entrada)
	}

}
