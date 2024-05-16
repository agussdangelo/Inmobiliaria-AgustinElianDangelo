package ar.edu.unlam.dominio.pb2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	public static Inmobiliaria inmobiliaria = new Inmobiliaria("DangeloPropiedades", "La Matanza", 1122334455);
	public static ArrayList<Persona> clientes = new ArrayList<Persona>();
	public static ArrayList<Departamento> departamento = new ArrayList<Departamento>();
	public static ArrayList<Casa> casa = new ArrayList<Casa>();
	public static ArrayList<Ph> ph = new ArrayList<Ph>();
	public static ArrayList<Terreno> terreno = new ArrayList<Terreno>();
	public static ArrayList<Campo> campo = new ArrayList<Campo>();
	public static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		
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
						System.out.println("Fue Alquilada? ");
						Boolean fueAlquiladaDepto = teclado.nextBoolean();
						teclado.nextLine();
						System.out.println("Fue vendida? ");
						Boolean fueVendidaDepto = teclado.nextBoolean();
						teclado.nextLine();
						Departamento nuevoDepto = new Departamento(localidadDepto, calleDepto, alturaDepto, precioDepto, codigoDepto, pisoDepto, fueAlquiladaDepto, fueVendidaDepto);
						departamento.add(nuevoDepto);
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
						System.out.println("Fue Alquilada? ");
						Boolean fueAlquiladaCasa = teclado.nextBoolean();
						teclado.nextLine();
						System.out.println("Fue vendida? ");
						Boolean fueVendidaCasa = teclado.nextBoolean();
						teclado.nextLine();
						Casa nuevaCasa = new Casa(localidadCasa, calleCasa, alturaCasa, precioCasa, codigoCasa, fueAlquiladaCasa, fueVendidaCasa);
						casa.add(nuevaCasa);
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
						System.out.println("Fue Alquilada? ");
						Boolean fueAlquiladaTerreno = teclado.nextBoolean();
						teclado.nextLine();
						System.out.println("Fue vendida? ");
						Boolean fueVendidaTerreno = teclado.nextBoolean();
						teclado.nextLine();
						Terreno nuevoTerreno = new Terreno(ubicacionTerreno, tamanioTerreno, formaTerreno, condicionDeSuelo, precioTerreno, codigoTerreno, fueAlquiladaTerreno, fueVendidaTerreno);
						terreno.add(nuevoTerreno);
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
						System.out.println("Fue Alquilada? ");
						Boolean fueAlquiladaPh = teclado.nextBoolean();
						teclado.nextLine();
						System.out.println("Fue vendida? ");
						Boolean fueVendidaPh = teclado.nextBoolean();
						teclado.nextLine();
						Ph nuevoPh = new Ph(localidadPh, callePh, alturaPh, precioPh, codigoPh, fueAlquiladaPh, fueVendidaPh);
						ph.add(nuevoPh);
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
						System.out.println("Fue Alquilada? ");
						Boolean fueAlquiladaCampo = teclado.nextBoolean();
						teclado.nextLine();
						System.out.println("Fue vendida? ");
						Boolean fueVendidaCampo = teclado.nextBoolean();
						teclado.nextLine();
						Campo nuevoCampo = new Campo(ubicacionCampo, tamanioCampo, climaDeLaRegionCampo, tipoDeSueloCampo, codigoCampo, precioCampo, fueAlquiladaCampo, fueVendidaCampo);
						campo.add(nuevoCampo);
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
						Inmobiliaria.buscarPropiedadesPorCodigoDepto(departamentos, codigoBusqueda);
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
						System.out.println("Fue Alquilada? ");
						Boolean fueAlquiladaDepto = teclado.nextBoolean();
						teclado.nextLine();
						System.out.println("Fue vendida? ");
						Boolean fueVendidaDepto = teclado.nextBoolean();
						teclado.nextLine();
						Departamento nuevoDepto = new Departamento(localidadDepto, calleDepto, alturaDepto, precioDepto, pisoDepto, codigoDepto, fueAlquiladaDepto, fueVendidaDepto);
						departamento.add(nuevoDepto);
						System.err.println("Propiedad modificada con exito!");
						break;
					case 2:
						PersonaInteresada.setPropiedadInteres(TipoDePropiedad.CASAS);
						Inmobiliaria casas = new Inmobiliaria();
						Inmobiliaria.buscarPropiedadesPorCodigoCasas(casas, codigoBusqueda);
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
						System.out.println("Fue Alquilada? ");
						Boolean fueAlquiladaCasa = teclado.nextBoolean();
						teclado.nextLine();
						System.out.println("Fue vendida? ");
						Boolean fueVendidaCasa = teclado.nextBoolean();
						teclado.nextLine();
						Casa nuevaCasa = new Casa(localidadCasa, calleCasa, alturaCasa, precioCasa, codigoCasa, fueAlquiladaCasa, fueVendidaCasa);
						casa.add(nuevaCasa);
						System.err.println("Propiedad modificada con exito!");
						break;				
					case 3:
						PersonaInteresada.setPropiedadInteres(TipoDePropiedad.TERRENOS);
						Inmobiliaria terrenos = new Inmobiliaria();
						Inmobiliaria.buscarPropiedadesPorCodigoTerreno(terrenos, codigoBusqueda);
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
						System.out.println("Fue Alquilada? ");
						Boolean fueAlquiladaTerreno = teclado.nextBoolean();
						teclado.nextLine();
						System.out.println("Fue vendida? ");
						Boolean fueVendidaTerreno = teclado.nextBoolean();
						teclado.nextLine();
						Terreno nuevoTerreno = new Terreno(ubicacionTerreno, tamanioTerreno, formaTerreno, condicionDeSuelo, precioTerreno, codigoTerreno, fueAlquiladaTerreno, fueVendidaTerreno);
						terreno.add(nuevoTerreno);
						System.err.println("Propiedad modificada con exito!");
						break;
					case 4:
						PersonaInteresada.setPropiedadInteres(TipoDePropiedad.PH);
						Inmobiliaria phs = new Inmobiliaria();
						Inmobiliaria.buscarPropiedadesPorCodigoPh(phs, codigoBusqueda);
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
						System.out.println("Fue Alquilada? ");
						Boolean fueAlquiladaPh = teclado.nextBoolean();
						teclado.nextLine();
						System.out.println("Fue vendida? ");
						Boolean fueVendidaPh = teclado.nextBoolean();
						teclado.nextLine();
						Ph nuevoPh = new Ph(localidadPh, callePh, alturaPh, precioPh, codigoPh, fueAlquiladaPh, fueVendidaPh);
						ph.add(nuevoPh);
						System.err.println("Propiedad modificada con exito!");
						break;
					case 5:
						PersonaInteresada.setPropiedadInteres(TipoDePropiedad.CAMPOS);
						Inmobiliaria campos = new Inmobiliaria();
						Inmobiliaria.buscarPropiedadesPorCodigoCampos(campos, codigoBusqueda);
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
						System.out.println("Fue Alquilada? ");
						Boolean fueAlquiladaCampo = teclado.nextBoolean();
						teclado.nextLine();
						System.out.println("Fue vendida? ");
						Boolean fueVendidaCampo = teclado.nextBoolean();
						teclado.nextLine();
						Campo nuevoCampo = new Campo(ubicacionCampo, tamanioCampo, climaDeLaRegionCampo, tipoDeSueloCampo, codigoCampo, precioCampo, fueAlquiladaCampo, fueVendidaCampo);
						campo.add(nuevoCampo);
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
		                if (clientes.get(j).getDni() == dni) {
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
				if (casa.size() == 0) {
					System.err.println("No hay casas cargadas");
				} else {
					ArrayList<Casa> casasOrdenadasPrecio = Inmobiliaria.ordenarPrecioCasa(casa);
				    System.out.println("Propiedades ordenadas por precio: ");
				    System.out.println("#############################");
			        System.out.println(casasOrdenadasPrecio.toString());
			        System.out.println("#############################");
				}
				if (departamento.size() == 0) {
					System.err.println("No hay departamentos cargados");
				} else {
					ArrayList<Departamento> deptosOrdenadasPrecio = Inmobiliaria.ordenarPrecioDepartamento(departamento);
				    System.out.println("Propiedades ordenadas por precio: ");
				    System.out.println("#############################");
			        System.out.println(deptosOrdenadasPrecio.toString());
			        System.out.println("#############################");
				}
				if(campo.size() == 0) {
					System.err.println("No hay campos cargados");
				}else {
					ArrayList<Campo> camposOrdenadasPrecio = Inmobiliaria.ordenarPrecioCampo(campo);
					System.out.println("Propiedades ordenados por precio: ");
					System.out.println("#############################");
					System.out.println(camposOrdenadasPrecio.toString());
					System.out.println("#############################");
				}
				if(ph.size() == 0) {
					System.err.println("No hay PHs cargados");
				}else {
					ArrayList<Ph> phOrdenadasPrecio = Inmobiliaria.ordenarPrecioPh(ph);
					System.out.println("Propiedades ordenados por precio: ");
					System.out.println("#############################");
					System.out.println(phOrdenadasPrecio.toString());
					System.out.println("#############################");
				}
				if(terreno.size() == 0) {
					System.err.println("No hay Terrenos cargados");
				}else {
					ArrayList<Terreno> terrenoOrdenadosPrecio = Inmobiliaria.ordenarPrecioTerreno(terreno);
					System.out.println("Propiedades ordenados por precio: ");
					System.out.println("#############################");
					System.out.println(terrenoOrdenadosPrecio.toString());
					System.out.println("#############################");
				}
				break;
			case 5:
				// LISTADO DE PROPIEDADES ORDENADOS POR UBICACION
				if(casa.size() == 0) {
					System.err.println("No hay casas cargadas");
				}else {
					ArrayList<Casa> casasOrdenadasUbicacion = Inmobiliaria.ordenarUbicacionesCasa(casa);
					System.out.println("Propiedades ordenados por ubicacion: ");
					System.out.println("#############################");
					System.out.println(casasOrdenadasUbicacion.toString());
					System.out.println("#############################");
				}
				if(departamento.size() == 0) {
					System.err.println("No hay departamentos cargados");
				}else {
					ArrayList<Departamento> deptoOrdenadasUbicacion = Inmobiliaria.ordenarUbicacionesDepartamento(departamento);
					System.out.println("Propiedades ordenados por ubicacion: ");
					System.out.println("#############################");
					System.out.println(deptoOrdenadasUbicacion.toString());
					System.out.println("#############################");
				}
				
				if(campo.size() == 0) {
					System.err.println("No hay campos cargados");
				}else {
					ArrayList<Campo> campoOrdenadosUbicacion = Inmobiliaria.ordenarUbicacionesCampo(campo);
					System.out.println("Propiedades ordenados por precio: ");
					System.out.println("#############################");
					System.out.println(campoOrdenadosUbicacion.toString());
					System.out.println("#############################");
				}
				if(ph.size() == 0) {
					System.err.println("No hay PHs cargados");
				}else {
					ArrayList<Ph> phOrdenadosUbicacion = Inmobiliaria.ordenarUbicacionesPh(ph);
					System.out.println("Propiedades ordenados por precio: ");
					System.out.println("#############################");
					System.out.println(phOrdenadosUbicacion.toString());
					System.out.println("#############################");
				}
				if(terreno.size() == 0) {
					System.err.println("No hay Terrenos cargados");
				}else {
					ArrayList<Terreno> terrenoOrdenadosUbicacion = Inmobiliaria.ordenarUbicacionesTerreno(terreno);
					System.out.println("Propiedades ordenados por precio: ");
					System.out.println("#############################");
					System.out.println(terrenoOrdenadosUbicacion.toString());
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
			                    
			                    if (casa.size() != 0) {
			                        Inmobiliaria.buscarPropiedadesPorPrecioCasa(casa, precioMin, precioMax);
			                    }
			                    if (departamento.size() != 0) {
			                        Inmobiliaria.buscarPropiedadesPorPrecioDepto(departamento, precioMin, precioMax);
			                    }
			                    if (ph.size() != 0) {
			                        Inmobiliaria.buscarPropiedadesPorPrecioPh(ph, precioMin, precioMax);
			                    }
			                    if (campo.size() != 0) {
			                        Inmobiliaria.buscarPropiedadesPorPrecioCampo(campo, precioMin, precioMax);
			                    }
			                    if (terreno.size() != 0) {
			                        Inmobiliaria.buscarPropiedadesPorPrecioTerrenos(terreno, precioMin, precioMax);
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
			                    if (casa.size() != 0) {
			                        Inmobiliaria.buscarPropiedadesPorUbicacionCasa(casa, ubicacionBuscada);
			                    }
			                    if (departamento.size() != 0) {
			                        Inmobiliaria.buscarPropiedadesPorUbicacionDepto(departamento, ubicacionBuscada);
			                    }
			                    if (ph.size() != 0) {
			                        Inmobiliaria.buscarPropiedadesPorUbicacionPh(ph, ubicacionBuscada);
			                    }			                    
			                    if (campo.size() != 0) {
			                        Inmobiliaria.buscarPropiedadesPorUbicacionCampo(campo, ubicacionBuscada);
			                    } 
			                    if (terreno.size() != 0) {
			                        Inmobiliaria.buscarPropiedadesPorUbicacionTerreno(terreno, ubicacionBuscada);
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
			                    if (casa.size() != 0) {
			                        Inmobiliaria.buscarPropiedadesPorVentaCasa(casa, ubicacionBuscadaVenta);
			                    }
			                    if (departamento.size() != 0) {
			                        Inmobiliaria.buscarPropiedadesPorVentaDepto(departamento, ubicacionBuscadaVenta);
			                    }			    
			                    if (ph.size() != 0) {
			                        Inmobiliaria.buscarPropiedadesPorVentaPh(ph, ubicacionBuscadaVenta);
			                    } 
			                    if (campo.size() != 0) {
			                        Inmobiliaria.buscarPropiedadesPorVentaCampo(campo, ubicacionBuscadaVenta);
			                    }			                    
			                    if (terreno.size() != 0) {
			                        Inmobiliaria.buscarPropiedadesPorVentaTerreno(terreno, ubicacionBuscadaVenta);
			                    }
			                    ventaIngresada = true;
			                } else {
			                    System.err.println("Ya se ingreso la ubicacion previamente");
			                }
			                
			                if (!alquilerIngresada) {
			                    System.out.println("La ubicacion a buscar esta alquilada? ");
			                    Boolean  ubicacionBuscadaAlquiler = teclado.nextBoolean();
			                    if (casa.size() != 0) {
			                        Inmobiliaria.buscarPropiedadesPorAlquilerCasa(casa, ubicacionBuscadaAlquiler);
			                    }
			                    if (departamento.size() != 0) {
			                        Inmobiliaria.buscarPropiedadesPorAlquilerDepto(departamento, ubicacionBuscadaAlquiler);
			                    }			    
			                    if (ph.size() != 0) {
			                        Inmobiliaria.buscarPropiedadesPorAlquilerPh(ph, ubicacionBuscadaAlquiler);
			                    }			                    
			                    if (campo.size() != 0) {
			                        Inmobiliaria.buscarPropiedadesPorAlquilerCampo(campo, ubicacionBuscadaAlquiler);
			                    }			                    
			                    if (terreno.size() != 0) {
			                        Inmobiliaria.buscarPropiedadesPorAlquilerTerreno(terreno, ubicacionBuscadaAlquiler);
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
		                for (int i = 0; i < departamento.size(); i++) {
		                    Departamento deptoActual = departamento.get(i);
		                    if (deptoActual != null && deptoActual.getCodigo() == codigoPropiedadVentaDepto) {
		                        Persona cliente = clientes.get(i); // Obtener el cliente interesado
		                        if (cliente != null) {
		                            deptoActual.setFueVendido(true);
		                            Double operacionVentaDepto = deptoActual.getPrecio() - cliente.getDinero();
		                            System.out.println("Departamento vendido exitosamente! Ahora el " + cliente.getNombre() + " posee un saldo de: " + operacionVentaDepto);
		                            departamento.set(i, deptoActual);
		                        }
		                    }
		                }
		                break;
					case 2:
		                System.out.println("Ingrese el codigo de la propiedad a vender: ");
		                Integer codigoPropiedadVentaCasa = teclado.nextInt();
		                for (int i = 0; i < casa.size(); i++) {
		                    Casa casaActual = casa.get(i);
		                    if (casaActual != null && casaActual.getCodigo() == codigoPropiedadVentaCasa) {
		                        Persona cliente = clientes.get(i); // Obtener el cliente interesado
		                        if (cliente != null) {
		                            casaActual.setFueVendido(true);
		                            Double operacionVentaCasa = casaActual.getPrecio() - cliente.getDinero();
		                            System.out.println("Casa vendido exitosamente! Ahora el " + cliente.getNombre() + " posee un saldo de: " + operacionVentaCasa);
		                            casa.set(i, casaActual);
		                        }
		                    }
		                }
		                break;
					case 3:
						System.out.println("Ingrese el codigo de la propiedad a vender: ");
		                Integer codigoPropiedadVentaTerreno = teclado.nextInt();
		                for (int i = 0; i < terreno.size(); i++) {
		                	Terreno terrenoActual = terreno.get(i);
		                    if (terrenoActual != null && terrenoActual.getCodigo() == codigoPropiedadVentaTerreno) {
		                        Persona cliente = clientes.get(i); // Obtener el cliente interesado
		                        if (cliente != null) {
		                            terrenoActual.setFueVendido(true);
		                            Double operacionVentaTerreno = terrenoActual.getPrecio() - cliente.getDinero();
		                            System.out.println("Casa vendido exitosamente! Ahora el " + cliente.getNombre() + " posee un saldo de: " + operacionVentaTerreno);
		                            terreno.set(i, terrenoActual);
		                        }
		                    }
		                }
		                break;
					case 4:
						System.out.println("Ingrese el codigo de la propiedad a vender: ");
		                Integer codigoPropiedadVentaPh = teclado.nextInt();
		                for (int i = 0; i < ph.size(); i++) {
		                	Ph phActual = ph.get(i);
		                    if (phActual != null && phActual.getCodigo() == codigoPropiedadVentaPh) {
		                        Persona cliente = clientes.get(i); // Obtener el cliente interesado
		                        if (cliente != null) {
		                            phActual.setFueVendido(true);
		                            Double operacionVentaPh = phActual.getPrecio() - cliente.getDinero();
		                            System.out.println("Casa vendido exitosamente! Ahora el " + cliente.getNombre() + " posee un saldo de: " + operacionVentaPh);
		                            ph.set(i, phActual);
		                        }
		                    }
		                }
		                break;
					case 5:
						System.out.println("Ingrese el codigo de la propiedad a vender: ");
		                Integer codigoPropiedadVentaCampo = teclado.nextInt();
		                for (int i = 0; i < campo.size(); i++) {
		                	Campo campoActual = campo.get(i);
		                    if (campoActual != null && campoActual.getCodigo() == codigoPropiedadVentaCampo) {
		                        Persona cliente = clientes.get(i); // Obtener el cliente interesado
		                        if (cliente != null) {
		                            campoActual.setFueVendido(true);
		                            Double operacionVentaCampo = campoActual.getPrecio() - cliente.getDinero();
		                            System.out.println("Casa vendido exitosamente! Ahora el " + cliente.getNombre() + " posee un saldo de: " + operacionVentaCampo);
		                            campo.set(i, campoActual);
		                        }
		                    }
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
						System.out.println("Ingrese el código de la propiedad a alquilar: ");
		                Integer codigoPropiedadAlquilerDepto = teclado.nextInt();
		                for (int i = 0; i < departamento.size(); i++) {
		                    Departamento deptoActual = departamento.get(i);
		                    if (deptoActual != null && deptoActual.getCodigo() == codigoPropiedadAlquilerDepto) {
		                        Persona cliente = clientes.get(i); // Obtener el cliente interesado
		                        if (cliente != null) {
		                            deptoActual.setFueAlquilado(true);
		                            Double operacionAlquilerDepto = deptoActual.getPrecio() - cliente.getDinero();
		                            System.out.println("Departamento alquilado exitosamente! Ahora el " + cliente.getNombre() + " posee un saldo de: " + operacionAlquilerDepto);
		                            departamento.set(i, deptoActual);
		                        }
		                    }
		                }
		                break;
					case 2:
						System.out.println("Ingrese el código de la propiedad a alquilar: ");
		                Integer codigoPropiedadAlquilerCasa = teclado.nextInt();
		                for (int i = 0; i < casa.size(); i++) {
		                    Casa casaActual = casa.get(i);
		                    if (casaActual != null && casaActual.getCodigo() == codigoPropiedadAlquilerCasa) {
		                        Persona cliente = clientes.get(i); // Obtener el cliente interesado
		                        if (cliente != null) {
		                            casaActual.setFueAlquilado(true);
		                            Double operacionAlquilerCasa = casaActual.getPrecio() - cliente.getDinero();
		                            System.out.println("Departamento alquilado exitosamente! Ahora el " + cliente.getNombre() + " posee un saldo de: " + operacionAlquilerCasa);
		                            casa.set(i, casaActual);
		                        }
		                    }
		                }
		                break;
					case 3:
						System.out.println("Ingrese el código de la propiedad a alquilar: ");
		                Integer codigoPropiedadAlquilerTerreno = teclado.nextInt();
		                for (int i = 0; i < terreno.size(); i++) {
		                    Terreno terrenoActual = terreno.get(i);
		                    if (terrenoActual != null && terrenoActual.getCodigo() == codigoPropiedadAlquilerTerreno) {
		                        Persona cliente = clientes.get(i); // Obtener el cliente interesado
		                        if (cliente != null) {
		                            terrenoActual.setFueAlquilado(true);
		                            Double operacionAlquilerTerreno = terrenoActual.getPrecio() - cliente.getDinero();
		                            System.out.println("Departamento alquilado exitosamente! Ahora el " + cliente.getNombre() + " posee un saldo de: " + operacionAlquilerTerreno);
		                            terreno.set(i, terrenoActual);
		                        }
		                    }
		                }
		                break;
					case 4:
						System.out.println("Ingrese el código de la propiedad a alquilar: ");
		                Integer codigoPropiedadAlquilerPh = teclado.nextInt();
		                for (int i = 0; i < ph.size(); i++) {
		                    Ph phActual = ph.get(i);
		                    if (phActual != null && phActual.getCodigo() == codigoPropiedadAlquilerPh) {
		                        Persona cliente = clientes.get(i); // Obtener el cliente interesado
		                        if (cliente != null) {
		                            phActual.setFueAlquilado(true);
		                            Double operacionAlquilerPh = phActual.getPrecio() - cliente.getDinero();
		                            System.out.println("Departamento alquilado exitosamente! Ahora el " + cliente.getNombre() + " posee un saldo de: " + operacionAlquilerPh);
		                            ph.set(i, phActual);
		                        }
		                    }
		                }
		                break;
					case 5:
						System.out.println("Ingrese el código de la propiedad a alquilar: ");
		                Integer codigoPropiedadAlquilerCampo = teclado.nextInt();
		                for (int i = 0; i < campo.size(); i++) {
		                    Campo campoActual = campo.get(i);
		                    if (campoActual != null && campoActual.getCodigo() == codigoPropiedadAlquilerCampo) {
		                        Persona cliente = clientes.get(i); // Obtener el cliente interesado
		                        if (cliente != null) {
		                            campoActual.setFueAlquilado(true);
		                            Double operacionAlquilerCampo = campoActual.getPrecio() - cliente.getDinero();
		                            System.out.println("Departamento alquilado exitosamente! Ahora el " + cliente.getNombre() + " posee un saldo de: " + operacionAlquilerCampo);
		                            campo.set(i, campoActual); 
		                        }
		                    }
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
