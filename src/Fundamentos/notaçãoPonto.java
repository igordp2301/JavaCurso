package Fundamentos;

public class notaçãoPonto {
	public static void main(String[] args) {
		double a = 2.3;
		String s = "Bom dia X";
		s = s.toUpperCase();
		
		s = s.replace("X", "Senhora");
		
		s = s.concat("!!!");
		
		System.out.println(s);
	}
}
