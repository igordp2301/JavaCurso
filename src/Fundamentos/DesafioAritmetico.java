package Fundamentos;

public class DesafioAritmetico {
	public static void main(String[] args) {

		// Expressão 1
		double a = 6 * (3 + 2);
		double a1 = Math.pow(a, 2);
		double x = a1 / 6;

		// Expressão 2
		double b = (1 - 5) * (2 - 7) / 2;
		double b1 = Math.pow(b, 2);

		double c = x - b1;
		double d = Math.pow(c, 3);

		double e = Math.pow(10, 3);

		double f = d / e;

		double numA = Math.pow(6 * (3 + 2), 2);
		double denA = 3 * 2;
		double superiorA = numA / denA;

		double superiorB = Math.pow((1 - 5) * (2 - 7) / 2, 2);

		double superior = Math.pow(superiorA - superiorB, 3);
		double inferior = Math.pow(10, 3);

		double resultado = superior / inferior;

		System.out.println((int) resultado);

	}
}
