package listas;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class Lista_8 {
	public static void Q1() {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a cotação do dolar: ");
		CurrencyConverter.valorDollar = sc.nextDouble();
		System.out.println("Digite quantos dolares deseja comprar: ");
		CurrencyConverter.qtdeDollar = sc.nextDouble();

		System.out.println("Quantidade a ser paga em reais: " + CurrencyConverter.CC());
	}
}
