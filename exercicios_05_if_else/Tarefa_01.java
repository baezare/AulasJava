package exercicios_05_if_else;

import java.util.Scanner;

public class Tarefa_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Entrada: ");
		int inteiro = sc.nextInt();
		
		if(inteiro > -1) {
			System.out.println("Saída: NAO NEGATIVO");
		}
		else {
			System.out.println("Saída: NEGATIVO");
		}
		
		
		sc.close();
	}

}
