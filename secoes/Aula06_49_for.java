package secoes;

import java.util.Scanner;

public class Aula06_49_for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int soma = 0;
		
		for(int i=0; i<n; i++) {
			int valor = sc.nextInt();
			soma += valor;
		}
		
		System.out.println(soma);
		
		sc.close();
	}

}
