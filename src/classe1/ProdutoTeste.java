package classe1;

import java.util.Scanner;

public class ProdutoTeste {
	public static void main(String[] args) {
		Produto p1 = new Produto();
		p1.nome = "Notebook";
		p1.preco = 4356.89;
		p1.desconto = 0.25;
		
		var p2 = new Produto();
		p2.nome = "Caneta Preta";
		p2.preco = 12.56;
		p2.desconto = 0.29;
		
		System.out.println(p1.nome);
		System.out.println(p2.nome);
		
		double precoFinal = p1.preco * (1 - p1.desconto);
		double precoFInal2 = p2.preco * (1 - p2.desconto);
		double mediaCarrinho = (precoFinal + precoFInal2) / 2;
		
		System.out.printf("A média do carrinho é: R$%.2f.", mediaCarrinho);
		
	}
}
