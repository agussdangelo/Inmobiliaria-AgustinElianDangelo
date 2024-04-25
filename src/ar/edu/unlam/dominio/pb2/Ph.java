package ar.edu.unlam.dominio.pb2;

public class Ph {
	
	private String localidad;
	private String calle;
	private Integer altura;
	private Double precio;
	private Integer codigo;
	private Boolean fueVendido;
	private Boolean fueAlquilado;
	
	public Ph() {
		
	}
	
	public Ph(String localidad, String calle, Integer altura, Double precio, Integer codigo) {
		this.localidad = localidad;
		this.calle = calle;
		this.altura = altura;
		this.precio = precio;
		this.codigo = codigo;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
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

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
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
