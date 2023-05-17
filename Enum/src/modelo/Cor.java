package modelo;

public enum Cor {
	
	AMARELA(1,"Amarela", ""), 
	AZUL(2,"Azul",""),
	BRANCA(3,"Branca",""),
	PRETA(4,"Preta",""), 
	VERDE(5,"Verde","");

	private int id;
	private String label;
	private String hexadecimal;
	
	private Cor(int id, String label, String hexadecimal) {
		this.id = id;
		this.label = label;
		this.hexadecimal = hexadecimal;
	}
	
	public int getId() {
		return id;
	}
	
	public String getHexadecimal() {
		return hexadecimal;
	}
	
	public String getLabel() {
		return label;
	}
	
	@Override
	public String toString() {
		return getLabel();
	}
	
	public static Cor valueof(Integer id) {
		if (id == null) {
			return null;
		}
		
		for (Cor cor : Cor.values()) {
			if (cor.getId() == id) {
				return cor;
			}
		}
		return null;

	}
	
}
