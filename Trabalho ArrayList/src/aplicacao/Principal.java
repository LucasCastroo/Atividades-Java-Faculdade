package aplicacao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import modelo.Pessoa;
import modelo.Sexo;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		List<Pessoa> lista = new ArrayList<Pessoa>();
		Scanner scan = new Scanner(System.in);

		// Cadastro da Pessoa
		for (int i = 0; i < 2; i++) {
			lista.add(Pessoa.cadastrarPessoa());
		}
		
		// Imprimindo Pessoas Cadastradas
		System.out.println("* Pessoas Cadastradas: \n");
		imprimirTudo(lista);
		
		// Percorrendo o tamanho do array que foi definido no FOR acima, depois comparando o cada pessoa
		// em cada índice que o atríbuto da Sexo (que é uma ENUM) for igual a MASCULINO, para depois ser
		// removido e decrementado no FOR.
		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i).getSexo() == Sexo.MASCULINO) {
				lista.remove(i);
				i--;
			}
		}
		// Atualização da lista com as pessoas do sexo masculino, removidas.
		System.out.println("\n* Atualização da lista com pessoas removidas do SEXO MASCULINO:");
		imprimirTudo(lista);
	}

	public static void imprimirTudo(List<Pessoa> lista) {
		for (Pessoa pessoa : lista) {
			System.out.println(pessoa);
		}
	}
}
