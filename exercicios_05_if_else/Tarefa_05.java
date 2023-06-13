package exercicios_05_if_else;

import java.util.Locale;
import java.util.Scanner;

public class Tarefa_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entrada:");
		int cod = sc.nextInt();
		int quant = sc.nextInt();
		double total = 0;
		
		if(cod == 1) {
			total = quant * 4.00;			
		}
		else if(cod == 2) {
			total = quant * 4.50;
		}
		else if(cod == 3) {
			total = quant * 5.00;
		}
		else if(cod == 4) {
			total = quant * 2.00;
		}
		else if(cod == 5) {
			total = quant * 1.50;
		}
		
		System.out.println("Saída");
		System.out.printf("Total: R$ %.2f", total);
		
		sc.close();
	}

}
