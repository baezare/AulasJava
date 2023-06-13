package exercicios_06_for;

import java.util.Scanner;

public class Tarefa_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int in = 0;
		int out = 0;
		
		for(int i=0; i<x; i++) {
			int valor = sc.nextInt();
			if(valor >= 10 && valor <= 20) {
				in += 1;
			}
			else {
				out += 1;
			}
		}
		
		System.out.println(in + " in");
		System.out.println(out + " out");
		
		sc.close();
	}

}
