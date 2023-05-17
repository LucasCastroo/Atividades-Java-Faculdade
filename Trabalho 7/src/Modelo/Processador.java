package Modelo;

public enum Processador {

	CELERON(1, "Celeron"), i3(2, "i3"), i5(3, "i5"), i7(4, "i7"), i9(5, "i9");

	private Integer id;
	private String label;

	private Processador(Integer id, String label) {
		this.id = id;
		this.label = label;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	// Método comparar id da classe
	public static Processador valueof(Integer id) {
		if (id == null) {
			return null;
		}

		for (Processador pro : Processador.values()) {
			if (pro.getId() == id) {
				return pro;
			}
		}

		return null;
	}

}
