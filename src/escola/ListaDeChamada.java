package escola;

import java.util.Map;

public class ListaDeChamada {

	public static void main(String[] args) {
		Turma turma = new Turma();
		turma.efetuaMatricula(new Aluno(1, "Alessandro", 10.0));
		turma.efetuaMatricula(new Aluno(2, "Helen", 10.0));
		turma.efetuaMatricula(new Aluno(10, "Rafael", 10.0));
		turma.efetuaMatricula(new Aluno(6, "Rafael", 10.0));
		turma.efetuaMatricula(new Aluno(8, "Rafael", 10.0));
		turma.efetuaMatricula(new Aluno(9, "Rafael", 10.0));
		turma.efetuaMatricula(new Aluno(3, "Joanice", 10.0));
		turma.efetuaMatricula(new Aluno(4, "Diego", 10.0));
		turma.efetuaMatricula(new Aluno(5, "Duanne", 10.0));
		turma.efetuaMatricula(new Aluno(7, "Matheus", 10.0));
		
		Map<Integer, Aluno> alunos = turma.getAlunos();
		
		System.out.println("TURMA COM " + alunos.size() + " ALUNOS:");
		for (Aluno alunoDaVez : alunos.values()) { // foreach
			System.out.println("Aluno(a): " + alunoDaVez.getNome() + " Matrícula: " + alunoDaVez.getMatricula());
		}
		
		System.out.println();
		turma.efetuaMatricula(new Aluno(5, "Duanne Schaedler", -10.0));
		System.out.println("TURMA COM " + alunos.size() + " ALUNOS:");
		for (Aluno alunoDaVez : alunos.values()) {
			System.out.println("Aluno(a): " + alunoDaVez.getNome() + " Matrícula: " + alunoDaVez.getMatricula());
		}
	}
	
}
