package escola;

import java.util.HashMap;
import java.util.Map;

public class Turma {
	
	private Map<Integer, Aluno> alunos; // Generics
	
	public Turma() {
		this.alunos = new HashMap<Integer, Aluno>();
	}
	
	public void efetuaMatricula(Aluno novoAluno) {
		this.alunos.put(novoAluno.getMatricula(), novoAluno);
	}
	
	public double calculaMedia() {
		double total = 0.0;

		for (Aluno alunoDaVez : this.alunos.values()) { // foreach
			total += alunoDaVez.getNota();
		}
		
		return total / this.alunos.size();
	}
	
	public void imprimeRelatorioDeReprovados() {
		System.out.println("==== RELAÇÃO DE REPROVADOS ====");
		
		for (Aluno alunoDaVez : this.alunos.values()) { // foreach
			if (alunoDaVez.getNota() < 5) {
				System.out.println(alunoDaVez.getNome() + " tirou " + alunoDaVez.getNota());
			}
		}
	}

	public int getTotalMatriculados() {
		return this.alunos.size();
	}
	
	public Map<Integer, Aluno> getAlunos() {
		return alunos;
	}
	
	public Aluno pesquisaAluno(int matricula) {
		if (this.alunos.containsKey(matricula)) {
			return this.alunos.get(matricula);
		}
				
		throw new IllegalStateException("Aluno não pertence à turma.");
	}
	
}








