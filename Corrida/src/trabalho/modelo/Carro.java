package trabalho.modelo;

import java.util.Scanner;

public class Carro {
	
	public String modelo;
	public String marca;
	public double potencia;
	public double peso;
	public double velocidade;
	
	
	public Carro inserirCarro() {
		Scanner scan = new Scanner(System.in);
		Carro carro = new Carro();
		
		System.out.print("\n* CARRO");
		System.out.print("\nModelo: ");
		carro.modelo = scan.next();
		System.out.print("Marca: ");
		carro.marca = scan.next();
		System.out.print("Potencia: ");
		carro.potencia = scan.nextDouble();
		System.out.print("Peso: ");
		carro.peso = scan.nextDouble();
		
		return carro;
	}
	
	public void acelerar() {
        velocidade += 5;
        velocidade += velocidade * (potencia*0.15) - (peso / 300);
    }
	
	public void frear() {
        velocidade *= 0.75;
    }
	
	public void imprimir() {
		System.out.printf("\n%s %s %.0f km/h", modelo,marca, velocidade);
	}
}

