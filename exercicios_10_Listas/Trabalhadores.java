package exercicios_10_Listas;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Trabalhadores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many employees will be registered? ");		
		int quant = sc.nextInt();
		System.out.println();
		
		List<Employee> dados = new ArrayList<Employee>();
		
		for(int i=1; i<=quant; i++) {
			System.out.println("Emplyoee #"+i+":");
			System.out.print("Id: ");
			Integer id = sc.nextInt();
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");
			Double salary = sc.nextDouble();
			Employee info = new Employee(id, name, salary);
			dados.add(info);
			System.out.println();
		}
		
		System.out.print("Enter the employee id that will have salary increase : ");
		int id = sc.nextInt();
		
		Employee findId = dados.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		
		if(findId != null) {
			System.out.print("Enter the percentage: ");
			double percent = sc.nextDouble();
			findId.increaseSalary(percent);
		}
		else {
			System.out.println("This id does not exist!");
		}
		
		System.out.println();
		System.out.println("List of employees:");
		
		for(Employee names : dados) {
			System.out.println(names);
		}
		
		sc.close();
	}
}