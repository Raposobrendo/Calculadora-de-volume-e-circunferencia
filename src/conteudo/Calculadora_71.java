package conteudo;

import java.util.Locale;
import java.util.Scanner;

import util.Calc;

public class Calculadora_71 {
	public static void Calc() {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o raio:");
		
		double raio = sc.nextDouble();
	
		double c = Calc.circunferencia(raio);
		
		double v = Calc.volume(raio);
		
		System.out.println("Circunferencia: " + c);
		System.out.println("Volume: " + v);
		System.out.println("PI: " + Calc.PI);
		
		sc.close();
	}	
}
