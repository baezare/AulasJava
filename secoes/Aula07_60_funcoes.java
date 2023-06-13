package secoes;

import java.util.Scanner;

public class Aula07_60_funcoes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com os 3 números: ");
		int num0 = sc.nextInt();
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		int maior = maximo(num0, num1, num2);
		
		imprimir(maior);
		
		sc.close();
	}
	
	public static int maximo(int x,int y,int z) {
		int auxiliar;
		if(x > y && x > z) {
			auxiliar = x;
		}
		else if (y > z) {
			auxiliar = y;
		}
		else {
			auxiliar = z;
		}
		return auxiliar;
	}
	
	public static void imprimir (int valor) {
		System.out.println("O maior valor é: "+ valor);
	}

}
