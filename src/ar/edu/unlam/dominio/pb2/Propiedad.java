package ar.edu.unlam.dominio.pb2;

public abstract class Propiedad {
	
	private String localidad;
	private Double precio;
	private Integer codigo;
	protected Boolean fueVendido;
	protected Boolean fueAlquilado;
	
	public Propiedad(String localidad, Double precio, Integer codigo, Boolean fueAlquilado, Boolean fueVendido) {
		this.localidad = localidad;
		this.precio = precio;
		this.codigo = codigo;
		this.fueAlquilado = fueAlquilado;
		this.fueVendido = fueVendido;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
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
	
	public void alquilarPropiedad() {
		this.fueAlquilado = true;
	} 
	
}
