package ar.edu.unlam.dominio.pb2;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
	
	public static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		Inmobiliaria inmobiliaria = new Inmobiliaria("DangeloPropiedades", "La Matanza", 1122334455);
		TreeSet<Persona> clientes = new TreeSet<Persona>();
		TreeSet<Departamento> departamento = new TreeSet<Departamento>();
		TreeSet<Casa> casa = new TreeSet<Casa>();
		TreeSet<Ph> ph = new TreeSet<Ph>();
		TreeSet<Terreno> terreno = new TreeSet<Terreno>();
		TreeSet<Campo> campo = new TreeSet<Campo>();
		TreeSet<Propiedad> propiedad = new TreeSet<Propiedad>();
		
		int opcion;
		int opcionPropiedadCodigo;
		String opcionBuscar;
		
		do {
			verMenu();
			opcion = teclado.nextInt();
			teclado.nextLine();
			switch(opcion) {
			case 1:
				// AGREGAR NUEVAS PROPIEDADES
				int opcionPropiedad;
				Persona personaInteresadaVenta = new Persona();
				do {
					verTiposDePropiedades();
					System.out.println("Ingrese el tipo de inmueble deseado: ");
					opcionPropiedad = teclado.nextInt();
					teclado.nextLine();
					switch(opcionPropiedad) {
					case 1:
						personaInteresadaVenta.setPropiedadInteres(TipoDePropiedad.DEPARTAMENTOS);
						System.out.println("Ingrese la localidad del Departamento:");
						String localidadDepto = teclado.nextLine();
						System.out.println("Ingrese la calle del Departamento:");
						String calleDepto = teclado.nextLine();
						System.out.println("Ingrese la altura del Departamento:");
						Integer alturaDepto = teclado.nextInt();
						teclado.nextLine();
						System.out.println("Ingrese el precio del Departamento:");
						Double precioDepto = teclado.nextDouble();
						teclado.nextLine();
						System.out.println("Ingrese el piso del Departamento:");
						Integer pisoDepto = teclado.nextInt();
						teclado.nextLine();
						System.out.println("Ingrese el código del Departamento:");
						Integer codigoDepto = teclado.nextInt();
						teclado.nextLine();
						System.out.println("Esta disponible? ");
						Boolean estaDisponibleDepto = teclado.nextBoolean();
						teclado.nextLine();
						System.out.println("Que operacion desea realizar? " +
											"Venta) Introduzca V" +
											"Alquiler) Introduzca A" +
											"Permuta) Introduzca P");
						String operacionSrc = teclado.next();
						TipoOperacion operacionDeptoEnum = null;
						if(operacionSrc.equalsIgnoreCase("V")) {
							operacionDeptoEnum = TipoOperacion.VENTA;
						}else if(operacionSrc.equalsIgnoreCase("A")) {
							operacionDeptoEnum = TipoOperacion.ALQUILER;
						}else if(operacionSrc.equalsIgnoreCase("P")) {
							operacionDeptoEnum = TipoOperacion.PERMUTA;
						}
						Propiedad nuevoDepto = new Departamento(localidadDepto, calleDepto, alturaDepto, precioDepto, codigoDepto, pisoDepto, estaDisponibleDepto, operacionDeptoEnum);
						propiedad.add(nuevoDepto);
						System.err.println("Propiedad agregada con exito!");
						break;
					case 2:
						personaInteresadaVenta.setPropiedadInteres(TipoDePropiedad.CASAS);
						System.out.println("Ingrese la localidad de la casa:");
						String localidadCasa = teclado.nextLine();
						System.out.println("Ingrese la calle de la casa:");
						String calleCasa = teclado.nextLine();
						System.out.println("Ingrese la altura de la casa:");
						Integer alturaCasa = teclado.nextInt();
						teclado.nextLine();
						System.out.println("Ingrese el precio de la casa:");
						Double precioCasa = teclado.nextDouble();
						teclado.nextLine();
						System.out.println("Ingrese el código de la casa:");
						Integer codigoCasa = teclado.nextInt();
						teclado.nextLine();
						System.out.println("Esta disponible? ");
						Boolean estaDisponibleCasa = teclado.nextBoolean();
						teclado.nextLine();
						System.out.println("Que operacion desea realizar? " +
											"Venta) Introduzca V" +
											"Alquiler) Introduzca A" +
											"Permuta) Introduzca P");
						String operacionCasaString = teclado.next();
						TipoOperacion operacionCasaEnum = null;
						if (operacionCasaString.equalsIgnoreCase("V")) {
							operacionCasaEnum = TipoOperacion.VENTA;
						} else if (operacionCasaString.equalsIgnoreCase("A")) {
							operacionCasaEnum = TipoOperacion.ALQUILER;
						} else if (operacionCasaString.equalsIgnoreCase("P")) {
							operacionCasaEnum = TipoOperacion.PERMUTA;
						}
						Propiedad nuevaCasa = new Casa(localidadCasa, calleCasa, alturaCasa, precioCasa, codigoCasa, estaDisponibleCasa, operacionCasaEnum);
						propiedad.add(nuevaCasa);
						System.err.println("Propiedad agregada con exito!");
						break;
					case 3:
						personaInteresadaVenta.setPropiedadInteres(TipoDePropiedad.TERRENOS);
						System.out.println("Ingrese la ubicacion del terreno:");
						String ubicacionTerreno = teclado.nextLine();
						System.out.println("Ingrese el tamanio del terreno:");
						Double tamanioTerreno = teclado.nextDouble();
						teclado.nextLine();
						System.out.println("Ingrese la forma del terreno:");
						String formaTerreno = teclado.nextLine();
						System.out.println("Ingrese la condicion de suelo del terreno:");
						String condicionDeSuelo = teclado.nextLine();
						System.out.println("Ingrese el precio del terreno:");
						Double precioTerreno = teclado.nextDouble();
						teclado.nextLine();
						System.out.println("Ingrese el código de la casa:");
						Integer codigoTerreno = teclado.nextInt();
						teclado.nextLine();
						System.out.println("Esta disponible? ");
						Boolean estaDisponibleTerreno = teclado.nextBoolean();
						teclado.nextLine();
						System.out.println("Que operacion desea realizar? " +
								"Venta) Introduzca V" +
								"Alquiler) Introduzca A" +
								"Permuta) Introduzca P");
						String operacionTerrenoString = teclado.next();
						TipoOperacion operacionTerrenoEnum = null;
						if (operacionTerrenoString.equalsIgnoreCase("V")) {
							operacionTerrenoEnum = TipoOperacion.VENTA;
						} else if (operacionTerrenoString.equalsIgnoreCase("A")) {
							operacionTerrenoEnum = TipoOperacion.ALQUILER;
						} else if (operacionTerrenoString.equalsIgnoreCase("P")) {
							operacionTerrenoEnum = TipoOperacion.PERMUTA;
						}
						Propiedad nuevoTerreno = new Terreno(ubicacionTerreno, tamanioTerreno, formaTerreno, condicionDeSuelo, precioTerreno, codigoTerreno, estaDisponibleTerreno, operacionTerrenoEnum);
						propiedad.add(nuevoTerreno);
						System.err.println("Propiedad agregada con exito!");
						break;
					case 4:
						personaInteresadaVenta.setPropiedadInteres(TipoDePropiedad.PH);
						System.out.println("Ingrese la localidad del PH:");
						String localidadPh = teclado.nextLine();
						System.out.println("Ingrese la calle del PH:");
						String callePh = teclado.nextLine();
						System.out.println("Ingrese la altura del PH");
						Integer alturaPh = teclado.nextInt();
						teclado.nextLine();
						System.out.println("Ingrese el precio del PH:");
						Double precioPh = teclado.nextDouble();
						teclado.nextLine();
						System.out.println("Ingrese el código del PH:");
						Integer codigoPh = teclado.nextInt();
						teclado.nextLine();
						System.out.println("Esta disponible? ");
						Boolean estaDisponiblePh = teclado.nextBoolean();
						teclado.nextLine();
						System.out.println("Que operacion desea realizar? " +
								"Venta) Introduzca V" +
								"Alquiler) Introduzca A" +
								"Permuta) Introduzca P");
						String operacionPhString = teclado.next();
						TipoOperacion operacionPhEnum = null;
						if (operacionPhString.equalsIgnoreCase("V")) {
							operacionPhEnum = TipoOperacion.VENTA;
						} else if (operacionPhString.equalsIgnoreCase("A")) {
							operacionPhEnum = TipoOperacion.ALQUILER;
						} else if (operacionPhString.equalsIgnoreCase("P")) {
							operacionPhEnum = TipoOperacion.PERMUTA;
						}
						Propiedad nuevoPh = new Ph(localidadPh, callePh, alturaPh, precioPh, codigoPh, estaDisponiblePh, operacionPhEnum);
						propiedad.add(nuevoPh);
						System.err.println("Propiedad agregada con exito!");
						break;
					case 5:
						personaInteresadaVenta.setPropiedadInteres(TipoDePropiedad.CAMPOS);
						System.out.println("Ingrese la ubicacion del campo:");
						String ubicacionCampo = teclado.nextLine();
						System.out.println("Ingrese el tamanio del campo:");
						Double tamanioCampo = teclado.nextDouble();
						teclado.nextLine();
						System.out.println("Ingrese el clima de la region del campo:");
						String climaDeLaRegionCampo = teclado.nextLine();
						System.out.println("Ingrese el tipo de suelo del campo:");
						String tipoDeSueloCampo = teclado.nextLine();
						System.out.println("Ingrese el precio del campo");
						Double precioCampo = teclado.nextDouble();
						teclado.nextLine();
						System.out.println("Ingrese el código del campo:");
						Integer codigoCampo = teclado.nextInt();
						teclado.nextLine();
						System.out.println("Esta disponible? ");
						Boolean estaDisponibleCampo = teclado.nextBoolean();
						teclado.nextLine();
						System.out.println("Que operacion desea realizar? " +
								"Venta) Introduzca V" +
								"Alquiler) Introduzca A" +
								"Permuta) Introduzca P");
						String operacionCampoString = teclado.next();
						TipoOperacion operacionCampoEnum = null;
						if (operacionCampoString.equalsIgnoreCase("V")) {
							operacionCampoEnum = TipoOperacion.VENTA;
						} else if (operacionCampoString.equalsIgnoreCase("A")) {
							operacionCampoEnum = TipoOperacion.ALQUILER;
						} else if (operacionCampoString.equalsIgnoreCase("P")) {
							operacionCampoEnum = TipoOperacion.PERMUTA;
						}
						Propiedad nuevoCampo = new Campo(ubicacionCampo, tamanioCampo, climaDeLaRegionCampo, tipoDeSueloCampo, codigoCampo, precioCampo, estaDisponibleCampo, operacionCampoEnum);
						propiedad.add(nuevoCampo);
						System.err.println("Propiedad agregada con exito!");
						break;
					case 6:
						System.out.println("Saliendo del menu tipos de propiedades...");
						break;
					}
				} while (opcionPropiedad != 6);
				break;
			case 2:
				// MODIFICAR PROPIEDAD EXISTENTE
				System.out.println("Ingrese el codigo de la propiedad a modificar: ");
				int codigoBusqueda = teclado.nextInt();
				Persona PersonaInteresada = new Persona();
				do {
					verTiposDePropiedades();
					opcionPropiedadCodigo = teclado.nextInt();
					System.out.println("Ingrese el tipo de inmueble: (Casas, PH, Departamentos, Terrenos, Campos)");
					switch (opcionPropiedadCodigo) {
					case 1:
						PersonaInteresada.setPropiedadInteres(TipoDePropiedad.DEPARTAMENTOS);
						Inmobiliaria departamentos = new Inmobiliaria();
						inmobiliaria.buscarPropiedadesPorCodigo(codigoBusqueda);
						System.out.println("Ingrese la localidad del Departamento a modificar:");
						String localidadDepto = teclado.nextLine();
						System.out.println("Ingrese la calle del Departamento a modificar:");
						String calleDepto = teclado.nextLine();
						System.out.println("Ingrese la altura del Departamento a modificar:");
						Integer alturaDepto = teclado.nextInt();
						teclado.nextLine();
						System.out.println("Ingrese el precio del Departamento a modificar:");
						Double precioDepto = teclado.nextDouble();
						teclado.nextLine();
						System.out.println("Ingrese el piso del Departamento a modificar:");
						Integer pisoDepto = teclado.nextInt();
						teclado.nextLine();
						System.out.println("Ingrese el código del Departamento a modificar:");
						Integer codigoDepto = teclado.nextInt();
						teclado.nextLine();
						System.out.println("Esta disponible? ");
						Boolean estaDisponibleDepto = teclado.nextBoolean();
						teclado.nextLine();
						System.out.println("Que operacion desea realizar? " +
											"Venta) Introduzca V" +
											"Alquiler) Introduzca A" +
											"Permuta) Introduzca P");
						String operacionSrc = teclado.next();
						TipoOperacion operacionDeptoEnum = null;
						if(operacionSrc.equalsIgnoreCase("V")) {
							operacionDeptoEnum = TipoOperacion.VENTA;
						}else if(operacionSrc.equalsIgnoreCase("A")) {
							operacionDeptoEnum = TipoOperacion.ALQUILER;
						}else if(operacionSrc.equalsIgnoreCase("P")) {
							operacionDeptoEnum = TipoOperacion.PERMUTA;
						}
						Propiedad nuevoDepto = new Departamento(localidadDepto, calleDepto, alturaDepto, precioDepto, codigoDepto, pisoDepto, estaDisponibleDepto, operacionDeptoEnum);
						propiedad.add(nuevoDepto);
						System.err.println("Propiedad modificada con exito!");
						break;
					case 2:
						PersonaInteresada.setPropiedadInteres(TipoDePropiedad.CASAS);
						Inmobiliaria casas = new Inmobiliaria();
						inmobiliaria.buscarPropiedadesPorCodigo(codigoBusqueda);
						System.out.println("Ingrese la localidad de la casa a modificar:");
						String localidadCasa = teclado.nextLine();
						System.out.println("Ingrese la calle de la casa a modificar:");
						String calleCasa = teclado.nextLine();
						System.out.println("Ingrese la altura de la casa a modificar:");
						Integer alturaCasa = teclado.nextInt();
						teclado.nextLine();
						System.out.println("Ingrese el precio de la casa a modificar:");
						Double precioCasa = teclado.nextDouble();
						teclado.nextLine();
						System.out.println("Ingrese el código de la casa a modificar:");
						Integer codigoCasa = teclado.nextInt();
						teclado.nextLine();
						System.out.println("Esta disponible? ");
						Boolean estaDisponibleCasa = teclado.nextBoolean();
						teclado.nextLine();
						System.out.println("Que operacion desea realizar? " +
								"Venta) Introduzca V" +
								"Alquiler) Introduzca A" +
								"Permuta) Introduzca P");
						String operacionCasaString = teclado.next();
						TipoOperacion operacionCasaEnum = null;
						if (operacionCasaString.equalsIgnoreCase("V")) {
							operacionCasaEnum = TipoOperacion.VENTA;
						} else if (operacionCasaString.equalsIgnoreCase("A")) {
							operacionCasaEnum = TipoOperacion.ALQUILER;
						} else if (operacionCasaString.equalsIgnoreCase("P")) {
							operacionCasaEnum = TipoOperacion.PERMUTA;
						}
						Propiedad nuevaCasa = new Casa(localidadCasa, calleCasa, alturaCasa, precioCasa, codigoCasa, estaDisponibleCasa, operacionCasaEnum);
						propiedad.add(nuevaCasa);
						System.err.println("Propiedad modificada con exito!");
						break;				
					case 3:
						PersonaInteresada.setPropiedadInteres(TipoDePropiedad.TERRENOS);
						Inmobiliaria terrenos = new Inmobiliaria();
						inmobiliaria.buscarPropiedadesPorCodigo(codigoBusqueda);
						System.out.println("Ingrese la ubicacion del terreno a modificar:");
						String ubicacionTerreno = teclado.nextLine();
						System.out.println("Ingrese el tamanio del terreno a modificar:");
						Double tamanioTerreno = teclado.nextDouble();
						teclado.nextLine();
						System.out.println("Ingrese la forma del terreno a modificar:");
						String formaTerreno = teclado.nextLine();
						System.out.println("Ingrese la condicion de suelo del terreno a modificar:");
						String condicionDeSuelo = teclado.nextLine();
						System.out.println("Ingrese el precio del terreno a modificar:");
						Double precioTerreno = teclado.nextDouble();
						teclado.nextLine();
						System.out.println("Ingrese el código de la casa a modificar:");
						Integer codigoTerreno = teclado.nextInt();
						teclado.nextLine();
						System.out.println("Esta disponible? ");
						Boolean estaDisponibleTerreno = teclado.nextBoolean();
						teclado.nextLine();
						System.out.println("Que operacion desea realizar? " +
								"Venta) Introduzca V" +
								"Alquiler) Introduzca A" +
								"Permuta) Introduzca P");
						String operacionTerrenoString = teclado.next();
						TipoOperacion operacionTerrenoEnum = null;
						if (operacionTerrenoString.equalsIgnoreCase("V")) {
							operacionTerrenoEnum = TipoOperacion.VENTA;
						} else if (operacionTerrenoString.equalsIgnoreCase("A")) {
							operacionTerrenoEnum = TipoOperacion.ALQUILER;
						} else if (operacionTerrenoString.equalsIgnoreCase("P")) {
							operacionTerrenoEnum = TipoOperacion.PERMUTA;
						}
						Propiedad nuevoTerreno = new Terreno(ubicacionTerreno, tamanioTerreno, formaTerreno, condicionDeSuelo, precioTerreno, codigoTerreno, estaDisponibleTerreno, operacionTerrenoEnum);
						propiedad.add(nuevoTerreno);
						System.err.println("Propiedad modificada con exito!");
						break;
					case 4:
						PersonaInteresada.setPropiedadInteres(TipoDePropiedad.PH);
						Inmobiliaria phs = new Inmobiliaria();
						inmobiliaria.buscarPropiedadesPorCodigo(codigoBusqueda);
						System.out.println("Ingrese la localidad del PH a modificar:");
						String localidadPh = teclado.nextLine();
						System.out.println("Ingrese la calle del PH a modificar:");
						String callePh = teclado.nextLine();
						System.out.println("Ingrese la altura del PH a modificar");
						Integer alturaPh = teclado.nextInt();
						teclado.nextLine();
						System.out.println("Ingrese el precio del PH a modificar:");
						Double precioPh = teclado.nextDouble();
						teclado.nextLine();
						System.out.println("Ingrese el código del PH a modificar:");
						Integer codigoPh = teclado.nextInt();
						teclado.nextLine();
						System.out.println("Esta disponible? ");
						Boolean estaDisponiblePh = teclado.nextBoolean();
						teclado.nextLine();
						System.out.println("Que operacion desea realizar? " +
								"Venta) Introduzca V" +
								"Alquiler) Introduzca A" +
								"Permuta) Introduzca P");
						String operacionPhString = teclado.next();
						TipoOperacion operacionPhEnum = null;
						if (operacionPhString.equalsIgnoreCase("V")) {
							operacionPhEnum = TipoOperacion.VENTA;
						} else if (operacionPhString.equalsIgnoreCase("A")) {
							operacionPhEnum = TipoOperacion.ALQUILER;
						} else if (operacionPhString.equalsIgnoreCase("P")) {
							operacionPhEnum = TipoOperacion.PERMUTA;
						}
						Propiedad nuevoPh = new Ph(localidadPh, callePh, alturaPh, precioPh, codigoPh, estaDisponiblePh, operacionPhEnum);
						propiedad.add(nuevoPh);
						System.err.println("Propiedad modificada con exito!");
						break;
					case 5:
						PersonaInteresada.setPropiedadInteres(TipoDePropiedad.CAMPOS);
						Inmobiliaria campos = new Inmobiliaria();
						inmobiliaria.buscarPropiedadesPorCodigo(codigoBusqueda);
						System.out.println("Ingrese la ubicacion del campo a modificar:");
						String ubicacionCampo = teclado.nextLine();
						System.out.println("Ingrese el tamanio del campo a modificar:");
						Double tamanioCampo = teclado.nextDouble();
						teclado.nextLine();
						System.out.println("Ingrese el clima de la region del campo a modificar:");
						String climaDeLaRegionCampo = teclado.nextLine();
						System.out.println("Ingrese el tipo de suelo del campo a modificar:");
						String tipoDeSueloCampo = teclado.nextLine();
						System.out.println("Ingrese el precio del campo a modificar:");
						Double precioCampo = teclado.nextDouble();
						teclado.nextLine();
						System.out.println("Ingrese el código del campo a modificar:");
						Integer codigoCampo = teclado.nextInt();
						teclado.nextLine();
						System.out.println("Esta disponible? ");
						Boolean estaDisponibleCampo = teclado.nextBoolean();
						teclado.nextLine();
						System.out.println("Que operacion desea realizar? " +
								"Venta) Introduzca V" +
								"Alquiler) Introduzca A" +
								"Permuta) Introduzca P");
						String operacionCampoString = teclado.next();
						TipoOperacion operacionCampoEnum = null;
						if (operacionCampoString.equalsIgnoreCase("V")) {
							operacionCampoEnum = TipoOperacion.VENTA;
						} else if (operacionCampoString.equalsIgnoreCase("A")) {
							operacionCampoEnum = TipoOperacion.ALQUILER;
						} else if (operacionCampoString.equalsIgnoreCase("P")) {
							operacionCampoEnum = TipoOperacion.PERMUTA;
						}
						Propiedad nuevoCampo = new Campo(ubicacionCampo, tamanioCampo, climaDeLaRegionCampo, tipoDeSueloCampo, codigoCampo, precioCampo, estaDisponibleCampo, operacionCampoEnum);
						propiedad.add(nuevoCampo);
						System.err.println("Propiedad modificada con exito!");
						break;
					case 6:
						System.out.println("Saliendo del menu tipos de propiedades...");
						break;
					}
				} while (opcionPropiedadCodigo != 6);
				break;
			case 3:
				// AGREGAR CLIENTES
				if(clientes.size() == 0) {
					System.err.println("No hay clientes cargados.");
				}
				System.out.println("Creando nuevas personas...");
				Persona nuevoCliente = new Persona();
				System.out.println("Ingrese el nombre del cliente: ");
				nuevoCliente.setNombre(teclado.next());
				System.out.println("Ingrese el apellido del cliente: ");
				nuevoCliente.setApellido(teclado.next());
				boolean dniRepetido;
		        do {
		            dniRepetido = false;
		            System.out.println("Ingrese el DNI del cliente: ");
		            long dni = teclado.nextLong();
		            teclado.nextLine();
		            // Verifica si el DNI ya existe en la lista de clientes
		            for (int j = 0; j < clientes.size(); j++) {
		                if (clientes.first().getDni() == dni) {
		                    dniRepetido = true;
		                    System.err.println("El DNI ingresado ya pertenece a otro cliente. Ingrese un DNI diferente.");
		                    break;
		                }
		            }
		            // Si el DNI no está repetido, se establece en el nuevo cliente
		            if (!dniRepetido) {
		                nuevoCliente.setDni(dni);
		            }
		        } while (dniRepetido);
				System.out.println("Ingrese el telefono de contacto: ");
				nuevoCliente.setTelefono(teclado.nextLong());
				teclado.nextLine();
				System.out.println("Ingrese la cantidad de dinero del cliente: ");
				nuevoCliente.setDinero(teclado.nextDouble());
				teclado.nextLine();
				clientes.add(nuevoCliente);
				System.out.println("Cliente agregado con Exito!");
				break;
			case 4:
				// LISTADO DE PROPIEDADES ORDENADOS POR PRECIO
				if (propiedad.size() == 0) {
					System.err.println("No hay propiedades cargadas");
				} else {
					TreeSet<Propiedad> propiedadesOrdenadasPrecio = inmobiliaria.devolverPropiedadOrdenadoPorPrecio();
				    System.out.println("Propiedades ordenadas por precio: ");
				    System.out.println("#############################");
			        System.out.println(propiedadesOrdenadasPrecio.toString());
			        System.out.println("#############################");
				}
				break;
			case 5:
				// LISTADO DE PROPIEDADES ORDENADOS POR UBICACION
				if(propiedad.size() == 0) {
					System.err.println("No hay propiedades cargadas");
				}else {
					TreeSet<Propiedad> propiedadesOrdenadasUbicacion = inmobiliaria.devolverPropiedadOrdenadoPorUbicacion();
					System.out.println("Propiedades ordenados por ubicacion: ");
					System.out.println("#############################");
					System.out.println(propiedadesOrdenadasUbicacion.toString());
					System.out.println("#############################");
				}
				break;
			case 6:
			    // BUSCAR PROPIEDAD POR RANGO DE PRECIOS Y POR UBICACION
				do {
			        verMenuOpcionBuscar();
			        opcionBuscar = teclado.next().toUpperCase();
			        boolean preciosIngresados = false;
			        boolean ubicacionIngresada = false;
			        boolean ventaIngresada = false;
			        boolean alquilerIngresada = false;
			        switch (opcionBuscar) {
			            case "A":
			                // buscar rango por precio
			                if (!preciosIngresados) {
			                    System.out.println("Ingrese el precio minimo deseado: ");
			                    long precioMin = teclado.nextLong();
			                    teclado.nextLine();
			                    System.out.println("Ingrese el precio maximo deseado: ");
			                    long precioMax = teclado.nextLong();
			                    teclado.nextLine();
			                    
			                    if (propiedad.size() != 0) {
			                        inmobiliaria.devolverPropiedadOrdenadoPorPrecio();
			                    }
			                    preciosIngresados = true;
			                } else {
			                    System.err.println("Ya se ingresaron los precios previamente");
			                }
			                break;
			            case "B":
			                // buscar por ubicacion
			                if (!ubicacionIngresada) {
			                    System.out.println("Ingrese la localidad a buscar: ");
			                    String ubicacionBuscada = teclado.next();
			                    if (propiedad.size() != 0) {
			                        inmobiliaria.devolverPropiedadOrdenadoPorUbicacion();
			                    }
			                    ubicacionIngresada = true;
			                } else {
			                    System.err.println("Ya se ingreso la ubicacion previamente");
			                }
			                break;
			            case "C":
			            	 // buscar por venta o alquiler
			                if (!ventaIngresada) {
			                    System.out.println("La ubicacion a buscar esta vendida? ");
			                    Boolean  ubicacionBuscadaVenta = teclado.nextBoolean();
			                    if (propiedad.size() != 0) {
			                        inmobiliaria.buscarPropiedadesPorVenta();
			                    }
			                    ventaIngresada = true;
			                } else {
			                    System.err.println("Ya se ingreso la ubicacion previamente");
			                }
			                
			                if (!alquilerIngresada) {
			                    System.out.println("La ubicacion a buscar esta alquilada? ");
			                    Boolean  ubicacionBuscadaAlquiler = teclado.nextBoolean();
			                    if (propiedad.size() != 0) {
			                        inmobiliaria.buscarPropiedadesPorAlquiler();
			                    }
			                    alquilerIngresada = true;
			                } else {
			                    System.err.println("Ya se ingreso la ubicacion previamente");
			                }
			            	break;
			            case "D":
			                System.out.println("Saliendo del menu de busqueda...");
			                break;
			        }
			    } while (!opcionBuscar.equalsIgnoreCase("D"));
			    System.out.println("Volviendo al menu anterior...");
			    break;
			case 7:
				// REALIZAR LA VENTA DE UNA PROPIEDAD
				int opcionPropiedadVenta;
				do {
					verTiposDePropiedades();
					System.out.println("Ingrese el tipo de inmueble deseado: ");
					opcionPropiedadVenta = teclado.nextInt();
					switch(opcionPropiedadVenta) {
					case 1:
						System.out.println("Ingrese el codigo de la propiedad a vender: ");
				        Integer codigoPropiedadVentaDepto = teclado.nextInt();

				        Propiedad propiedadEncontrada = null;
				        for (Propiedad propiedadActual : propiedad) {
				            if (propiedadActual.getCodigo().equals(codigoPropiedadVentaDepto)) {
				                propiedadEncontrada = propiedadActual;
				                break;
				            }
				        }

				        if (propiedadEncontrada != null && !propiedadEncontrada.getEstaDisponible()) {
				            Persona cliente = null;
				            for (Persona c : clientes) {
				                if (c.getDinero() >= propiedadEncontrada.getPrecio()) { // Asumiendo que se puede comprar la propiedad si tiene suficiente dinero
				                    cliente = c;
				                    break;
				                }
				            }
				            if (cliente != null) {
				                propiedadEncontrada.setEstaDisponible(true);
				                cliente.setDinero(cliente.getDinero() - propiedadEncontrada.getPrecio()); // Reducir el dinero del cliente
				                System.out.println("Departamento vendido exitosamente! Ahora " + cliente.getNombre() + " posee un saldo de: " + cliente.getDinero());
				            } else {
				                System.out.println("No se encontró un cliente con suficiente dinero.");
				            }
				        } else {
				            System.out.println("Propiedad no encontrada o ya fue vendida.");
				        }
		                break;
					case 6:
						System.out.println("Saliendo del menu tipos de propiedades...");
						break;
					}
				} while (opcionPropiedadVenta != 6);
				break;
			case 8:
				// REALIZAR EL ALQUILER DE UNA PROPIEDAD
				int opcionPropiedadAlquiler;
				do {
					verTiposDePropiedades();
					System.out.println("Ingrese el tipo de inmueble deseado: ");
					opcionPropiedadAlquiler = teclado.nextInt();
					switch(opcionPropiedadAlquiler) {
					case 1:
						System.out.println("Ingrese el codigo de la propiedad a alquilar: ");
				        Integer codigoPropiedadAlquiler = teclado.nextInt();

				        Propiedad propiedadEncontrada = null;
				        for (Propiedad propiedadActual : propiedad) {
				            if (propiedadActual.getCodigo().equals(codigoPropiedadAlquiler)) {
				                propiedadEncontrada = propiedadActual;
				                break;
				            }
				        }

				        if (propiedadEncontrada != null && !propiedadEncontrada.getEstaDisponible()) {
				            Persona cliente = null;
				            for (Persona c : clientes) {
				                if (c.getDinero() >= propiedadEncontrada.getPrecio()) { // Asumiendo que se puede alquilar la propiedad si tiene suficiente dinero
				                    cliente = c;
				                    break;
				                }
				            }
				            if (cliente != null) {
				                propiedadEncontrada.setEstaDisponible(true);
				                cliente.setDinero(cliente.getDinero() - propiedadEncontrada.getPrecio()); // Reducir el dinero del cliente
				                System.out.println("Departamento alquilado exitosamente! Ahora " + cliente.getNombre() + " posee un saldo de: " + cliente.getDinero());
				            } else {
				                System.out.println("No se encontró un cliente con suficiente dinero.");
				            }
				        } else {
				            System.out.println("Propiedad no encontrada o ya fue alquilada.");
				        }
		                break;
					case 6:
						System.out.println("Saliendo del menu tipos de propiedades...");
						break;
					}
				} while (opcionPropiedadAlquiler != 6);
				break;
			}	
		}while(opcion != 9);
		System.err.println("Saliendo del programa...");
	}

	public static void verMenu() {
		System.out.println("------MENU INMOBILIARIA------");
		System.out.println("1) Agregar nuevas propiedades");
		System.out.println("2) Modificar propiedades existentes");
		System.out.println("3) Agregar clientes");
		System.out.println("4) Obtener listado de propiedades ORDENADOS por PRECIO");
		System.out.println("5) Obtener listado de propiedades ORDENADOS por UBICACION");
		System.out.println("6) Buscar propiedades por diferentes parametros: ");
		System.out.println("7) Realizar la VENTA de una propiedad");
		System.out.println("8) Realizar el ALQUILER de una propiedad");
		System.out.println("9) SALIR");
	}
	
	public static void verMenuOpcionBuscar() {
		System.out.println("--------MENU BUSQUEDA--------");
		System.out.println("A) Buscar por rango de precios");
		System.out.println("B) Buscar por ubicacion");
		System.out.println("C) Buscar por VENTA o ALQUILER");
		System.out.println("D) Volver al menu principal");
	}
	
	public static void verTiposDePropiedades() {
		System.out.println("---------MENU PROPIEDADES--------");
		System.out.println("1) Elegir propiedad Departamentos");
		System.out.println("2) Elegir propiedad Casas");
		System.out.println("3) Elegir propiedad Terrenos");
		System.out.println("4) Elegir propiedad PH");
		System.out.println("5) Elegir propiedad Campos");
		System.out.println("6) Volver al menu anterior");
	}
	
		
}
