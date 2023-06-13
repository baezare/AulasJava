package exercicios_10_vetores;

import java.util.Locale;
import java.util.Scanner;

public class Tarefa_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serao digitadas? ");
		int quant = sc.nextInt();
		
		double[] alt = new double[quant];
		char[] sex = new char[quant];
		
		double maiorAltura=0.0;
		double menorAltura=10.0;
		double somaDasAlturas=0.0;
		int numHomems = 0;
		
		for(int i=0; i<alt.length; i++) {
			System.out.print("Altura da "+(i+1)+"a pessoa: ");
			alt[i] = sc.nextDouble();
			System.out.print("Genero da "+(i+1)+"a pessoa: ");
			sex[i] = sc.next().charAt(0);
			somaDasAlturas += alt[i];
			if(sex[i] == 'M') {
				numHomems++;
			}
		}
		
		for(int j=0; j<alt.length; j++) {
			if(menorAltura > alt[j]) {
				menorAltura = alt[j];
			}
			if(maiorAltura < alt[j]) {
				maiorAltura = alt[j];				
			}
		}
		double media = (double)somaDasAlturas / quant;
		System.out.printf("Menor altura = %.2f%n", menorAltura);
		System.out.printf("Maior altura = %.2f%n", maiorAltura);
		System.out.printf("Media das alturas das mulheres = %.2f%n", media);
		System.out.println("Numero de homens = "+numHomems);
		
		sc.close();
	}
}