package EstruturaDeControle;

import java.util.Scanner;

public class JogoAdivinha {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = 24;
		
		System.out.println("Tente adivinhar um número de 0 - 100 com apenas 10 tentativas!");
		
		
		
		int chute;
		
		
		for(int tentantivas = 1; tentantivas <= 10; tentantivas++) {
			int restante = 10 - tentantivas;
			
			System.out.print(tentantivas + " - Tentativa: ");
			chute = sc.nextInt();
			
			
			if(chute < num && chute != num && restante > 0) {
				System.out.println("O número que pensei é maior, restam " + restante + " tentativas!");
			} else if (chute > num && chute != num && restante > 0) { System.out.println("O número que pensei é menor, restam " + restante + " tentativas!");}
			
			if(chute == num) {System.out.println("Você acertou o número!"); break; }
			
			if(restante == 0) {System.out.println("Você perdeu!"); }
		}
		
		
		
		
	}

}
