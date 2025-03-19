package Fundamentos;

import java.util.Scanner;

public class Desafio {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		/*System.out.print("Digite o antepenultimo salário recebido: ");
		String salarioStr1 = sc.next().replace(",", ".");
		System.out.print("Digite o penultimo salário recebido: ");
		String salarioStr2 = sc.next().replace(",", ".");
		System.out.print("Digite o ultimo salário recebido: ");
		String salarioStr3 = sc.next().replace(",", ".");

		double salario1 = Double.parseDouble(salarioStr1);
		double salario2 = Double.parseDouble(salarioStr2);
		double salario3 = Double.parseDouble(salarioStr3);

		double media = (salario1 + salario2 + salario3) / 3;

		System.out.printf("A média salaria é: R$ %.2f", media); */

		//String para Double
		
		String valor1 = "1293.88";
		double valorDouble = Double.parseDouble(valor1);
		
		double valorMult = valorDouble * 10;
		
		System.out.printf("%.2f", valorMult);
		
		int valorNum = Integer.parseInt(valor1);
		
		
		
		
		
		
		
		
		
		
		
		sc.close();

	}
}
