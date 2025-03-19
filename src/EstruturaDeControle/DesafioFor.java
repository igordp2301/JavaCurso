package EstruturaDeControle;

public class DesafioFor {
	public static void main(String[] args) {
		
		String valor = "#";
		for(int i = 1; i <=5; i++) {
			System.out.println(valor);
			valor += "#";
		}
		
		//V. do desafio
		//Não pode usar valor numerico para controlar o laço 
	
		for(String cerca = "#"; !cerca.equals("######"); cerca += "#" ) {
			System.out.println(cerca);
		}
	}
}
