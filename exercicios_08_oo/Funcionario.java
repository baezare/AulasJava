package exercicios_08_oo;

import java.util.Locale;
import java.util.Scanner;

public class Funcionario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Employee dados = new Employee();
		
		System.out.print("Name: ");
		dados.name = sc.nextLine();
		System.out.print("Gross salary: ");
		dados.grossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		dados.tax = sc.nextDouble();
		
		System.out.println();
		System.out.println("Employee: "+dados);
		
		System.out.println();
		System.out.print("Which percentage to increase salary? ");
		double percentage = sc.nextDouble();
		dados.increaseSalary(percentage);
		
		System.out.println();
		System.out.println("Updated data: "+dados);		
		
		sc.close();
	}

}
