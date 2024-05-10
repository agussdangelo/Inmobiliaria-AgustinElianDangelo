package ar.edu.unlam.dominio.pb2;

import java.util.ArrayList;
import java.util.HashSet;

public class Inmobiliaria {
	
	private static Integer CANTIDAD_MAXIMA_CLIENTES = 100;
	private static Integer CANTIDAD_MAXIMA_PROPIEDADES = 50;
	private static Integer CANTIDAD_MAXIMA_DEPARTAMENTO = 10;
	private String nombre;
	private String direccion;
	private Integer telefono;
	private static ArrayList<Casa> casa;
	private Integer cantidadCasas;
	private static ArrayList<Departamento> departamento;
	private Integer cantidadDepartamentos;
	private Ph ph[];
	private Integer cantidadPh;
	private Terreno terreno[];
	private Integer cantidadTerrenos;
	private Campo campo[];
	private Integer cantidadCampos;
	private static HashSet<Persona> cliente;
	private Integer cantidadCliente;
	
	public Inmobiliaria() {
		Inmobiliaria.casa = new ArrayList<Casa>();
		Inmobiliaria.cliente = new HashSet<Persona>();
		Inmobiliaria.departamento = new ArrayList<Departamento>();
		this.cantidadCliente = 0;
		this.cantidadCasas = 0;
		cantidadDepartamentos = 0;
		this.cantidadCampos = 0;
		this.cantidadPh = 0;
	    this.cantidadTerrenos = 0;
	}
	
	public Inmobiliaria(String nombre, String direccion, Integer telefono) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
		Inmobiliaria.cliente = new HashSet<Persona>();
		Inmobiliaria.casa = new ArrayList<Casa>();
		Inmobiliaria.departamento = new ArrayList<Departamento>();
		this.campo = new Campo[CANTIDAD_MAXIMA_PROPIEDADES];
		this.ph = new Ph[CANTIDAD_MAXIMA_PROPIEDADES];
	    this.terreno = new Terreno[CANTIDAD_MAXIMA_PROPIEDADES];
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

	public static Integer getCANTIDAD_MAXIMA_CLIENTES() {
		return CANTIDAD_MAXIMA_CLIENTES;
	}

	public static void setCANTIDAD_MAXIMA_CLIENTES(Integer cANTIDAD_MAXIMA_CLIENTES) {
		CANTIDAD_MAXIMA_CLIENTES = cANTIDAD_MAXIMA_CLIENTES;
	}

	public static Integer getCANTIDAD_MAXIMA_PROPIEDADES() {
		return CANTIDAD_MAXIMA_PROPIEDADES;
	}

	public static void setCANTIDAD_MAXIMA_PROPIEDADES(Integer cANTIDAD_MAXIMA_PROPIEDADES) {
		CANTIDAD_MAXIMA_PROPIEDADES = cANTIDAD_MAXIMA_PROPIEDADES;
	}

	public ArrayList<Casa> getCasa() {
		return casa;
	}

	public void setCasa(ArrayList<Casa> casa) {
		Inmobiliaria.casa = casa;
	}

	public ArrayList<Departamento> getDepartamento() {
		return departamento;
	}

	public void setDepartamento(ArrayList<Departamento> departamento) {
		Inmobiliaria.departamento = departamento;
	}

	public Ph[] getPh() {
		return ph;
	}

	public void setPh(Ph ph[]) {
		this.ph = ph;
	}

	public Terreno[] getTerreno() {
		return terreno;
	}

	public void setTerreno(Terreno terreno[]) {
		this.terreno = terreno;
	}

	public Campo[] getCampo() {
		return campo;
	}

	public void setCampo(Campo campo[]) {
		this.campo = campo;
	}

	public HashSet<Persona> getCliente() {
		return cliente;
	}

	public void setCliente(HashSet<Persona> cliente) {
		Inmobiliaria.cliente = cliente;
	}

	public Integer getCantidadCasas() {
		return cantidadCasas;
	}

	public void setCantidadCasas(Integer cantidadCasas) {
		this.cantidadCasas = cantidadCasas;
	}

	public Integer getCantidadDepartamentos() {
		return cantidadDepartamentos;
	}

	public void setCantidadDepartamentos(Integer cantidadDepartamentos) {
		this.cantidadDepartamentos = cantidadDepartamentos;
	}

	public Integer getCantidadPh() {
		return cantidadPh;
	}

	public void setCantidadPh(Integer cantidadPh) {
		this.cantidadPh = cantidadPh;
	}

	public Integer getCantidadTerrenos() {
		return cantidadTerrenos;
	}

	public void setCantidadTerrenos(Integer cantidadTerrenos) {
		this.cantidadTerrenos = cantidadTerrenos;
	}

	public Integer getCantidadCampos() {
		return cantidadCampos;
	}

	public void setCantidadCampos(Integer cantidadCampos) {
		this.cantidadCampos = cantidadCampos;
	}

	public Integer getCantidadCliente() {
		return cantidadCliente;
	}

	public void setCantidadCliente(Integer cantidadCliente) {
		this.cantidadCliente = cantidadCliente;
	}
	
	public static void buscarPropiedadesPorCodigoCasas(Inmobiliaria inmobiliaria, int codigoBusqueda) {
        System.out.println("Propiedades encontradas en el codigo " + codigoBusqueda + " : ");
        for (Casa p : inmobiliaria.getCasa()) {
            if (p.getCodigo() == codigoBusqueda) {
				System.out.println("---------------------");
				System.out.println("Precio: " + p.getPrecio());
				System.out.println("Ubicado en: " + p.getLocalidad());
				System.out.println("Direccion en: " + p.getCalle());
				System.out.println("Altura: " + p.getAltura());
				System.out.println("Codigo: " + p.getCodigo());
				System.out.println("---------------------");
            }
        }
    }
	
	public static void buscarPropiedadesPorCodigoDepto(Inmobiliaria inmobiliaria, int codigoBusqueda) {
        System.out.println("Propiedades encontradas en el codigo " + codigoBusqueda + " : ");
        for (Departamento d : inmobiliaria.getDepartamento()) {
            if (d != null && d.getCodigo() == codigoBusqueda) {
				System.out.println("---------------------");
				System.out.println("Precio: " + d.getPrecio());
				System.out.println("Ubicado en: " + d.getLocalidad());
				System.out.println("Direccion en: " + d.getCalle());
				System.out.println("Altura: " + d.getAltura());
				System.out.println("Piso: " + d.getPiso());
				System.out.println("Codigo: " + d.getCodigo());
				System.out.println("---------------------");
            }
        }
    }
	
	public static void buscarPropiedadesPorCodigoPh(Inmobiliaria inmobiliaria, int codigoBusqueda) {
        System.out.println("Propiedades encontradas en el codigo " + codigoBusqueda + " : ");
        for (Ph phs : inmobiliaria.getPh()) {
            if (phs.getCodigo() == codigoBusqueda) {
				System.out.println("---------------------");
				System.out.println("Precio: " + phs.getPrecio());
				System.out.println("Ubicado en: " + phs.getLocalidad());
				System.out.println("Direccion en: " + phs.getCalle());
				System.out.println("Altura: " + phs.getAltura());
				System.out.println("Codigo: " + phs.getCodigo());
				System.out.println("---------------------");
            }
        }
    }
	
	public static void buscarPropiedadesPorCodigoTerreno(Inmobiliaria inmobiliaria, int codigoBusqueda) {
        System.out.println("Propiedades encontradas en el codigo " + codigoBusqueda + " : ");
        for (Terreno terrenos : inmobiliaria.getTerreno()) {
            if (terrenos.getCodigo() == codigoBusqueda) {
				System.out.println("---------------------");
				System.out.println("Precio: " + terrenos.getPrecio());
				System.out.println("Ubicado en: " + terrenos.getLocalidad());
				System.out.println("Tamanio de: " + terrenos.getTamanio());
				System.out.println("Forma de: " + terrenos.getForma());
				System.out.println("Condicion de suelo: " + terrenos.getCondicionDeSuelo());
				System.out.println("Codigo: " + terrenos.getCodigo());
				System.out.println("---------------------");
            }
        }
    }
	
	public static void buscarPropiedadesPorCodigoCampos(Inmobiliaria inmobiliaria, int codigoBusqueda) {
        System.out.println("Propiedades encontradas en el codigo " + codigoBusqueda + " : ");
        for (Campo campo : inmobiliaria.getCampo()) {
            if (campo.getCodigo() == codigoBusqueda) {
				System.out.println("---------------------");
				System.out.println("Precio: " + campo.getPrecio());
				System.out.println("Ubicado en: " + campo.getLocalidad());
				System.out.println("Tamanio de: " + campo.getTamanio());
				System.out.println("Clima de la region: " + campo.getClimaDeLaRegion());
				System.out.println("Tipo de suelo: " + campo.getTipoDeSuelo());
				System.out.println("Codigo: " + campo.getCodigo());
				System.out.println("---------------------");
            }
        }
    }
	
	public static Casa[] ordenarPrecioCasa(Casa[] array) {
	    Casa value;
	    for (int i = array.length - 1; i > 0; i--) {
	        for (int j = 0; j < i; j++) {
	            if (array[j].getPrecio() < array[j + 1].getPrecio()) {
	                value = array[j + 1];
	                array[j + 1] = array[j];
	                array[j] = value;
	            }
	        }
	    }
	    return array;
	}
	
	public static Departamento[] ordenarPrecioDepartamento(Departamento[] array) {
	    Departamento value;
	    for (int i = array.length - 1; i > 0; i--) {
	        for (int j = 0; j < i; j++) {
	            if (array[j].getPrecio() < array[j + 1].getPrecio()) {
	                value = array[j + 1];
	                array[j + 1] = array[j];
	                array[j] = value;
	            }
	        }
	    }
	    return array;
	}
	
	public static Ph[] ordenarPrecioPh(Ph[] array) {
	    Ph value;
	    for (int i = array.length - 1; i > 0; i--) {
	        for (int j = 0; j < i; j++) {
	            if (array[j].getPrecio() < array[j + 1].getPrecio()) {
	                value = array[j + 1];
	                array[j + 1] = array[j];
	                array[j] = value;
	            }
	        }
	    }
	    return array;
	}
	
	public static Terreno[] ordenarPrecioTerreno(Terreno[] array) {
	    Terreno value;
	    for (int i = array.length - 1; i > 0; i--) {
	        for (int j = 0; j < i; j++) {
	            if (array[j].getPrecio() < array[j + 1].getPrecio()) {
	                value = array[j + 1];
	                array[j + 1] = array[j];
	                array[j] = value;
	            }
	        }
	    }
	    return array;
    }
	
	public static Campo[] ordenarPrecioCampo(Campo[] array) {
	    Campo value;
	    for (int i = array.length - 1; i > 0; i--) {
	        for (int j = 0; j < i; j++) {
	            if (array[j].getPrecio() < array[j + 1].getPrecio()) {
	                value = array[j + 1];
	                array[j + 1] = array[j];
	                array[j] = value;
	            }
	        }
	    }
	    return array;
	}
	
	public static Casa[] ordenarUbicacionesCasa(Casa[] casas) {
        int n = casas.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (casas[j].getLocalidad().compareTo(casas[j + 1].getLocalidad()) > 0) {
                    Casa temp = casas[j];
                    casas[j] = casas[j + 1];
                    casas[j + 1] = temp;
                }
            }
        }
		return casas;
    }
	
	public static Departamento[] ordenarUbicacionesDepto(Departamento[] depto) {
        int n = depto.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (depto[j].getLocalidad().compareTo(depto[j + 1].getLocalidad()) > 0) {
                    Departamento temp = depto[j];
                    depto[j] = depto[j + 1];
                    depto[j + 1] = temp;
                }
            }
        }
		return depto;
    }
	
	public static Ph[] ordenarUbicacionesPh(Ph[] ph) {
        int n = ph.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (ph[j].getLocalidad().compareTo(ph[j + 1].getLocalidad()) > 0) {
                    Ph temp = ph[j];
                    ph[j] = ph[j + 1];
                    ph[j + 1] = temp;
                }
            }
        }
		return ph;
    }
	
	public static Terreno[] ordenarUbicacionesTerreno(Terreno[] terreno) {
        int n = terreno.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (terreno[j].getLocalidad().compareTo(terreno[j + 1].getLocalidad()) > 0) {
                    Terreno temp = terreno[j];
                    terreno[j] = terreno[j + 1];
                    terreno[j + 1] = temp;
                }
            }
        }
		return terreno;
    }
	
	public static Campo[] ordenarUbicacionesCampo(Campo[] campos) {
        int n = campos.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (campos[j].getLocalidad().compareTo(campos[j + 1].getLocalidad()) > 0) {
                    Campo temp = campos[j];
                    campos[j] = campos[j + 1];
                    campos[j + 1] = temp;
                }
            }
        }
		return campos;
    }
	
	public static void buscarPropiedadesPorPrecioCasa(Casa[] casas, long precioMin, long precioMax) {
        System.out.println("Propiedades encontradas dentro del rango de precios: ");
        for (Casa p : casas) {
           if (p.getPrecio() >= precioMin && p.getPrecio() <= precioMax) {
               System.out.println("#############################");
                System.out.println("Fue encontrada la casa con direccion " + p.getCalle() + " altura " + p.getAltura() 
                + " con un precio de " + p.getPrecio() + " y codigo " + p.getCodigo());
                System.out.println("#############################");
            }
        }
    }
	
	public static void buscarPropiedadesPorPrecioDepto(Departamento[] depto, long precioMin, long precioMax) {
        System.out.println("Propiedades encontradas dentro del rango de precios: ");
        for (Departamento d : depto) {
           if (d.getPrecio() >= precioMin && d.getPrecio() <= precioMax) {
               System.out.println("#############################");
               System.out.println("Fue encontrada el departamento con direccion " + d.getCalle() + " altura " + d.getAltura() 
               + " con un precio de " + d.getPrecio() + " y codigo " + d.getCodigo());
                System.out.println("#############################");
            }
        }
    }
	
	public static void buscarPropiedadesPorPrecioCampo(Campo[] campo, long precioMin, long precioMax) {
        System.out.println("Propiedades encontradas dentro del rango de precios: ");
        for (Campo campos : campo) {
           if (campos.getPrecio() >= precioMin && campos.getPrecio() <= precioMax) {
               System.out.println("#############################");
               System.out.println("Fue encontrada el campo ubicado en " + campos.getLocalidad() + " tamanio " + campos.getTamanio() 
               + " con un precio de " + campos.getPrecio() + " y codigo " + campos.getCodigo());
                System.out.println("#############################");
            }
        }
    }
	
	public static void buscarPropiedadesPorPrecioPh(Ph[] ph, long precioMin, long precioMax) {
        System.out.println("Propiedades encontradas dentro del rango de precios: ");
        for (Ph phs : ph) {
           if (phs.getPrecio() >= precioMin && phs.getPrecio() <= precioMax) {
               System.out.println("#############################");
               System.out.println("Fue encontrada la casa con direccion " + phs.getCalle() + " altura " + phs.getAltura() 
               + " con un precio de " + phs.getPrecio() + " y codigo " + phs.getCodigo());
                System.out.println("#############################");
            }
        }
    }
	
	public static void buscarPropiedadesPorPrecioTerrenos(Terreno[] terreno, long precioMin, long precioMax) {
        System.out.println("Propiedades encontradas dentro del rango de precios: ");
        for (Terreno t : terreno) {
           if (t.getPrecio() >= precioMin && t.getPrecio() <= precioMax) {
               System.out.println("#############################");
               System.out.println("El terreno ubicado en " + t.getLocalidad() + " con un tamanio de " + 
						t.getTamanio() + " tiene un precio de " + t.getPrecio() + " y su codigo " + t.getCodigo());
                System.out.println("#############################");
            }
        }
    }
	
	public static void buscarPropiedadesPorUbicacionCasa(Casa[] casas, String ubicacionBusqueda) {
        System.out.println("Propiedades encontradas en la ubicación " + ubicacionBusqueda + " : ");
        for (Casa c : casas) {
            if (c.getLocalidad().equalsIgnoreCase(ubicacionBusqueda)) {
                 System.out.println("#############################");
                 System.out.println("La propiedad casa en la calle " + c.getCalle() + " con altura " + 
     					c.getAltura() + " ubicado en " + c.getLocalidad());
                System.out.println("#############################");
            }
        }
    }
	
	public static void buscarPropiedadesPorUbicacionDepto(Departamento[] depto, String ubicacionBusqueda) {
        System.out.println("Propiedades encontradas en la ubicación " + ubicacionBusqueda + " : ");
        for (Departamento d : depto) {
            if (d.getLocalidad().equalsIgnoreCase(ubicacionBusqueda)) {
                 System.out.println("#############################");
                 System.out.println("La propiedad departamento en la calle " + d.getCalle() + " con altura " + 
     					d.getAltura() + " ubicado en " + d.getLocalidad() + " piso numero " + d.getPiso());
                System.out.println("#############################");
            }
        }
    }
	
	public static void buscarPropiedadesPorUbicacionPh(Ph[] ph, String ubicacionBusqueda) {
        System.out.println("Propiedades encontradas en la ubicación " + ubicacionBusqueda + " : ");
        for (Ph p : ph) {
            if (p.getLocalidad().equalsIgnoreCase(ubicacionBusqueda)) {
                 System.out.println("#############################");
                 System.out.println("La propiedad PH en la calle " + p.getCalle() + " con altura " + 
     					p.getAltura() + " ubicado en " + p.getLocalidad());
                System.out.println("#############################");
            }
        }
    }
	
	public static void buscarPropiedadesPorUbicacionTerreno(Terreno[] terreno, String ubicacionBusqueda) {
        System.out.println("Propiedades encontradas en la ubicación " + ubicacionBusqueda + " : ");
        for (Terreno t : terreno) {
            if (t.getLocalidad().equalsIgnoreCase(ubicacionBusqueda)) {
                 System.out.println("#############################");
                 System.out.println("La propiedad Terreno con forma de " + t.getForma() + " con tamanio " + 
     					t.getTamanio() + " ubicado en " + t.getLocalidad());
                System.out.println("#############################");
            }
        }
    }
	
	public static void buscarPropiedadesPorUbicacionCampo(Campo[] campo, String ubicacionBusqueda) {
        System.out.println("Propiedades encontradas en la ubicación " + ubicacionBusqueda + " : ");
        for (Campo campos : campo) {
            if (campos.getLocalidad().equalsIgnoreCase(ubicacionBusqueda)) {
                 System.out.println("#############################");
                 System.out.println("La propiedad Campo con tamanio de " + campos.getTamanio() + " con tipo de suelo " + 
     					campos.getTipoDeSuelo() + " ubicado en " + campos.getLocalidad());
                System.out.println("#############################");
            }
        }
    }
	
	public Boolean agregarCasa(Casa casaNueva) {
		return casa.add(casaNueva);
    }
	
	public Boolean agregarDepartamento(Departamento deptoNuevo) {
       return departamento.add(deptoNuevo);
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
	
	public boolean noAgregarDepartamentoMismaDireccion(Departamento nuevoDepartamento) {
	    for (Departamento deptoExistente : departamento) {
	        if (deptoExistente != null && deptoExistente.getCalle().equals(nuevoDepartamento.getCalle()) &&
	                deptoExistente.getAltura() == nuevoDepartamento.getAltura() &&
	                deptoExistente.getLocalidad().equals(nuevoDepartamento.getLocalidad())) {
	            System.err.println("Ya existe un departamento en la misma dirección.");
	            return true;
	        }
	    }
	    agregarDepartamento(nuevoDepartamento); // Si no hay otro departamento con la misma dirección, lo agregamos
	    return false;
	}

	public Integer calcularPrecioPromedioCasas() {
		Double promedio = 0.0;
		Double sumatoria = 0.0;
		
		for (Casa casaActual : casa) {
			if(casaActual != null) {
				sumatoria += casaActual.getPrecio();
			}
		}
		promedio = sumatoria / casa.size();
		Integer resultado = (int) Math.round(promedio);
		return resultado;
	}
	
	public Double calcularPrecioPromedioDepartamento() {
		Double promedio = 0.0;
		Double sumatoria = 0.0;
		
		for (Departamento deptoActual : departamento) {
			if(deptoActual != null) {
				sumatoria += deptoActual.getPrecio();
			}
		}
		promedio = sumatoria / departamento.size();
		return promedio;
	}

	public static ArrayList<Casa> buscarCasasPorRangoDePrecios(Double precioMin, Double precioMax) {
		ArrayList<Casa> resultado = new ArrayList<Casa>();
		for (Casa casaActual : casa) {
			if(casaActual.getPrecio() >= precioMin && casaActual.getPrecio() <= precioMax) {
				resultado.add(casaActual);
			}
		}
		return resultado;
    }
		
	public static ArrayList<Casa> buscarCasasPorRangoDePrecioNulo(ArrayList<Casa> casas, Double precioMin, Double precioMax) {
		ArrayList<Casa> casasBuscadas = new ArrayList<>();

        for (Casa casa : casas) {
            if (casa != null && casa.getPrecio() >= precioMin && casa.getPrecio() <= precioMax) {
                casasBuscadas.add(casa);
            }
        }
        
        if (casasBuscadas.isEmpty()) {
        	return casasBuscadas; 
        } else {
        	return null; // Devuelve null si se encontraron casas
        }

   }

}