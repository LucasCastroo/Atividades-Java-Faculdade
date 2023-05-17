package Classes;
import java.util.Scanner;

public class Maquina {
	private int id;
	private String bebida;
	private int mililitros;
	private double preco;
	
	public Maquina(int id,String bebida, int mililitros, double preco) {
		this.id = id;
		this.bebida = bebida;
		this.mililitros = mililitros;
		this.preco = preco;
	}
	
	public int getId() {
		return id;
	}

	public void mostrarBebida() {
		System.out.println("["+this.id+"] - "+this.bebida+" "+this.mililitros+" ML"+" R$"+this.preco);
	}
	
	public void venda() {
		Scanner scan = new Scanner(System.in);
		double valor = 0;
		double troco = 0;
		
		System.out.println("\n\t* Valor total a se pagar: R$"+this.preco);
		System.out.print("- Insira a quantia em dinheiro que deseja pagar\n R$");
		valor = scan.nextFloat();
		
		calcularTroco(valor,troco);
		
		System.out.println("\n-------- OPERAÇÃO FINALIZADA --------");
		System.out.println("\n----------- VOLTE SEMPRE -----------");
	}
	
	private void calcularTroco(double valor,double troco) {
		
		if(valor>=this.preco) {
			troco += valor - this.preco;
			System.out.println("\t* Seu troco é R$"+troco);
		}
		else {
			System.out.println("\n# FALTA DINHEIRO MEU CARO! #");
		}
	
	}
	
}
