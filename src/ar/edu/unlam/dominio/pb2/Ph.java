package ar.edu.unlam.dominio.pb2;

public class Ph extends Propiedad{
	
	private String calle;
	private Integer altura;
	
	public Ph(String localidad, String calle, Integer altura, Double precio, Integer codigo, Boolean fueAlquilado, Boolean fueVendido) {
		super(localidad, precio, codigo, fueAlquilado, fueVendido);
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

}
