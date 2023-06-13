package exercicios_05_if_else;

import java.util.Scanner;

public class Tarefa_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entrada:");
		int num = sc.nextInt();
		
		if(num % 2 == 0) {
			System.out.println("Saída: ");
			System.out.println("PAR");
		}
		else {
			System.out.println("Saída:");
			System.out.println("IMPAR");
		}
		
		sc.close();
	}

}
