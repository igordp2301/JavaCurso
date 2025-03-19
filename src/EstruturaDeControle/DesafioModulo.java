package EstruturaDeControle;

import java.util.Scanner;

public class DesafioModulo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		double num = sc.nextDouble();
		sc.nextLine();
		
		if(num >= 0 && num <= 10 && num % 2 == 0) {
			System.out.println("Verdade");
		} else {
			System.out.println("Falso");
		}
		
		
		
		sc.close();
	}
}
