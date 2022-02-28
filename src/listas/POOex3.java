package listas;

import java.util.Locale;
import java.util.Scanner;
import entities.Aluno;

public class POOex3 {
	public static void Q3(){
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite seu nome e suas 3 notas para sabermos se está aprovado:");
		Aluno estudante = new Aluno();
		
		estudante.nome = sc.nextLine();
		estudante.nota1 = sc.nextDouble();
		estudante.nota2 = sc.nextDouble();
		estudante.nota3 = sc.nextDouble();
		
		System.out.println("Nota Final = " + estudante.notaFinal());
		if (estudante.notaFinal()<60) {
			System.out.println("FALHOU");
			System.out.printf("Faltou %.2f pontos", estudante.notaFaltando());
		}
		else {
			System.out.println("APROVADO");
			
			sc.close();
		}
	}
}
