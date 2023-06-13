package exercicios_09_Construtores;

import java.util.Locale;
import java.util.Scanner;
import entities.Customer;

public class Cliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Customer dados;
		
		System.out.print("Enter account number: ");
		int conta = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String nome = sc.nextLine();
		System.out.print("Is there an initial deposit (y/n)? ");
		char resp = sc.nextLine().charAt(0);
		
		
		if(resp == 'y') {
			System.out.print("Enter initial deposit value: ");
			double initial  = sc.nextDouble();
			dados = new Customer(conta, nome, initial);
		}
		else {
			dados = new Customer(conta, nome);
		}	
		
		System.out.println();
		System.out.println("Account data:");
		System.out.println(dados);
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		double adcionar = sc.nextDouble();
		dados.adicionar(adcionar);
		System.out.println("Updated account data:");
		System.out.println(dados);
		
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		double retirar = sc.nextDouble();
		dados.retirar(retirar);
		System.out.println("Updated account data:");
		System.out.println(dados);
		
		sc.close();
	}

}
