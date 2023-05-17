package Principal;
import java.util.Scanner;

import Classes.Maquina;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Maquina bebida1 = new Maquina(1,"Pepsi",435,5.5d);
		Maquina bebida2 = new Maquina(2,"Coca-Cola",350,4d);
		Maquina bebida3 = new Maquina(3,"Fanta-Uva",250,3.5d);
		Maquina bebida4 = new Maquina(4,"Fanta-Laranja",250,3.5d);
		Maquina bebida5 = new Maquina(5,"Sprite",350,5d);
		String nome;
		int escolha;
		
		System.out.print("* Olá, me chamo UNI, a máquina de refrigerante inteligente\nQual o seu nome? ");
		nome = scan.nextLine();
		System.out.println("\n* Seja Bem-Vindo "+nome);
		System.out.println("* Lembrando que só aceitamos pagamento no dinheiro!");
		System.out.println("- Escolha o ID da bebida que deseja: \n");
	
		System.out.println("-----------------------------------");
		bebida1.mostrarBebida();
		System.out.println("-----------------------------------");
		bebida2.mostrarBebida();
		System.out.println("-----------------------------------");
		bebida3.mostrarBebida();
		System.out.println("-----------------------------------");
		bebida4.mostrarBebida();
		System.out.println("-----------------------------------");
		bebida5.mostrarBebida();
		System.out.println("-----------------------------------");

		System.out.print("=> ");
		escolha = scan.nextInt();
		
		if(escolha == bebida1.getId()) {
			bebida1.venda();
		}
		else if(escolha == bebida2.getId()) {
			bebida2.venda();
		}
		else if(escolha == bebida3.getId()) {
			bebida3.venda();
		}
		else if(escolha == bebida4.getId()) {
			bebida4.venda();
		}
		else if(escolha == bebida5.getId()) {
			bebida5.venda();
		}
	}

}
