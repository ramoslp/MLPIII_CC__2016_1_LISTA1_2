package br.unipe.mlpIII.inventario.ui;

import br.unipe.mlpIII.inventario.modelo.Inventario;
import br.unipe.mlpIII.inventario.modelo.Item;

public class Main {

	public static void main(String[] args) {

		Inventario inventario = new Inventario();

		if (inventario.getLista().isEmpty()) {
			System.out.println("Lista vazia!");
		}

		Item caderno = new Item(5452, "Caderno");
		inventario.setLista(caderno);

		Item caneta = new Item(1234, "Caneta");
		inventario.setLista(caneta);

		Item lapis = new Item(3145, "Lápis");
		inventario.setLista(lapis);

		Item borracha = new Item(1111, "Borracha");

		System.out.println(inventario.getLista());

		if (!inventario.getLista().contains(borracha)) {
			System.out.println(borracha.toString() + " não pertence à lista!");
		}

	}

}