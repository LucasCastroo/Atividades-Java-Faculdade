package Modelo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Notebook {
	private String marca;
	private HD armazenamento;
	private LocalDate dataCadastro;
	private Processador processador;

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public HD getArmazenamento() {
		return armazenamento;
	}

	public void setArmazenamento(HD armazenamento) {
		this.armazenamento = armazenamento;
	}

	public LocalDate getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(LocalDate dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public Processador getProcessador() {
		return processador;
	}

	public void setProcessador(Processador processador) {
		this.processador = processador;
	}

	public Notebook inserirNotebook() {
		Scanner scan = new Scanner(System.in);
		Notebook note = new Notebook();

		System.out.println("- Qual a Marca do Notebook? ");
		note.marca = scan.next();
		System.out.println("- Selecione o tamanho do HD: ");
		for (HD hd : HD.values()) {
			System.out.println("[" + hd.getId() + "] - " + hd.getLabel());
		}
		System.out.print("=>");
		note.armazenamento = HD.valueof(scan.nextInt());
		
		note.dataCadastro = LocalDate.now();
		
		System.out.println("- Selecione o Processador do seu Notebook: ");
		for (Processador pro : Processador.values()) {
			System.out.println("[" + pro.getId() + "] - " + pro.getLabel());
		}
		System.out.print("=>");
		note.processador = Processador.valueof(scan.nextInt());
		
		System.out.println("----- NOTEBOOK INSERIDO COM SUCESSO -----\n");

		return note;
	}

	public void imprimirNotebook() {
		System.out.println("-------------------------------");
		System.out.println("Marca: " + marca);
		System.out.println("Armazenamento: " + armazenamento);
		// Formatar LocalDate
		DateTimeFormatter formatarDia = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println("Data de Cadastro: " + formatarDia.format(dataCadastro));
		
		System.out.println("Processador: " + processador);
		System.out.println("-------------------------------\n");
	}

	@Override
	public String toString() {
		return "Notebook [marca=" + marca + ", armazenamento=" + armazenamento + ", dataCadastro=" + dataCadastro
				+ ", processador=" + processador + "]";
	}
	
	
}
