package secoes;

import java.util.Locale;
import java.util.Scanner;

public class Aula10_88_vetores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int ene = sc.nextInt();
		double[] vetor = new double[ene];
		
		for(int i=0; i<ene; i++) {
			vetor[i] = sc.nextDouble();			
		}
		
		double soma = 0.0;
		
		for(int j=0; j<ene; j++) {
			soma += vetor[j];
		}
		
		double media = soma / ene;
		
		System.out.printf("media: %.2f", media);
		
		sc.close();
	}	

}
