package modelo;

import java.util.Scanner;
import java.time.LocalDate;

public class Time {
	private String nome;
	private LocalDate dataCadastro;
	private Integer colocacao;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getDataCadastro(Integer length) {
		return dataCadastro;
	}

	public void setDataCadastro(LocalDate dataCriacao) {
		this.dataCadastro = dataCriacao;
	}

	public Integer getColocacao() {
		return colocacao;
	}

	public void setColocacao(Integer colocacao) {
		this.colocacao = colocacao;
	}

	public Time cadastro() {
		Time time = new Time();
		Scanner scan = new Scanner(System.in);

		System.out.println("\n* CADASTRO DE TIME *");
		System.out.print("Nome: ");
		time.nome = scan.next();
		time.dataCadastro = LocalDate.now();
		System.out.print("Colocação no campeonato: ");
		time.colocacao = scan.nextInt();
		System.out.println("------ CADASTRADO COM SUCESSO! ------");

		return time;
	}

	public void listarTodos() {
		System.out.println("-------------------------------------");
		System.out.println("TIME");
		System.out.println("Nome: " + this.nome);
		System.out.println("Data de cadastro: " + this.dataCadastro);
		System.out.println("Colocação no Campeonato: " + this.colocacao);
		System.out.println("-------------------------------------\n");
	}
}
