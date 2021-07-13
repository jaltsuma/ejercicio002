package es.cic.bootcamp.ejercicio002;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CocheTest {

	private Coche cut;
	private Motor dependencia;
	
	@BeforeEach
	void setUp() throws Exception {
		this.cut = new Coche();
		this.dependencia = mock(Motor.class);
		
		cut.setMotor(dependencia);
	}

	@Test
	void testEncender() {
		when(dependencia.arrancar()).thenReturn(25);
		
		int resultado = cut.encender();
		
		assertEquals(3, resultado, "El resultado de encender no es el correcto");
		verify(dependencia, times(1)).arrancar();
	}

}
