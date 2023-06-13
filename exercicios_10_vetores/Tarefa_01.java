package exercicios_10_vetores;

import java.util.Scanner;

public class Tarefa_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Quantos números você vai digitar? ");		
		int quant = sc.nextInt();
		
		System.out.println();
		
		int[] num = new int[quant];
		
		for(int i=0; i<num.length; i++) {
			System.out.print("Digite um número: ");
			int coleta = sc.nextInt();
			num[i] = coleta;
		}
		
		System.out.println();
		System.out.println("NUMEROS NEGATIVOS");
		for(int j=0; j<num.length; j++) {
			if(num[j] < 0) {
				System.out.println(num[j]);
			}
		}
		
		sc.close();
	}

}
