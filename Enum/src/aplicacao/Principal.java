package aplicacao;

import java.util.Scanner;

import modelo.Cor;
import modelo.Telefone;

public class Principal {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Selecione uma das cores: ");
		for (Cor cor : Cor.values()) {
			System.out.println(cor.getId() + " " + cor.getLabel());
		}
		
		
		System.out.println(Cor.valueof(scan.nextInt()));

	}

}
