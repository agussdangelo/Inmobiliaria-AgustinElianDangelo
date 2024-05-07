package ar.edu.unlam.dominio.pb2;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class PruebaUnitariaAutomatizada {

	@Test
	public void queSePuedaDarDeAltaUnaCasaEnLaInmobiliaria() {
		// Preparacion de datos
		Inmobiliaria inmobiliaria = new Inmobiliaria();
		Casa casa = new Casa("Merlo", "Mitre", 1234, 45000.0, 111, true, false);
		String valorCalleEsperado = "Mitre";
		Integer valorAlturaEsperado = 1234;
		Double valorPrecioEsperado = 45000.0;
		String valorLocalidadEsperado = "Merlo";
		Integer valorCodigoEsperado = 111;
		// Ejecucion
		inmobiliaria.agregarCasa(casa);
		// Validacion
		assertEquals(valorCalleEsperado, casa.getCalle());
		assertEquals(valorAlturaEsperado, casa.getAltura());
		assertEquals(valorPrecioEsperado, casa.getPrecio(), 0.1);
		assertEquals(valorLocalidadEsperado, casa.getLocalidad());
		assertEquals(valorCodigoEsperado, casa.getCodigo(), 0.0);
	}
	
	@Test
	public void queSePuedanDarDeAltaDosCasasEnLaInmobiliaria() {
		// Preparacion de datos
		Inmobiliaria inmobiliaria = new Inmobiliaria();
		Casa casa1 = new Casa("Merlo", "Mitre", 1234, 45000.0, 111, true, false);
		Casa casa2 = new Casa("Liniers", "Costa", 4557, 95000.0, 222, true, false);
		// primera casa
		String valorCalleEsperadoCasa1 = "Mitre";
		Integer valorAlturaEsperadoCasa1 = 1234;
		Double valorPrecioEsperadoCasa1 = 45000.0;
		String valorLocalidadEsperadoCasa1 = "Merlo";
		Integer valorCodigoEsperadoCasa1 = 111;
		// segunda casa
		String valorCalleEsperadoCasa2 = "Costa";
		Integer valorAlturaEsperadoCasa2 = 4557;
		Double valorPrecioEsperadoCasa2 = 95000.0;
		String valorLocalidadEsperadoCasa2 = "Liniers";
		Integer valorCodigoEsperadoCasa2 = 222;
		// Ejecucion
		inmobiliaria.agregarCasa(casa1);
		inmobiliaria.agregarCasa(casa2);
		// Validacion
		assertEquals(valorCalleEsperadoCasa1, casa1.getCalle());
		assertEquals(valorCalleEsperadoCasa2, casa2.getCalle());
		assertEquals(valorAlturaEsperadoCasa1, casa1.getAltura(), 0.0);
		assertEquals(valorAlturaEsperadoCasa2, casa2.getAltura(), 0.0);
		assertEquals(valorPrecioEsperadoCasa1, casa1.getPrecio(), 0.1);
		assertEquals(valorPrecioEsperadoCasa2, casa2.getPrecio(), 0.1);
		assertEquals(valorLocalidadEsperadoCasa1, casa1.getLocalidad());
		assertEquals(valorLocalidadEsperadoCasa2, casa2.getLocalidad());
		assertEquals(valorCodigoEsperadoCasa1, casa1.getCodigo(), 0.0);
		assertEquals(valorCodigoEsperadoCasa2, casa2.getCodigo(), 0.0);
	}
	
	@Test
	public void queNoSePuedanDarDeAltaDosCasasConUnaMismaDireccion(){   // Calle, número y localidad(
		// Preparacion de datos
		Inmobiliaria inmobiliaria = new Inmobiliaria();
		Casa casa1 = new Casa("Merlo", "Mitre", 1234, 45000.0, 111, true, false);
		Casa casa2 = new Casa("Merlo", "Mitre", 1234, 45000.0, 111, true, false);
		// primera casa
		String valorCalleEsperadoCasa1 = "Mitre";
		Integer valorAlturaEsperadoCasa1 = 1234;
		Double valorPrecioEsperadoCasa1 = 45000.0;
		String valorLocalidadEsperadoCasa1 = "Merlo";
		Integer valorCodigoEsperadoCasa1 = 111;
		// segunda casa
		String valorCalleEsperadoCasa2 = "Mitre";
		Integer valorAlturaEsperadoCasa2 = 1234;
		Double valorPrecioEsperadoCasa2 = 45000.0;
		String valorLocalidadEsperadoCasa2 = "Merlo";
		Integer valorCodigoEsperadoCasa2 = 111;
		// Ejecucion
		inmobiliaria.agregarCasa(casa1);
		inmobiliaria.agregarCasa(casa2);
		// Validacion
		assertEquals(valorCalleEsperadoCasa1, casa1.getCalle());
		assertEquals(valorCalleEsperadoCasa2, casa2.getCalle());
		assertEquals(valorAlturaEsperadoCasa1, casa1.getAltura(), 0.0);
		assertEquals(valorAlturaEsperadoCasa2, casa2.getAltura(), 0.0);
		assertEquals(valorPrecioEsperadoCasa1, casa1.getPrecio(), 0.1);
		assertEquals(valorPrecioEsperadoCasa2, casa2.getPrecio(), 0.1);
		assertEquals(valorLocalidadEsperadoCasa1, casa1.getLocalidad());
		assertEquals(valorLocalidadEsperadoCasa2, casa2.getLocalidad());
		assertEquals(valorCodigoEsperadoCasa1, casa1.getCodigo(), 0.0);
		assertEquals(valorCodigoEsperadoCasa2, casa2.getCodigo(), 0.0);
	}
	
	@Test
	public void queSePuedaDarDeAltaUnDepartamentoEnLaInmobiliaria() {
		// Preparacion de datos
		Inmobiliaria inmobiliaria = new Inmobiliaria();
		Departamento depto1 = new Departamento("CABA", "Montiel", 9090, 49000.0, 333, 7, false, true);
		// Ejecucion
		String valorCalleEsperadoDepto = "Montiel";
		Integer valorAlturaEsperadaDepto = 9090;
		Double valorPrecioEsperadoDepto = 49000.0;
		String valorLocalidadEsperadaDepto = "CABA";
		Integer valorCodigoEsperadoDepto = 333;
		Integer valorPisoEsperadoDepto = 7;
		inmobiliaria.agregarDepartamento(depto1);
		// Validacion
		assertEquals(valorCalleEsperadoDepto, depto1.getCalle());
		assertEquals(valorAlturaEsperadaDepto, depto1.getAltura(), 0.0);
		assertEquals(valorPrecioEsperadoDepto, depto1.getPrecio(), 0.1);
		assertEquals(valorLocalidadEsperadaDepto, depto1.getLocalidad());
		assertEquals(valorCodigoEsperadoDepto, depto1.getCodigo(), 0.0);
		assertEquals(valorPisoEsperadoDepto, depto1.getPiso(), 0.0);
	}
	
	@Test
	public void queSePuedaDarDeAltaDosDepartamentoEnLaInmobiliaria() {
		// Preparacion de datos
		Inmobiliaria inmobiliaria = new Inmobiliaria();
		Departamento depto1 = new Departamento("CABA", "Montiel", 9090, 49000.0, 333, 7, false, true);
		Departamento depto2 = new Departamento("RamosMejia", "Suarez", 3355, 86500.0, 555, 9, true, false);
		// Ejecucion
		// depto1
		String valorCalleEsperadoDepto = "Montiel";
		Integer valorAlturaEsperadaDepto = 9090;
		Double valorPrecioEsperadoDepto = 49000.0;
		String valorLocalidadEsperadaDepto = "CABA";
		Integer valorCodigoEsperadoDepto = 333;
		Integer valorPisoEsperadoDepto = 7;
		// depto2
		String valorCalleEsperadoDepto2 = "Suarez";
		Integer valorAlturaEsperadaDepto2 = 3355;
		Double valorPrecioEsperadoDepto2 = 86500.0;
		String valorLocalidadEsperadaDepto2 = "RamosMejia";
		Integer valorCodigoEsperadoDepto2 = 555;
		Integer valorPisoEsperadoDepto2 = 9;
		inmobiliaria.agregarDepartamento(depto1);
		inmobiliaria.agregarDepartamento(depto2);
		// Validacion
		assertEquals(valorCalleEsperadoDepto, depto1.getCalle());
		assertEquals(valorAlturaEsperadaDepto, depto1.getAltura(), 0.0);
		assertEquals(valorPrecioEsperadoDepto, depto1.getPrecio(), 0.1);
		assertEquals(valorLocalidadEsperadaDepto, depto1.getLocalidad());
		assertEquals(valorCodigoEsperadoDepto, depto1.getCodigo(), 0.0);
		assertEquals(valorPisoEsperadoDepto, depto1.getPiso(), 0.0);
		assertEquals(valorCalleEsperadoDepto2, depto2.getCalle());
		assertEquals(valorAlturaEsperadaDepto2, depto2.getAltura(), 0.0);
		assertEquals(valorPrecioEsperadoDepto2, depto2.getPrecio(), 0.1);
		assertEquals(valorLocalidadEsperadaDepto2, depto2.getLocalidad());
		assertEquals(valorCodigoEsperadoDepto2, depto2.getCodigo(), 0.0);
		assertEquals(valorPisoEsperadoDepto2, depto2.getPiso(), 0.0);
	}
	
	@Test
	public void queNoSePuedanDarDeAltaDosDepartamentoConUnaMismaDireccion() {  // Calle, numero, depto, piso y localidad
		// Preparacion de datos
		Inmobiliaria inmobiliaria = new Inmobiliaria();
		Departamento depto1 = new Departamento("CABA", "Montiel", 9090, 49000.0, 333, 7, false, true);
		Departamento depto2 = new Departamento("CABA", "Montiel", 9090, 49000.0, 333, 7, false, true);
		// Ejecucion
		Boolean agregoDepartamento1 = inmobiliaria.noAgregarDepartamentoMismaDireccion(depto1);
		Boolean agregoDepartamento2 = inmobiliaria.noAgregarDepartamentoMismaDireccion(depto2);
		// Validacion
		assertFalse(agregoDepartamento1);
		assertFalse(agregoDepartamento2);
	}

	@Test
	public void queSePuedaObtenerElValorPromedioDeLasCasas() {
		// Preparacion de datos
		Inmobiliaria inmobiliaria = new Inmobiliaria();
		Casa casa1 = new Casa("Merlo", "Mitre", 1234, 45000.0, 111, false, true);
		Casa casa2 = new Casa("Liniers", "Costa", 4557, 95000.0, 222, true, false);
		Casa casa3 = new Casa("Palomar", "Peron", 3399, 15000.0, 333, false, true);
		// Ejecucion
		inmobiliaria.agregarCasa(casa1);
		inmobiliaria.agregarCasa(casa2);
		inmobiliaria.agregarCasa(casa3);
		Integer promedioEsperadoCasa = 51667;
		// Validacion
		assertEquals(promedioEsperadoCasa, inmobiliaria.calcularPrecioPromedioCasas());
	}
	
	@Test
	public void queSePuedaObtenerElValorPromedioDeLosDepartamentos() {
		// Preparacion de datos
		Inmobiliaria inmobiliaria = new Inmobiliaria();
		Departamento depto1 = new Departamento("CABA", "Montiel", 9090, 49000.0, 333, 7, false, true);
		Departamento depto2 = new Departamento("RamosMejia", "Suarez", 3355, 86500.0, 555, 9, true, false);
		Departamento depto3 = new Departamento("Haedo", "SanMartin", 6890, 55300.0, 666, 10, false, true);
		// Ejecucion
		inmobiliaria.agregarDepartamento(depto1);
		inmobiliaria.agregarDepartamento(depto2);
		inmobiliaria.agregarDepartamento(depto3);
		Double promedioEsperadoDepto = 19080.0;
		// Validacion
		assertEquals(promedioEsperadoDepto, inmobiliaria.calcularPrecioPromedioDepartamento());
	}
	
	@Test
	public void queLaBusquedaPorRangoDePrecioDeMeArrojeUnArrayNoNuloSiAplicanResultados() {
		// Preparacion de datos
		Inmobiliaria inmobiliaria = new Inmobiliaria();
		Casa casa1 = new Casa("LaMatanza", "Brown", 1234, 45000.0, 111, true, false);
		Casa casa2 = new Casa("Ituzaingo", "Peron", 5678, 95000.0, 222, false, true);
		inmobiliaria.agregarCasa(casa1);
		inmobiliaria.agregarCasa(casa2);
		// Ejecucion
		Double precioMin = 40000.0;
		Double precioMax = 100000.0;
		ArrayList<Casa> casasEnRango = Inmobiliaria.buscarCasasPorRangoDePrecios(precioMin, precioMax);
		// Validacion
		assertNotNull(casasEnRango);
	}
	
	@Test
	public void queLaBusquedaPorRangoDePrecioDeCasasMeArrojeUnArrayNuloSiNoAplicanResultados() {
		// Preparacion de datos
		Inmobiliaria inmobiliaria = new Inmobiliaria();
		Casa casa1 = new Casa("LaMatanza", "Brown", 1234, 45000.0, 111, true, false);
		Casa casa2 = new Casa("Ituzaingo", "Peron", 5678, 95000.0, 222, false, true);
		// Ejecucion
		Double precioMin = 90000.0;
		Double precioMax = 100000.0;
		ArrayList<Casa> casasEnRango = Inmobiliaria.buscarCasasPorRangoDePrecioNulo(precioMin, precioMax);
		// Validacion
		assertNull(casasEnRango);
	}
	
	@Test
	public void queSePuedanAgregar3ClienteYElTamanioDelArraySea3() {
		Integer dimensionArrayEsperado = 3;
		Inmobiliaria inmobiliaria = new Inmobiliaria();
		Persona cliente1 = new Persona("Raul", "Gimenez", 33445566, 1198585454, TipoDePropiedad.CASAS);
		Persona cliente2 = new Persona("Fernando", "Lopez", 77889900, 117657454, TipoDePropiedad.DEPARTAMENTOS);
		Persona cliente3 = new Persona("Luis", "Rodriguez", 11223344, 1145456634, TipoDePropiedad.PH);
		
		inmobiliaria.agregarCliente(cliente1);
		inmobiliaria.agregarCliente(cliente2);
		inmobiliaria.agregarCliente(cliente3);
		
		assertEquals(dimensionArrayEsperado, (Integer) inmobiliaria.getCliente().size());
	}
	
	@Test
	public void queSePuedaAgregarUnaCasaYLaDimensionDelArraySeaLaMinimaPosible() {
		Integer dimensionArrayEsperado = 1;
		Inmobiliaria inmobiliaria = new Inmobiliaria();
		Casa casa1 = new Casa("LaMatanza", "Brown", 1234, 45000.0, 111, true, false);
		
		inmobiliaria.agregarCasa(casa1);
		
		assertEquals(dimensionArrayEsperado, (Integer) inmobiliaria.getCasa().size());
	}
	
	@Test
	public void queSePuedanAgregar3CasasYElTamanioDelArraySea3() {
		Integer dimensionArrayEsperado = 3;
		Inmobiliaria inmobiliaria = new Inmobiliaria();
		Casa casa1 = new Casa("LaMatanza", "Brown", 1234, 45000.0, 111, true, false);
		Casa casa2 = new Casa("Ituzaingo", "Peron", 5678, 95000.0, 222, false, true);
		Casa casa3 = new Casa("SanJusto", "Bransen", 9977, 34000.0, 333, true, false);
		
		inmobiliaria.agregarCasa(casa1);
		inmobiliaria.agregarCasa(casa2);
		inmobiliaria.agregarCasa(casa3);
		
		assertEquals(dimensionArrayEsperado, (Integer) inmobiliaria.getCasa().size());
	}
	
	@Test
	public void queSePuedaAgregarUnClienteYLaDimensionDelArraySeaLaMinimaPosible() {
		Integer dimensionArrayEsperado = 1;
		Inmobiliaria inmobiliaria = new Inmobiliaria();
		Persona cliente1 = new Persona("Raul", "Gimenez", 33445566, 1198585454, TipoDePropiedad.CASAS);
		
		inmobiliaria.agregarCliente(cliente1);
		
		assertEquals(dimensionArrayEsperado, (Integer) inmobiliaria.getCliente().size());
	}
	
	@Test
	public void queNoSePuedaAgregar2ClientesConLosMismosDatosEnUnArrayDe1() {
		Integer dimensionArrayEsperado = 1;
		Inmobiliaria inmobiliaria = new Inmobiliaria();
		Persona cliente1 = new Persona("Raul", "Gimenez", 33445566, 1198585454, TipoDePropiedad.CASAS);
		Persona cliente2 = new Persona("Raul", "Gimenez", 33445566, 1198585454, TipoDePropiedad.CASAS);
		
		Boolean agregarCliente1 = inmobiliaria.agregarCliente(cliente1);
		Boolean agregarCliente2 = inmobiliaria.agregarCliente(cliente2);
		
		assertEquals(dimensionArrayEsperado, (Integer) inmobiliaria.getCliente().size());
		assertTrue(agregarCliente1);
		assertFalse(agregarCliente2);
		
		
	}
	
}
