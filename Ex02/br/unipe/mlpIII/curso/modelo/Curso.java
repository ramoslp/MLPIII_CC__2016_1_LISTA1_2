package br.unipe.mlpIII.curso.modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Curso {

	protected List<Aluno> alunos;
	protected Professor professor;
	protected String nome;
	protected int numeroIdentificacao;
	
	NomeComparator comparator = new NomeComparator();
	
	public Curso(Professor professor, String nome, int numeroIdentificacao) {
		this.alunos = new ArrayList<>();
		this.professor = professor;
		this.nome = nome;
		this.numeroIdentificacao = numeroIdentificacao;
	}

	public List<Aluno> getAlunos() {
		return alunos;
	}

	public void setAlunos(Aluno aluno) {
		this.alunos.add(aluno);
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumeroIdentificacao() {
		return numeroIdentificacao;
	}

	public void setNumeroIdentificacao(int numeroIdentificacao) {
		this.numeroIdentificacao = numeroIdentificacao;
	}
	
	public boolean removeAluno(String nome){
		for (int i = 0; i < alunos.size(); i++){
			Aluno aux = alunos.get(i);
		if((aux.getNome().equals(nome)) || (aux.getMatricula().equals(nome))){
			alunos.remove(aux);
			return true;
		}
		}
		return false;
	}

	public boolean isMatriculado(String matricula){
		for(int i = 0; i < alunos.size(); i++){
			Aluno aux = alunos.get(i);
			if(aux.getMatricula().equals(matricula))
				return true;
		}
		return false;
	}
	
	public void alunosAprovados(){
		for(int i = 0; i < alunos.size(); i++){
			Aluno aux = alunos.get(i);
			if(aux.getMedia() >= 7)
				System.out.println(aux);
		}
	}
	
	public void alunosReprovados(){
		for(int i = 0; i < alunos.size(); i++){
			Aluno aux = alunos.get(i);
			if((aux.getMedia() < 7) || (aux.getFaltas() > 15))
				System.out.println(aux);
		}
	}
	
	public void sortListaAlfabetica(){
		Collections.sort(alunos, comparator);
	}
}