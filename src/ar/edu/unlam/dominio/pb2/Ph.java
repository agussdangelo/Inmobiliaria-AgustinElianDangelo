package ar.edu.unlam.dominio.pb2;

public class Ph extends Propiedad{
	
	private String calle;
	private Integer altura;
	
	public Ph(String localidad, String calle, Integer altura, Double precio, Integer codigo, Boolean estaDisponible, TipoOperacion operacion) {
		super(localidad, precio, codigo, estaDisponible, operacion);
		this.calle = calle;
		this.altura = altura;
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public Integer getAltura() {
		return altura;
	}

	public void setAltura(Integer altura) {
		this.altura = altura;
	}

	@Override
	public String toString() {
		return "Ph [calle=" + calle + ", altura=" + altura + "]";
	}

}
