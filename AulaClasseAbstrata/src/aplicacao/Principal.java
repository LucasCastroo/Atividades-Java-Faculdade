package aplicacao;

import modelo.InterRadio;
import modelo.Pessoa;
import modelo.PessoaFisica;
import modelo.Radio;

public class Principal {
	public static void main(String[] args) {

//		PessoaFisica pf = new PessoaFisica();
//		pf.setNome("Joao");
//
//		impressao(pf);
		
		
//		Radio r = new Radio();
		
		InterRadio i = Radio.getInstace();
		
		i.ligar();
		i.deligar();
		i.mudarEstacao(89l);

	}

	public static void impressao(Pessoa pessoa) {
		pessoa.imprimir();
	}

	

}
