package exercicios_10_vetores;

import java.util.Locale;
import java.util.Scanner;

public class Tarefa_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		int quant = sc.nextInt();
		
		double[] nums = new double[quant];
		
		double soma = 0.0;
		for(int i=0; i<nums.length; i++) {
			System.out.print("Digite um numero: ");
			nums[i] = sc.nextDouble();
			soma += nums[i];
		}
		
		double media = (double)soma / quant;
		System.out.println();
		System.out.printf("MEDIA DO VETOR = %.3f%n", media);
		System.out.println("ELEMENTOS FORA DA MEDIA:");
		for(int j=0; j<nums.length; j++) {
			if(nums[j] < media) {
				System.out.println(nums[j]);
			}
		}
		
		
		sc.close();
	}

}
