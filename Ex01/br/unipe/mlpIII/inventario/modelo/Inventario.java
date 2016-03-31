package br.unipe.mlpIII.inventario.modelo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Inventario {

	private List<Item> lista = new ArrayList<Item>();

	public List<Item> getLista() {
		return lista;
	}

	public void setLista(Item item) {
		lista.add(item);
		Collections.sort(lista);
	}

}