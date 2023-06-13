package exercicios_10_vetores;

import java.util.Locale;
import java.util.Scanner;

public class Tarefa_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serao digitadas? ");
		int numero = sc.nextInt();
		DadosPessoais[] pessoas = new DadosPessoais[numero];		
		
		for(int i=0; i<pessoas.length; i++) {
			System.out.println("Dados da "+(i+1)+"a pessoa:");
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Idade: ");
			int idade = sc.nextInt();
			System.out.print("Altura: ");
			double altura = sc.nextDouble();
			pessoas[i] = new DadosPessoais(nome, idade, altura);			
		}
		
		System.out.println();
		double somaAltura = 0.0;
		double menor16 = 0;
		for(int j=0; j<pessoas.length; j++) {
			somaAltura += pessoas[j].getAltura();
			if(pessoas[j].getIdade() < 16) {
				menor16++;
			}
		}
		double mediaAltura = somaAltura / numero;
		System.out.printf("Altura média = %.2f%n", mediaAltura);
		double menores = 100.0 / numero * menor16;
		System.out.println("Pessoas com menos de 16 anos: "+ menores+"%");
		
		for(int k=0; k<pessoas.length; k++) {
			if(pessoas[k].getIdade() < 16) {
				System.out.println(pessoas[k].getNome());
			}
		}
		
		
		sc.close();
	}

}
