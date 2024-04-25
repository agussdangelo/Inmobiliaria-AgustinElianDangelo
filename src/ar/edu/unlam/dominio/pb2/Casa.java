package ar.edu.unlam.dominio.pb2;

public class Casa {

	private String localidad;
	private String calle;
	private Integer altura;
	private Double precio;
	private Integer codigo;
	private Boolean fueVendido;
	private Boolean fueAlquilado;
	
	public Casa() {
		
	}
	
	public Casa(String localidad, String calle, Integer altura, Double precio, Integer codigo) {
		this.localidad = localidad;
		this.calle = calle;
		this.altura = altura;
		this.precio = precio;
		this.codigo = codigo;
	}
	
	public String getLocalidad() {
		return localidad;
	}
	
	public String setLocalidad(String localidad) {
		return this.localidad = localidad;
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
	
	public Double getPrecio() {
		return precio;
	}
	
	public Double setPrecio(Double precio) {
		return this.precio = precio;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public Integer setCodigo(Integer codigo) {
		return this.codigo = codigo;
	}

	public Boolean getFueVendido() {
		return fueVendido;
	}

	public void setFueVendido(Boolean fueVendido) {
		this.fueVendido = fueVendido;
	}

	public Boolean getFueAlquilado() {
		return fueAlquilado;
	}

	public void setFueAlquilado(Boolean fueAlquilado) {
		this.fueAlquilado = fueAlquilado;
	}
	
	
}
