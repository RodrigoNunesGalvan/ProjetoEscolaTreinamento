package projetoescola;

public class Pessoa {
	//Atributos
	private String nome;
	private int idade;
	private String sexo;
	
	//Métodos Publicos
	public void fazerAniversario() {
		this.idade++;
	}

	//Métodos Especiais
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + "]";
	}

	public void setCurso(String string) {
		// TODO Auto-generated method stub
		
	}

	public void setSalario(float f) {
		// TODO Auto-generated method stub
		
	}

	public void setSetor(String string) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	
}
