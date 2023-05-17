package Modelo;

public enum HD {

	GB126(1, "126 GB"), GB256(2, "256 GB"), GB512(3, "512 GB"), TB1(4, "1 TB"), TB2(5, "2 TB");

	private Integer id;
	private String label;

	private HD(Integer id, String label) {
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
	public static HD valueof(Integer id) {
		if (id == null) {
			return null;
		}

		for (HD hd : HD.values()) {
			if (hd.getId() == id) {
				return hd;
			}
		}

		return null;
	}

}
