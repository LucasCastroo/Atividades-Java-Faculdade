package trabalho.modelo;
import java.util.Scanner;


public class Moto {
	
	public String modelo;
	public String marca;
	public double cilindrada;
	public double peso;
	public double velocidade;
	
	public Moto inserirMoto() {
		Scanner scan = new Scanner(System.in);
		Moto moto = new Moto();
		
		System.out.print("\n* MOTO");
		System.out.print("\nModelo: ");
		moto.modelo = scan.next();
		System.out.print("Marca: ");
		moto.marca = scan.next();
		System.out.print("Cilindrada: ");
		moto.cilindrada = scan.nextDouble();
		System.out.print("Peso: ");
		moto.peso = scan.nextDouble();
		
		return moto;
		
	}
	
	public void acelerar() {
        velocidade += 5;
        velocidade += velocidade * (cilindrada*0.15) - (peso / 300);
    }
	
	public void frear() {
        velocidade *= 0.75;
    }
	
	public void imprimir() {
		System.out.printf("\n%s %s %.0f km/h", modelo,marca, velocidade);
	}
}
