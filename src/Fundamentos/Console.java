package Fundamentos;

import java.util.Scanner;

public class Console {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Qual a sua idade?: ");
		int idade = entrada.nextInt();
		
		entrada.nextLine();
		System.out.print("Qual seu nome?: ");
		String nome = entrada.nextLine();
		
		System.out.print("Qual seu sobrenome?: ");
		String sobrenome = entrada.nextLine();
		
		System.out.printf("Você é o %s %s e possui %d anos. %n", nome, sobrenome, idade);
		entrada.close();
	}   
}
