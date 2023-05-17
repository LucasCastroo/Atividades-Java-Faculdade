package modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Pessoa {
	private String cpf;
	private String nome;
	private Sexo sexo;

	public Pessoa() {
		// TODO Auto-generated constructor stub
	}

	public Pessoa(String cpf, String nome, Sexo sexo) {
		this.cpf = cpf;
		this.nome = nome;
		this.sexo = sexo;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoa other = (Pessoa) obj;
		return Objects.equals(cpf, other.cpf) && Objects.equals(nome, other.nome) && sexo == other.sexo;
	}

	public static Pessoa cadastrarPessoa() {
		Pessoa pessoa = new Pessoa();
		Scanner scan = new Scanner(System.in);

		System.out.println("* Nova Pessoa");
		System.out.println("Qual o cpf? ");
		pessoa.cpf = scan.next();
		System.out.println("Qual o nome? ");
		pessoa.nome = scan.next();
		System.out.println("Qual o sexo?");
		for (Sexo sex : Sexo.values()) {
			System.out.println("[" + sex.getId() + "] - " + sex.getNome());
		}
		System.out.print("=> ");
		pessoa.sexo = Sexo.valueof(scan.nextInt());

		System.out.println("------- PESSOA CADASTRADA -------");

		return pessoa;
	}
	
	@Override
	public String toString() {
		return "Pessoa [ cpf = " + cpf + ", nome = " + nome + ", sexo = " + sexo + "]"; 
	}
	
}
