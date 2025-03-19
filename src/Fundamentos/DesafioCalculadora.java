package Fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {
	public static void main(String[] args) {
		// ler n1
		// ler n2
		// escolha opç ( + - * / %
		// print resultado
		
		Scanner sc = new Scanner(System.in);
		System.out.println("----------");
		System.out.println(" 7 - 8 - 9");
		System.out.println(" 4 - 5 - 6");
		System.out.println(" 1 - 2 - 3");
		System.out.println("----------");
		System.out.println("Escolha o primeiro número para sua operação: ");
		double numero1 = sc.nextInt();
		System.out.println("Agora, escolha o segundo número: ");
		double numero2 = sc.nextInt();
		System.out.println("Qual operação a seguir deseja realizar?: +, -, /, * ou %");
		String operacao = sc.next();
		
		double resultado = "+".equals(operacao) ? numero1 + numero2 : 0;
		resultado = "-".equals(operacao) ? numero1 - numero2 : resultado;
		resultado = "/".equals(operacao) ? numero1 / numero2 : resultado;
		resultado = "*".equals(operacao) ? numero1 * numero2 : resultado;
		resultado = "%".equals(operacao) ? numero1 % numero2 : resultado;
		
		System.out.printf("%.2f %s %.2f = %.2f", numero1, operacao, numero2, resultado);
		
		
	}
}
