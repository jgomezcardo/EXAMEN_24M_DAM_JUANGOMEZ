import java.util.Scanner;

public class Ejercicio {

	public static void main (String args[]) {
		
		int num = 0;
		
		System.out.println("Buenos d�as Ceinmark, soy Juan G�mez\r\n" + 
				"\r\n" + 
				"Introduce un n�mero para averiguar si es primo o no:\r\n" + 
				"");
		
		Scanner ent = new Scanner(System.in);
		 num = ent.nextInt(); 
		if (num/num == 0) {
			System.out.println("el numero es primo");
			
		}else {
			System.out.println("El n�mero no es primo \r\n" + 
					"Los divisores del n�mero son:\r\n" + 
					"");
		}
	}
}
