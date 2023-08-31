package fundamentals;

import javax.swing.JOptionPane;

public class StringToNumber {

	public static void main(String[] args) {
		
		String valor1 = JOptionPane.showInputDialog("Digite um numero");
		String valor2 = JOptionPane.showInputDialog("Digite um numero");
		
		System.out.println(valor1 + valor2);
		
		double numero1 = Double.parseDouble(valor1); //transforma a string em double
		double numero2 = Double.parseDouble(valor2);
		
		double soma = numero1 + numero2;
		System.out.println("Soma: " + soma);
		System.out.printf("Media: %. 1f", soma/2);
		
		}
}