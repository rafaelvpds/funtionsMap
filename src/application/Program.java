package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		List<Product> listaProdutos = new ArrayList<>();

		listaProdutos.add(new Product("tv", 900.00));
		listaProdutos.add(new Product("Mouse", 50.00));
		listaProdutos.add(new Product("Tablet", 350.50));
		listaProdutos.add(new Product("HD case", 80.90));

		// Produzir os nomes dos produtos em caixa alta

		// O Map tem que ser atribuido a uma lista de Streams

		List<String> name = listaProdutos.stream().map(p -> p.getNome().toUpperCase()).collect(Collectors.toList());
		name.forEach(System.out::println);

	}

}
