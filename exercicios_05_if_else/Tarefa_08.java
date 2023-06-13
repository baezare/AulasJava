package exercicios_05_if_else;

import java.util.Locale;
import java.util.Scanner;

public class Tarefa_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entrada:");
		double valor = sc.nextDouble();
		double total = 0;
		
		if(valor >= 4500.01) {
			System.out.println("Saída");
			total = (valor - 4500) * 0.28 + 350;
			System.out.printf("R$ %.2f", total);
		}
		else if(valor >= 3000.01) {
			System.out.println("Saída");
			total = (valor - 3000.0) * 0.18 + 80.0;
			System.out.printf("R$ %.2f", total);
		}
		else if(valor >= 2000.01) {
			System.out.println("Saída");
			total = (valor - 2000.0) * 0.08;
			System.out.printf("R$ %.2f", total);
		}
		else if(valor >= 0.0) {
			System.out.println("Saída");
			System.out.println("Isento");
		}		
		
		sc.close();
	}

}
