package secoes;

import java.util.Locale;
import java.util.Scanner;

import entities.Info;

public class Aula08_66_oo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Info dados = new Info();
		
		System.out.println("Enter product data:");
		System.out.print("Name: ");
		dados.name = sc.nextLine();
		System.out.print("Price: ");
		dados.price = sc.nextDouble();
		System.out.print("Quantity in stock: ");
		dados.quantity = sc.nextInt();
		
		
		System.out.println();
		System.out.println("Product data: "+dados);
		
		System.out.println();
		System.out.print("Enter the number of products to be added in stock: ");
		int adicao = sc.nextInt();
		dados.adicao(adicao);
		
		System.out.println();
		System.out.println("Updated data: " +dados);
		
		System.out.println();
		System.out.print("Enter the number of products to be removed from stock: ");
		int remover = sc.nextInt();
		dados.remover(remover);
		
		System.out.println();
		System.out.println("Updated data: " +dados);
		
		sc.close();
	}

}
