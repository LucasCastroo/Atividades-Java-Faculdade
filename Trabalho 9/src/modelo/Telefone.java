package modelo;

import java.util.Scanner;

public class Telefone implements Impressao {
	private Integer codigoArea;
	private Integer numero;

	public Integer getCodigoArea() {
		return codigoArea;
	}

	public void setCodigoArea(Integer codigoArea) {
		this.codigoArea = codigoArea;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public static Telefone lerTelefone() {
		Telefone telefone = new Telefone();
		Scanner scan = new Scanner(System.in);
		System.out.print("\n- Digite o código de área: ");
		telefone.codigoArea = scan.nextInt();
		System.out.print("- Digite o número: ");
		telefone.numero = scan.nextInt();
		
		return telefone;
	}

	@Override
	public void imprimir() {
		System.out.println("* Telefone");
		System.out.println("> Código de Área = " + getCodigoArea());
		System.out.println("> Número = " + getNumero());
	}

	@Override
	public String toString() {
		return "(" + this.codigoArea + ") " + this.numero;
	}

}
