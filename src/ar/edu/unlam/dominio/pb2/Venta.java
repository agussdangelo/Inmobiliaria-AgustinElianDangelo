package ar.edu.unlam.dominio.pb2;

public class Venta implements Operacion{

	@Override
	public boolean ejecutar(Propiedad propiedad1, Persona nuevoPropietario1, Propiedad propiedad2, Persona nuevoPropietario2) {
		if (propiedad1 != null && nuevoPropietario1 != null) {
            propiedad1.setPropietario(nuevoPropietario2);
            return true;
        }
        return false;
	}


}                   
