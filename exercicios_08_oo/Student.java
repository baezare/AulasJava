package exercicios_08_oo;

public class Student {
	public String name;
	public double nota1;
	public double nota2;
	public double nota3;
	
	public double finalGrade() {
		return nota1+nota2+nota3;
	}
	public double missGrade() {
		return 60 - finalGrade();
	}
}
