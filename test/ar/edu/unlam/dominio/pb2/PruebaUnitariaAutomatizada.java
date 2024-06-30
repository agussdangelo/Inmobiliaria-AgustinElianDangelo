package ar.edu.unlam.dominio.pb2;

import static org.junit.Assert.*;

import java.util.TreeSet;

import org.junit.Test;

public class PruebaUnitariaAutomatizada {

	@Test
	public void queSePuedaDarDeAltaUnaCasaEnLaInmobiliaria() throws UmbralMinimoNoAlcanzadoException {
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
	public void queSePuedanDarDeAltaDosCasasEnLaInmobiliaria() throws UmbralMinimoNoAlcanzadoException {
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
	public void queSePuedaDarDeAltaUnDepartamentoEnLaInmobiliaria() throws UmbralMinimoNoAlcanzadoException {
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
	public void queSePuedaDarDeAltaDosDepartamentoEnLaInmobiliaria() throws UmbralMinimoNoAlcanzadoException {
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
	public void queSePuedaObtenerElValorPromedioDeLasCasas() throws UmbralMinimoNoAlcanzadoException {
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
	public void queSePuedaObtenerElValorPromedioDeLosDepartamentos() throws UmbralMinimoNoAlcanzadoException {
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
	public void queLaBusquedaDePropiedadesPorVentaMeArrojeUnaLista() throws UmbralMinimoNoAlcanzadoException {
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
	public void queSePuedaAgregarUnClienteALaInmobiliaria() {
		// Preparacion de datos
		Inmobiliaria inmobiliaria = new Inmobiliaria("DangeloPropiedades", "La Matanza", 1122334455);
		Persona cliente = new Persona("Pepe", "Fernandez", 33446577, 1588956640, TipoDePropiedad.CASAS);
		String nombreCliente = "Pepe";
		String apellidoCliente = "Fernandez";
		Long dniCliente = (long) 33446577;
		Long telefonoCliente = (long) 1588956640;
		TipoDePropiedad propiedadClienteInteres = TipoDePropiedad.CASAS;
		// Ejecucion
		inmobiliaria.getCliente();
		Integer tamañoArrayEsperado = 1;
		Boolean agregoCliente = inmobiliaria.agregarCliente(cliente);
		// Validacion
		assertEquals(nombreCliente, cliente.getNombre());
		assertEquals(apellidoCliente, cliente.getApellido());
		assertEquals(dniCliente, cliente.getDni());
		assertEquals(telefonoCliente, cliente.getTelefono());
		assertEquals(propiedadClienteInteres, cliente.getPropiedadInteres());
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
    public void queSePuedaRealizarLaVentaDeUnaPropiedad() throws UmbralMinimoNoAlcanzadoException {
        // Preparacion de datos
        Inmobiliaria inmobiliaria = new Inmobiliaria("DangeloPropiedades", "La Matanza", 1122334455);
        Persona dueño = new Persona("Juan", "Beliz", 9843784, 117847474, TipoDePropiedad.DEPARTAMENTOS);
        Persona comprador = new Persona("Maria", "Nieves", 1263262, 1126352738, TipoDePropiedad.DEPARTAMENTOS);
        Propiedad depto1 = new Departamento("CABA", "Montiel", 9090, 49000.0, 111, 7, true, TipoOperacion.VENTA);
        Integer cantidadEsperada = 1;
        inmobiliaria.agregarPropiedad(depto1);
        // Ejecucion
        Operacion venta = new Venta();
        Boolean ventaExitosa = inmobiliaria.ejecutarOperacion(venta, depto1, dueño, depto1, comprador);
        // Validacion
        assertTrue(ventaExitosa);
        assertEquals(cantidadEsperada, inmobiliaria.getCantidadPropiedades());
        assertTrue(inmobiliaria.getPropiedad().contains(depto1));
        assertEquals(depto1.getPropietario(), comprador);
    }

    @Test
    public void queSePuedaRealizarElAlquilerDeUnaPropiedad() throws UmbralMinimoNoAlcanzadoException {
        // Preparacion de datos
        Inmobiliaria inmobiliaria = new Inmobiliaria("DangeloPropiedades", "La Matanza", 1122334455);
        Persona dueño = new Persona("Juan", "Beliz", 9843784, 117847474, TipoDePropiedad.DEPARTAMENTOS );
        Persona inquilino = new Persona("Pedro", "Ramirez", 2372374, 1174854950, TipoDePropiedad.DEPARTAMENTOS);
        Propiedad depto1 = new Departamento("CABA", "Montiel", 9090, 49000.0, 111, 7, true, TipoOperacion.ALQUILER);
        Integer cantidadEsperada = 1;
        inmobiliaria.agregarPropiedad(depto1);
        // Ejecucion
        Operacion alquiler = new Alquiler();
        Boolean alquilerExitoso = inmobiliaria.ejecutarOperacion(alquiler, depto1, dueño, depto1, inquilino);
        // Validacion
        assertTrue(alquilerExitoso);
        assertEquals(cantidadEsperada, inmobiliaria.getCantidadPropiedades());
        assertTrue(inmobiliaria.getPropiedad().contains(depto1));
        assertEquals(depto1.getInquilino(), inquilino);
    }

    @Test
    public void queSePuedaRealizarLaPermutaDePropiedades() throws UmbralMinimoNoAlcanzadoException {
        // Preparacion de datos
        Inmobiliaria inmobiliaria = new Inmobiliaria("DangeloPropiedades", "La Matanza", 1122334455);
        Persona propietario1 = new Persona("Juan", "Beliz", 9843784, 117847474, TipoDePropiedad.DEPARTAMENTOS );
        Persona propietario2 = new Persona("Maria", "Nieves", 1263262, 1126352738, TipoDePropiedad.DEPARTAMENTOS);
        Propiedad depto1 = new Departamento("CABA", "Montiel", 9090, 49000.0, 111, 7, true, TipoOperacion.PERMUTA);
        Propiedad depto2 = new Departamento("RamosMejia", "Suarez", 3355, 86500.0, 333, 9, true, TipoOperacion.PERMUTA);
        Integer cantidadEsperada = 2;
        inmobiliaria.agregarPropiedad(depto1);
        inmobiliaria.agregarPropiedad(depto2);
        // Ejecucion
        Operacion permuta = new Permuta();
        Boolean permutaExitosa = inmobiliaria.ejecutarOperacion(permuta, depto1, propietario1, depto2, propietario2);
        // Validacion
        assertTrue(permutaExitosa);
        assertEquals(cantidadEsperada, inmobiliaria.getCantidadPropiedades());
        assertEquals(depto1.getPropietario(), propietario2);
        assertEquals(depto2.getPropietario(), propietario1);
    }
	
	@Test
	public void queSePuedaRealizarLaBusquedaDeCasasPorRangoDePreciosYElResultadoEsteOrdenadoPorPrecio() throws UmbralMinimoNoAlcanzadoException {
		// Preparacion de datos
        Inmobiliaria inmobiliaria = new Inmobiliaria("DangeloPropiedades", "La Matanza", 1122334455);     
       	Propiedad casa1 = new Casa("CABA", "Montiel", 9090, 150000.0, 3, true, TipoOperacion.PERMUTA);
       	Propiedad casa2 = new Casa("RamosMejia", "Suarez", 3355, 120000.0, 4, false, TipoOperacion.ALQUILER);
       	Propiedad casa3 = new Casa("Moron", "Belgrano", 1234, 180000.0, 5, false, TipoOperacion.ALQUILER);
        inmobiliaria.agregarPropiedad(casa1);
        inmobiliaria.agregarPropiedad(casa2);
        inmobiliaria.agregarPropiedad(casa3);
        Integer arrayEsperado = 3;
        Double precioMin = 100000.0;
        Double precioMax = 160000.0;
        // Ejecucion
        inmobiliaria.getPropiedad();
        TreeSet<Propiedad> casasEncontradas = inmobiliaria.buscarCasasPorRangoDePrecios(precioMin, precioMax);
        // Validacion
        assertEquals(arrayEsperado, inmobiliaria.getCantidadPropiedades());
        assertNotNull(casasEncontradas);
        assertEquals(casa2, casasEncontradas.last());
        assertEquals(casa1, casasEncontradas.first());
  
	}
	
	@Test
	public void queSePuedaRealizarLaBusquedaDeCasasPorUbicacionYElResultadoEsteOrdenadoPorUbicacion() throws UmbralMinimoNoAlcanzadoException {
		// Preparacion de datos
        Inmobiliaria inmobiliaria = new Inmobiliaria("DangeloPropiedades", "La Matanza", 1122334455);
        Propiedad casa1 = new Casa("CABA", "Montiel", 9090, 150000.0, 3, true, TipoOperacion.PERMUTA);
       	Propiedad casa2 = new Casa("RamosMejia", "Suarez", 3355, 120000.0, 4, false, TipoOperacion.ALQUILER);
       	Propiedad casa3 = new Casa("Moron", "Belgrano", 1234, 180000.0, 5, false, TipoOperacion.ALQUILER);
	    inmobiliaria.agregarPropiedad(casa1);
	    inmobiliaria.agregarPropiedad(casa2);
	    inmobiliaria.agregarPropiedad(casa3);
        Integer arrayEsperado = 3;
        String localidadCasa1 = "CABA";
        String localidadCasa2 = "RamosMejia";
        String localidadCasa3 = "Moron";
		// Ejecucion
        inmobiliaria.getPropiedad();
        TreeSet<Propiedad> casasEncontradas1 = inmobiliaria.buscarCasasPorUbicacion(localidadCasa1);
        TreeSet<Propiedad> casasEncontradas2 = inmobiliaria.buscarCasasPorUbicacion(localidadCasa2);
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
	public void queSePuedaRealizarLaBusquedaDeDepartamentosPorRangoDePreciosYElResultadoEsteOrdenadoPorPrecio() throws UmbralMinimoNoAlcanzadoException {
		// Preparacion de datos
        Inmobiliaria inmobiliaria = new Inmobiliaria("DangeloPropiedades", "La Matanza", 1122334455);     
        Propiedad depto1 = new Departamento("RamosMejia", "Suarez", 3355, 86500.0, 222, 9, true, TipoOperacion.VENTA);
        Propiedad depto2 = new Departamento("CABA", "Montiel", 9090, 49000.0, 111, 7, false, TipoOperacion.ALQUILER);
        Propiedad depto3 = new Departamento("Castelar", "Peron", 945, 180000.0, 333, 3 ,false, TipoOperacion.ALQUILER);
        inmobiliaria.agregarPropiedad(depto1);
        inmobiliaria.agregarPropiedad(depto2);
        inmobiliaria.agregarPropiedad(depto3);
        Integer arrayEsperado = 3;
        Double precioMin = 40000.0;
        Double precioMax = 90000.0;
        // Ejecucion
        inmobiliaria.getPropiedad();
        TreeSet<Propiedad> departamentosEncontradas = inmobiliaria.buscarDepartamentosPorRangoDePrecios(precioMin, precioMax);
        // Validacion
        assertEquals(arrayEsperado, inmobiliaria.getCantidadPropiedades());
        assertNotNull(departamentosEncontradas);
        assertEquals(depto1, departamentosEncontradas.last());
        assertEquals(depto2, departamentosEncontradas.first());
   
	}
	
	@Test (expected = SinResultadosException.class)
	public void queAlBuscarPorUnCriterioQueNoArrojeResultadosSeProduzcaLaExcepcionSinResultadosException() throws SinResultadosException, UmbralMinimoNoAlcanzadoException {
		// Preparacion de datos
		Inmobiliaria inmobiliaria = new Inmobiliaria("DangeloPropiedades", "La Matanza", 1122334455);  
		Propiedad depto1 = new Departamento("Ramos Mejia", "Suarez", 3355, 86500.0, 222, 9, true, TipoOperacion.VENTA);
        Propiedad depto2 = new Departamento("CABA", "Montiel", 9090, 49000.0, 111, 7, false, TipoOperacion.ALQUILER);
        inmobiliaria.agregarPropiedad(depto1);
        inmobiliaria.agregarPropiedad(depto2);
        String criterioDeBusqueda = "Ituzaingo";
        Integer arrayEsperado = 2;
        // Ejecucion
        inmobiliaria.getPropiedad();
        inmobiliaria.buscarPropiedadesPorCriterio(criterioDeBusqueda);
        // Validacion
        assertFalse(inmobiliaria.getPropiedad().isEmpty());
        assertTrue(inmobiliaria.getPropiedad().contains(depto1));
        assertTrue(inmobiliaria.getPropiedad().contains(depto2));
        assertEquals(arrayEsperado, inmobiliaria.getCantidadPropiedades());
	}
	
	@Test
	public void queSePuedaRealizarLaBusquedaDeDepartamentosPorUbicacionYElResultadoEsteOrdenadoPorUbicacion() throws UmbralMinimoNoAlcanzadoException {
		// Preparacion de datos
        Inmobiliaria inmobiliaria = new Inmobiliaria("DangeloPropiedades", "La Matanza", 1122334455); 
        Propiedad depto1 = new Departamento("Ramos Mejia", "Suarez", 3355, 86500.0, 222, 9, true, TipoOperacion.VENTA);
    	inmobiliaria.agregarPropiedad(depto1);
        Propiedad depto2 = new Departamento("Ituzaingo", "Montiel", 9090, 49000.0, 111, 7, false, TipoOperacion.ALQUILER);
        inmobiliaria.agregarPropiedad(depto2);
       	Propiedad depto3 = new Departamento("Castelar", "Peron", 945, 180000.0, 333, 3 ,false, TipoOperacion.ALQUILER);
       	inmobiliaria.agregarPropiedad(depto3);
       	Integer arrayEsperadoDepartamento = 3;
        String localidadDepto1 = "Ramos Mejia";
        String localidadDepto2 = "Ituzaingo";
        String localidadDepto3 = "Castelar";
		// Ejecucion
        inmobiliaria.getPropiedad();
        TreeSet<Propiedad> departamentosEncontradas1 = inmobiliaria.buscarDepartamentosPorUbicacion(localidadDepto3);
        TreeSet<Propiedad> departamentosEncontradas2 = inmobiliaria.buscarDepartamentosPorUbicacion(localidadDepto2);
		// Validacion
        assertEquals(arrayEsperadoDepartamento, inmobiliaria.getCantidadPropiedades());
        assertEquals(localidadDepto1, depto1.getLocalidad());
        assertEquals(localidadDepto2, depto2.getLocalidad());
        assertEquals(localidadDepto3, depto3.getLocalidad());
        assertNotNull(departamentosEncontradas1);
        assertNotNull(departamentosEncontradas2);
        assertEquals(depto3, departamentosEncontradas1.first());
        assertEquals(depto2, departamentosEncontradas2.last());
	}
	
	@Test (expected = UmbralMinimoNoAlcanzadoException.class)
	public void queAlIntentarGuardarUnaPropiedadParaLaVentaCuyoImporteEstaPorDebajoDelUmbral10000SeArrojeLaExcepcionUmbralMinimoNoAlcanzadoException() throws UmbralMinimoNoAlcanzadoException {
		// Preparacion de datos
		Inmobiliaria inmobiliaria = new Inmobiliaria("DangeloPropiedades", "La Matanza", 1122334455);
		Propiedad casaBarata = new Casa("CABA", "Montiel", 9090, 9000.0, 3, true, TipoOperacion.PERMUTA);
		// Ejecucion
		inmobiliaria.agregarPropiedad(casaBarata);
        // Validacion
        assertFalse(inmobiliaria.getPropiedad().contains(casaBarata));
        assertTrue(inmobiliaria.getPropiedad().isEmpty());
	}
	
}
