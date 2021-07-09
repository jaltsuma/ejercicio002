package ejercicio002;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CocheTest {
private Coche coche;
	@BeforeEach
	void setUp() throws Exception {
		this.coche = new Coche();
	}

	@Test
	void testArranqueMotor() {
		int potencia =(int)(Math.random()*(40-20+1)+25);
		int resultado;
	resultado =	coche.ArranqueMotor(potencia);
		assertEquals(potencia/7, resultado,"El resultado no es el esperado");
	}

}
