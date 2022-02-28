import java.util.Scanner;

public class Lista3 {
	public static void Q2() {
		int x,y;
		System.out.println("Digite dois números para mostrarmos o quadrante das coordenadas:");
		Scanner num = new Scanner(System.in);
		x = num.nextInt();
		y = num.nextInt();
		
		while (x!=0 && y!=0) {
			if (x>0 && y>0) {
				System.out.println("Quadrante 1");
			}
			else if (x<0 && y>0) {
				System.out.println("Quadrante 2");
			}
			else if (x<0 && y<0) {
				System.out.println("Quadrante 3");
			}
			else {
				System.out.println("Quadrante 4");
			}
			
			x = num.nextInt();
			y = num.nextInt();
		}
		num.close();
	}
	
	public static void Q3() {
		int alc, gas, die, opt;
		Scanner num = new Scanner(System.in);
		alc = 0;
		gas = 0;
		die = 0;
		opt = 0;
		
		while (opt != 4) {
			opt = num.nextInt();
			if (opt == 1) {
				alc++;
			}
			else if(opt == 2) {
				gas++;
			}
			else if(opt == 3) {
				die++;
			}
			else if(opt == 4) {
			}
			else {
				System.out.println("Erro, digite novamente");
			}
		}
		System.out.println("Alcool: " + alc);
		System.out.println("Gasolina: " + gas);
		System.out.println("Diesel: " + die);
		System.out.println("Muito obrigado!");
		
		num.close();
	}
}
