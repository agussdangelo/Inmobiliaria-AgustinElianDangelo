package ar.edu.unlam.dominio.pb2;

public class Campo {
	
	private String localidad;
	private Double tamanio;
	private String climaDeLaRegion;
	private String tipoDeSuelo;
	private Integer codigo;
	private Double precio;
	private Boolean fueVendido;
	private Boolean fueAlquilado;
	
	public Campo() {
		
	}
	
	public Campo(String localidad, Double tamanio, String climaDeLaRegion, String tipoDeSuelo, Integer codigo, Double precio) {
		this.localidad = localidad;
		this.tamanio = tamanio;
		this.climaDeLaRegion = climaDeLaRegion;
		this.tipoDeSuelo = tipoDeSuelo;
		this.codigo = codigo;
		this.precio = precio;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public Double getTamanio() {
		return tamanio;
	}

	public void setTamanio(Double tamanio) {
		this.tamanio = tamanio;
	}

	public String getClimaDeLaRegion() {
		return climaDeLaRegion;
	}

	public void setClimaDeLaRegion(String climaDeLaRegion) {
		this.climaDeLaRegion = climaDeLaRegion;
	}

	public String getTipoDeSuelo() {
		return tipoDeSuelo;
	}

	public void setTipoDeSuelo(String tipoDeSuelo) {
		this.tipoDeSuelo = tipoDeSuelo;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
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
