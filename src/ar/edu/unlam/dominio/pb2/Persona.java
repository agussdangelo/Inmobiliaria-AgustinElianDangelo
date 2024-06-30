package ar.edu.unlam.dominio.pb2;

import java.util.Objects;

public class Persona implements Comparable<Persona>{
	
	// ATRIBUTOS
	private String nombre;
	private String apellido;
	private Long dni;
	private Long telefono;
	private Double dinero;
	private TipoDePropiedad propiedadInteres;
	private Persona propietario;
	private Persona inquilino;
	
	// CONSTRUCTOR
	public Persona(String nombre, String apellido, long dni, long telefono, TipoDePropiedad propiedadInteres) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.telefono = telefono;
		this.propiedadInteres = propiedadInteres;
	}

	// CONSTRUCTOR POR DEFAULT
	public Persona() {

	}

	// GETTERS AND SETTERSS
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Long getDni() {
		return dni;
	}

	public void setDni(Long dni) {
		this.dni = dni;
	}

	public Long getTelefono() {
		return telefono;
	}

	public void setTelefono(Long telefono) {
		this.telefono = telefono;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public TipoDePropiedad getPropiedadInteres() {
		return propiedadInteres;
	}

	public void setPropiedadInteres(TipoDePropiedad propiedadInteres) {
		this.propiedadInteres = propiedadInteres;
	}

	public Double getDinero() {
		return dinero;
	}

	public void setDinero(Double dinero) {
		this.dinero = dinero;
	}
	
	public Persona getPropietario() {
		return propietario;
	}

	public void setPropietario(Persona propietario) {
		this.propietario = propietario;
	}

	public Persona getInquilino() {
		return inquilino;
	}

	public void setInquilino(Persona inquilino) {
		this.inquilino = inquilino;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(dni);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		return Objects.equals(dni, other.dni);
	}	
	
	@Override
	public int compareTo(Persona o) {
		return Long.compare(this.dni, o.getDni());
	}

}
