package EstruturaDeControle;

public class DesafioQuadrados {
	public static void main(String[] args) {
		int somaDosQuadrados = 0;
		int soma = 0;
		
		for(int i = 1; i <= 100; i++) {
			somaDosQuadrados += i * i;
			soma += i;
			}
		
		int quadradoDaSoma = soma * soma;
		int diferenca = quadradoDaSoma - somaDosQuadrados;
		
		System.out.println(quadradoDaSoma);
		System.out.println(somaDosQuadrados);
		System.out.println(diferenca);
			
			
		}
	}

