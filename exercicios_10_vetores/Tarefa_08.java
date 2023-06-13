package exercicios_10_vetores;

import java.util.Locale;
import java.util.Scanner;

public class Tarefa_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos elementos vai ter o vetor? ");		
		int nums = sc.nextInt();
		
		int[] numeros = new int[nums];
		
		int soma = 0;
		int total =0;
		
		for(int i=0; i<numeros.length; i++) {
			System.out.print("Digite um numero: ");
			numeros[i] = sc.nextInt();
			if(numeros[i] % 2 == 0) {
				soma+=numeros[i];
				total++;
			}			
		}
		
		double media = (double) soma / total;
		
		if(total != 0) {
			System.out.println("MEDIA DOS PARES = " +media);
		}
		else {
			System.out.println("NENHUM NUMERO PAR");
		}
		
		sc.close();
	}

}
