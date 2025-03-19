package EstruturaDeControle;

import java.util.Scanner;

public class ElseIF {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a nota: ");
		double nota = sc.nextDouble();
		
		if(nota > 10 || nota < 0) {
			System.out.println("Nota invalida!");
		} else if (nota >= 8.1) { 
			System.out.print("Conceito A");
		} else if (nota >= 6.1) {
			System.out.print("Conceito B");
		} else if (nota >= 4.1) {
			System.out.print("Conceito C");
		} else if (nota >= 2.1) {
			System.out.print("Conceito D");
		} else {
			System.out.print("Conceito E");
		}
	}
}
