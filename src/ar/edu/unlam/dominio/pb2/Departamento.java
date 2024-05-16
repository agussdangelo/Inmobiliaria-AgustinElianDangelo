package ar.edu.unlam.dominio.pb2;

public class Departamento extends Propiedad{
	
	private String calle;
	private Integer altura;
	private Integer piso;

	public Departamento(String localidad, String calle, Integer altura, Double precio, Integer codigo, Integer piso, Boolean fueAlquilado, Boolean fueVendido) {
		super(localidad, precio, codigo, fueAlquilado, fueVendido);
		this.calle = calle;
		this.altura = altura;
		this.piso = piso;
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

	public Integer getPiso() {
		return piso;
	}

	public void setPiso(Integer piso) {
		this.piso = piso;
	}

	@Override
	public String toString() {
		return "Departamento [calle=" + calle + ", altura=" + altura + ", piso=" + piso + "]";
	}

}
