package Desafios;

import java.util.Iterator;

public class LoopMil {
	public static void main(String[] args) {
		int soma = 0;
		for (int i = 0; i <= 1000; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				soma += i;
			}
		}
		System.out.println(soma);
	}
}
