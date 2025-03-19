package EstruturaDeControle;

import java.util.Scanner;

public class Primo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Diga o número inteiro: ");
		int num = sc.nextInt();
		sc.nextLine();
		
		boolean primo = true;
		
		for(int i = 2; i <= num / 2; i++) {
			if(num % i == 0) {
				primo = false;
				break;
			}
			
		}
		System.out.println(primo);
		
	}
}
