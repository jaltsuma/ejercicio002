package es.cic.bootcamp.ejercicio002;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import es.cic.bootcamp.ejercicio002.Coche;
import es.cic.bootcamp.ejercicio002.Motor;

class CocheIntegrationTest {
	
	private Coche coche;
	
	@BeforeEach
	void setUp() throws Exception {
		this.coche = new Coche();
		this.coche.setMotor(new Motor());
	}

	@Test
	void testEncenderDosVecesMismoTorque() {
		int resultado =	coche.encender();
		int resultado2 = coche.encender();
		
		assertTrue(resultado == resultado2, 
				String.format("El torque del coche no es siempre el mismo: %d, %d", resultado, resultado2));
	}
		
	@Test
	void testEncenderCocheAlMenosTorqueMinimo() {
		int resultado =	coche.encender();
		
		assertTrue(resultado >= 2, String.format("El torque del coche debe ser al menos 2, pero era %d", resultado));
	}
	
	@Test
	void testEncenderComoMaximoTorqueMaximo() {
		int resultado =	coche.encender();
		
		assertTrue(resultado <= 5, String.format("El torque del coche debe como máximo 5 pero era %d", resultado));
	}	
}
