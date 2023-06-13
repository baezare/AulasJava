package secoes;

import java.util.Scanner;

public class Aula06_44_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int valor = sc.nextInt();
		int soma = 0;
		
		while (valor != 0) {	
			soma += valor;
			valor = sc.nextInt();			
		}
		
		System.out.println(soma);
		
		sc.close();
	}

}
