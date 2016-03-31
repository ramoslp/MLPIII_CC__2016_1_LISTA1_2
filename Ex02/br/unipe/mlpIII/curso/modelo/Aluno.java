package br.unipe.mlpIII.curso.modelo;

public class Aluno extends Pessoa {

	protected double media;
	protected int faltas;

	public Aluno(String nome, String matricula, double media, int faltas) {
		super(nome, matricula);
		this.media = media;
		this.faltas = faltas;
	}

	public double getMedia() {
		return media;
	}

	public void setMedia(double media) {
		this.media = media;
	}

	public int getFaltas() {
		return faltas;
	}

	public void setFaltas(int faltas) {
		this.faltas = faltas;
	}

	public String toString() {
		return this.matricula + " " + this.nome;
	}

}