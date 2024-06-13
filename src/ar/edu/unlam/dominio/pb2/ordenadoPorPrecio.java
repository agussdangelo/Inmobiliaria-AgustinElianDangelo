package ar.edu.unlam.dominio.pb2;

import java.util.Comparator;

public class ordenadoPorPrecio implements Comparator<Propiedad> {

	@Override
	public int compare(Propiedad o1, Propiedad o2) {
		return o1.getPrecio().compareTo(o2.getPrecio());
	}

}
