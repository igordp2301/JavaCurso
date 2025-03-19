package EstruturaDeControle;

import java.util.Scanner;

public class NotaAlunos {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a primeiro nota: ");
		double notaUm = sc.nextDouble();
		
		System.out.println("Digite a segunda nota: ");
		double notaDois = sc.nextDouble();
		sc.nextLine();
		
		double media = (notaUm + notaDois) / 2;
		
		String resultado = media >= 70 ? "Aprovado" : "Reprovado";
		resultado = media >= 40 && media < 70 ? "Recuperação" : resultado;
		resultado = media < 40 ? "Reprovado" : resultado;
		
		System.out.println(resultado);
		sc.close();
	}
}
