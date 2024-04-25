package ar.edu.unlam.dominio.pb2;

public class Departamento {
	
	private String localidad;
	private String calle;
	private Integer altura;
	private Double precio;
	private Integer codigo;
	private Integer piso;
	private Boolean fueVendido;
	private Boolean fueAlquilado;
	
	public Departamento() {
		
	}
	
	public Departamento(String localidad, String calle, Integer altura, Double precio, Integer codigo, Integer piso) {
		this.localidad = localidad;
		this.calle = calle;
		this.altura = altura;
		this.precio = precio;
		this.codigo = codigo;
		this.piso = piso;
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

	public Integer getPiso() {
		return piso;
	}

	public Integer setPiso(Integer piso) {
		return this.piso = piso;
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
