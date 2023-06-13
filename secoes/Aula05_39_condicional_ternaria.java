package secoes;

public class Aula05_39_condicional_ternaria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double preco = 34;
		double desconto = (preco < 20) ? preco * 0.01 : preco * 0.05;
		
		System.out.printf("valor: %.2f",desconto);
	}

}
