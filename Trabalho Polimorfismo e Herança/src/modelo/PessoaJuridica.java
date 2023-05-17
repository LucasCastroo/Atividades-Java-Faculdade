package modelo;

public class PessoaJuridica extends Pessoa {
	private String cnpj;
	private String inscricaoEstadual;
	private String telefoneFixo;

	// CONSTRUCTOR
	public PessoaJuridica(Integer id, String nome, String email, String cnpj, String inscricaoEstadual,
			String telefoneFixo) {
		super(id, nome, email);
		this.cnpj = cnpj;
		this.inscricaoEstadual = inscricaoEstadual;
		this.telefoneFixo = telefoneFixo;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getInscricaoEstadual() {
		return inscricaoEstadual;
	}

	public void setInscricaoEstadual(String inscricaoEstadual) {
		this.inscricaoEstadual = inscricaoEstadual;
	}

	public String getTelefoneFixo() {
		return telefoneFixo;
	}

	public void setTelefoneFixo(String telefoneFixo) {
		this.telefoneFixo = telefoneFixo;
	}

	@Override
	public void imprimir() {
		System.out.println("\n\t*PESSOA JURÍDICA*");
		super.imprimir();
		System.out.println("CNPJ: " + getCnpj());
		System.out.println("Inscrição Estadual: " + getInscricaoEstadual());
		System.out.println("Telefone Fixo: " + getTelefoneFixo());
	}

	@Override
	public String toString() {
		return super.toString() + "CNPJ: " + this.cnpj + " Inscrição Estadual: " + this.inscricaoEstadual
				+ " Telefone Fixo: " + this.telefoneFixo;
	}

	@Override
	public boolean equals(Object obj) {
		// COMPARA SE A CLASSE DO OBJETO QUE ESTÁ COMPARANDO É A MESMA CORRESPONDENTE
		if (this.getClass() != obj.getClass()) {
			return false;
		}

		// CAST CONVERTE DA CLASSE OBJECT PARA CLASSE PESSOA
		PessoaJuridica p = (PessoaJuridica) obj;

		// CLASSE OBJECT.equals sendo usada para comparar int, pois se uns dos valores forem null, ele ainda compara sem erro.
		return super.equals(obj) && getCnpj().equals(p.getCnpj());
	}
}
