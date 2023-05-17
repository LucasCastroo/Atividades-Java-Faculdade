package Aplicacao;

import Modelo.Notebook;

public class Principal {

	public static void main(String[] args) {
		Notebook notebooks[] = new Notebook[2];
		Notebook notebook = new Notebook();
		
		System.out.println("* Cadastrar Notebook\n");
		for (int i = 0; i < notebooks.length; i++) {
			notebooks[i] = notebook.inserirNotebook();
		}
		
		System.out.println("* Notebooks Cadastrados\n");
		for (Notebook n : notebooks) {
			n.imprimirNotebook();
		}
	}

}
