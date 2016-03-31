package br.unipe.mlpIII.curso.modelo;

import java.util.Comparator;

public class NomeComparator implements Comparator<Aluno> {

	public int compare(Aluno aluno, Aluno outroAluno) {
		return aluno.getNome().compareTo(outroAluno.getNome());
	}

}
