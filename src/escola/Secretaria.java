package escola;

public class Secretaria {

	public static void main(String[] args) {
		Turma turma = new Turma();
		turma.efetuaMatricula(new Aluno(1, "Alessandro", 10.0));
		turma.efetuaMatricula(new Aluno(2, "Helen", 10.0));
		turma.efetuaMatricula(new Aluno(6, "Rafael", 10.0));
		turma.efetuaMatricula(new Aluno(3, "Joanice", 10.0));
		turma.efetuaMatricula(new Aluno(4, "Diego", 10.0));
		turma.efetuaMatricula(new Aluno(5, "Duanne", 10.0));
		turma.efetuaMatricula(new Aluno(7, "Matheus", 10.0));
		
		int matricula = 2;

		try {
			Aluno aluno = turma.pesquisaAluno(matricula);
			System.out.println("Certificado do aluno(a): " + aluno.getNome());
		} catch (IllegalStateException e) {
			System.out.println(e.getMessage());
		}

	}
	
}
