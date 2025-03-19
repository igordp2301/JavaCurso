package Fundamentos;

public class Ternario {
	public static void main(String[] args) {
		double media = 5.5; 
		String resultadoParcial = media >= 5.0 ? "em recuperação." : "reprovado.";
		String resultado = media >= 7.0 ? "Aprovado" : resultadoParcial;
		System.out.println("O aluno está "+ resultado);
		
		double nota = 9.9;
		boolean bomComportamento = true;
		boolean passouPorMedia = nota >= 7;
		boolean temDesconto = bomComportamento && passouPorMedia;
		String resultado1 = temDesconto ? "sim" : "não";
		
		System.out.println("Tem desconto? "+ resultado1);
	}
}
