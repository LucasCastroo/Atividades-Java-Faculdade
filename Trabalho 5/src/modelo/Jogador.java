package modelo;

import java.util.Scanner;

public class Jogador {
	private String nome;
	private String posicao;
	private Integer numeroCamisa;
	private Integer idade;
	private String time;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getPosicao() {
		return posicao;
	}

	public void setPosicao(String posicao) {
		this.posicao = posicao;
	}

	public Integer getNumeroCamisa() {
		return numeroCamisa;
	}

	public void setNumeroCamisa(Integer numeroCamisa) {
		this.numeroCamisa = numeroCamisa;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public Jogador cadastro() {
		Jogador jogador = new Jogador();
		Scanner scan = new Scanner(System.in);

		System.out.println("\n* CADASTRO DE JOGADOR *");
		System.out.print("Nome: ");
		jogador.nome = scan.next();
		System.out.print("Posição: ");
		jogador.posicao = scan.next();
		System.out.print("Número da camisa: ");
		jogador.numeroCamisa = scan.nextInt();
		System.out.print("Idade: ");
		jogador.idade = scan.nextInt();
		System.out.print("Time: ");
		jogador.time = scan.next();
		System.out.println("------ CADASTRADO COM SUCESSO! ------");

		return jogador;
	}

	public void listarTodos() {
		System.out.println("-------------------------------------");
		System.out.println("JOGADOR");
		System.out.println("Nome: " + this.nome);
		System.out.println("Posição: " + this.posicao);
		System.out.println("Numero da Camisa: " + this.numeroCamisa);
		System.out.println("Idade: " + this.idade);
		System.out.println("Joga no time: " + this.time);
		System.out.println("-------------------------------------\n");
	}

}
