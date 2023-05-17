package modelo;

import java.util.Objects;

public class Pessoa {
	private Integer id;
	private String nome;
	private String email;

	// CONSTRUCTOR
	public Pessoa(Integer id, String nome, String email) {
		this.id = id;
		this.nome = nome;
		this.email = email;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void imprimir() {
		System.out.println("\n\t*PESSOA*");
		System.out.println("Id: " + getId());
		System.out.println("Nome: " + getNome());
		System.out.println("Email: " + getEmail());
	}

	@Override
	public String toString() {
		return "ID: " + this.id + "NOME: " + this.nome + "EMAIL: " + this.email;
	}

	@Override
	public boolean equals(Object obj) {
		// COMPARA SE A CLASSE DO OBJETO QUE ESTÁ COMPARANDO É A MESMA CORRESPONDENTE
		if (this.getClass() != obj.getClass()) {
			return false;
		}

		// CAST CONVERTE DA CLASSE OBJECT PARA CLASSE PESSOA
		Pessoa p = (Pessoa) obj;

		// CLASSE OBJECT.equals sendo usada para comparar int, pois se uns dos valores forem null, ele ainda compara sem erro.
		return Objects.equals(getId(), p.getId());
	}
}
