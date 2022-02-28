import java.util.Scanner;

public class Condicional {
	public static void teste() {
		int x;
		
		System.out.println("Que horas são?\n");
		Scanner hora = new Scanner(System.in);
		x = hora.nextInt();
		
		if(x > 0 && x <=12) {
			System.out.println("Bom dia");
		}
		else {
			if(x >12 && x <18) {
				System.out.println("Boa tarde!");
			}
			else {
				System.out.println("Boa noite!");
			}
		}
		hora.close();
	}
}
