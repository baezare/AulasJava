package exercicios_08_oo;

import java.util.Locale;
import java.util.Scanner;

public class Retangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Rectangle dados = new Rectangle();
		
		System.out.println("Enter rectangule with and height:");
		dados.width = sc.nextDouble();
		dados.height = sc.nextDouble();
		System.out.printf("Area = %.2f%n",dados.area());
		System.out.printf("Perimeter = %.2f%n", dados.perimeter());
		System.out.printf("Diagonal = %.2f", dados.diagonal());
		
		sc.close();
	}

}
