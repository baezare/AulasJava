package exercicios_08_oo;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class Cotacao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What is the dollar price? ");
		double price = sc.nextDouble();
		System.out.print("How many dollars will be bought? ");
		double amount = sc.nextDouble();
		double calculo = CurrencyConverter.calc(price, amount);
		System.out.printf("Amount to be paid in reais = %.2f", calculo);
		
		sc.close();
	}

}
