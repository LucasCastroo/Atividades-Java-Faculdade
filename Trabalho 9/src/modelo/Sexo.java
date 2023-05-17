package modelo;

public enum Sexo {
	Masculino(1, "Masculino"), Feminino(2, "Feminino");

	private Sexo(Integer id, String nome) {
		this.id = id;
		this.nome = nome;
	}

	private Integer id;
	private String nome;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public static Sexo valueof(Integer id) {
		if (id == null) {
			return null;
		}

		for (Sexo sex : Sexo.values()) {
			if (sex.getId() == id) {
				return sex;
			}
		}

		return null;
	}

}
