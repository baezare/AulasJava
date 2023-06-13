package secoes;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Aula10_89_vetores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int ene = sc.nextInt();
		
		Product[] elementos = new Product[ene];
		
		for(int i=0; i<elementos.length; i++) {
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			elementos[i] =  new Product(name, price);
		}
		
		double soma = 0.0;
		
		for(int j=0; j<elementos.length; j++) {
			soma += elementos[j].getPrice();
		}
		
		double media = soma / ene;
		
		System.out.printf("Media: %.2f", media);
		
		sc.close();
	}

}
