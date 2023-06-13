package exercicios_06_while;

import java.util.Scanner;

public class Tarefa_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		
		while(n1 != 0 && n2 != 0) {
			if(n1 > 0 && n2 > 0) {
				System.out.println("primeiro");
			}
			else if(n1 > 0 && n2 < 0) {
				System.out.println("quarto");
			}
			else if(n1 < 0 && n2 < 0) {
				System.out.println("terceiro");
			}
			else {
				System.out.println("segundo");
			}
			n1 = sc.nextInt();
			n2 = sc.nextInt();
		}
		
		sc.close();
	}

}
