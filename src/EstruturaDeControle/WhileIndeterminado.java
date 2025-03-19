package EstruturaDeControle;

import java.util.Scanner;

public class WhileIndeterminado {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite algo: ");
		String resposta = sc.nextLine();
		
		while(!resposta.equalsIgnoreCase("SAIR")) {
			System.out.print("Digite algo: ");
			resposta = sc.nextLine();
		}
	}
}
