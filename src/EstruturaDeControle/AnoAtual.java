package EstruturaDeControle;

import java.util.Scanner;

public class AnoAtual {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o ano atual: ");
		int anoAtual = sc.nextInt();
		sc.nextLine();
		
		if(anoAtual % 4 == 0) {System.out.println("O ano atual é bissexto!");
		}else { System.out.println("o Ano atual não é bissexto");}
		sc.close();
	}
	
	
	
}
