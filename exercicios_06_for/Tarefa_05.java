package exercicios_06_for;

import java.util.Scanner;

public class Tarefa_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int ene = sc.nextInt();
		int fatorial = 1;
			
			if(ene == 0) {
				System.out.println(1);
			}
			else {
				for(int i=0; i<ene; i++) {
					fatorial *= (ene-i);				
				}
				System.out.println(fatorial);
			}
			
			
			
		sc.close();
	}

}
