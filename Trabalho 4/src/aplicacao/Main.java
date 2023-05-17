package aplicacao;

import java.util.Scanner;

import modelo.Jogador;
import modelo.Time;

public class Main {

	public static Jogador jogadores[] = new Jogador[2];
	public static Time times[] = new Time[2];

	public static void main(String[] args) {

		menu();

	}

	private static void menu() {
		Scanner scan = new Scanner(System.in);
		Time time = new Time();
		Jogador jogador = new Jogador();
		int escolha = 0;
		String buscarJogador;

		do {
			System.out.println("\n\t*MENU DO PROGRAMA*\n");
			System.out.println("[1] - CADASTRAR TIME");
			System.out.println("[2] - CADASTRAR JOGADOR");
			System.out.println("[3] - LISTAR TODOS OS TIMES E JOGADORES");
			System.out.println("[4] - BUSCAR JOGADOR");
			System.out.println("[0] - FINALIZAR PROGRAMA");
			System.out.print("\n=> ");
			escolha = scan.nextInt();

			switch (escolha) {
			case 1:
				for (int i = 0; i < times.length; i++) {
					times[i] = time.cadastro();
				}
				break;
			case 2:
				for (int i = 0; i < jogadores.length; i++) {
					jogadores[i] = jogador.cadastro();
				}
				break;
			case 3:
				for (Time t : times) {
					t.listarTodos();
				}
				for (Jogador j : jogadores) {
					j.listarTodos();
				}
				break;
			case 4:
				System.out.print("\n* Qual o nome do jogador que deseja buscar: ");
				buscarJogador = scan.next();
				buscar(buscarJogador, jogadores);
				break;
			}
		} while (escolha != 0);

	}

	private static boolean buscar(String busca, Jogador[] jogadores) {

		for (int i = 0; i < jogadores.length; i++) {
			if (busca.equalsIgnoreCase(jogadores[i].getNome())) {
				jogadores[i].listarTodos();
				return true;
			}
		}
		return false;
	}

}
