package modelo;

public class PessoaFisica extends Pessoa {
	private String cpf;
	private String celular;

	// CONSTRUCTOR
	public PessoaFisica(Integer id, String nome, String email, String cpf, String celular) {
		super(id, nome, email);
		this.cpf = cpf;
		this.celular = celular;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	@Override
	public void imprimir() {
		System.out.println("\n\t*PESSOA FÍSICA*");
		super.imprimir();
		System.out.println("CPF: " + getCpf());
		System.out.println("Celular: " + getCelular());
	}

	@Override
	public String toString() {
		return super.toString() + "CPF: " + this.cpf + " Celular: " + this.celular;
	}

	@Override
	public boolean equals(Object obj) {
		// COMPARA SE A CLASSE DO OBJETO QUE ESTÁ COMPARANDO É A MESMA CORRESPONDENTE
		if (this.getClass() != obj.getClass()) {
			return false;
		}

		// CAST CONVERTE DA CLASSE OBJECT PARA CLASSE PESSOA
		PessoaFisica p = (PessoaFisica) obj;

		// CLASSE OBJECT.equals sendo usada para comparar int, pois se uns dos valores forem null, ele ainda compara sem erro.
		return super.equals(obj) && getCpf().equals(p.getCpf());
	}
}
