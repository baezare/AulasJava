package exercicios_06_for;

import java.util.Scanner;

public class Tarefa_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =  new Scanner(System.in);
		
		int x = sc.nextInt();
		
		for(int i=0; i<x; i++) {
			if(i % 2 != 0) {
				System.out.println(i);
			}
		}
		
		sc.close();
	}

}
