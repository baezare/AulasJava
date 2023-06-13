package exercicios_06_for;

import java.util.Scanner;

public class Tarefa_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int ene = sc.nextInt();
		
		for(int i=1; i<=ene; i++) {
			int segundo = i*i;
			int terceiro = segundo * i;
			System.out.println(i + " " + segundo + " " + terceiro);
		}
		
		sc.close();
	}

}
