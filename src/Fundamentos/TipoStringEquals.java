package Fundamentos;

import java.util.Scanner;

public class TipoStringEquals {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor de comparação: ");
		
		
		String s1 = "2";
		String s2 = sc.next();
		
		String resultado = s1.equals(s2.trim()) ? "verdadeiro" : "falso";
		System.out.println("Resultado da comparação: " + resultado);
		
	
	
	}
}
