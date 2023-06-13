package exercicios_10_vetores;

import java.util.Locale;
import java.util.Scanner;

public class Tarefa_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int num = sc.nextInt();
		
		double[] vect = new double[num];
		
		for(int i=0; i<vect.length; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextDouble();
		}
		int posicao = 0;
		double maior = 0.0;
		for(int j=0; j<vect.length; j++) {
			if(vect[j]> maior) {
				maior = vect[j];
				posicao = j;
			}
		}		
	
		System.out.println();
		System.out.println("MAIOR VALOR = "+maior);
		System.out.println("POSICAO DO MAIOR VALOR = "+posicao);
		
		sc.close();
	}

}
