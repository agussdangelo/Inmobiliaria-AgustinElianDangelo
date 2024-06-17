package ar.edu.unlam.dominio.pb2;

import static org.junit.Assert.*;

import java.util.TreeSet;

import org.junit.Test;

public class PruebaUnitariaAutomatizada {

	@Test
	public void queSePuedaDarDeAltaUnaCasaEnLaInmobiliaria() {
		// Preparacion de datos
		Inmobiliaria inmobiliaria = new Inmobiliaria("DangeloPropiedades", "La Matanza", 1122334455);
		Casa casa = new Casa("Merlo", "Mitre", 1234, 45000.0, 111, true, TipoOperacion.ALQUILER);
		String valorCalleEsperado = "Mitre";
		Integer valorAlturaEsperado = 1234;
		Double valorPrecioEsperado = 45000.0;
		String valorLocalidadEsperado = "Merlo";
		Integer valorCodigoEsperado = 111;
		// Ejecucion
		inmobiliaria.getPropiedad();
		Integer tamañoArrayEsperado = 1;
		Boolean agregoCasa = inmobiliaria.agregarPropiedad(casa);
		// Validacion
		assertEquals(valorCalleEsperado, casa.getCalle());
		assertEquals(valorAlturaEsperado, casa.getAltura());
		assertEquals(valorPrecioEsperado, casa.getPrecio(), 0.1);
		assertEquals(valorLocalidadEsperado, casa.getLocalidad());
		assertEquals(valorCodigoEsperado, casa.getCodigo(), 0.0);
		assertTrue(agregoCasa);
		assertEquals(tamañoArrayEsperado, inmobiliaria.getCantidadPropiedades());
	}
	
	@Test
	public void queSePuedanDarDeAltaDosCasasEnLaInmobiliaria() {
		// Preparacion de datos
		Inmobiliaria inmobiliaria = new Inmobiliaria("DangeloPropiedades", "La Matanza", 1122334455);
		Propiedad nuevaCasa1 = new Casa("Merlo", "Mitre", 1234, 45000.0, 111, true, TipoOperacion.ALQUILER);
		Propiedad nuevaCasa2 = new Casa("Liniers", "Costa", 4557, 95000.0, 222, true, TipoOperacion.VENTA);
		// Ejecucion
		inmobiliaria.getPropiedad();
		Boolean agregoCasa1 = inmobiliaria.agregarPropiedad(nuevaCasa1);
		Boolean agregoCasa2 = inmobiliaria.agregarPropiedad(nuevaCasa2);
		Integer tamañoArrayEsperado = 2;
		// Validacion
		assertTrue(agregoCasa1);
		assertTrue(agregoCasa2);
		assertEquals(tamañoArrayEsperado, inmobiliaria.getCantidadPropiedades());
	}
	
	@Test
	public void queNoSePuedanDarDeAltaDosCasasConUnaMismaDireccion(){   // Calle, número y localidad(
		// Preparacion de datos
		Inmobiliaria inmobiliaria = new Inmobiliaria("DangeloPropiedades", "La Matanza", 1122334455);
		Propiedad nuevaCasa1 = new Casa("Merlo", "Mitre", 1234, 45000.0, 111, true, TipoOperacion.ALQUILER);
		Propiedad nuevaCasa2 = new Casa("Merlo", "Mitre", 1234, 45000.0, 111, true, TipoOperacion.ALQUILER);
		// primera casa
		Boolean agregoCasa1 = inmobiliaria.noAgregarCasasMismaDireccion(nuevaCasa1);
		Boolean agregoCasa2 = inmobiliaria.noAgregarCasasMismaDireccion(nuevaCasa2);
		Integer tamañoArrayEsperado = 1;
		// Validacion
		assertTrue(agregoCasa1);
		assertFalse(agregoCasa2);
		assertEquals(tamañoArrayEsperado, inmobiliaria.getCantidadPropiedades());
	}
	
	@Test
	public void queSePuedaDarDeAltaUnDepartamentoEnLaInmobiliaria() {
		// Preparacion de datos
		Inmobiliaria inmobiliaria = new Inmobiliaria("DangeloPropiedades", "La Matanza", 1122334455);
		Propiedad depto1 = new Departamento("CABA", "Montiel", 9090, 49000.0, 333, 7, false, TipoOperacion.PERMUTA);
		Double valorPrecioEsperadoDepto = 49000.0;
		String valorLocalidadEsperadaDepto = "CABA";
		Integer valorCodigoEsperadoDepto = 333;
		// Ejecucion
		inmobiliaria.getPropiedad();
		Boolean agregoDepto = inmobiliaria.agregarPropiedad(depto1);
		Integer tamañoArrayEsperado = 1;
		// Validacion
		assertEquals(valorPrecioEsperadoDepto, depto1.getPrecio(), 0.1);
		assertEquals(valorLocalidadEsperadaDepto, depto1.getLocalidad());
		assertEquals(valorCodigoEsperadoDepto, depto1.getCodigo(), 0.0);
		assertTrue(agregoDepto);
		assertEquals(tamañoArrayEsperado, inmobiliaria.getCantidadPropiedades());
	}
	
	@Test
	public void queSePuedaDarDeAltaDosDepartamentoEnLaInmobiliaria() {
		// Preparacion de datos
		Inmobiliaria inmobiliaria = new Inmobiliaria("DangeloPropiedades", "La Matanza", 1122334455);
		Propiedad nuevoDepto1 = new Departamento("CABA", "Montiel", 9090, 49000.0, 333, 7, false, TipoOperacion.PERMUTA);
		Propiedad nuevoDepto2 = new Departamento("RamosMejia", "Suarez", 3355, 86500.0, 555, 9, true, TipoOperacion.VENTA);
		// Ejecucion
		inmobiliaria.getPropiedad();
		Boolean agregoDepto1 = inmobiliaria.agregarPropiedad(nuevoDepto1);
		Boolean agregoDepto2 = inmobiliaria.agregarPropiedad(nuevoDepto2);
		Integer tamañoArrayEsperado = 2;
		// Validacion
		assertEquals(tamañoArrayEsperado, inmobiliaria.getCantidadPropiedades());
		assertTrue(agregoDepto1);
		assertTrue(agregoDepto2);
	}
	
	@Test
	public void queNoSePuedanDarDeAltaDosDepartamentoConUnaMismaDireccion() {  // Calle, numero, depto, piso y localidad
		// Preparacion de datos
		Inmobiliaria inmobiliaria = new Inmobiliaria("DangeloPropiedades", "La Matanza", 1122334455);
		Propiedad nuevoDepto1 = new Departamento("CABA", "Montiel", 9090, 49000.0, 333, 7, false, TipoOperacion.PERMUTA);
		Propiedad nuevoDepto2 = new Departamento("CABA", "Montiel", 9090, 49000.0, 333, 7, false, TipoOperacion.PERMUTA);
		// Ejecucion
		inmobiliaria.getPropiedad();
		Boolean agregoDepartamento1 = inmobiliaria.agregarDepartamentoMismaDireccion((Departamento) nuevoDepto1);
		Boolean agregoDepartamento2 = inmobiliaria.agregarDepartamentoMismaDireccion((Departamento) nuevoDepto2);
		Integer tamañoArrayEsperado = 1;
		// Validacion
		assertTrue(agregoDepartamento1);
		assertFalse(agregoDepartamento2);
		assertEquals(tamañoArrayEsperado, inmobiliaria.getCantidadPropiedades());
	}

	@Test
	public void queSePuedaObtenerElValorPromedioDeLasCasas() {
		// Preparacion de datos
		Inmobiliaria inmobiliaria = new Inmobiliaria("DangeloPropiedades", "La Matanza", 1122334455);
		Propiedad casaAgregada = new Casa("Merlo", "Mitre", 1234, 45000.0, 111, true, TipoOperacion.ALQUILER);
		inmobiliaria.agregarPropiedad(casaAgregada);
		casaAgregada = new Casa("Liniers", "Costa", 4557, 95000.0, 222, true, TipoOperacion.VENTA);
		inmobiliaria.agregarPropiedad(casaAgregada);
		casaAgregada = new Casa("Palomar", "Peron", 3399, 15000.0, 333, false, TipoOperacion.PERMUTA);
		inmobiliaria.agregarPropiedad(casaAgregada);
		// Ejecucion
		inmobiliaria.getPropiedad();
		Integer promedioEsperadoCasa = 51667;
		Integer tamañoArrayEsperado = 3;
		// Validacion
		assertEquals(promedioEsperadoCasa, inmobiliaria.calcularPrecioPromedioPropiedad());
		assertEquals(tamañoArrayEsperado, inmobiliaria.getCantidadPropiedades());
	}
	
	@Test
	public void queSePuedaObtenerElValorPromedioDeLosDepartamentos() {
		// Preparacion de datos
		Inmobiliaria inmobiliaria = new Inmobiliaria("DangeloPropiedades", "La Matanza", 1122334455);
		Propiedad deptoAgregado = new Departamento("CABA", "Montiel", 9090, 49000.0, 333, 7, false, TipoOperacion.PERMUTA);
		inmobiliaria.agregarPropiedad(deptoAgregado);
		deptoAgregado = new Departamento("RamosMejia", "Suarez", 3355, 86500.0, 555, 9, true, TipoOperacion.VENTA);
		inmobiliaria.agregarPropiedad(deptoAgregado);
		deptoAgregado = new Departamento("Haedo", "SanMartin", 6890, 55300.0, 666, 10, false, TipoOperacion.ALQUILER);
		inmobiliaria.agregarPropiedad(deptoAgregado);
		// Ejecucion
		inmobiliaria.getPropiedad();
		Integer tamañoArrayEsperado = 3;
		Integer promedioEsperadoDepto = 63600;
		// Validacion
		assertEquals(promedioEsperadoDepto, inmobiliaria.calcularPrecioPromedioPropiedad());
		assertEquals(tamañoArrayEsperado, inmobiliaria.getCantidadPropiedades());
	}
	
	@Test
	public void queLaBusquedaPorRangoDePrecioDeMeArrojeUnArrayNoNuloSiAplicanResultados() {
		// Preparacion de datos
		Inmobiliaria inmobiliaria = new Inmobiliaria("DangeloPropiedades", "La Matanza", 1122334455);
		Propiedad casa1 = new Casa("Merlo", "Mitre", 1234, 45000.0, 111, true, TipoOperacion.ALQUILER);	
		Propiedad casa2 = new Casa("Liniers", "Costa", 4557, 95000.0, 222, true, TipoOperacion.VENTA);
		inmobiliaria.agregarPropiedad(casa1);
		inmobiliaria.agregarPropiedad(casa2);
		// Ejecucion
		inmobiliaria.getPropiedad();
		Integer tamañoArrayEsperado = 2;
		TreeSet<Propiedad> casasEnRango = inmobiliaria.devolverPropiedadOrdenadoPorPrecio();
		// Validacion
		assertNotNull(casasEnRango);
		assertEquals(tamañoArrayEsperado, inmobiliaria.getCantidadPropiedades());
		assertEquals(casa1, casasEnRango.first());
		assertEquals(casa2, casasEnRango.last());
	}
	
	@Test
	public void queLaBusquedaPorRangoDePrecioDeCasasMeArrojeUnArrayNuloSiNoAplicanResultados() {
		// Preparacion de datos
		Inmobiliaria inmobiliaria = new Inmobiliaria("DangeloPropiedades", "La Matanza", 1122334455);
		TreeSet<Propiedad> casas = new TreeSet<Propiedad>();
		Propiedad casa1 = new Casa("Merlo", "Mitre", 1234, 45000.0, 111, true, TipoOperacion.ALQUILER);	
		Propiedad casa2 = new Casa("Liniers", "Costa", 4557, 95000.0, 222, true, TipoOperacion.VENTA);
		Double precioMin = 90000.0;
		Double precioMax = 100000.0;
		Integer arrayEsperado = 0;
		// Ejecucion
		inmobiliaria.getPropiedad();
		casas.add(casa1);
	    casas.add(casa2);
		TreeSet<Propiedad> casasEnRango = inmobiliaria.buscarCasasPorRangoDePrecioNulo(casas, precioMin, precioMax);
		// Validacion
		assertNull(casasEnRango);
		assertEquals(arrayEsperado, inmobiliaria.getCantidadPropiedades(), 0.0);
	}
	
	@Test
	public void queLaBusquedaDePropiedadesPorVentaMeArrojeUnaLista() {
		// Preparacion de datos
		Inmobiliaria inmobiliaria = new Inmobiliaria("DangeloPropiedades", "La Matanza", 1122334455);
		Propiedad casa1 = new Casa("Merlo", "Mitre", 1234, 45000.0, 111, true, TipoOperacion.ALQUILER);	
		Propiedad casa2 = new Casa("Liniers", "Costa", 4557, 95000.0, 222, true, TipoOperacion.VENTA);
	    inmobiliaria.agregarPropiedad(casa1);
	    inmobiliaria.agregarPropiedad(casa2);
		// Ejecucion
		inmobiliaria.getPropiedad();
		Integer tamañoArrayEsperado = 2;
	    TreeSet<Propiedad> casa1Buscada = inmobiliaria.buscarPropiedadesPorVenta();
		TreeSet<Propiedad> casa2Buscada = inmobiliaria.buscarPropiedadesPorVenta();
		// Validacion
		assertNotNull(casa1Buscada);
		assertNotNull(casa2Buscada);
		assertEquals(tamañoArrayEsperado, inmobiliaria.getCantidadPropiedades());
	}
	
	@Test
	public void queLaBusquedaDePropiedadesPorVentaMeArrojeUnaListaNuloSiNoAplicanResultados() {
		// Preparacion de datos
		Inmobiliaria inmobiliaria = new Inmobiliaria("DangeloPropiedades", "La Matanza", 1122334455);
		TreeSet<Propiedad> casas = new TreeSet<Propiedad>();
		Propiedad casa1 = new Casa("Merlo", "Mitre", 1234, 45000.0, 111, true, TipoOperacion.ALQUILER);	
		Propiedad casa2 = new Casa("Liniers", "Costa", 4557, 95000.0, 222, true, TipoOperacion.VENTA);
		Integer arrayEsperado = 0;
		// Ejecucion
		inmobiliaria.getPropiedad();
		casas.add(casa1);
	    casas.add(casa2);
		TreeSet<Propiedad> casa1Buscada = inmobiliaria.buscarPropiedadPorVentaNulo(casas);
		TreeSet<Propiedad> casa2Buscada = inmobiliaria.buscarPropiedadPorVentaNulo(casas);
		// Validacion
		assertNull(casa1Buscada);
		assertNull(casa2Buscada);
		assertEquals(arrayEsperado, inmobiliaria.getCantidadPropiedades(), 0.0);
		
	}
	
	@Test
	public void queSePuedaAgregarUnClienteALaInmobiliaria() {
		// Preparacion de datos
		Inmobiliaria inmobiliaria = new Inmobiliaria("DangeloPropiedades", "La Matanza", 1122334455);
		Persona cliente = new Persona("Pepe", "Fernandez", 33446577, 1588956640, TipoDePropiedad.CASAS);
		String nombreCliente = "Pepe";
		String apellidoCliente = "Fernandez";
		Long dniCliente = (long) 33446577;
		Long telefonoCliente = (long) 1588956640;
		TipoDePropiedad propiedadCliente = TipoDePropiedad.CASAS;
		// Ejecucion
		inmobiliaria.getCliente();
		Integer tamañoArrayEsperado = 1;
		Boolean agregoCliente = inmobiliaria.agregarCliente(cliente);
		// Validacion
		assertEquals(nombreCliente, cliente.getNombre());
		assertEquals(apellidoCliente, cliente.getApellido());
		assertEquals(dniCliente, cliente.getDni());
		assertEquals(telefonoCliente, cliente.getTelefono());
		assertEquals(propiedadCliente, cliente.getPropiedadInteres());
		assertTrue(agregoCliente);
		assertEquals(tamañoArrayEsperado, inmobiliaria.getCantidadCliente());
	}
	
	@Test
	public void queNoSePuedanAgregarDosClientesConUnMismoDni() {
		// Preparacion de datos
		Inmobiliaria inmobiliaria = new Inmobiliaria("DangeloPropiedades", "La Matanza", 1122334455);
		Persona cliente = new Persona("Pepe", "Fernandez", 33446577, 1588956640, TipoDePropiedad.CASAS);
		cliente = new Persona("Raul", "Guimenez", 33446577, 1587947365, TipoDePropiedad.DEPARTAMENTOS);
		// Ejecucion
		inmobiliaria.getCliente();
		Integer tamañoArrayEsperado = 1;
		Boolean agregoCliente1 = inmobiliaria.agregarCliente(cliente);
		Boolean agregoCliente2 = inmobiliaria.agregarCliente(cliente);
		// Validacion
		assertTrue(agregoCliente1);
		assertFalse(agregoCliente2);
		assertEquals(tamañoArrayEsperado, inmobiliaria.getCantidadCliente());
	}
	
	@Test
	public void queSePuedaRealizarLaVentaDeUnaPropiedad() {
		// Preparacion de datos
        Inmobiliaria inmobiliaria = new Inmobiliaria("DangeloPropiedades", "La Matanza", 1122334455);
        Propiedad depto1 = new Departamento("CABA", "Montiel", 9090, 49000.0, 333, 7, false, TipoOperacion.VENTA);
		Propiedad depto2 = new Departamento("RamosMejia", "Suarez", 3355, 86500.0, 555, 9, true, TipoOperacion.VENTA);
        Integer cantidadEsperada2 = 2;
        Integer cantidadEsperada1 = 1;
        inmobiliaria.agregarPropiedad(depto1);
        inmobiliaria.agregarPropiedad(depto2);
        // Ejecucion
        assertEquals(cantidadEsperada2, inmobiliaria.getCantidadPropiedades());
        Boolean ventaExitosa = inmobiliaria.venderPropiedad(depto1);
        // Validacion
        assertTrue(ventaExitosa);
        assertEquals(cantidadEsperada1, inmobiliaria.getCantidadPropiedades());
        assertFalse(inmobiliaria.getPropiedad().contains(depto1));
        assertTrue(inmobiliaria.getPropiedad().contains(depto2));
	}
	
	// Aqui profe lo que hace es agregar 2 propiedades de tipo Casa, luego al realizar el alquiler hace que una de las casas
	// se elimine del array, quedando como arrayEsperado = 1.
	@Test
	public void queSePuedaRealizarElAlquilerDeUnaPropiedad() {
		// Preparacion de datos
        Inmobiliaria inmobiliaria = new Inmobiliaria("DangeloPropiedades", "La Matanza", 1122334455);
        Propiedad casa = new Casa("Merlo", "Mitre", 1234, 45000.0, 111, true, TipoOperacion.ALQUILER);
		inmobiliaria.agregarPropiedad(casa);
		casa = new Casa("Liniers", "Costa", 4557, 95000.0, 222, true, TipoOperacion.ALQUILER);
		inmobiliaria.agregarPropiedad(casa);  
        Integer arrayEsperado = 1;
        // Ejecucion
        Boolean alquilerExitoso = inmobiliaria.alquilarPropiedad(casa, inmobiliaria);
        // Validacion
        assertTrue(alquilerExitoso);
        assertTrue(casa.getEstaDisponible());
        assertEquals(arrayEsperado, inmobiliaria.getCantidadPropiedades());
     
	}
	
	@Test
	public void queSePuedaRealizarLaPermutaDeDosPropiedades() {
		// Preparación de datos
		 Inmobiliaria inmobiliaria = new Inmobiliaria("DangeloPropiedades", "La Matanza", 1122334455);
		Persona cliente1 = new Persona("Pepe", "Fernandez", 33446577, 1588956640, TipoDePropiedad.CASAS);
		Persona cliente2 = new Persona("Raul", "Guimenez", 33446577, 1587947365, TipoDePropiedad.DEPARTAMENTOS);
        Propiedad depto1 = new Departamento("CABA", "Montiel", 9090, 49000.0, 333, 7, false, TipoOperacion.PERMUTA);
		Propiedad depto2 = new Departamento("RamosMejia", "Suarez", 3355, 86500.0, 555, 9, true, TipoOperacion.PERMUTA);
        Integer arrayEsperado = 2;
        inmobiliaria.agregarPropiedad(depto1);
        inmobiliaria.agregarPropiedad(depto2);
        // Verificar que las propiedades están en las listas correctas antes de la permuta
        // Ejecucion
        Boolean permutaExitosa = inmobiliaria.permutaPropiedades(cliente1, cliente2);
        // Validacion
        assertTrue(permutaExitosa);
        assertTrue(inmobiliaria.getPropiedad().contains(depto1));
        assertTrue(inmobiliaria.getPropiedad().contains(depto2));
        assertEquals(arrayEsperado, inmobiliaria.getCantidadPropiedades());

	}
	
	@Test
	public void queSePuedaRealizarLaBusquedaDeCasasPorRangoDePreciosYElResultadoEsteOrdenadoPorPrecio() {
		// Preparación de datos
        Inmobiliaria inmobiliaria = new Inmobiliaria("DangeloPropiedades", "La Matanza", 1122334455);     
       	Propiedad casa1 = new Casa("CABA", "Montiel", 9090, 150000.0, 3, true, TipoOperacion.PERMUTA);
       	Propiedad casa2 = new Casa("RamosMejia", "Suarez", 3355, 120000.0, 4, false, TipoOperacion.ALQUILER);
       	Propiedad casa3 = new Casa("Moron", "Belgrano", 1234, 180000.0, 3, false, TipoOperacion.ALQUILER);
        inmobiliaria.agregarPropiedad(casa1);
        inmobiliaria.agregarPropiedad(casa2);
        inmobiliaria.agregarPropiedad(casa3);
        Integer arrayEsperado = 3;
        // Ejecucion
        TreeSet<Propiedad> casasEncontradas = inmobiliaria.devolverPropiedadOrdenadoPorPrecio();
        // Validacion
        assertEquals(arrayEsperado, inmobiliaria.getCantidadPropiedades());
        assertNotNull(casasEncontradas);
        assertEquals(casa3, casasEncontradas.last());
        assertEquals(casa2, casasEncontradas.first());
  
	}
	
	
	@Test
	public void queSePuedaRealizarLaBusquedaDeCasasPorUbicacionYElResultadoEsteOrdenadoPorUbicacion() {
		// Preparación de datos
        Inmobiliaria inmobiliaria = new Inmobiliaria("DangeloPropiedades", "La Matanza", 1122334455);
        Propiedad casa1 = new Casa("CABA", "Montiel", 9090, 150000.0, 3, true, TipoOperacion.PERMUTA);
       	Propiedad casa2 = new Casa("RamosMejia", "Suarez", 3355, 120000.0, 4, false, TipoOperacion.ALQUILER);
       	Propiedad casa3 = new Casa("Moron", "Belgrano", 1234, 180000.0, 3, false, TipoOperacion.ALQUILER);
	    inmobiliaria.agregarPropiedad(casa1);
	    inmobiliaria.agregarPropiedad(casa2);
	    inmobiliaria.agregarPropiedad(casa3);
        Integer arrayEsperado = 3;
        String localidadCasa1 = "CABA";
        String localidadCasa2 = "RamosMejia";
        String localidadCasa3 = "Moron";
		// Ejecucion
        TreeSet<Propiedad> casasEncontradas1 = inmobiliaria.devolverPropiedadOrdenadoPorUbicacion();
        TreeSet<Propiedad> casasEncontradas2 = inmobiliaria.devolverPropiedadOrdenadoPorUbicacion();
		// Validacion
        assertEquals(arrayEsperado, inmobiliaria.getCantidadPropiedades());
        assertNotNull(casasEncontradas1);
        assertNotNull(casasEncontradas2);
        assertEquals(localidadCasa1, casa1.getLocalidad());
        assertEquals(localidadCasa2, casa2.getLocalidad());
        assertEquals(localidadCasa3, casa3.getLocalidad());
        assertEquals(casa1, casasEncontradas1.first());
        assertEquals(casa2, casasEncontradas2.last());
	}
	
	@Test
	public void queSePuedaRealizarLaBusquedaDeDepartamentosPorRangoDePreciosYElResultadoEsteOrdenadoPorPrecio() {
		// Preparacion de datos
        Inmobiliaria inmobiliaria = new Inmobiliaria("DangeloPropiedades", "La Matanza", 1122334455);     
        Propiedad depto1 = new Departamento("RamosMejia", "Suarez", 3355, 86500.0, 222, 9, true, TipoOperacion.VENTA);
        Propiedad depto2 = new Departamento("CABA", "Montiel", 9090, 49000.0, 111, 7, false, TipoOperacion.ALQUILER);
        Propiedad depto3 = new Departamento("Castelar", "Peron", 945, 180000.0, 333, 3 ,false, TipoOperacion.ALQUILER);
        inmobiliaria.agregarPropiedad(depto1);
        inmobiliaria.agregarPropiedad(depto2);
        inmobiliaria.agregarPropiedad(depto3);
        Integer arrayEsperado = 3;
        // Ejecucion
        TreeSet<Propiedad> departamentosEncontradas = inmobiliaria.devolverPropiedadOrdenadoPorPrecio();
        // Validacion
        assertEquals(arrayEsperado, inmobiliaria.getCantidadPropiedades());
        assertNotNull(departamentosEncontradas);
        assertEquals(depto3, departamentosEncontradas.last());
        assertEquals(depto2, departamentosEncontradas.first());
   
	}
	
	@Test (expected = SinResultadosException.class)
	public void queAlBuscarPorUnCriterioQueNoArrojeResultadosSeProduzcaLaExcepcionSinResultadosException() {
		Inmobiliaria inmobiliaria = new Inmobiliaria("DangeloPropiedades", "La Matanza", 1122334455);  
		Propiedad depto1 = new Departamento("Ramos Mejia", "Suarez", 3355, 86500.0, 222, 9, true, TipoOperacion.VENTA);
        Propiedad depto2 = new Departamento("CABA", "Montiel", 9090, 49000.0, 111, 7, false, TipoOperacion.ALQUILER);
        inmobiliaria.agregarPropiedad(depto1);
        inmobiliaria.agregarPropiedad(depto2);
        String criterioDeBusqueda = "Ituzaingo";

        try {
            // Realizamos la búsqueda
            TreeSet<Propiedad> resultado = inmobiliaria.buscarPropiedadesPorCriterio(criterioDeBusqueda);
            fail("Se esperaba que se lanzara una SinResultadosException");
        } catch (SinResultadosException e) {
            // Verificamos el mensaje de la excepción
            assertEquals("No se encontraron propiedades que coincidan con el criterio: " + criterioDeBusqueda, e.getMessage());
        }

        // Adicionalmente, verificamos que la lista de propiedades sigue conteniendo las propiedades agregadas inicialmente
        assertFalse(inmobiliaria.getPropiedad().isEmpty());
	}
	
	@Test
	public void queSePuedaRealizarLaBusquedaDeDepartamentosPorUbicacionYElResultadoEsteOrdenadoPorUbicacion() {
		// Preparación de datos
        Inmobiliaria inmobiliaria = new Inmobiliaria("DangeloPropiedades", "La Matanza", 1122334455); 
        Propiedad depto1 = new Departamento("Ramos Mejia", "Suarez", 3355, 86500.0, 222, 9, true, TipoOperacion.VENTA);
    	inmobiliaria.agregarPropiedad(depto1);
        Propiedad depto2 = new Departamento("CABA", "Montiel", 9090, 49000.0, 111, 7, false, TipoOperacion.ALQUILER);
        inmobiliaria.agregarPropiedad(depto2);
       	Propiedad depto3 = new Departamento("Castelar", "Peron", 945, 180000.0, 333, 3 ,false, TipoOperacion.ALQUILER);
       	inmobiliaria.agregarPropiedad(depto3);
       	Integer arrayEsperadoDepartamento = 3;
        String localidadDepto1 = "Ramos Mejia";
        String localidadDepto2 = "CABA";
        String localidadDepto3 = "Castelar";
		// Ejecucion
        TreeSet<Propiedad> departamentosEncontradas1 = inmobiliaria.devolverPropiedadOrdenadoPorUbicacion();
        TreeSet<Propiedad> departamentosEncontradas2 = inmobiliaria.devolverPropiedadOrdenadoPorUbicacion();
		// Validacion
        assertEquals(arrayEsperadoDepartamento, inmobiliaria.getCantidadPropiedades());
        assertEquals(localidadDepto1, depto1.getLocalidad());
        assertEquals(localidadDepto2, depto2.getLocalidad());
        assertEquals(localidadDepto3, depto3.getLocalidad());
        assertNotNull(departamentosEncontradas1);
        assertNotNull(departamentosEncontradas2);
        assertEquals(depto2, departamentosEncontradas1.first());
        assertEquals(depto1, departamentosEncontradas2.last());
	}
	
	@Test
	public void queAlIntentarGuardarUnaPropiedadParaLaVentaCuyoImporteEstaPorDebajoDelUmbral10000SeArrojeLaExcepcionUmbralMinimoNoAlcanzadoException() {
		// Preparacion de datos
		
		// Ejecucion
		
		// Validacion
	
	}
	


}
