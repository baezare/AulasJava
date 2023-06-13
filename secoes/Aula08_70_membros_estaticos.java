package secoes;

import java.util.Locale;
import java.util.Scanner;

public class Aula08_70_membros_estaticos {
	
	public static double PI = 3.14151;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter radius");
		double radius =sc.nextDouble();
		
		double circunference = circunference(radius);
		System.out.printf("Circumference: %.2f%n", circunference);
		
		double volume = volume(radius);
		System.out.printf("Volume: %.2f%n", volume);
		
		sc.close();
	}
	public static double circunference(double radius) {
		return 2.0 * PI * radius;
	}
	public static double volume(double radius) {
		return 4.0 * PI * radius * radius * radius / 3.0;
	}
}
