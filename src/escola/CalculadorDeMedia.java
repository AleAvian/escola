package escola;

public class CalculadorDeMedia {

	public static void main(String[] args) {
		Turma flutter = new Turma();
		flutter.efetuaMatricula(new Aluno(1,"fabio", 7.9));
		flutter.efetuaMatricula(new Aluno(2,"helio", 3.8));
		flutter.efetuaMatricula(new Aluno(3,"bia", 8.9));
		flutter.efetuaMatricula(new Aluno(4,"ana", 10.0));
		flutter.efetuaMatricula(new Aluno(5,"caio", 4.5));
		flutter.efetuaMatricula(new Aluno(6,"dani", 4.8));
		
		System.out.println("Alunos matriculados: " + flutter.getTotalMatriculados());
		System.out.println("Média a turma de flutter: " + flutter.calculaMedia());
		
		flutter.imprimeRelatorioDeReprovados();
	
		flutter.efetuaMatricula(new Aluno(7, "gabi", 9.5));
		flutter.efetuaMatricula(new Aluno(8, "eli", 5.0));
		
		System.out.println("Alunos matriculados: " + flutter.getTotalMatriculados());
		System.out.println("Média a turma de flutter: " + flutter.calculaMedia());
		
		flutter.imprimeRelatorioDeReprovados();
	}
	
}
