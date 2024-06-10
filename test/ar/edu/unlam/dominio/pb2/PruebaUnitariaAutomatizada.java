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
	
}
