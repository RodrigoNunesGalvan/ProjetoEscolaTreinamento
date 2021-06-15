package projetoescola;

public class Aluno extends Pessoa {
	//Atributos
	private int matricula;
	private String curso;
	
	//Métodos Publicos
	public void cancelarMatricula() {
		System.out.println("Mátricula será cancelada!!");
	}
	
	//Métodos Especiais

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	
	
	
	
}
