package ar.edu.unlam.dominio.pb2;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int opcion;
		int opcionPropiedadCodigo;
		String opcionBuscar;
		Persona[] clientes = new Persona[2];
		Departamento[] departamento = new Departamento[2];
		Casa[] casa = new Casa[2];
		Ph[] ph = new Ph[2];
		Terreno[] terreno = new Terreno[2];
		Campo[] campo = new Campo[2];
		
		do {
			verMenu();
			opcion = teclado.nextInt();
			switch(opcion) {
			case 1:
				// AGREGAR NUEVAS PROPIEDADES
				int opcionPropiedad;
				Persona personaInteresadaVenta = new Persona();
				do {
					verTiposDePropiedades();
					System.out.println("Ingrese el tipo de inmueble deseado: ");
					opcionPropiedad = teclado.nextInt();
					switch(opcionPropiedad) {
					case 1:
						for (int i = 0; i < departamento.length; i++) {
							personaInteresadaVenta.setPropiedadInteres(TipoDePropiedad.DEPARTAMENTOS);
							System.out.println("Ingrese la localidad del Departamento:");
							String localidadDepto = teclado.next();
							System.out.println("Ingrese la calle del Departamento:");
							String calleDepto = teclado.next();
							System.out.println("Ingrese la altura del Departamento:");
							Integer alturaDepto = teclado.nextInt();
							System.out.println("Ingrese el precio del Departamento:");
							Double precioDepto = teclado.nextDouble();
							System.out.println("Ingrese el piso del Departamento:");
							Integer pisoDepto = teclado.nextInt();
							System.out.println("Ingrese el código del Departamento:");
							Integer codigoDepto = teclado.nextInt();
							Departamento nuevoDepto = new Departamento(localidadDepto, calleDepto, alturaDepto, precioDepto, codigoDepto, pisoDepto);
							departamento[i] = nuevoDepto;
							System.err.println("Ingrese otra propiedad...");
						}
						break;
					case 2:
						for (int i = 0; i < casa.length; i++) {
							personaInteresadaVenta.setPropiedadInteres(TipoDePropiedad.CASAS);
							System.out.println("Ingrese la localidad de la casa:");
							String localidadCasa = teclado.next();
							System.out.println("Ingrese la calle de la casa:");
							String calleCasa = teclado.next();
							System.out.println("Ingrese la altura de la casa:");
							Integer alturaCasa = teclado.nextInt();
							System.out.println("Ingrese el precio de la casa:");
							Double precioCasa = teclado.nextDouble();
							System.out.println("Ingrese el código de la casa:");
							Integer codigoCasa = teclado.nextInt();
							Casa nuevaCasa = new Casa(localidadCasa, calleCasa, alturaCasa, precioCasa, codigoCasa);
							casa[i] = nuevaCasa;
							System.err.println("Ingrese otra propiedad...");
						}
						break;
					
					case 3:
						for (int i = 0; i < terreno.length; i++) {
							personaInteresadaVenta.setPropiedadInteres(TipoDePropiedad.TERRENOS);
							System.out.println("Ingrese la ubicacion del terreno:");
							String ubicacionTerreno = teclado.next();
							System.out.println("Ingrese el tamanio del terreno:");
							Double tamanioTerreno = teclado.nextDouble();
							System.out.println("Ingrese la forma del terreno:");
							String formaTerreno = teclado.next();
							System.out.println("Ingrese la condicion de suelo del terreno:");
							String condicionDeSuelo = teclado.next();
							System.out.println("Ingrese el precio del terreno:");
							Double precioTerreno = teclado.nextDouble();
							System.out.println("Ingrese el código de la casa:");
							Integer codigoTerreno = teclado.nextInt();
							Terreno nuevoTerreno = new Terreno(ubicacionTerreno, tamanioTerreno, formaTerreno, condicionDeSuelo, precioTerreno, codigoTerreno);
							terreno[i] = nuevoTerreno;
							System.err.println("Ingrese otra propiedad...");
						}
						break;
					case 4:
						for (int i = 0; i < ph.length; i++) {
							personaInteresadaVenta.setPropiedadInteres(TipoDePropiedad.PH);
							System.out.println("Ingrese la localidad del PH:");
							String localidadPh = teclado.next();
							System.out.println("Ingrese la calle del PH:");
							String callePh = teclado.next();
							System.out.println("Ingrese la altura del PH");
							Integer alturaPh = teclado.nextInt();
							System.out.println("Ingrese el precio del PH:");
							Double precioPh = teclado.nextDouble();
							System.out.println("Ingrese el código del PH:");
							Integer codigoPh = teclado.nextInt();
							Ph nuevoPh = new Ph(localidadPh, callePh, alturaPh, precioPh, codigoPh);
							ph[i] = nuevoPh;
							System.err.println("Ingrese otra propiedad...");
						}
						break;
					case 5:
						for (int i = 0; i < campo.length; i++) {
							personaInteresadaVenta.setPropiedadInteres(TipoDePropiedad.CAMPOS);
							System.out.println("Ingrese la ubicacion del campo:");
							String ubicacionCampo = teclado.next();
							System.out.println("Ingrese el tamanio del campo:");
							Double tamanioCampo = teclado.nextDouble();
							System.out.println("Ingrese el clima de la region del campo:");
							String climaDeLaRegionCampo = teclado.next();
							System.out.println("Ingrese el tipo de suelo del campo:");
							String tipoDeSueloCampo = teclado.next();
							System.out.println("Ingrese el precio del campo");
							Double precioCampo = teclado.nextDouble();
							System.out.println("Ingrese el código del campo:");
							Integer codigoCampo = teclado.nextInt();
							Campo nuevoCampo = new Campo(ubicacionCampo, tamanioCampo, climaDeLaRegionCampo, tipoDeSueloCampo, codigoCampo, precioCampo);
							campo[i] = nuevoCampo;
							System.err.println("Ingrese otra propiedad...");
						}
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
						for (int i = 0; i < departamento.length; i++) {
							PersonaInteresada.setPropiedadInteres(TipoDePropiedad.DEPARTAMENTOS);
							Inmobiliaria departamentos = new Inmobiliaria();
							Inmobiliaria.buscarPropiedadesPorCodigoDepto(departamentos, codigoBusqueda);
							System.out.println("Ingrese la localidad del Departamento a modificar:");
							String localidadDepto = teclado.next();
							System.out.println("Ingrese la calle del Departamento a modificar:");
							String calleDepto = teclado.next();
							System.out.println("Ingrese la altura del Departamento a modificar:");
							Integer alturaDepto = teclado.nextInt();
							System.out.println("Ingrese el precio del Departamento a modificar:");
							Double precioDepto = teclado.nextDouble();
							System.out.println("Ingrese el piso del Departamento a modificar:");
							Integer pisoDepto = teclado.nextInt();
							System.out.println("Ingrese el código del Departamento a modificar:");
							Integer codigoDepto = teclado.nextInt();
							Departamento nuevoDepto = new Departamento(localidadDepto, calleDepto, alturaDepto, precioDepto, pisoDepto, codigoDepto);
							departamento[i] = nuevoDepto;
							System.err.println("Ingrese otra propiedad...");
						}
						break;
					case 2:
						for (int i = 0; i < casa.length; i++) {
							PersonaInteresada.setPropiedadInteres(TipoDePropiedad.CASAS);
							Inmobiliaria casas = new Inmobiliaria();
							Inmobiliaria.buscarPropiedadesPorCodigoCasas(casas, codigoBusqueda);
							System.out.println("Ingrese la localidad de la casa a modificar:");
							String localidadCasa = teclado.nextLine();
							System.out.println("Ingrese la calle de la casa a modificar:");
							String calleCasa = teclado.nextLine();
							System.out.println("Ingrese la altura de la casa a modificar:");
							Integer alturaCasa = teclado.nextInt();
							System.out.println("Ingrese el precio de la casa a modificar:");
							Double precioCasa = teclado.nextDouble();
							System.out.println("Ingrese el código de la casa a modificar:");
							Integer codigoCasa = teclado.nextInt();
							Casa nuevaCasa = new Casa(localidadCasa, calleCasa, alturaCasa, precioCasa, codigoCasa);
							casa[i] = nuevaCasa;
							System.err.println("Ingrese otra propiedad...");
						}
						break;
				
					case 3:
						for (int i = 0; i < terreno.length; i++) {
							PersonaInteresada.setPropiedadInteres(TipoDePropiedad.TERRENOS);
							Inmobiliaria terrenos = new Inmobiliaria();
							Inmobiliaria.buscarPropiedadesPorCodigoTerreno(terrenos, codigoBusqueda);
							System.out.println("Ingrese la ubicacion del terreno a modificar:");
							String ubicacionTerreno = teclado.nextLine();
							System.out.println("Ingrese el tamanio del terreno a modificar:");
							Double tamanioTerreno = teclado.nextDouble();
							System.out.println("Ingrese la forma del terreno a modificar:");
							String formaTerreno = teclado.next();
							System.out.println("Ingrese la condicion de suelo del terreno a modificar:");
							String condicionDeSuelo = teclado.next();
							System.out.println("Ingrese el precio del terreno a modificar:");
							Double precioTerreno = teclado.nextDouble();
							System.out.println("Ingrese el código de la casa a modificar:");
							Integer codigoTerreno = teclado.nextInt();
							Terreno nuevoTerreno = new Terreno(ubicacionTerreno, tamanioTerreno, formaTerreno, condicionDeSuelo, precioTerreno, codigoTerreno);
							terreno[i] = nuevoTerreno;
							System.err.println("Ingrese otra propiedad...");
						}

						break;
					case 4:
						for (int i = 0; i < ph.length; i++) {
							PersonaInteresada.setPropiedadInteres(TipoDePropiedad.PH);
							Inmobiliaria phs = new Inmobiliaria();
							Inmobiliaria.buscarPropiedadesPorCodigoPh(phs, codigoBusqueda);
							System.out.println("Ingrese la localidad del PH a modificar:");
							String localidadPh = teclado.nextLine();
							System.out.println("Ingrese la calle del PH a modificar:");
							String callePh = teclado.nextLine();
							System.out.println("Ingrese la altura del PH a modificar");
							Integer alturaPh = teclado.nextInt();
							System.out.println("Ingrese el precio del PH a modificar:");
							Double precioPh = teclado.nextDouble();
							System.out.println("Ingrese el código del PH a modificar:");
							Integer codigoPh = teclado.nextInt();
							Ph nuevoPh = new Ph(localidadPh, callePh, alturaPh, precioPh, codigoPh);
							ph[i] = nuevoPh;
							System.err.println("Ingrese otra propiedad...");
						}
						break;
					case 5:
						for (int i = 0; i < campo.length; i++) {
							PersonaInteresada.setPropiedadInteres(TipoDePropiedad.CAMPOS);
							Inmobiliaria campos = new Inmobiliaria();
							Inmobiliaria.buscarPropiedadesPorCodigoCampos(campos, codigoBusqueda);
							System.out.println("Ingrese la ubicacion del campo a modificar:");
							String ubicacionCampo = teclado.next();
							System.out.println("Ingrese el tamanio del campo a modificar:");
							Double tamanioCampo = teclado.nextDouble();
							System.out.println("Ingrese el clima de la region del campo a modificar:");
							String climaDeLaRegionCampo = teclado.next();
							System.out.println("Ingrese el tipo de suelo del campo a modificar:");
							String tipoDeSueloCampo = teclado.next();
							System.out.println("Ingrese el precio del campo a modificar:");
							Double precioCampo = teclado.nextDouble();
							System.out.println("Ingrese el código del campo a modificar:");
							Integer codigoCampo = teclado.nextInt();
							Campo nuevoCampo = new Campo(ubicacionCampo, tamanioCampo, climaDeLaRegionCampo, tipoDeSueloCampo, codigoCampo, precioCampo);
							campo[i] = nuevoCampo;
							System.err.println("Ingrese otra propiedad...");
						}
						break;
					case 6:
						System.out.println("Saliendo del menu tipos de propiedades...");
						break;
					}
				} while (opcionPropiedadCodigo != 6);
				break;
			case 3:
				// AGREGAR CLIENTES
				if(clientes[0] == null) {
					System.err.println("No hay clientes cargados.");
				}
				System.out.println("Creando nuevas personas...");
				for (int i = 0; i < clientes.length; i++) {
					Persona p = new Persona();
					System.out.println("Ingrese el nombre del cliente: ");
					p.setNombre(teclado.next());
					System.out.println("Ingrese el apellido del cliente: ");
					p.setApellido(teclado.next());
					boolean dniRepetido;
			        do {
			            dniRepetido = false;
			            System.out.println("Ingrese el DNI del cliente: ");
			            long dni = teclado.nextLong();
			            // Verifica si el DNI ya existe en la lista de clientes
			            for (int j = 0; j < i; j++) {
			                if (clientes[j].getDni() == dni) {
			                    dniRepetido = true;
			                    System.err.println("El DNI ingresado ya pertenece a otro cliente. Ingrese un DNI diferente.");
			                    break;
			                }
			            }
			            // Si el DNI no está repetido, se establece en el nuevo cliente
			            if (!dniRepetido) {
			                p.setDni(dni);
			            }
			        } while (dniRepetido);
					System.out.println("Ingrese el telefono de contacto: ");
					p.setTelefono(teclado.nextLong());
					System.out.println("Ingrese la cantidad de dinero del cliente: ");
					p.setDinero(teclado.nextDouble());
					clientes[i] = p;
	    			System.out.println(clientes.length - i - 1 + " Clientes restantes");
	    			
				}				
				break;
			case 4:
				// LISTADO DE PROPIEDADES ORDENADOS POR PRECIO
				if (casa[0] == null) {
					System.err.println("No hay casas cargadas");
				} else {
					Casa[] casasOrdenadasPrecio = Inmobiliaria.ordenarPrecioCasa(casa);
				    System.out.println("Propiedades ordenadas por precio: ");
				    for (Casa casas : casasOrdenadasPrecio) {
				        System.out.println("#############################");
				        System.out.println("La propiedad en la calle " + casas.getCalle() + " con altura "
				                + casas.getAltura() + " tiene un precio de " + casas.getPrecio() + " y su codigo " + casas.getCodigo());
				        System.out.println("#############################");
				    }
				}
				if (departamento[0] == null) {
					System.err.println("No hay departamentos cargados");
				} else {
					Departamento[] deptosOrdenadasPrecio = Inmobiliaria.ordenarPrecioDepartamento(departamento);
				    System.out.println("Propiedades ordenadas por precio: ");
				    for (Departamento depto : deptosOrdenadasPrecio) {
				        System.out.println("#############################");
				        System.out.println("La propiedad en la calle " + depto.getCalle() + " con altura "
				                + depto.getAltura() + " tiene un precio de " + depto.getPrecio() + " y su codigo " + depto.getCodigo());
				        System.out.println("#############################");
				     }
				}
				if(campo[0] == null) {
					System.err.println("No hay campos cargados");
				}else {
					Campo[] camposOrdenadasPrecio = Inmobiliaria.ordenarPrecioCampo(campo);
					System.out.println("Propiedades ordenados por precio: ");
					for (Campo campos : camposOrdenadasPrecio) {
						System.out.println("#############################");
						System.out.println("El campo ubicado en " + campos.getLocalidad() + " con un tamanio de "
								+ campos.getTamanio() + " tiene un precio de " + campos.getPrecio() + " y su codigo "
								+ campos.getCodigo());
						System.out.println("#############################");
					}
				}
				if(ph[0] == null) {
					System.err.println("No hay PHs cargados");
				}else {
					Ph[] phOrdenadasPrecio = Inmobiliaria.ordenarPrecioPh(ph);
					System.out.println("Propiedades ordenados por precio: ");
					for (Ph phs : phOrdenadasPrecio) {
						System.out.println("#############################");
						System.out.println("La propiedad en la calle " + phs.getCalle() + " con altura "
								+ phs.getAltura() + " ubicado en " + phs.getLocalidad() + " tiene un precio de "
								+ phs.getPrecio() + " y su codigo " + phs.getCodigo());
						System.out.println("#############################");
					}
				}
				if(terreno[0] == null) {
					System.err.println("No hay Terrenos cargados");
				}else {
					Terreno[] terrenoOrdenadosPrecio = Inmobiliaria.ordenarPrecioTerreno(terreno);
					System.out.println("Propiedades ordenados por precio: ");
					for (Terreno terrenos : terrenoOrdenadosPrecio) {
						System.out.println("#############################");
						System.out.println("El terreno ubicado en " + terrenos.getLocalidad() + " con un tamanio de " + 
								terrenos.getTamanio() + " tiene un precio de " + terrenos.getPrecio() + " y su codigo " + terrenos.getCodigo());
						System.out.println("#############################");
					}
				}
				break;
			case 5:
				// LISTADO DE PROPIEDADES ORDENADOS POR UBICACION
				if(casa[0] == null) {
					System.err.println("No hay casas cargadas");
				}else {
					Casa[] casasOrdenadasUbicacion = Inmobiliaria.ordenarUbicacionesCasa(casa);
					System.out.println("Propiedades ordenados por ubicacion: ");
					for (Casa casas : casasOrdenadasUbicacion) {
						System.out.println("#############################");
						System.out.println("La propiedad en la calle " + casas.getCalle() + " con altura " + 
						casas.getAltura() + " ubicado en " + casas.getLocalidad() + " tiene un precio de " + casas.getPrecio() 
						+ " y su codigo " + casas.getCodigo());
						System.out.println("#############################");
					}
				}
				if(departamento[0] == null) {
					System.err.println("No hay departamentos cargados");
				}else {
					Departamento[] deptoOrdenadasUbicacion = Inmobiliaria.ordenarUbicacionesDepto(departamento);
					System.out.println("Propiedades ordenados por ubicacion: ");
					for (Departamento depto : deptoOrdenadasUbicacion) {
						System.out.println("#############################");
						System.out.println("La propiedad en la calle " + depto.getCalle() + " con altura " + 
						depto.getAltura() + " ubicado en " + depto.getLocalidad() + " tiene un precio de " + depto.getPrecio() 
						+ " y su codigo " + depto.getCodigo());
						System.out.println("#############################");
					}
				}
				
				if(campo[0] == null) {
					System.err.println("No hay campos cargados");
				}else {
					Campo[] campoOrdenadosUbicacion = Inmobiliaria.ordenarUbicacionesCampo(campo);
					System.out.println("Propiedades ordenados por precio: ");
					for (Campo campos : campoOrdenadosUbicacion) {
						System.out.println("#############################");
						System.out.println("El campo ubicado en " + campos.getLocalidad() + " con un tamanio de " + 
							campos.getTamanio() + " tiene un precio de " + campos.getPrecio() + " y su codigo " + campos.getCodigo());
						System.out.println("#############################");
					}
				}
				if(ph[0] == null) {
					System.err.println("No hay PHs cargados");
				}else {
					Ph[] phOrdenadosUbicacion = Inmobiliaria.ordenarUbicacionesPh(ph);
					System.out.println("Propiedades ordenados por precio: ");
					for (Ph phs : phOrdenadosUbicacion) {
						System.out.println("#############################");
						System.out.println("La propiedad en la calle " + phs.getCalle() + " con altura " + 
								phs.getAltura() + " ubicado en " + phs.getLocalidad() + " tiene un precio de " + phs.getPrecio() + " y su codigo " + phs.getCodigo());
						System.out.println("#############################");
					}
				}
				if(terreno[0] == null) {
					System.err.println("No hay Terrenos cargados");
				}else {
					Terreno[] terrenoOrdenadosUbicacion = Inmobiliaria.ordenarUbicacionesTerreno(terreno);
					System.out.println("Propiedades ordenados por precio: ");
					for (Terreno terrenos : terrenoOrdenadosUbicacion) {
						System.out.println("#############################");
						System.out.println("El terreno ubicado en " + terrenos.getLocalidad() + " con un tamanio de " + 
								terrenos.getTamanio() + " tiene un precio de " + terrenos.getPrecio() + " y su codigo " + terrenos.getCodigo());
						System.out.println("#############################");
					}
				}
				break;
			case 6:
			    // BUSCAR PROPIEDAD POR RANGO DE PRECIOS Y POR UBICACION
				do {
			        verMenuOpcionBuscar();
			        opcionBuscar = teclado.next().toUpperCase();
			        boolean preciosIngresados = false;
			        boolean ubicacionIngresada = false;
			        switch (opcionBuscar) {
			            case "A":
			                // buscar rango por precio
			                if (!preciosIngresados) {
			                    System.out.println("Ingrese el precio minimo deseado: ");
			                    long precioMin = teclado.nextLong();
			                    System.out.println("Ingrese el precio maximo deseado: ");
			                    long precioMax = teclado.nextLong();
			                    
			                    if (casa[0] != null) {
			                        Inmobiliaria.buscarPropiedadesPorPrecioCasa(casa, precioMin, precioMax);
			                    }
			                    if (departamento[0] != null) {
			                        Inmobiliaria.buscarPropiedadesPorPrecioDepto(departamento, precioMin, precioMax);
			                    }
			                    
			                    if (ph[0] != null) {
			                        Inmobiliaria.buscarPropiedadesPorPrecioPh(ph, precioMin, precioMax);
			                    }
			                    if (campo[0] != null) {
			                        Inmobiliaria.buscarPropiedadesPorPrecioCampo(campo, precioMin, precioMax);
			                    }
			                    if (terreno[0] != null) {
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
			                    System.out.println("Ingrese la ubicacion a buscar: ");
			                    String ubicacionBuscada = teclado.next();
			                    if (casa[0] != null) {
			                        Inmobiliaria.buscarPropiedadesPorUbicacionCasa(casa, ubicacionBuscada);
			                    }else {
			                    	System.err.println("No hay casas cargadas");
			                    }
			                    if (departamento[0] != null) {
			                        Inmobiliaria.buscarPropiedadesPorUbicacionDepto(departamento, ubicacionBuscada);
			                    }else {
			                    	System.err.println("No hay departamentos cargados");
			                    }
			    
			                    if (ph[0] != null) {
			                        Inmobiliaria.buscarPropiedadesPorUbicacionPh(ph, ubicacionBuscada);
			                    }else {
			                    	System.err.println("No hay ph cargados");
			                    }
			                    
			                    if (campo[0] != null) {
			                        Inmobiliaria.buscarPropiedadesPorUbicacionCampo(campo, ubicacionBuscada);
			                    }else {
			                    	System.err.println("No hay campos cargados");
			                    }
			                    
			                    if (terreno[0] != null) {
			                        Inmobiliaria.buscarPropiedadesPorUbicacionTerreno(terreno, ubicacionBuscada);
			                    }else {
			                    	System.err.println("No hay terrenos cargados");
			                    }
			                    ubicacionIngresada = true;
			                } else {
			                    System.err.println("Ya se ingreso la ubicacion previamente");
			                }
			                break;
			            case "C":
			                System.out.println("Saliendo del menu de busqueda...");
			                break;
			        }
			    } while (!opcionBuscar.equalsIgnoreCase("C"));
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
						for (int i = 0; i < departamento.length; i++) {
							for (int j = 0; j < clientes.length; j++) {
								// venta de departamento
								if(departamento[i] != null && departamento[i].getCodigo() == codigoPropiedadVentaDepto) {
									departamento[i].setFueVendido(true);
									Double operacionVentaDepto = departamento[i].getPrecio() - clientes[j].getDinero();
									System.out.println("Casa vendido exitosamente!, Ahora el cliente posee un saldo de: " + operacionVentaDepto);
								}
							}
						}
						break;
					case 2:
						System.out.println("Ingrese el codigo de la propiedad a vender: ");
						Integer codigoPropiedadVentaCasa = teclado.nextInt();
						for (int i = 0; i < casa.length; i++) {
							for (int j = 0; j < clientes.length; j++) {
								// venta de casa
								if(casa[i] != null && casa[i].getCodigo() == codigoPropiedadVentaCasa) {
									departamento[i].setFueVendido(true);
									Double operacionVentaCasa = casa[i].getPrecio() - clientes[j].getDinero();
									System.out.println("Departamento vendido exitosamente!, Ahora el cliente posee un saldo de: " + operacionVentaCasa);
								}
							}
						}
						break;
					
					case 3:
						System.out.println("Ingrese el codigo de la propiedad a vender: ");
						Integer codigoPropiedadVentaTerreno = teclado.nextInt();
						for (int i = 0; i < terreno.length; i++) {
							for (int j = 0; j < clientes.length; j++) {
								// venta de terreno
								if(terreno[i] != null && terreno[i].getCodigo() == codigoPropiedadVentaTerreno) {
									terreno[i].setFueVendido(true);
									Double operacionVentaTerreno = terreno[i].getPrecio() - clientes[j].getDinero();
									System.out.println("Terreno vendido exitosamente!, Ahora el cliente posee un saldo de: " + operacionVentaTerreno);
								}
							}
						}
						break;
					case 4:
						System.out.println("Ingrese el codigo de la propiedad a vender: ");
						Integer codigoPropiedadVentaPh = teclado.nextInt();
						for (int i = 0; i < ph.length; i++) {
							for (int j = 0; j < clientes.length; j++) {
							// venta de ph
								if(ph[i] != null && ph[i].getCodigo() == codigoPropiedadVentaPh) {
									ph[i].setFueVendido(true);
									Double operacionVentaPh = ph[i].getPrecio() - clientes[j].getDinero();
									System.out.println("Ph vendida exitosamente!, Ahora el cliente posee un saldo de: " + operacionVentaPh);
								}
							}
						}
						break;
					case 5:
						System.out.println("Ingrese el codigo de la propiedad a vender: ");
						Integer codigoPropiedadVentaCampo = teclado.nextInt();
						for (int i = 0; i < campo.length; i++) {
							for (int j = 0; j < clientes.length; j++) {
								// venta de campo
								if(campo[i] != null && campo[i].getCodigo() == codigoPropiedadVentaCampo) {
									campo[i].setFueVendido(true);
									Double operacionVentaCampo = campo[i].getPrecio() - clientes[j].getDinero();
									System.out.println("Campo vendido exitosamente!, Ahora el cliente posee un saldo de: " + operacionVentaCampo);
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
						System.out.println("Ingrese el codigo de la propiedad a alquilar: ");
						Integer codigoPropiedadAlquilerDepto = teclado.nextInt();
						for (int i = 0; i < departamento.length; i++) {
							for (int j = 0; j < clientes.length; j++) {
								// venta de departamento
								if(departamento[i] != null && departamento[i].getCodigo() == codigoPropiedadAlquilerDepto) {
									departamento[i].setFueAlquilado(true);
									Double operacionAlquilerDepto = departamento[i].getPrecio() - clientes[j].getDinero();
									System.out.println("Departamento alquilado exitosamente!, Ahora el cliente posee un saldo de: " + operacionAlquilerDepto);
								}
							}
						}
						break;
					case 2:
						System.out.println("Ingrese el codigo de la propiedad a alquilar: ");
						Integer codigoPropiedadAlquilerCasa = teclado.nextInt();
						for (int i = 0; i < casa.length; i++) {
							for (int j = 0; j < clientes.length; j++) {
								// venta de casa
								if(casa[i] != null && casa[i].getCodigo() == codigoPropiedadAlquilerCasa) {
									departamento[i].setFueAlquilado(true);
									Double operacionAlquilerCasa = casa[i].getPrecio() - clientes[j].getDinero();
									System.out.println("Casa alquilado exitosamente!, Ahora el cliente posee un saldo de: " + operacionAlquilerCasa);
								}
							}
						}
						break;
					
					case 3:
						System.out.println("Ingrese el codigo de la propiedad a alquilar: ");
						Integer codigoPropiedadAlquilerTerreno = teclado.nextInt();
						for (int i = 0; i < terreno.length; i++) {
							for (int j = 0; j < clientes.length; j++) {
								// venta de terreno
								if(terreno[i] != null && terreno[i].getCodigo() == codigoPropiedadAlquilerTerreno) {
									terreno[i].setFueAlquilado(true);
									Double operacionAlquilerTerreno =  terreno[i].getPrecio() - clientes[j].getDinero();
									System.out.println("Terreno alquilado exitosamente!, Ahora el cliente posee un saldo de: " + operacionAlquilerTerreno);
								}
							}
						}
						break;
					case 4:
						System.out.println("Ingrese el codigo de la propiedad a alquilar: ");
						Integer codigoPropiedadAlquilerPh = teclado.nextInt();
						for (int i = 0; i < ph.length; i++) {
							for (int j = 0; j < clientes.length; j++) {
								// venta de ph
								if(ph[i] != null && ph[i].getCodigo() == codigoPropiedadAlquilerPh) {
									ph[i].setFueAlquilado(true);
									Double operacionAlquilerPh = ph[i].getPrecio() - clientes[j].getDinero();
									System.out.println("Ph alquilado exitosamente!, Ahora el cliente posee un saldo de: " + operacionAlquilerPh);
								}
							}
						}
						break;
					case 5:
						System.out.println("Ingrese el codigo de la propiedad a alquilar: ");
						Integer codigoPropiedadAlquilerCampo = teclado.nextInt();
						for (int i = 0; i < campo.length; i++) {
							for (int j = 0; j < clientes.length; j++) {
								// venta de campo
								if(campo[i] != null && campo[i].getCodigo() == codigoPropiedadAlquilerCampo) {
									campo[i].setFueAlquilado(true);
									Double operacionAlquilerCampo = campo[i].getPrecio() - clientes[j].getDinero();
									System.out.println("Campo alquilado exitosamente!, Ahora el cliente posee un saldo de: " + operacionAlquilerCampo);
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
		System.out.println("Saliendo del programa...");
	}

	public static void verMenu() {
		System.out.println("------MENU INMOBILIARIA------");
		System.out.println("1) Agregar nuevas propiedades");
		System.out.println("2) Modificar propiedades existentes");
		System.out.println("3) Agregar clientes");
		System.out.println("4) Obtener listado de propiedades ordenados por precio");
		System.out.println("5) Obtener listado de propiedades ordenados por ubicacion");
		System.out.println("6) Buscar propiedades por diferentes parametros: ");
		System.out.println("7) Realizar la venta de una propiedad");
		System.out.println("8) Realizar el alquiler de una propiedad");
		System.out.println("9) SALIR");
	}
	
	public static void verMenuOpcionBuscar() {
		System.out.println("A) Buscar por rango de precios");
		System.out.println("B) Buscar por ubicacion");
		System.out.println("C) Volver al menu principal");
	}
	
	public static void verTiposDePropiedades() {
		System.out.println("1) Elegir propiedad Departamentos");
		System.out.println("2) Elegir propiedad Casas");
		System.out.println("3) Elegir propiedad Terrenos");
		System.out.println("4) Elegir propiedad PH");
		System.out.println("5) Elegir propiedad Campos");
		System.out.println("6) Volver al menu anterior");
	}
	
		
}
