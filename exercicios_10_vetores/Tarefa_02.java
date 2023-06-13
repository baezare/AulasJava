package exercicios_10_vetores;

import java.util.Locale;
import java.util.Scanner;

public class Tarefa_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int quant = sc.nextInt();
		double[] nums = new double[quant];
		
		for(int i=0; i<nums.length; i++) {
			System.out.print("Digite um numero: ");
			nums[i] = sc.nextDouble();
			
		}
		
		double soma = 0.0;
		System.out.println();
		System.out.print("Valores = ");
		for(int j=0; j<nums.length; j++) {
			System.out.print(nums[j]+ " ");
			soma+=nums[j];
		}
		System.out.println();
		System.out.printf("Soma = %.2f%n", soma);
		double media = soma / quant;
		System.out.printf("MEDIA = %.2f", media);
		
		
		sc.close();
	}

}
