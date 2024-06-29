package ar.edu.unlam.dominio.pb2;

public class Propiedad implements Comparable<Propiedad>{
	
	private String localidad;
	private Double precio;
	private Integer codigo;
	private Boolean estaDisponible;
	private TipoOperacion operacion;
	private Persona propietario;
	
	public Propiedad(String localidad, Double precio, Integer codigo, Boolean estaDisponible, TipoOperacion operacion) {
		this.localidad = localidad;
		this.precio = precio;
		this.codigo = codigo;
		this.estaDisponible = estaDisponible;
		this.operacion = operacion;
		this.propietario = null;
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

	@Override
	public int compareTo(Propiedad o) {
		return codigo.compareTo(o.getCodigo());
	}

	public Boolean getEstaDisponible() {
		return estaDisponible;
	}

	public void setEstaDisponible(Boolean estaDisponible) {
		this.estaDisponible = estaDisponible;
	}

	public TipoOperacion getOperacion() {
		return operacion;
	}

	public void setOperacion(TipoOperacion operacion) {
		this.operacion = operacion;
	}

	public Persona getPropietario() {
		return propietario;
	}

	public void setPropietario(Persona propietario) {
		this.propietario = propietario;
	}

	@Override
	public String toString() {
		return "Propiedad [localidad=" + localidad + ", precio=" + precio + ", codigo=" + codigo + ", estaDisponible="
				+ estaDisponible + ", operacion=" + operacion + ", propietario=" + propietario + "]";
	}
	
	
	
}
