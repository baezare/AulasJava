package exercicios_05_if_else;

import java.util.Scanner;

public class Tarefa_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entrada:");
		int hora1 = sc.nextInt();
		int hora2 =sc.nextInt();
		
		if(hora1 >= hora2) {
			int tot = 24 - hora1 + hora2;
			System.out.println("O JOGO DUROU " + tot + " HORA(S)");
		}
		else {
			int tot = hora2 - hora1;
			System.out.println("O JOGO DUROU " + tot + " HORA(S)");
		}
		
		sc.close();
	}

}
