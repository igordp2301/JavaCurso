package EstruturaDeControle;

import java.util.Scanner;

public class DesafioWhile {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int quantidadeDeNotas = 0;
		double nota = 0;
		double total = 0;
		
		
		while(nota != -1) {
			System.out.print("Digite a nota do aluno (ou -1 p/ sair): ");
			nota = sc.nextDouble();
			
			if(nota <= 10 && nota >= 0) {
				total += nota;
				quantidadeDeNotas++;
			} else if (nota != -1) {
				System.out.println("nota invalida");
			}
			
		}
		
		double media = total / quantidadeDeNotas;
		System.err.println("Média: "+ media);
		
		
		sc.close();
	}
}
