package ar.edu.unlam.dominio.pb2;

public class Casa extends Propiedad{

	private String calle;
	private Integer altura;
	
	public Casa(String localidad, String calle, Integer altura, Double precio, Integer codigo, Boolean fueAlquilado, Boolean fueVendido) {
		super(localidad, precio, codigo, fueAlquilado, fueVendido);
		this.calle = calle;
		this.altura = altura;
	}
	
	public String getCalle() {
		return calle;
	}
	
	public String setCalle(String calle) {
		return this.calle = calle;
	}
	
	public Integer getAltura() {
		return altura;
	}
	
	public Integer setAltura(Integer altura) {
		return this.altura = altura;
	}
	
}
