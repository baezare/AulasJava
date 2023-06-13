package exercicios_10_vetores;

import java.util.Scanner;

public class Tarefa_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas voce vai digitar? ");
		int quant = sc.nextInt();
		
		String[] nome = new String[quant];
		int[] idade = new int[quant];
		
		int maiorIdade = 0;
		for(int i=0; i<nome.length; i++) {
			System.out.println("Dados da "+(i+1)+"a pessoa:");
			System.out.print("Nome: ");
			sc.nextLine();
			nome[i] = sc.nextLine();
			System.out.print("Idade: ");
			idade[i] = sc.nextInt();
			if(idade[i] > maiorIdade) {
				maiorIdade = idade[i];
			}
		}
		
		for(int j=0; j<nome.length; j++) {	
			if(maiorIdade == idade[j]) {
				System.out.println("PESSOA MAIS VELHA: "+ nome[j]);
			}
		}	
		
		
		
		sc.close();
	}	

}
