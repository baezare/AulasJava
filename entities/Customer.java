package entities;

public class Customer {
	
	private int conta;
	private String nome;
	private double deposito;
	
	public Customer(int conta, String nome) {
		this.conta = conta;
		this.nome = nome;
	}
	
	public Customer(int conta, String nome, double deposito) {
		this.conta = conta;
		this.nome = nome;
		adicionar(deposito);
	}
	
	public int getConta() {
		return conta;
	}	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getDeposito() {
		return deposito;
	}
	
	public void adicionar(double adiciona) {
		deposito += adiciona;
	}
	public void retirar(double retira) {
		deposito -= retira + 5.0;
	}
	
	public String toString() {
		return "Account "
				+conta
				+", Holder: "
				+nome
				+", Balance: $ "
				+String.format("%.2f", deposito);
	}
	
}
