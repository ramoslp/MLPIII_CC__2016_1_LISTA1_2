package br.unipe.mlpIII.curso.ui;

import java.util.Locale;
import java.util.Scanner;

import br.unipe.mlpIII.curso.modelo.Aluno;
import br.unipe.mlpIII.curso.modelo.Curso;
import br.unipe.mlpIII.curso.modelo.Pessoa;
import br.unipe.mlpIII.curso.modelo.Professor;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		scan.useLocale(Locale.US);

		Pessoa professor = new Professor("Jefferson", "11010097", "Orienta��o a Objetos");
		Curso metodologia3 = new Curso((Professor) professor, "MLPIII", 596);
		int op = 1;

		while (op != 0) {
			System.out.println("1) Incluir alunos");
			System.out.println("2) Remover aluno (por nome ou matr�cula)");
			System.out.println("3) Verificar se um aluno est� matriculado");
			System.out.println("4) Listar todos os alunos aprovados (m�dia superior a 7,0)");
			System.out.println("5) Listar todos os alunos reprovados por falta (faltas superiores a 15)");
			System.out.println("6) Listar por ordem alfab�tica");
			System.out.println("0) Sair");

			op = scan.nextInt();

			switch (op) {
			case 1: {
				System.out.println("Nome: ");
				String nome = scan.next();
				System.out.println("Matr�cula: ");
				String matricula = scan.next();
				System.out.println("M�dia: ");
				double media = scan.nextDouble();
				System.out.println("N� de faltas: ");
				int faltas = scan.nextInt();

				Aluno aluno = new Aluno(nome, matricula, media, faltas);
				metodologia3.setAlunos(aluno);
			}
				break;

			case 2: {
				System.out.println("Nome ou matr�cula: ");
				String aux = scan.next();
				
				if(metodologia3.removeAluno(aux)){
					System.out.println("Removido");
				}else{
					System.out.println("N�o foi removido");
				}
			}
				break;

			case 3: {
				System.out.println("Matr�cula: ");
				String matricula = scan.next();
				
				if(metodologia3.isMatriculado(matricula)){
					System.out.println("Matriculado");
				}else{
					System.out.println("N�o foi matriculado");
				}
			}
				break;

			case 4: {
				metodologia3.alunosAprovados();
			}
				break;

			case 5: {
				metodologia3.alunosReprovados();
			}
				break;

			case 6: {
				metodologia3.sortListaAlfabetica();
				System.out.println(metodologia3.getAlunos());
			}
				break;
		}
	}
	scan.close();
}
	
}
