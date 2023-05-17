package modelo;

public class Radio implements InterRadio {
	private float estacao;
	private boolean ligado;

	private Radio() {

	}

	public static InterRadio getInstace() {
		return new Radio();
	}

	public float getEstacao() {
		return estacao;
	}

	public void setEstacao(float estacao) {
		this.estacao = estacao;
	}

	public boolean isLigado() {
		return ligado;
	}

	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}

	@Override
	public void ligar() {
		this.ligado = true;

	}

	@Override
	public void deligar() {
		this.ligado = false;

	}

	@Override
	public void mudarEstacao(float valor) {
		this.estacao = valor;

	}

}
