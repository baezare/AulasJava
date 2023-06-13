package exercicios_08_oo;

import java.util.Locale;
import java.util.Scanner;

public class Aluno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Student dados = new Student();
		
		System.out.println("Entrada:");
		dados.name = sc.nextLine();
		dados.nota1 = sc.nextDouble();
		dados.nota2 = sc.nextDouble();
		dados.nota3 = sc.nextDouble();
		
		System.out.println();
		System.out.println("Saída");
		if(dados.finalGrade() > 60.0) {
			System.out.printf("Final Grade = %.2f%n",dados.finalGrade());
			System.out.println("PASS");
		}
		else {
			System.out.printf("Final Grade = %.2f%n",dados.finalGrade());
			System.out.println("FAILED");
			System.out.printf("Missing %.2f Points",dados.missGrade());
		}
		
		sc.close();
	}

}
