package modelo;

public class Matematica {
	
//	 SOMAR
	public Integer somarI(Integer v1, Integer v2) {
		return v1+v2;
	}

	public Double somarD(Double v1, Double v2) {
		return v1+v2;
	}

	public Integer somar3(Integer v1, Integer v2, Integer v3) {
		return v1+v2+v3;
	}
	
//	SUBTRAIR
	public Integer subtrairI(Integer v1, Integer v2) {
		return v1-v2;
	}
	
	public Double subtrairD(Double v1, Double v2) {
		return v1-v2;
	}

	public Integer subtrair3(Integer v1, Integer v2, Integer v3) {
		return v1-v2-v3;
	}
	
//	MULTIPLICAR
	public Integer multiplicarI(Integer v1, Integer v2) {
		return v1*v2;
	}
	
	public Double multiplicarD(Double v1, Double v2) {
		return v1*v2;
	}

	public Integer multiplicar3(Integer v1, Integer v2, Integer v3) {
		return v1*v2*v3;
	}
	
//	DIVIDIR
	public Integer dividirI(Integer v1, Integer v2) {
		return v1/v2;
	}
	
	public Double dividirD(Double v1, Double v2) {
		return v1/v2;
	}
	
	public Integer dividir3(Integer v1, Integer v2, Integer v3) {
		return (v1 / v2)/v3;
	}
}
