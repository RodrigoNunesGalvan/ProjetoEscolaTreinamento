package projetoescola;

public class Professor extends Pessoa {
	//Atributos
	
	private String especialidades;
	private float salario;

	//Métodos Publicos
	
	public void receberAumento(float aum) {
		this.salario += aum;
	}
	
	//Métodos Especiais

	public String getEspecialidades() {
		return especialidades;
	}

	public void setEspecialidades(String especialidades) {
		this.especialidades = especialidades;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}
	
	
}
