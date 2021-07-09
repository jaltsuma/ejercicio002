package ejercicio002;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MotorTest {
private Motor motor;
	@BeforeEach
	void setUp() throws Exception {
		this.motor =new Motor();
	}

	@Test
	void testPotenciaMotor() {
	int resultado=	motor.PotenciaMotor(44);
		
		assertEquals(6, resultado, "Resultado no esperado");
		
	}

}
