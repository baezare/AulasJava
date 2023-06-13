package exercicios_05_if_else;

import java.util.Scanner;

public class Tarefa_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entrada:");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		if(num1 % num2 == 0 || num2 % num1 == 0) {
			System.out.println("Sao Multiplos");
		}
		else {
			System.out.println("Nao Sao Multiplos");
		}
		
		
		
		sc.close();
	}

}
