package exercicios_06_for;

import java.util.Scanner;

public class Tarefa_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int ene = sc.nextInt();
		
		for(int i=1; i<=ene; i++) {
			if(ene % i == 0) {
				System.out.println(i);
			}
		}
				
		sc.close();
	}

}
