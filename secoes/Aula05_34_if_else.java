package secoes;

import java.util.Scanner;

public class Aula05_34_if_else {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("que horas são? ");
		int horas = sc.nextInt();
		
		if(horas < 12) {
			System.out.println("Bom dia!");
		} 
		else if (horas < 18) {
			System.out.println("Boa tarde!");
		} 
		else {
			System.out.println("Boa noite!");
		}
		
		
		
		sc.close();
	}

}
