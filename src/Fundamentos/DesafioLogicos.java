package Fundamentos;

import java.util.Scanner;

public class DesafioLogicos {
	public static void main(String[] args) {
		// Trabalho na terça (v ou F)
		/*
		 *If T1 e t2 == v 
		 *ir pro shop tomar sorvete &
		 *COMPRAR tv 50pol
		 * 
		 * If T1 OR T2 == v
		 * ir pro shop tomar sorvete & comprar tv 32
		 * 
		 * if t1 && t2 == F
		 * Ficar em casa 
		 */
		
		boolean trabalho1;
		boolean trabalho2;
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("O trabalho de terça-feira deu certo?: 1- Sim, 2- Não");
		int escolha = sc.nextInt();
		
		trabalho1 = (escolha == 1);
		
		
		System.out.println("O trabalho de quinta-feira deu certo?: 1- Sim, 2- Não");
		int escolha1 = sc.nextInt();
		
		trabalho2 = (escolha1 == 1);
				
		
		if (trabalho1 && trabalho2) {
			System.out.println("Fomos ao shopping tomar sorvete e comprar a TV de 50 polegadas!");
		} else if (trabalho1 || trabalho2) {
			System.out.println("Fomos ao shopping tomar sorvete e comprar a TV de 32 polegadas");
		} else if (trabalho1 && trabalho2) {
			System.out.println("Ficamos em casa");	
		}
		
		
		
		
		
		
		
		
	}
}
