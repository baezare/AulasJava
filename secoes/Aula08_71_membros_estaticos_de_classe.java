package secoes;

import java.util.Locale;
import java.util.Scanner;

import util.Calculator;

public class Aula08_71_membros_estaticos_de_classe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter radius: ");
		double radius =sc.nextDouble();		
		double c = Calculator.circumference(radius);
		double v = Calculator.volume(radius);
		
		System.out.printf("Circumference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI value: %.2f",Calculator.PI);
		
		sc.close();
		
	}

}
