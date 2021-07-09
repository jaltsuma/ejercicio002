package ejercicio002;

public class Coche {
 
	private Motor motor = new Motor();
	
	public int ArranqueMotor(int potencia) {
		int p;
		p=motor.PotenciaMotor(potencia);
		return p;
	}
}
