package aplicacao;

import java.util.ArrayList;
import java.util.List;

import modelo.Pessoa;
import modelo.Sexo;

public class Principal {

	public static void main(String[] args) {
		List<Pessoa> lista = new ArrayList<Pessoa>();
		
		// Cadastro de Pessoas
		for (int i = 0; i < 2; i++) {
			lista.add(Pessoa.lerDados());
		}
		
		System.out.println("\n* Imprimindo usando método da Interface");
		lista.forEach(p -> p.imprimir());
		
		System.out.println("\n* Imprimindo todos, sem filtragem");
		Pessoa.imprimirLista(lista);
		
		System.out.println("\n* Imprimindo Pessoas do sexo Masculino");
		Pessoa.imprimirLista(lista, Sexo.Masculino);
		
		System.out.println("\n* Imprimindo Ordenado por Nome");
		Pessoa.imprimirListaOrdenadaPorNome(lista);
		
		System.out.println("\n* Imprimindo Ordenado por Idade");
		Pessoa.imprimirListaOrdenadaPorIdade(lista);
		
		System.out.println("\n* Imprimindo Ordenado por Sexo");
		Pessoa.imprimirListaOrdenadaPorSexo(lista);
	}

}
