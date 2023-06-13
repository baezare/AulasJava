package secoes;

import java.util.Scanner;

public class Aula10_99_Matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int quant = sc.nextInt();
		int[][] dados = new int [quant][quant];
		
		for(int i=0; i<dados.length; i++) {
			for(int j=0; j<dados[i].length; j++) {
				dados[i][j] = sc.nextInt();
			}
		}
		
		int negativos = 0;
		for(int i=0; i<quant; i++) {
			for(int j=0; j<quant; j++) {
				System.out.print(dados[i][j]+" ");
				if(dados[i][j] < 0) {
					negativos++;
				}
			}
			System.out.println();
		}		
		System.out.println();
		
		for(int i=0; i<quant; i++) {
			System.out.print(dados[i][i]+" ");			
		}		
		System.out.println();	
			
		System.out.println();		
		System.out.println("Negative numbers = "+ negativos);
		
		sc.close();
	}

}
