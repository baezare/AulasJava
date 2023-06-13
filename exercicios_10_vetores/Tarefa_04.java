package exercicios_10_vetores;

import java.util.Scanner;

public class Tarefa_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int quant = sc.nextInt();
		
		int[] pares = new int[quant];
		for(int i=0; i<pares.length; i++) {
			System.out.print("Digite um numero: ");
			pares[i] = sc.nextInt();
		}
		
		System.out.println();
		int somaPares = 0;
		System.out.println("NUMEROS PARES:");
		for(int j=0; j<pares.length; j++) {
			if(pares[j] % 2 == 0) {
				System.out.print(pares[j]+" ");
				somaPares += 1;
			}
		}
		System.out.println();
		System.out.println();
		System.out.println("Quantidade de pares  = "+somaPares);
		
		sc.close();
	}

}
