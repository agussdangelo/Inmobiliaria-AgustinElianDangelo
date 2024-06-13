package ar.edu.unlam.dominio.pb2;

public class Campo extends Propiedad{
	
	private Double tamanio;
	private String climaDeLaRegion;
	private String tipoDeSuelo;
	
	public Campo(String localidad, Double tamanio, String climaDeLaRegion, String tipoDeSuelo, Integer codigo, Double precio, Boolean estaDisponible, TipoOperacion operacion) {
		super(localidad, precio, codigo, estaDisponible, operacion);
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

	@Override
	public String toString() {
		return "Campo [tamanio=" + tamanio + ", climaDeLaRegion=" + climaDeLaRegion + ", tipoDeSuelo=" + tipoDeSuelo
				+ "]";
	}

}
