package entities;

public class Info {
	
	public String name;
	public double price;
	public int quantity;
	
	public double total() {
		return price * quantity;
	}
	
	public void adicao(int adicao) {
		quantity += adicao;
	}
	
	public void remover(int remover) {
		quantity -= remover;
	}
	
	public String toString() {
		return name 
				+ ", $ " 
				+ String.format("%.2f", price) 
				+ ", " + quantity
				+ " units, Total: $ "
				+ String.format("%.2f", total());
	}

}
