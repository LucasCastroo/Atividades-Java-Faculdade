package modelo;

public class Telefone {
	private String nome;
	private Cor cor;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Cor getCor() {
		return cor;
	}

	public void setCor(Cor cor) {
		this.cor = cor;
	}

	@Override
	public String toString() {
		return "Telefone [nome=" + nome + ", cor=" + cor + "]";
	}
}
