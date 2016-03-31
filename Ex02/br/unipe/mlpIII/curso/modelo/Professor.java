package br.unipe.mlpIII.curso.modelo;

public class Professor extends Pessoa {

	protected String especialidade;

	public Professor(String nome, String matricula, String especialidade) {
		super(nome, matricula);
		this.especialidade = especialidade;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

}