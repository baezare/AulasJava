package exercicios_10_vetores;

import java.util.Locale;
import java.util.Scanner;

public class Tarefa_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos alunos serao digitados? ");
		int quant = sc.nextInt();
		Aprovados[] dados = new Aprovados[quant];
				
		for(int i=0; i<dados.length; i++) {
			System.out.println("Digite nome, primeira e segunda nota do "+(i+1)+"o aluno: ");
			sc.nextLine();
			String nome = sc.nextLine();
			double nota1 = sc.nextDouble();
			double nota2 = sc.nextDouble();
			dados[i] = new Aprovados(nome, nota1, nota2); 
		}
		
		for(int j=0; j<dados.length; j++) {
			if(dados[j].media() >= 6.0) {
				System.out.println("Alunos aprovados:");
				System.out.println(dados[j].getNome());				
			}
		}
		
		sc.close();
	}

}
