package projetoescola;

public class Funcionario extends Pessoa{
	//Atributos
	private String setor;
	private boolean trabalhando;
	
	//Métodos Publicos
	
	public void mudarTrabalho() {
		this.trabalhando = ! this.trabalhando;
	}
	
	//Mpetods Especiais

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

	public boolean getTrabalhando() {
		return trabalhando;
	}

	public void setTrabalhando(boolean trabalhando) {
		this.trabalhando = trabalhando;
	}
	
	
}
