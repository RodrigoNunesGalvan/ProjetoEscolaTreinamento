package projetoescola;

public class ProjetoEscola {

	public static void main(String[] args) {
		//Programa Principal
		
		Pessoa p1 = new Pessoa();
		Pessoa p2 = new Aluno();
		Pessoa p3 = new Professor();
		Pessoa p4 = new Funcionario();
		
		p1.setNome(" Rodrigo");
		p2.setNome(" Alice");
		p3.setNome(" Juliana");
		p4.setNome(" Arthur");
		
		p1.setIdade(40);
		p1.setSexo(" Masculino");
		
		p2.setCurso("Development Java");
		p3.setSalario(2600.95f);
		p4.setSetor("Gerente");
		
		//p3.receberAumento(500.00f);
		//p2.mudarTrabalho();
		//p4.cancelarMatricula();
		
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());
		System.out.println(p4.toString());
		

	}

}
