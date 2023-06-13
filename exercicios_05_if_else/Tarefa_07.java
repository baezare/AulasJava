package exercicios_05_if_else;

import java.util.Locale;
import java.util.Scanner;

public class Tarefa_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entrada:");
		double x1 = sc.nextDouble();
		double y1 = sc.nextDouble();
		
		if(x1 == 0 && y1 == 0) {
			System.out.println("Saída:");
			System.out.println("Origem");
		}
		else if (x1 > 0 && y1 > 0) {
			System.out.println("Saída:");
			System.out.println("Q1");
		}
		else if (x1 < 0 && y1 > 0) {
			System.out.println("Saída:");
			System.out.println("Q2");
		}
		else if (x1 < 0 && y1 < 0) {
			System.out.println("Saída:");
			System.out.println("Q3");
		}
		else if (x1 > 0 && y1 < 0) {
			System.out.println("Saída:");
			System.out.println("Q4");
		}
		
		sc.close();
	}

}
