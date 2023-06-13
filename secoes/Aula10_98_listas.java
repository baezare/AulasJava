package secoes;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Aula10_98_listas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> lista = new ArrayList<>();
		
		lista.add("Paulo");
		lista.add("Fernanda");
		lista.add("Amanda");
		lista.add("Sergio");
		lista.add(2, "Marcos");
		lista.add("Karen");
		lista.add("Xavier");
		lista.add("Kamila");
		lista.add("Maria");
		lista.add("Beatriz");
		
		System.out.println(lista.size());
		
		lista.remove("Fernanda");
		
		lista.remove(3);
		
		lista.removeIf(x -> x.charAt(0) == 'K');
		
		System.out.println("Index of Beatriz: " + lista.indexOf("Beatriz"));
		
		System.out.println("Index of Karen: " + lista.indexOf("Karen"));
		
		List<String> selecionarLista = lista.stream().filter(x -> x.charAt(0) == 'M').collect(Collectors.toList());		
		
		String primeiroNome = lista.stream().filter(x -> x.charAt(0) == 'P').findFirst().orElse(null);
		
		System.out.println("Primero da lista: " + primeiroNome);
				
		for(String nomes : lista) {
			System.out.println(nomes);
		}
		
		System.out.println();
		
		for(String predicados : selecionarLista) {
			System.out.println(predicados);
		}
	}

}
