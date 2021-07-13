package es.cic.bootcamp.ejercicio002;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import es.cic.bootcamp.ejercicio002.Motor;

public class MotorTest {
	private Motor motor;
	
	@BeforeEach
	void setUp() throws Exception {
		this.motor =new Motor();
	}

	@Test
	void testArrancarDosVecesMismaPotencia() {
		int resultado =	motor.arrancar();
		int resultado2 = motor.arrancar();
		
		assertTrue(resultado == resultado2, "La potencia del motor no es siempre la misma");
	}
	
	@Test
	void testArrancarAlMenosPotenciaMinima() {
		int resultado =	motor.arrancar();
		
		assertTrue(resultado >= 20, String.format("La potencia del motor debe ser al menos 20, pero era %d", resultado));
	}
	
	@Test
	void testArrancarComoMaximoPotenciaMaxima() {
		int resultado =	motor.arrancar();
		
		assertTrue(resultado <= 40, String.format("La potencia del motor debe como máximo 40 pero era %d", resultado));
	}	
}
