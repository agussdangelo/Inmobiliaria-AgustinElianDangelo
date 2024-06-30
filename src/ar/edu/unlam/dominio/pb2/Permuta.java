package ar.edu.unlam.dominio.pb2;

public class Permuta implements Operacion{

	@Override
	public boolean ejecutar(Propiedad propiedad1, Persona nuevoPropietario1, Propiedad propiedad2, Persona nuevoPropietario2) {
		if (propiedad1 != null && propiedad2 != null && nuevoPropietario1 != null && nuevoPropietario2 != null) {
            propiedad1.setPropietario(nuevoPropietario1);
            propiedad2.setPropietario(nuevoPropietario2);
            
            propiedad1.setPropietario(nuevoPropietario2);
            propiedad2.setPropietario(nuevoPropietario1);
            
            return true;
        }
        return false;
    }

}
