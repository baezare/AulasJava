package exercicios_06_for;

import java.util.Locale;
import java.util.Scanner;

public class Tarefa_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		for(int i=0; i<num; i++) {
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			
			
			if(num2 == 0) {
				System.out.println("divisao impossível");
			}
			else {
				double res = (double) num1 / num2;
				System.out.printf("%.1f%n", res);
			}
			
		}
		
		sc.close();
	}

}
