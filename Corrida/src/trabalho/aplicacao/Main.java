package trabalho.aplicacao;

import trabalho.modelo.*;


public class Main {

	public static void main(String[] args) {
		Carro carro = new Carro();
		Moto moto = new Moto();
		Carro carros[] = new Carro[4];
		Moto motos[] = new Moto[4];
		
		System.out.println("* SEJA BEM VINDO A CORRIDA DA UNITINS! ");
		System.out.println("PRIMEIRAMENTE CADASTRE OS VEÍCULOS QUE IRÃO PARTICIPAR DA CORRIDA: ");
		
		for(int i = 0;i < carros.length; i++) {
			carros[i] = carro.inserirCarro();
		}
		
		for(int i = 0;i < motos.length; i++) {
			motos[i] = moto.inserirMoto();
		}
		
		System.out.println("\n****  AGORA VAMOS COMEÇAR A CORRIDA  ****");
		
		System.out.println("\n--- CORRIDA DOS CARROS ---");
		for (int tempo = 1; tempo <= 20; tempo++) {
            if (tempo != 6 && tempo != 11 && tempo != 15) {
                for (Carro c : carros) {
                    c.acelerar();
                }
            } else {
                for (Carro c : carros) {
                    c.frear();
                }
            }
        }
		for(Carro c : carros) {
			c.imprimir();
		}
		
		System.out.println("\n\n--- CORRIDA DAS MOTOS ---");
		for (int tempo = 1; tempo <= 20; tempo++) {
            if (tempo != 6 && tempo != 11 && tempo != 15) {
                for (Moto m : motos) {
                    m.acelerar();
                }
            } else {
                for (Moto m : motos) {
                    m.frear();
                }
            }
        }
		for(Moto m : motos) {
			m.imprimir();
		}
	}
}