package exercicios_10_vetores;

import java.util.Scanner;

public class Pensionato {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many rooms will be rented? ");
		int rooms = sc.nextInt();
		
		Quartos[] dados = new Quartos[10];
		
		for(int i=0; i<rooms; i++) {
			System.out.println("Rent #"+(i+1)+":");
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int room = sc.nextInt();
			dados[room] = new Quartos(name, email);
			System.out.println();
		}
		
		System.out.println("Busy rooms:");
		for(int j=0; j<dados.length; j++) {
			if(dados[j] != null) {
				System.out.println(j+": "+dados[j]);
			}
		}
		
		
		sc.close();
	}

}