package secoes;

public class Aula10_95_boxing_unboxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 20;
		
		Object obj = x; // boxing
		
		int y = (int)obj; // unboxing - necessario casting
		
		int j = 30;
		
		Integer num = j; // wraper class compativel não necessita o casting
		
		int k = num;
		
		System.out.println(y);
		
		System.out.println(k);
	}	

}
