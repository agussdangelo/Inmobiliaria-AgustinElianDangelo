package ar.edu.unlam.dominio.pb2;

import java.util.Comparator;
import java.util.HashSet;
import java.util.TreeSet;

public class Inmobiliaria{
	
	// ATRIBUTOS
	private String nombre;
	private String direccion;
	private Integer telefono;
	private HashSet<Persona> cliente;
	private TreeSet<Propiedad> propiedad;
	private static final Double UMBRAL_MINIMO = 10000.0;
	
	// CONTRUCTOR POR DEFAULT
	public Inmobiliaria() {
		this.cliente = new HashSet<Persona>();
	    this.propiedad = new TreeSet<Propiedad>();
	}
	
	// CONSTRUCTOR PARA CREAR LA INMOBILIARIA CON SUS PROPIEDADES
	public Inmobiliaria(String nombre, String direccion, Integer telefono) {
		this.nombre = nombre;	
		this.direccion = direccion;
		this.telefono = telefono;
		this.cliente = new HashSet<Persona>();
	    this.propiedad = new TreeSet<Propiedad>();
	}

	// GETTERS AND SETTERS
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Integer getTelefono() {
		return telefono;
	}

	public void setTelefono(Integer telefono) {
		this.telefono = telefono;
	}

	public HashSet<Persona> getCliente() {
		return cliente;
	}

	public void setCliente(HashSet<Persona> cliente) {
		this.cliente = cliente;
	}
	
	public TreeSet<Propiedad> getPropiedad() {
		return propiedad;
	}

	public void setPropiedad(TreeSet<Propiedad> propiedad) {
		this.propiedad = propiedad;
	}

	public Integer getCantidadCliente() {
		return cliente.size();
	}
	
	public Integer getCantidadPropiedades() {
		return propiedad.size();
	}
	
	// METODO USADO EN EL MAIN
	
	public TreeSet<Propiedad> buscarPropiedadesPorCodigo(Integer codigoIngresado) {
		 TreeSet<Propiedad> propiedadesEncontrados = new TreeSet<Propiedad>();
	        for (Propiedad propiedadActual : propiedad) {
	        	if (propiedadActual.getCodigo().equals(codigoIngresado)) {
	        	   propiedadesEncontrados.add(propiedadActual);
	            }
	        }
		return propiedadesEncontrados;
    }
	
	public TreeSet<Propiedad> buscarPropiedadesPorRangoDePrecios(Double precioMin, Double precioMax) {
		 TreeSet<Propiedad> propiedadesEncontrados = new TreeSet<Propiedad>();
	        for (Propiedad propiedadActual : propiedad) {    	
				if (propiedadActual.getPrecio() >= precioMin && propiedadActual.getPrecio() <= precioMax) {
					propiedadesEncontrados.add(propiedadActual);
				}	        	        	
	        }
		return propiedadesEncontrados;
	}
	
	public TreeSet<Propiedad> buscarPropiedadesPorUbicacion(String propiedadBuscada) {
		 TreeSet<Propiedad> propiedadesEncontrados = new TreeSet<Propiedad>();
	        for (Propiedad propiedadActual : propiedad) {
	        	if(propiedadActual instanceof Casa) {
	        		if (propiedadActual.getLocalidad().equals(propiedadBuscada)) {
	 	        	   propiedadesEncontrados.add(propiedadActual);
	 	            }
	        	}      	
	        }
		return propiedadesEncontrados;
	}
	
	// METODOS USADOS EN EL TEST
	
	public TreeSet<Propiedad> buscarCasasPorRangoDePrecios(Double precioMin, Double precioMax) {
		 TreeSet<Propiedad> propiedadesEncontrados = new TreeSet<Propiedad>();
	        for (Propiedad propiedadActual : propiedad) {
	        	if(propiedadActual instanceof Casa) {
	        		if (propiedadActual.getPrecio() >= precioMin && propiedadActual.getPrecio() <= precioMax) {
	 	        	   propiedadesEncontrados.add(propiedadActual);
	 	            }
	        	}        	
	        }
		return propiedadesEncontrados;
	}
	
	public TreeSet<Propiedad> buscarDepartamentosPorRangoDePrecios(Double precioMin, Double precioMax) {
		 TreeSet<Propiedad> propiedadesEncontrados = new TreeSet<Propiedad>();
	        for (Propiedad propiedadActual : propiedad) {
	        	if(propiedadActual instanceof Departamento) {
	        		if (propiedadActual.getPrecio() >= precioMin && propiedadActual.getPrecio() <= precioMax) {
	 	        	   propiedadesEncontrados.add(propiedadActual);
	 	            }
	        	}        	
	        }
		return propiedadesEncontrados;
	}
	
	public TreeSet<Propiedad> buscarCasasPorUbicacion(String propiedadBuscada) {
		 TreeSet<Propiedad> propiedadesEncontrados = new TreeSet<Propiedad>();
	        for (Propiedad propiedadActual : propiedad) {
	        	if(propiedadActual instanceof Casa) {
	        		if (propiedadActual.getLocalidad().equals(propiedadBuscada)) {
	 	        	   propiedadesEncontrados.add(propiedadActual);
	 	            }
	        	}      	
	        }
		return propiedadesEncontrados;
	}
	
	public TreeSet<Propiedad> buscarDepartamentosPorUbicacion(String propiedadBuscada) {
		 TreeSet<Propiedad> propiedadesEncontrados = new TreeSet<Propiedad>();
	        for (Propiedad propiedadActual : propiedad) {
	        	if (propiedadActual.getLocalidad().equals(propiedadBuscada)) {
	        	   propiedadesEncontrados.add(propiedadActual);
	            }
	        }
		return propiedadesEncontrados;
	}
	
	public TreeSet<Propiedad> buscarPropiedadesPorAlquiler() {
        TreeSet<Propiedad> propiedadesEncontrados = new TreeSet<Propiedad>();
        for (Propiedad propiedadActual : propiedad) {
        	if (propiedadActual.getOperacion().equals(TipoOperacion.ALQUILER)) {
        	   propiedadesEncontrados.add(propiedadActual);
            }
        }
		return propiedadesEncontrados;
    }
	
	public TreeSet<Propiedad> buscarPropiedadesPorVenta() {
		TreeSet<Propiedad> propiedadesEncontrados = new TreeSet<Propiedad>();
		for (Propiedad propiedadActual : propiedad) {
			if (propiedadActual.getOperacion().equals(TipoOperacion.VENTA)) {
	        	   propiedadesEncontrados.add(propiedadActual);
	        }
		}
		return propiedadesEncontrados;
	}
	
	public TreeSet<Propiedad> buscarPropiedadesPorPermuta() {
		TreeSet<Propiedad> propiedadesEncontrados = new TreeSet<Propiedad>();
		for (Propiedad propiedadActual : propiedad) {
			if (propiedadActual.getOperacion().equals(TipoOperacion.PERMUTA)) {
	        	   propiedadesEncontrados.add(propiedadActual);
	        }
		}
		return propiedadesEncontrados;
	}
	
	// METODO USADO EN EL TEST CON EXCEPTION
	public Boolean agregarPropiedadException(Propiedad propiedadNuevo) throws UmbralMinimoNoAlcanzadoException {
	    if(propiedadNuevo.getPrecio() < UMBRAL_MINIMO) {
	    	throw new UmbralMinimoNoAlcanzadoException("El importe de la propiedad está por debajo del umbral mínimo de " + UMBRAL_MINIMO);
	    }
		
		return propiedad.add(propiedadNuevo);
	}
	
	public Boolean agregarPropiedad(Propiedad propiedadNuevo) {
		return propiedad.add(propiedadNuevo);
	}
	
	public Boolean venderPropiedad(Propiedad propiedadNuevo) {
	    return propiedad.remove(propiedadNuevo);
	}
	
	public Boolean agregarCliente(Persona clienteNuevo) {
		for (Persona cliente : cliente) {
			if(cliente != null && cliente.getNombre().equals(clienteNuevo.getNombre()) && 
					cliente.getApellido().equals(clienteNuevo.getApellido()) && 
							cliente.getDni().equals(clienteNuevo.getDni()) &&
									cliente.getTelefono().equals(clienteNuevo.getTelefono()) &&
									cliente.getPropiedadInteres().equals(clienteNuevo.getPropiedadInteres())){
				return false;
			}
		}
		Boolean retorno = cliente.add(clienteNuevo); 
		return retorno;
    }

	public Integer calcularPrecioPromedioPropiedad() {
		Double promedio = 0.0;
		Double sumatoria = 0.0;
		
		for (Propiedad propiedadActual : propiedad) {
			if(propiedadActual != null) {
				sumatoria += propiedadActual.getPrecio();
			}
		}
		promedio = sumatoria / propiedad.size();
		Integer resultado = (int) Math.round(promedio);
		return resultado;
	}
	
	public TreeSet<Propiedad> devolverPropiedadOrdenadoPorPrecio() {
		return ordenarPropiedadParaDevolver(new ordenadoPorPrecio());
	}
	
	public TreeSet<Propiedad> devolverPropiedadOrdenadoPorUbicacion() {
		return ordenarPropiedadParaDevolver(new ordenadoPorUbicacion());
	}
	
	public TreeSet<Propiedad> ordenarPropiedadParaDevolver(Comparator<Propiedad> citerioDeOrdenacion) {
		TreeSet<Propiedad> propiedadOrdenada = new TreeSet<Propiedad>(citerioDeOrdenacion);
		propiedadOrdenada.addAll(propiedad);
		return propiedadOrdenada;
	}
		
	public TreeSet<Propiedad> buscarCasasPorRangoDePrecioNulo(Double precioMin, Double precioMax) {
		TreeSet<Propiedad> casasBuscadas = new TreeSet<Propiedad>();

        for (Propiedad propiedadActual : propiedad) {
            if (propiedad != null && propiedadActual.getPrecio() >= precioMin && propiedadActual.getPrecio() <= precioMax) {
                casasBuscadas.add(propiedadActual);
            }
        }
        
        if (casasBuscadas.isEmpty()) {
        	return casasBuscadas; 
        } else {    	
        	return null;
        }

	}
	
	public Boolean alquilarPropiedad(Propiedad otraPropiedad, Inmobiliaria inmobiliaria) {
		if (this.propiedad.contains(otraPropiedad) && otraPropiedad.getEstaDisponible()) {
			inmobiliaria.getPropiedad().remove(otraPropiedad);
	        return true;
	    }
		return false;
	}
	
	public void eliminarPropiedad(Propiedad propiedades) {
        propiedad.remove(propiedades);
    }
	
	public Boolean permutaPropiedades(Persona persona1, Persona persona2) {
		Propiedad propiedadPersona1 = null;
        Propiedad propiedadPersona2 = null;

        // Buscar la propiedad asociada a cada persona
        for (Propiedad propiedad : propiedad) {
            if (propiedad.getPropietario() != null && propiedad.getPropietario().equals(persona1)) {
                propiedadPersona1 = propiedad;
            }
            if (propiedad.getPropietario() != null && propiedad.getPropietario().equals(persona2)) {
                propiedadPersona2 = propiedad;
            }
        }

        if (propiedadPersona1 != null && propiedadPersona2 != null) {
            // Intercambiar propiedades
            propiedadPersona1.setPropietario(persona2);
            propiedadPersona2.setPropietario(persona1);

            return false;
        }
        return true;
    }
	
	public TreeSet<Propiedad> buscarPropiedadesPorCriterio(String criterioDeBusqueda) throws SinResultadosException {
		TreeSet<Propiedad> resultado = new TreeSet<Propiedad>();

		for (Propiedad propiedad : propiedad) {
			if (propiedad.getLocalidad().equalsIgnoreCase(criterioDeBusqueda)) {
				resultado.add(propiedad);
			}
		}

		if (resultado.isEmpty()) {
			throw new SinResultadosException("No se encontraron propiedades que coincidan con el criterio: " + criterioDeBusqueda);
		}

	    return resultado;
	}

}