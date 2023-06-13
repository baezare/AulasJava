package exercicios_05_if_else;

import java.util.Locale;
import java.util.Scanner;

public class Tarefa_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entrada:");
		double valor = sc.nextDouble();
		
		if(valor < 0 || valor > 100) {
			System.out.println("Saída");
			System.out.println("Fora de intervalo");
		}
		else if(valor > 75) {
			System.out.println("Saída");
			System.out.println("Intervalo (75,100)");
		}
		else if(valor > 50) {
			System.out.println("Saída");
			System.out.println("Intervalo (50,75)");		
		}
		else if(valor > 25) {
			System.out.println("Saída");
			System.out.println("Intervalo (25,50)");
		}
		else if(valor > 0) {
			System.out.println("Saída");
			System.out.println("Intervalo (0,25)");
		}		
		
		sc.close();
	}

}
