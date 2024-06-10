package ar.edu.unlam.dominio.pb2;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class PruebaUnitariaAutomatizada {

	@Test
	public void queSePuedaDarDeAltaUnaCasaEnLaInmobiliaria() {
		// Preparacion de datos
		Inmobiliaria inmobiliaria = new Inmobiliaria("DangeloPropiedades", "La Matanza", 1122334455);
		Casa casa = new Casa("Merlo", "Mitre", 1234, 45000.0, 111, true, false);
		String valorCalleEsperado = "Mitre";
		Integer valorAlturaEsperado = 1234;
		Double valorPrecioEsperado = 45000.0;
		String valorLocalidadEsperado = "Merlo";
		Integer valorCodigoEsperado = 111;
		// Ejecucion
		inmobiliaria.getCasa();
		Integer tamañoArrayEsperado = 1;
		Boolean agregoCasa = inmobiliaria.agregarCasa(casa);
		// Validacion
		assertEquals(valorCalleEsperado, casa.getCalle());
		assertEquals(valorAlturaEsperado, casa.getAltura());
		assertEquals(valorPrecioEsperado, casa.getPrecio(), 0.1);
		assertEquals(valorLocalidadEsperado, casa.getLocalidad());
		assertEquals(valorCodigoEsperado, casa.getCodigo(), 0.0);
		assertTrue(agregoCasa);
		assertEquals(tamañoArrayEsperado, inmobiliaria.getCantidadCasas());
	}
	
	@Test
	public void queSePuedanDarDeAltaDosCasasEnLaInmobiliaria() {
		// Preparacion de datos
		Inmobiliaria inmobiliaria = new Inmobiliaria("DangeloPropiedades", "La Matanza", 1122334455);
		Casa nuevaCasa = new Casa("Merlo", "Mitre", 1234, 45000.0, 111, true, false);
		nuevaCasa = new Casa("Liniers", "Costa", 4557, 95000.0, 222, true, false);
		// Ejecucion
		inmobiliaria.getCasa();
		Boolean agregoCasa1 = inmobiliaria.agregarCasa(nuevaCasa);
		Boolean agregoCasa2 = inmobiliaria.agregarCasa(nuevaCasa);
		Integer tamañoArrayEsperado = 2;
		// Validacion
		assertTrue(agregoCasa1);
		assertTrue(agregoCasa2);
		assertEquals(tamañoArrayEsperado, inmobiliaria.getCantidadCasas());
	}
	
	@Test
	public void queNoSePuedanDarDeAltaDosCasasConUnaMismaDireccion(){   // Calle, número y localidad(
		// Preparacion de datos
		Inmobiliaria inmobiliaria = new Inmobiliaria("DangeloPropiedades", "La Matanza", 1122334455);
		Casa casa = new Casa("Merlo", "Mitre", 1234, 45000.0, 111, true, false);
		casa = new Casa("Merlo", "Mitre", 1234, 45000.0, 111, true, false);
		// primera casa
		Boolean agregoCasa1 = inmobiliaria.noAgregarCasasMismaDireccion(casa);
		Boolean agregoCasa2 = inmobiliaria.noAgregarCasasMismaDireccion(casa);
		Integer tamañoArrayEsperado = 1;
		// Validacion
		assertTrue(agregoCasa1);
		assertFalse(agregoCasa2);
		assertEquals(tamañoArrayEsperado, inmobiliaria.getCantidadCasas());
	}
	
	@Test
	public void queSePuedaDarDeAltaUnDepartamentoEnLaInmobiliaria() {
		// Preparacion de datos
		Inmobiliaria inmobiliaria = new Inmobiliaria("DangeloPropiedades", "La Matanza", 1122334455);
		Departamento depto1 = new Departamento("CABA", "Montiel", 9090, 49000.0, 333, 7, false, true);
		String valorCalleEsperadoDepto = "Montiel";
		Integer valorAlturaEsperadaDepto = 9090;
		Double valorPrecioEsperadoDepto = 49000.0;
		String valorLocalidadEsperadaDepto = "CABA";
		Integer valorCodigoEsperadoDepto = 333;
		Integer valorPisoEsperadoDepto = 7;
		// Ejecucion
		inmobiliaria.getDepartamento();
		Boolean agregoDepto = inmobiliaria.agregarDepartamento(depto1);
		Integer tamañoArrayEsperado = 1;
		// Validacion
		assertEquals(valorCalleEsperadoDepto, depto1.getCalle());
		assertEquals(valorAlturaEsperadaDepto, depto1.getAltura(), 0.0);
		assertEquals(valorPrecioEsperadoDepto, depto1.getPrecio(), 0.1);
		assertEquals(valorLocalidadEsperadaDepto, depto1.getLocalidad());
		assertEquals(valorCodigoEsperadoDepto, depto1.getCodigo(), 0.0);
		assertEquals(valorPisoEsperadoDepto, depto1.getPiso(), 0.0);
		assertTrue(agregoDepto);
		assertEquals(tamañoArrayEsperado, inmobiliaria.getCantidadDepartamentos());
	}
	
	@Test
	public void queSePuedaDarDeAltaDosDepartamentoEnLaInmobiliaria() {
		// Preparacion de datos
		Inmobiliaria inmobiliaria = new Inmobiliaria("DangeloPropiedades", "La Matanza", 1122334455);
		Departamento nuevoDepto = new Departamento("CABA", "Montiel", 9090, 49000.0, 333, 7, false, true);
		nuevoDepto = new Departamento("RamosMejia", "Suarez", 3355, 86500.0, 555, 9, true, false);
		// Ejecucion
		inmobiliaria.getDepartamento();
		Boolean agregoDepto1 = inmobiliaria.agregarDepartamento(nuevoDepto);
		Boolean agregoDepto2 = inmobiliaria.agregarDepartamento(nuevoDepto);
		Integer tamañoArrayEsperado = 2;
		// Validacion
		assertEquals(tamañoArrayEsperado, inmobiliaria.getCantidadDepartamentos());
		assertTrue(agregoDepto1);
		assertTrue(agregoDepto2);
	}
	
	@Test
	public void queNoSePuedanDarDeAltaDosDepartamentoConUnaMismaDireccion() {  // Calle, numero, depto, piso y localidad
		// Preparacion de datos
		Inmobiliaria inmobiliaria = new Inmobiliaria("DangeloPropiedades", "La Matanza", 1122334455);
		Propiedad deptoAgregado = new Departamento("CABA", "Montiel", 9090, 49000.0, 333, 7, false, true);
		deptoAgregado = new Departamento("CABA", "Montiel", 9090, 49000.0, 333, 7, false, true);
		// Ejecucion
		inmobiliaria.getDepartamento();
		Boolean agregoDepartamento1 = inmobiliaria.agregarDepartamentoMismaDireccion((Departamento) deptoAgregado);
		Boolean agregoDepartamento2 = inmobiliaria.agregarDepartamentoMismaDireccion((Departamento) deptoAgregado);
		Integer tamañoArrayEsperado = 1;
		// Validacion
		assertTrue(agregoDepartamento1);
		assertFalse(agregoDepartamento2);
		assertEquals(tamañoArrayEsperado, inmobiliaria.getCantidadDepartamentos());
	}

	@Test
	public void queSePuedaObtenerElValorPromedioDeLasCasas() {
		// Preparacion de datos
		Inmobiliaria inmobiliaria = new Inmobiliaria("DangeloPropiedades", "La Matanza", 1122334455);
		Casa casaAgregada = new Casa("Merlo", "Mitre", 1234, 45000.0, 111, false, true);
		inmobiliaria.agregarCasa(casaAgregada);
		casaAgregada = new Casa("Liniers", "Costa", 4557, 95000.0, 222, true, false);
		inmobiliaria.agregarCasa(casaAgregada);
		casaAgregada = new Casa("Palomar", "Peron", 3399, 15000.0, 333, false, true);
		inmobiliaria.agregarCasa(casaAgregada);
		// Ejecucion
		inmobiliaria.getCasa();
		Integer promedioEsperadoCasa = 51667;
		Integer tamañoArrayEsperado = 3;
		// Validacion
		assertEquals(promedioEsperadoCasa, inmobiliaria.calcularPrecioPromedioCasas());
		assertEquals(tamañoArrayEsperado, inmobiliaria.getCantidadCasas());
	}
	
	@Test
	public void queSePuedaObtenerElValorPromedioDeLosDepartamentos() {
		// Preparacion de datos
		Inmobiliaria inmobiliaria = new Inmobiliaria("DangeloPropiedades", "La Matanza", 1122334455);
		Departamento deptoAgregado = new Departamento("CABA", "Montiel", 9090, 49000.0, 333, 7, false, true);
		inmobiliaria.agregarDepartamento(deptoAgregado);
		deptoAgregado = new Departamento("RamosMejia", "Suarez", 3355, 86500.0, 555, 9, true, false);
		inmobiliaria.agregarDepartamento(deptoAgregado);
		deptoAgregado = new Departamento("Haedo", "SanMartin", 6890, 55300.0, 666, 10, false, true);
		inmobiliaria.agregarDepartamento(deptoAgregado);
		// Ejecucion
		inmobiliaria.getDepartamento();
		Integer tamañoArrayEsperado = 3;
		Integer promedioEsperadoDepto = 63600;
		// Validacion
		assertEquals(promedioEsperadoDepto, inmobiliaria.calcularPrecioPromedioDepartamento());
		assertEquals(tamañoArrayEsperado, inmobiliaria.getCantidadDepartamentos());
	}
	
	@Test
	public void queLaBusquedaPorRangoDePrecioDeMeArrojeUnArrayNoNuloSiAplicanResultados() {
		// Preparacion de datos
		Inmobiliaria inmobiliaria = new Inmobiliaria("DangeloPropiedades", "La Matanza", 1122334455);
		Casa casa = new Casa("LaMatanza", "Brown", 1234, 45000.0, 111, true, false);
		inmobiliaria.agregarCasa(casa);
		casa = new Casa("Ituzaingo", "Peron", 5678, 95000.0, 222, false, true);
		inmobiliaria.agregarCasa(casa);
		Double precioMin = 40000.0;
		Double precioMax = 100000.0;
		// Ejecucion
		inmobiliaria.getCasa();
		Integer tamañoArrayEsperado = 2;
		ArrayList<Casa> casasEnRango = inmobiliaria.buscarCasasPorRangoDePrecios(precioMin, precioMax);
		// Validacion
		assertNotNull(casasEnRango);
		assertEquals(tamañoArrayEsperado, inmobiliaria.getCantidadCasas());
	}
	
	@Test
	public void queLaBusquedaPorRangoDePrecioDeCasasMeArrojeUnArrayNuloSiNoAplicanResultados() {
		// Preparacion de datos
		Inmobiliaria inmobiliaria = new Inmobiliaria("DangeloPropiedades", "La Matanza", 1122334455);
		ArrayList<Casa> casas = new ArrayList<>();
	    Casa casa = new Casa("LaMatanza", "Brown", 1234, 45000.0, 111, true, false);
	    casa = new Casa("Ituzaingo", "Peron", 5678, 95000.0, 222, false, true);
		Double precioMin = 90000.0;
		Double precioMax = 100000.0;
		// Ejecucion
		inmobiliaria.getCasa();
		casas.add(casa);
	    casas.add(casa);
		ArrayList<Casa> casasEnRango = inmobiliaria.buscarCasasPorRangoDePrecioNulo(casas, precioMin, precioMax);
		// Validacion
		assertNull(casasEnRango);
		assertEquals(0, inmobiliaria.getCantidadCasas(), 0.0);
	}
	
	@Test
	public void queLaBusquedaDePropiedadesPorVentaMeArrojeUnaLista() {
		// Preparacion de datos
		Inmobiliaria inmobiliaria = new Inmobiliaria("DangeloPropiedades", "La Matanza", 1122334455);
	    Casa casa = new Casa("LaMatanza", "Brown", 1234, 45000.0, 111, true, false);
	    inmobiliaria.agregarCasa(casa);
	    casa = new Casa("Ituzaingo", "Peron", 5678, 95000.0, 222, false, true);
	    inmobiliaria.agregarCasa(casa);
	    Boolean propiedad1PorVentaBuscada = casa.getFueVendido();
		Boolean propiedad2PorVentaBuscada = casa.getFueVendido();
		// Ejecucion
		inmobiliaria.getCasa();
		Integer tamañoArrayEsperado = 2;
	    ArrayList<Casa> casa1Buscada = inmobiliaria.buscarPropiedadesPorVenta(propiedad1PorVentaBuscada);
		ArrayList<Casa> casa2Buscada = inmobiliaria.buscarPropiedadesPorVenta(propiedad2PorVentaBuscada);
		// Validacion
		assertNotNull(casa1Buscada);
		assertNotNull(casa2Buscada);
		assertEquals(tamañoArrayEsperado, inmobiliaria.getCantidadCasas());
	}
	
	@Test
	public void queLaBusquedaDePropiedadesPorVentaMeArrojeUnaListaNuloSiNoAplicanResultados() {
		// Preparacion de datos
		Inmobiliaria inmobiliaria = new Inmobiliaria("DangeloPropiedades", "La Matanza", 1122334455);
		ArrayList<Casa> casas = new ArrayList<>();
	    Casa casa1 = new Casa("LaMatanza", "Brown", 1234, 45000.0, 111, true, false);
	    Casa casa2 = new Casa("Ituzaingo", "Peron", 5678, 95000.0, 222, false, true);
		Boolean propiedad1PorVentaBuscada = casa1.getFueVendido();
		Boolean propiedad2PorVentaBuscada = casa2.getFueVendido();
		// Ejecucion
		inmobiliaria.getCasa();
		casas.add(casa1);
	    casas.add(casa2);
		ArrayList<Casa> casa1Buscada = inmobiliaria.buscarPropiedadPorVentaNulo(casas, propiedad1PorVentaBuscada);
		ArrayList<Casa> casa2Buscada = inmobiliaria.buscarPropiedadPorVentaNulo(casas, propiedad2PorVentaBuscada);
		// Validacion
		assertNull(casa1Buscada);
		assertNull(casa2Buscada);
		assertEquals(0, inmobiliaria.getCantidadCasas(), 0.0);
		
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
        Propiedad depto = new Departamento("CABA", "Montiel", 9090, 49000.0, 111, 7, true, false);
        depto = new Departamento("RamosMejia", "Suarez", 3355, 86500.0, 222, 9, true, false);
        Integer cantidadEsperada2 = 2;
        Integer cantidadEsperada1 = 1;
        inmobiliaria.agregarPropiedad(depto);
        inmobiliaria.agregarPropiedad(depto);
        // Ejecucion
        assertEquals(cantidadEsperada2, inmobiliaria.getCantidadPropiedades());
        Boolean ventaExitosa = inmobiliaria.venderPropiedad(depto);
        // Validacion
        assertTrue(ventaExitosa);
        assertEquals(cantidadEsperada1, inmobiliaria.getCantidadPropiedades());
        assertTrue(inmobiliaria.getPropiedad().contains(depto));
        assertTrue(inmobiliaria.getPropiedad().contains(depto));
	}
	
	@Test
	public void queSePuedaRealizarElAlquilerDeUnaPropiedad() {
		// Preparacion de datos
        Inmobiliaria inmobiliaria = new Inmobiliaria("DangeloPropiedades", "La Matanza", 1122334455);
        Propiedad casa = new Casa("LaMatanza", "Brown", 1234, 45000.0, 333, false, false);
        inmobiliaria.agregarPropiedad(casa);
        casa = new Casa("Ituzaingo", "Peron", 5678, 95000.0, 444, false, true);
        inmobiliaria.agregarPropiedad(casa);      
        Integer arrayEsperado = 2;
        // Ejecucion
        // Aqui verifica que la casa todavia no esta alquilada, por eso el assertFalse
        assertFalse(casa.getFueAlquilado()); 
        Boolean alquilerExitoso = inmobiliaria.alquilarPropiedad(casa);
        // Validacion
        assertTrue(alquilerExitoso);
        assertTrue(casa.getFueAlquilado());
        assertEquals(arrayEsperado, inmobiliaria.getCantidadPropiedades());
     
	}
	
	// Aqui profe lo que hice fue una permuta donde se realizan el intercambio entre dos inmobiliarias. Lo pense de muchas maneras pero
	// me resulto mucho mas comodo con esta logica.
	@Test
	public void queSePuedaRealizarLaPermutaDeDosPropiedades() {
		// Preparación de datos
        Inmobiliaria inmobiliaria1 = new Inmobiliaria("DangeloPropiedades", "La Matanza", 1122334455);
        Inmobiliaria inmobiliaria2 = new Inmobiliaria("RigaPropiedades", "Capital Federal", 1166778899);
        Propiedad depto1 = new Departamento("CABA", "Montiel", 9090, 49000.0, 111, 7, false, true);
        Propiedad depto2 = new Departamento("RamosMejia", "Suarez", 3355, 86500.0, 222, 9, true, false);
        Integer arrayEsperado = 1;
        inmobiliaria1.agregarPropiedad(depto1);
        inmobiliaria2.agregarPropiedad(depto2);
        // Verificar que las propiedades están en las listas correctas antes de la permuta
        assertTrue(inmobiliaria1.getPropiedad().contains(depto1));
        assertFalse(inmobiliaria1.getPropiedad().contains(depto2));
        assertTrue(inmobiliaria2.getPropiedad().contains(depto2));
        assertFalse(inmobiliaria2.getPropiedad().contains(depto1));
        // Ejecucion
        Boolean permutaExitosa = inmobiliaria1.permutaPropiedades(depto1, inmobiliaria2, depto2);
        // Validacion
        assertTrue(permutaExitosa);
        assertFalse(inmobiliaria1.getPropiedad().contains(depto1));
        assertTrue(inmobiliaria1.getPropiedad().contains(depto2));
        assertFalse(inmobiliaria2.getPropiedad().contains(depto2));
        assertTrue(inmobiliaria2.getPropiedad().contains(depto1));
        assertEquals(arrayEsperado, inmobiliaria1.getCantidadPropiedades());
        assertEquals(arrayEsperado, inmobiliaria2.getCantidadPropiedades());
	}
	
	@Test
	public void queSePuedaRealizarLaBusquedaDeCasasPorRangoDePreciosYElResultadoEsteOrdenadoPorPrecio() {
		// Preparacion de datos
		
		// Ejecucion
		
		// Validacion
		
	}
	
	@Test
	public void queSePuedaRealizarLaBusquedaDeCasasPorRangoDePrecioYElResultadoEsteOrdenadoPorPrecio() {
		// Preparacion de datos
		
		// Ejecucion
		
		// Validacion
		
	}
	
	@Test
	public void queSePuedaRealizarLaBusquedaDeCasasPorUbicacionYElResultadoEsteOrdenadoPorUbicacion() {
		// Preparacion de datos
		
		// Ejecucion
		
		// Validacion
		
	}
	
	@Test
	public void queSePuedaRealizarLaBusquedaDeDepartamentosPorRangoDePreciosYElResultadoEsteOrdenadoPorPrecio() {
		// Preparacion de datos
		
		// Ejecucion
		
		// Validacion
		
	}
	
	@Test
	public void queAlBuscarPorUnCriterioQueNoArrojeResultadosSeProduzcaLaExcepcionSinResultadosException() {
		// Preparacion de datos
		
		// Ejecucion
		
		// Validacion
		
	}
	
	@Test
	public void queSePuedaRealizarLaBusquedaDeDepartamentosPorUbicacionYElResultadoEsteOrdenadoPorUbicacion() {
		// Preparacion de datos
		
		// Ejecucion
		
		// Validacion
	
	}
	
	@Test
	public void queAlIntentarGuardarUnaPropiedadParaLaVentaCuyoImporteEstaPorDebajoDelUmbral10000SeArrojeLaExcepcionUmbralMinimoNoAlcanzadoException() {
		// Preparacion de datos
		
		// Ejecucion
		
		// Validacion
	
	}
	


}
