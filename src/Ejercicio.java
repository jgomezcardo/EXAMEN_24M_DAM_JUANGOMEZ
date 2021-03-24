import java.util.Scanner;

public class Ejercicio {

	public static void main (String args[]) {
		
		int num = 0;
		
		System.out.println("Buenos días Ceinmark, soy Juan Gómez\r\n" + 
				"\r\n" + 
				"Introduce un número para averiguar si es primo o no:\r\n" + 
				"");
		
		Scanner ent = new Scanner(System.in);
		 num = ent.nextInt(); 
		if (num/num == 0) {
			System.out.println("el numero es primo");
			
		}else {
			System.out.println("El número no es primo \r\n" + 
					"Los divisores del número son:\r\n" + 
					"");
		}
	}
}
