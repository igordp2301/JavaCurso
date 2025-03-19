package exercicioClasses;

public class DataTeste{
	public static void main(String[] args) {
		Data p1 = new Data();
		
		p1.dia = 23;
		p1.mes = 01;
		p1.ano = 2006;
		
		System.out.printf("%d/%d/%d", p1.dia, p1.mes, p1.ano);
		
		var d2 = new Data();
		d2.dia = 31;
		d2.mes = 11;
		d2.ano = 2020;
		
		System.out.printf("\n%d/%d/%d", d2.dia, d2.mes, d2.ano);
		
	}
	
	

}
