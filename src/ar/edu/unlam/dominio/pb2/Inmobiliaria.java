package ar.edu.unlam.dominio.pb2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;

public class Inmobiliaria implements Comparable<Object>{
	
	// ATRIBUTOS
	private String nombre;
	private String direccion;
	private Integer telefono;
	private ArrayList<Casa> casa;
	private ArrayList<Departamento> departamento;
	private ArrayList<Ph> ph;
	private ArrayList<Terreno> terreno;
	private ArrayList<Campo> campo;
	private HashSet<Persona> cliente;
	
	// CONTRUCTOR POR DEFAULT
	public Inmobiliaria() {
		this.casa = new ArrayList<Casa>();
		this.cliente = new HashSet<Persona>();
		this.departamento = new ArrayList<Departamento>();
		this.campo = new ArrayList<Campo>();
		this.ph = new ArrayList<Ph>();
	    this.terreno = new ArrayList<Terreno>();
	}
	
	// CONSTRUCTOR PARA CREAR LA INMOBILIARIA CON SUS PROPIEDADES
	public Inmobiliaria(String nombre, String direccion, Integer telefono) {
		this.nombre = nombre;	
		this.direccion = direccion;
		this.telefono = telefono;
		this.casa = new ArrayList<Casa>();
		this.cliente = new HashSet<Persona>();
		this.departamento = new ArrayList<Departamento>();
		this.campo = new ArrayList<Campo>();
		this.ph = new ArrayList<Ph>();
	    this.terreno = new ArrayList<Terreno>();
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

	public ArrayList<Casa> getCasa() {
		return casa;
	}

	public void setCasa(ArrayList<Casa> casa) {
		this.casa = casa;
	}

	public ArrayList<Departamento> getDepartamento() {
		return departamento;
	}

	public void setDepartamento(ArrayList<Departamento> departamento) {
		this.departamento = departamento;
	}

	public ArrayList<Ph> getPh() {
		return ph;
	}

	public void setPh(ArrayList<Ph> ph) {
		this.ph = ph;
	}

	public ArrayList<Terreno> getTerreno() {
		return terreno;
	}

	public void setTerreno(ArrayList<Terreno> terreno) {
		this.terreno = terreno;
	}

	public ArrayList<Campo> getCampo() {
		return campo;
	}

	public void setCampo(ArrayList<Campo> campo) {
		this.campo = campo;
	}

	public HashSet<Persona> getCliente() {
		return cliente;
	}

	public void setCliente(HashSet<Persona> cliente) {
		this.cliente = cliente;
	}

	public Integer getCantidadCasas() {
		return casa.size();
	}

	public Integer getCantidadDepartamentos() {
		return departamento.size();
	}

	public Integer getCantidadPh() {
		return ph.size();
	}


	public Integer getCantidadTerrenos() {
		return terreno.size();
	}


	public Integer getCantidadCampos() {
		return campo.size();
	}

	public Integer getCantidadCliente() {
		return cliente.size();
	}

	// METODOS
	
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
	
	public static ArrayList<Casa> ordenarPrecioCasa(ArrayList<Casa> casas) {
	    ArrayList<Casa> casasOrdenadas = new ArrayList<>(casas);
	    Collections.sort(casasOrdenadas, new Comparator<Casa>() {
	        @Override
	        public int compare(Casa c1, Casa c2) {
	            return Double.compare(c1.getPrecio(), c2.getPrecio());
	        }
	    });
	    return casasOrdenadas;
	}
	
	public static ArrayList<Departamento> ordenarPrecioDepartamento(ArrayList<Departamento> depto) {
		ArrayList<Departamento> deptosOrdenados = new ArrayList<>(depto);
	    Collections.sort(deptosOrdenados, new Comparator<Departamento>() {
	    	@Override
	        public int compare(Departamento d1, Departamento d2) {
	            return Double.compare(d1.getPrecio(), d2.getPrecio());
	        }
	    });
	    return deptosOrdenados;
	}
	
	public static ArrayList<Ph> ordenarPrecioPh(ArrayList<Ph> ph) {
		ArrayList<Ph> phOrdenados = new ArrayList<>(ph);
	    Collections.sort(phOrdenados, new Comparator<Ph>() {
	    	@Override
	        public int compare(Ph ph1, Ph ph2) {
	            return Double.compare(ph1.getPrecio(), ph2.getPrecio());
	        }
	    });
	    return phOrdenados;
	}
	
	public static ArrayList<Terreno> ordenarPrecioTerreno(ArrayList<Terreno> terreno) {
		ArrayList<Terreno> terrenosOrdenados = new ArrayList<>(terreno);
	    Collections.sort(terrenosOrdenados, new Comparator<Terreno>() {
	    	@Override
	        public int compare(Terreno t1, Terreno t2) {
	            return Double.compare(t1.getPrecio(), t2.getPrecio());
	        }
	    });
	    return terrenosOrdenados;
    }
	
	public static ArrayList<Campo> ordenarPrecioCampo(ArrayList<Campo> campo) {
		ArrayList<Campo> camposOrdenados = new ArrayList<>(campo);
	    Collections.sort(camposOrdenados, new Comparator<Campo>() {
	    	@Override
	        public int compare(Campo c1, Campo c2) {
	            return Double.compare(c1.getPrecio(), c2.getPrecio());
	        }
	    });
	    return camposOrdenados;
	}
	
	public static ArrayList<Casa> ordenarUbicacionesCasa(ArrayList<Casa> casas) {
	    int n = casas.size();
	    for (int i = 0; i < n - 1; i++) {
	        for (int j = 0; j < n - i - 1; j++) {
	            if (casas.get(j).getLocalidad().compareTo(casas.get(j + 1).getLocalidad()) > 0) {
	                Casa temp = casas.get(j);
	                casas.set(j, casas.get(j + 1));
	                casas.set(j + 1, temp);
	            }
	        }
	    }
	    return casas;
	}
	
	public static ArrayList<Departamento> ordenarUbicacionesDepartamento(ArrayList<Departamento> depto) {
	    int n = depto.size();
	    for (int i = 0; i < n - 1; i++) {
	        for (int j = 0; j < n - i - 1; j++) {
	            if (depto.get(j).getLocalidad().compareTo(depto.get(j + 1).getLocalidad()) > 0) {
	                Departamento temp = depto.get(j);
	                depto.set(j, depto.get(j + 1));
	                depto.set(j + 1, temp);
	            }
	        }
	    }
	    return depto;
	}
	
	public static ArrayList<Ph> ordenarUbicacionesPh(ArrayList<Ph> ph) {
	    int n = ph.size();
	    for (int i = 0; i < n - 1; i++) {
	        for (int j = 0; j < n - i - 1; j++) {
	            if (ph.get(j).getLocalidad().compareTo(ph.get(j + 1).getLocalidad()) > 0) {
	                Ph temp = ph.get(j);
	                ph.set(j, ph.get(j + 1));
	                ph.set(j + 1, temp);
	            }
	        }
	    }
	    return ph;
	}
	
	public static ArrayList<Terreno> ordenarUbicacionesTerreno(ArrayList<Terreno> terreno) {
	    int n = terreno.size();
	    for (int i = 0; i < n - 1; i++) {
	        for (int j = 0; j < n - i - 1; j++) {
	            if (terreno.get(j).getLocalidad().compareTo(terreno.get(j + 1).getLocalidad()) > 0) {
	                Terreno temp = terreno.get(j);
	                terreno.set(j, terreno.get(j + 1));
	                terreno.set(j + 1, temp);
	            }
	        }
	    }
	    return terreno;
	}
	
	public static ArrayList<Campo> ordenarUbicacionesCampo(ArrayList<Campo> campo) {
	    int n = campo.size();
	    for (int i = 0; i < n - 1; i++) {
	        for (int j = 0; j < n - i - 1; j++) {
	            if (campo.get(j).getLocalidad().compareTo(campo.get(j + 1).getLocalidad()) > 0) {
	                Campo temp = campo.get(j);
	                campo.set(j, campo.get(j + 1));
	                campo.set(j + 1, temp);
	            }
	        }
	    }
	    return campo;
	}
	
	public static void buscarPropiedadesPorPrecioCasa(ArrayList<Casa> casas, long precioMin, long precioMax) {
        System.out.println("Propiedades encontradas dentro del rango de precios: ");
        for (Casa p : casas) {
           if (p.getPrecio() >= precioMin && p.getPrecio() <= precioMax) {
               System.out.println("#############################");
               System.out.println(p.toString());
               System.out.println("#############################");
            }
        }
    }
	
	public static void buscarPropiedadesPorPrecioDepto(ArrayList<Departamento> depto, long precioMin, long precioMax) {
        System.out.println("Propiedades encontradas dentro del rango de precios: ");
        for (Departamento d : depto) {
           if (d.getPrecio() >= precioMin && d.getPrecio() <= precioMax) {
               System.out.println("#############################");
               System.out.println(d.toString());
               System.out.println("#############################");
            }
        }
    }
	
	public static void buscarPropiedadesPorPrecioCampo(ArrayList<Campo> campo, long precioMin, long precioMax) {
        System.out.println("Propiedades encontradas dentro del rango de precios: ");
        for (Campo campos : campo) {
           if (campos.getPrecio() >= precioMin && campos.getPrecio() <= precioMax) {
               System.out.println("#############################");
               System.out.println(campos.toString());
               System.out.println("#############################");
            }
        }
    }
	
	public static void buscarPropiedadesPorPrecioPh(ArrayList<Ph> ph, long precioMin, long precioMax) {
        System.out.println("Propiedades encontradas dentro del rango de precios: ");
        for (Ph phs : ph) {
           if (phs.getPrecio() >= precioMin && phs.getPrecio() <= precioMax) {
               System.out.println("#############################");
               System.out.println(phs.toString());
               System.out.println("#############################");
            }
        }
    }
	
	public static void buscarPropiedadesPorPrecioTerrenos(ArrayList<Terreno> terreno, long precioMin, long precioMax) {
        System.out.println("Propiedades encontradas dentro del rango de precios: ");
        for (Terreno t : terreno) {
           if (t.getPrecio() >= precioMin && t.getPrecio() <= precioMax) {
               System.out.println("#############################");
               System.out.println(t.toString());
               System.out.println("#############################");
            }
        }
    }
	
	public static void buscarPropiedadesPorUbicacionCasa(ArrayList<Casa> casas, String ubicacionBusqueda) {
        System.out.println("Propiedades encontradas en la ubicación " + ubicacionBusqueda + " : ");
        for (Casa c : casas) {
            if (c.getLocalidad().equalsIgnoreCase(ubicacionBusqueda)) {
                System.out.println("#############################");
                System.out.println(c.toString());
                System.out.println("#############################");
            }
        }
    }
	
	public static void buscarPropiedadesPorUbicacionDepto(ArrayList<Departamento> depto, String ubicacionBusqueda) {
        System.out.println("Propiedades encontradas en la ubicación " + ubicacionBusqueda + " : ");
        for (Departamento d : depto) {
            if (d.getLocalidad().equalsIgnoreCase(ubicacionBusqueda)) {
                System.out.println("#############################");
                System.out.println(d.toString());
                System.out.println("#############################");
            }
        }
    }
	
	public static void buscarPropiedadesPorUbicacionPh(ArrayList<Ph> ph, String ubicacionBusqueda) {
        System.out.println("Propiedades encontradas en la ubicación " + ubicacionBusqueda + " : ");
        for (Ph p : ph) {
            if (p.getLocalidad().equalsIgnoreCase(ubicacionBusqueda)) {
                System.out.println("#############################");
                System.out.println(p.toString());
                System.out.println("#############################");
            }
        }
    }
	
	public static void buscarPropiedadesPorUbicacionTerreno(ArrayList<Terreno> terreno, String ubicacionBusqueda) {
        System.out.println("Propiedades encontradas en la ubicación " + ubicacionBusqueda + " : ");
        for (Terreno t : terreno) {
            if (t.getLocalidad().equalsIgnoreCase(ubicacionBusqueda)) {
                System.out.println("#############################");
                System.out.println(t.toString());
                System.out.println("#############################");
            }
        }
    }
	
	public static void buscarPropiedadesPorUbicacionCampo(ArrayList<Campo> campo, String ubicacionBusqueda) {
        System.out.println("Propiedades encontradas en la ubicación " + ubicacionBusqueda + " : ");
        for (Campo campos : campo) {
            if (campos.getLocalidad().equalsIgnoreCase(ubicacionBusqueda)) {
                System.out.println("#############################");
                System.out.println(campos.toString());
                System.out.println("#############################");
            }
        }
    }
	
	public static void buscarPropiedadesPorAlquilerCasa(ArrayList<Casa> casas, Boolean estaEnAlquiler) {
        System.out.println("Propiedades alquiladas encontradas: ");
        for (Casa casaActual : casas) {
           if (casaActual.getFueAlquilado().equals(estaEnAlquiler)) {
                System.out.println("#############################");
                System.out.println(casaActual.toString());
                System.out.println("#############################");
            }
        }
    }
	
	public static void buscarPropiedadesPorAlquilerDepto(ArrayList<Departamento> depto, Boolean estaEnAlquiler) {
		 System.out.println("Propiedades alquiladas encontradas: ");
        for (Departamento deptoActual : depto) {
           if (deptoActual.getFueAlquilado().equals(estaEnAlquiler)) {
               System.out.println("#############################");
               System.out.println(deptoActual.toString());
               System.out.println("#############################");
            }
        }
    }
	
	public static void buscarPropiedadesPorAlquilerPh(ArrayList<Ph> ph, Boolean estaEnAlquiler) {
		 System.out.println("Propiedades alquiladas encontradas: ");
        for (Ph phs : ph) {
           if (phs.getFueAlquilado().equals(estaEnAlquiler)) {
        	   System.out.println("#############################");
        	   System.out.println(phs.toString());
               System.out.println("#############################");
            }
        }
    }
	
	public static void buscarPropiedadesPorAlquilerTerreno(ArrayList<Terreno> terreno, Boolean estaEnAlquiler) {
		 System.out.println("Propiedades alquiladas encontradas: ");
        for (Terreno terrenoActual : terreno) {
           if (terrenoActual.getFueAlquilado().equals(estaEnAlquiler)) {
        	   System.out.println("#############################");
               System.out.println(terrenoActual.toString());
               System.out.println("#############################");
            }
        }
    }
	
	public static void buscarPropiedadesPorAlquilerCampo(ArrayList<Campo> campo, Boolean estaEnAlquiler) {
		 System.out.println("Propiedades alquiladas encontradas: ");
        for (Campo campoActual : campo) {
           if (campoActual.getFueAlquilado().equals(estaEnAlquiler)) {
        	   System.out.println("#############################");
               System.out.println(campoActual.toString());
               System.out.println("#############################");
            }
        }
    }
	
	public static void buscarPropiedadesPorVentaCasa(ArrayList<Casa> casas, Boolean estaEnVenta) {
		 System.out.println("Propiedades vendidas encontradas: ");
        for (Casa casaActual : casas) {
           if (casaActual.getFueVendido().equals(estaEnVenta)) {
               System.out.println("#############################");
               System.out.println(casaActual.toString());
               System.out.println("#############################");
            }
        }
    }
	
	public static void buscarPropiedadesPorVentaDepto(ArrayList<Departamento> depto, Boolean estaEnVenta) {
		System.out.println("Propiedades vendidas encontradas: ");
        for (Departamento deptoActual : depto) {
           if (deptoActual.getFueVendido().equals(estaEnVenta)) {
                System.out.println("#############################");
                System.out.println(deptoActual.toString());
                System.out.println("#############################");
            }
        }
    }
	
	public static void buscarPropiedadesPorVentaPh(ArrayList<Ph> ph, Boolean estaEnVenta) {
		System.out.println("Propiedades vendidas encontradas: ");
        for (Ph phs : ph) {
           if (phs.getFueVendido().equals(estaEnVenta)) {
        	   System.out.println("#############################");
               System.out.println(phs.toString());
               System.out.println("#############################");
            }
        }
    }
	
	public static void buscarPropiedadesPorVentaTerreno(ArrayList<Terreno> terreno, Boolean estaEnVenta) {
		System.out.println("Propiedades vendidas encontradas: ");
        for (Terreno terrenoActual : terreno) {
           if (terrenoActual.getFueVendido().equals(estaEnVenta)) {
        	  System.out.println("#############################");
              System.out.println(terrenoActual.toString());
              System.out.println("#############################");
            }
        }
    }
	
	public static void buscarPropiedadesPorVentaCampo(ArrayList<Campo> campo, Boolean estaEnVenta) {
		System.out.println("Propiedades vendidas encontradas: ");
        for (Campo campoActual : campo) {
           if (campoActual.getFueVendido().equals(estaEnVenta)) {
        	   System.out.println("#############################");
               System.out.println(campoActual.toString());
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
	
	public Boolean agregarPh(Ph phNuevo) {
	   return ph.add(phNuevo);
	}
	
	public Boolean agregarCampo(Campo campoNuevo) {
	   return campo.add(campoNuevo);
	}
	
	public Boolean agregarTerreno(Terreno terrenoNuevo) {
	    return terreno.add(terrenoNuevo);
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
	
	public Boolean agregarDepartamentoMismaDireccion(Departamento nuevoDepartamento) {
	    for (Departamento deptoExistente : departamento) {
	        if (deptoExistente != null && deptoExistente.getCalle().equals(nuevoDepartamento.getCalle()) &&
	                deptoExistente.getAltura() == nuevoDepartamento.getAltura() &&
	                deptoExistente.getLocalidad().equals(nuevoDepartamento.getLocalidad()) &&
	                deptoExistente.getFueAlquilado().equals(nuevoDepartamento.getFueAlquilado()) &&
	                deptoExistente.getFueVendido().equals(nuevoDepartamento.getFueVendido())) {
	            System.err.println("Ya existe un departamento en la misma dirección.");
	            return false;
	        }
	    }
	    agregarDepartamento(nuevoDepartamento); // Si no hay otro departamento con la misma dirección, lo agregamos
	    return true;
	}
	
	public Boolean noAgregarCasasMismaDireccion(Casa nuevaCasa) {
	    for (Casa casaActual : casa) {
	        if (casaActual != null && casaActual.getCalle().equals(nuevaCasa.getCalle()) &&
	                casaActual.getAltura() == nuevaCasa.getAltura() &&
	                casaActual.getLocalidad().equals(nuevaCasa.getLocalidad()) &&
	                casaActual.getFueAlquilado().equals(nuevaCasa.getFueAlquilado()) &&
	                casaActual.getFueVendido().equals(nuevaCasa.getFueVendido())) {
	            System.err.println("Ya existe un departamento en la misma dirección.");
	            return false;
	        }
	    }
	    agregarCasa(nuevaCasa); // Si no hay otro departamento con la misma dirección, lo agregamos
	    return true;
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
	
	public Integer calcularPrecioPromedioDepartamento() {
		Double promedio = 0.0;
		Double sumatoria = 0.0;
		
		for (Departamento deptoActual : departamento) {
			if(deptoActual != null) {
				sumatoria += deptoActual.getPrecio();
			}
		}
		promedio = sumatoria / departamento.size();
		Integer resultado = (int) Math.round(promedio);
		return resultado;
	}

	public ArrayList<Casa> buscarCasasPorRangoDePrecios(Double precioMin, Double precioMax) {
		ArrayList<Casa> resultado = new ArrayList<Casa>();
		for (Casa casaActual : casa) {
			if(casaActual.getPrecio() >= precioMin && casaActual.getPrecio() <= precioMax) {
				resultado.add(casaActual);
			}
		}
		return resultado;
    }
		
	public ArrayList<Casa> buscarCasasPorRangoDePrecioNulo(ArrayList<Casa> casas, Double precioMin, Double precioMax) {
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
	
	public ArrayList<Casa> buscarPropiedadesPorVenta(Boolean propiedadPorVentaBuscada) {
	ArrayList<Casa> casasBuscadas = new ArrayList<>();
		
		for (Casa casaActual : casa) {
			if(casa != null && casaActual.getFueVendido().equals(propiedadPorVentaBuscada)) {
				casasBuscadas.add(casaActual);
			}
		}
		if(casasBuscadas.isEmpty()) {
			return casasBuscadas;
		}
		return casasBuscadas;
		
    }
	
	public ArrayList<Casa> buscarPropiedadPorVentaNulo(ArrayList<Casa> casas, Boolean propiedadPorVentaBuscada) {
		ArrayList<Casa> casasBuscadas = new ArrayList<>();
		
		for (Casa casaActual : casas) {
			if(casa != null && casaActual.getFueVendido().equals(propiedadPorVentaBuscada)) {
				casasBuscadas.add(casaActual);
			}
		}
		
		if(casasBuscadas.isEmpty()) {
			return casasBuscadas;
		}else {
			return null;
		}
		
	}

	@Override
	public int compareTo(Object o) {
		return 0;
	}

}