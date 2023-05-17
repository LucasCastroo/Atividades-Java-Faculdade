package modelo;

public class PessoaFisica extends Pessoa {
	private String cpf;

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@Override
	public void imprimir() {
		System.out.println("Nome: "+ getNome());
		System.out.println("CPF: " + cpf);
	}
}
