package modelo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Pessoa implements Impressao {
	private String nome;
	private Integer idade;
	private Sexo sexo;
	private List<Telefone> listaTelefone;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}

	public List<Telefone> getListaTelefone() {
		return listaTelefone;
	}

	public void setListaTelefone(List<Telefone> listaTelefone) {
		this.listaTelefone = listaTelefone;
	}

	public static Pessoa lerDados() {
		List<Telefone> listaTelefone = new ArrayList<Telefone>();
		Scanner scan = new Scanner(System.in);
		Pessoa pessoa = new Pessoa();

		System.out.println("\n* Cadastro de uma Pessoa\n");
		System.out.print("- Digite o nome: ");
		pessoa.nome = scan.next();
		System.out.print("- Digite a idade: ");
		pessoa.idade = scan.nextInt();
		System.out.println("- Qual o sexo?");
		for (Sexo sex : Sexo.values()) {
			System.out.println("[" + sex.getId() + "] - " + sex.getNome());
		}
		System.out.print("=> ");
		pessoa.sexo = Sexo.valueof(scan.nextInt());
		System.out.println("* Quantos números de telefone dessa inserir? ");
		int numTelefone = scan.nextInt();
		for (int i = 0; i < numTelefone; i++) {
			System.out.println("\n* Inserção do telefone " + (i + 1));
			listaTelefone.add(Telefone.lerTelefone());
		}
		pessoa.listaTelefone = listaTelefone;

		System.out.println("----- Cadastro Concluído ------");
		return pessoa;
	}

	@Override
	public void imprimir() {
		System.out.println("---------------------------");
		System.out.println("* Dados Pessoais");
		System.out.println("> Nome = " + getNome());
		System.out.println("> Idade = " + getIdade());
		System.out.println("> Sexo = " + getSexo());
		listaTelefone.forEach(p -> p.imprimir());
		System.out.println("---------------------------\n");
	}

	public static void imprimirLista(List<Pessoa> lista) {
		lista.forEach(p -> System.out.println(p));
	}

	public static void imprimirLista(List<Pessoa> lista, Sexo sexo) {
		lista.stream().filter(p -> p.getSexo() == sexo).forEach(p -> System.out.println(p));
		;
	}

	public static void imprimirListaOrdenadaPorNome(List<Pessoa> lista) {
		lista.sort((p1, p2) -> p1.getNome().compareToIgnoreCase(p2.getNome()));
//		lista.sort(new Comparator<Pessoa>() {
//
//			@Override
//			public int compare(Pessoa p1, Pessoa p2) {
//				return p1.getNome().compareTo(p2.getNome());
//			};
//		});
		lista.forEach(p -> System.out.println(p));
	}

	public static void imprimirListaOrdenadaPorIdade(List<Pessoa> lista) {
		lista.sort((p1, p2) -> p1.getIdade().compareTo(p2.getIdade()));
//		lista.sort(new Comparator<Pessoa>() {
//
//			@Override
//			public int compare(Pessoa p1, Pessoa p2) {
//				Integer idade = p1.getIdade();
//				return idade.compareTo(p2.getIdade());
//			};
//		});
		lista.forEach(p -> System.out.println(p));
	}

	public static void imprimirListaOrdenadaPorSexo(List<Pessoa> lista) {
		lista.sort((p1, p2) -> p1.getSexo().compareTo(p2.getSexo()));
//		lista.sort(new Comparator<Pessoa>() {
//
//			@Override
//			public int compare(Pessoa p1, Pessoa p2) {
//				return p1.getSexo().compareTo(p2.getSexo());
//			};
//		});
		lista.forEach(p -> System.out.println(p));
	}

	@Override
	public String toString() {
		return "Pessoa [nome = " + nome + ", idade = " + idade + ", sexo = " + sexo + ", telefone = "
				+ listaTelefone.toString() + "]";
	}

}
