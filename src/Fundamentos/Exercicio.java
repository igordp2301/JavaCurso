package Fundamentos;

import java.util.Scanner;

public class Exercicio {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos elementos terá sua lista?");
		int tamanho = sc.nextInt();
		
		int lista[] = new int[tamanho];
		
		for(int i = 0; i < tamanho; i++) {
			lista[i] = sc.nextInt();
		}
		
		System.out.println("Tamanaho da lista é: " + lista.length);
		
		
	}
}
