package escola;

public class Aluno implements Comparable<Aluno> {

	private int matricula;
	private String nome;
	private double nota;
	
	public Aluno(int matricula, String nome, double nota) {
		this.nome = nome;
		this.nota = nota;
		this.matricula = matricula;
	}
	
	public int getMatricula() {
		return matricula;
	}
	
	public double getNota() {
		return this.nota;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setNota(double nota) {
		this.nota = nota;
	}
	
	public int compareTo(Aluno outroAluno) {
		return this.nome.compareTo(outroAluno.nome);
	}

	public int hashCode() {
		return this.matricula;
	}
	
	public boolean equals(Object obj) {
		if (obj instanceof Aluno) {
			Aluno outroAluno = (Aluno) obj;
			return this.matricula == outroAluno.matricula;
		}
		
		return false;
	}
	
	
	
}














