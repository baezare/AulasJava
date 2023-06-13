package principalLM;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidadesLM.Employee;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many employees will be registered? ");
		int quant = sc.nextInt();
		List<Employee> dados = new ArrayList<Employee>();
		System.out.println();
		
		for(int i=1;i<=quant;i++) {
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
		int showId = sc.nextInt();
		Employee findID = dados.stream().filter(x -> x.getId() == showId).findFirst().orElse(null);
		
		if(findID != null) {
			System.out.print("Enter the percentage: ");
			double percentage = sc.nextDouble();
			findID.increaseSalary(percentage);
		}
		else {
			System.out.println("This id does not exist!");
		}
		
		System.out.println();
		System.out.println("List of employees:");
		for(Employee nomes: dados) {
			System.out.println(nomes);
		}
		
		sc.close();
	}

}
