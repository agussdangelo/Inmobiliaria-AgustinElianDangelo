package ar.edu.unlam.dominio.pb2;

public class Terreno {

	private String localidad;
	private Double tamanio;
	private String forma;
	private String condicionDeSuelo;
	private Double precio;
	private Integer codigo;
	private Boolean fueVendido;
	private Boolean fueAlquilado;
	
	public Terreno() {
		
	}
	
	public Terreno(String localidad, Double tamanio, String forma, String condicionDeSuelo, Double precio, Integer codigo) {
		this.localidad = localidad;
		this.tamanio = tamanio;
		this.forma = forma;
		this.condicionDeSuelo = condicionDeSuelo;
		this.precio = precio;
		this.codigo = codigo;
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

	public String getForma() {
		return forma;
	}

	public void setForma(String forma) {
		this.forma = forma;
	}

	public String getCondicionDeSuelo() {
		return condicionDeSuelo;
	}

	public void setCondicionDeSuelo(String condicionDeSuelo) {
		this.condicionDeSuelo = condicionDeSuelo;
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
