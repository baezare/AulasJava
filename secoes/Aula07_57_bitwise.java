package secoes;

import java.util.Scanner;

public class Aula07_57_bitwise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// programa��o de baixo n�vel, aplicado em micro controlador, interface com rede, arduino, etc
		int n1 = 89;
		int n2 = 60;
		System.out.println(n1 & n2);
		System.out.println(n1 | n2);
		System.out.println(n1 ^ n2);
		
		Scanner sc = new Scanner(System.in);
		int mask = 0b100000;
		int n = sc.nextInt();
		if ((n & mask) != 0) {
		System.out.println("6th bit is true!");
		}
		else {
		System.out.println("6th bit is false");
		}
		sc.close();
	}

}
