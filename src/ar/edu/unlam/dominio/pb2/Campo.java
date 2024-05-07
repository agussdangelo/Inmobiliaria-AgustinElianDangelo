package ar.edu.unlam.dominio.pb2;

public class Campo extends Propiedad{
	
	private Double tamanio;
	private String climaDeLaRegion;
	private String tipoDeSuelo;
	
	public Campo(String localidad, Double tamanio, String climaDeLaRegion, String tipoDeSuelo, Integer codigo, Double precio, Boolean fueAlquilado, Boolean fueVendido) {
		super(localidad, precio, codigo, fueAlquilado, fueVendido);
		this.tamanio = tamanio;
		this.climaDeLaRegion = climaDeLaRegion;
		this.tipoDeSuelo = tipoDeSuelo;
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

}
