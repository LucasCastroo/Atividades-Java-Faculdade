package aplicacao;

import modelo.Matematica;
import modelo.Multiplicacao;
import modelo.Pessoa;
import modelo.PessoaFisica;
import modelo.PessoaJuridica;

public class Principal {

	public static void main(String[] args) {

		Matematica teste = new Matematica();

		// TESTE SOMAR
		System.out.println("\t *SOMAR*");
		System.out.println("\n- MÉTODO 1:");
		System.out.println("55 + 14 = " + teste.somarI(55, 14));
		System.out.println("- MÉTODO 2:");
		System.out.println("55.7 + 22.5 = " + teste.somarD(55.7, 22.5));
		System.out.println("- MÉTODO 3:");
		System.out.println("120 + 43 + 2 = " + teste.somar3(120, 43, 2));

		// TESTE SUBTRAIR System.out.println("\n\t *SUBTRAIR*");
		System.out.println("\n- MÉTODO 1:");
		System.out.println("55 - 14 = " + teste.subtrairI(55, 14));
		System.out.println("- MÉTODO 2:");
		System.out.println("55.7 - 22.5 = " + teste.subtrairD(55.7, 22.5));
		System.out.println("- MÉTODO 3:");
		System.out.println("120 - 43 - 2 = " + teste.subtrair3(120, 43, 2));

		// TESTE MULTIPLICAR System.out.println("\n\t *MULTIPLICAR*");
		System.out.println("\n- MÉTODO 1:");
		System.out.println("55 * 14 = " + teste.multiplicarI(55, 14));
		System.out.println("- MÉTODO 2:");
		System.out.println("55.7 * 22.5 = " + teste.multiplicarD(55.7, 22.5));
		System.out.println("- MÉTODO 3:");
		System.out.println("120 * 43 * 2 = " + teste.multiplicar3(120, 43, 2));

		// TESTE MULTIPLICAR System.out.println("\n\t *DIVIDIR*");
		System.out.println("\n- MÉTODO 1:");
		System.out.println("55 / 14 = " + teste.dividirI(55, 14));
		System.out.println("- MÉTODO 2:");
		System.out.println("55.7 / 22.5 = " + teste.dividirD(55.7, 22.5));
		System.out.println("- MÉTODO 3:");
		System.out.println("120 / 43 / 2 = " + teste.dividir3(120, 43, 2));

		// QUESTÃO 2
		Multiplicacao teste2 = new Multiplicacao();

		System.out.println("\n\t*TESTE*");
		System.out.println("\n- MÉTODO 1:");
		System.out.println("7 * 5.3 = " + teste2.multiplicacao1(7, 5.3f));
		System.out.println("\n- MÉTODO 2:");
		System.out.println("7.9 * 5 = " + teste2.multiplicacao2((float) 7.9, 5));
		System.out.println("\n- MÉTODO 3:");
		System.out.println("2 * 5.7 = " + teste2.multiplicacao3(2, (double) 5.7));

		// QUESTÃO 3 A 5 DAQUI PARA BAIXO E DENTRO DAS CLASSES
		Pessoa pessoanormal = new Pessoa(1, "Alvaro Calebe", "alvaro@gmail.com");
		pessoanormal.imprimir();

		Pessoa pessoafisica = new PessoaFisica(1, "Alvaro Calebe", "alvaro@gmail.com", "045.721.869-80",
				"(63) 99245-8976");
		pessoafisica.imprimir();

		Pessoa pessoajuridica = new PessoaJuridica(1, "Alvaro Calebe", "alvaro@gmail.com", "32.710.884/0001-64",
				"25363029-0", "(63) 3218-1452");
		pessoajuridica.imprimir();

	}

	public static void imprimir(Pessoa pessoa) {
		// O instanceof é um operador que permite testar se um objeto é uma instância de
		// um tipo específico de uma class.
		if (pessoa instanceof PessoaFisica) {
			((PessoaFisica) pessoa).imprimir();
		} else if (pessoa instanceof PessoaJuridica) {
			((PessoaJuridica) pessoa).imprimir();
		}
	}

}
