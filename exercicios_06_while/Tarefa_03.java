package exercicios_06_while;

import java.util.Scanner;

public class Tarefa_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int codigo = sc.nextInt();
		int alcool = 0;
		int gas = 0;
		int diesel = 0;
		
		while(codigo != 4) {
			if(codigo == 1) {
				alcool += 1;
			}
			else if(codigo == 2) {
				gas += 1;
			}
			else if(codigo == 3) {
				diesel += 1;
			}
			codigo = sc.nextInt();
		}
		
		System.out.println("Muito Obrigado");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gas);
		System.out.println("Diesel: " + diesel);
		sc.close();
	}

}
