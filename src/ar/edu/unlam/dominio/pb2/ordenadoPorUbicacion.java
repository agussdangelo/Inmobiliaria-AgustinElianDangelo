package ar.edu.unlam.dominio.pb2;

import java.util.Comparator;

public class ordenadoPorUbicacion implements Comparator<Propiedad> {

	@Override
	public int compare(Propiedad o1, Propiedad o2) {
		return o1.getLocalidad().compareTo(o2.getLocalidad());
	}

}
