package ar.edu.unlam.dominio.pb2;

public class Terreno extends Propiedad{

	private Double tamanio;
	private String forma;
	private String condicionDeSuelo;
	
	public Terreno(String localidad, Double tamanio, String forma, String condicionDeSuelo, Double precio, Integer codigo, Boolean estaDisponible, TipoOperacion operacion) {
		super(localidad, precio, codigo, estaDisponible, operacion);
		this.tamanio = tamanio;
		this.forma = forma;
		this.condicionDeSuelo = condicionDeSuelo;
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

	@Override
	public String toString() {
		return "Terreno [tamanio=" + tamanio + ", forma=" + forma + ", condicionDeSuelo=" + condicionDeSuelo + "]";
	}
	
}
