package projetoescola;

public class Aluno extends Pessoa {
	//Atributos
	private int matricula;
	private String curso;
	
	//M�todos Publicos
	public void cancelarMatricula() {
		System.out.println("M�tricula ser� cancelada!!");
	}
	
	//M�todos Especiais

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
