package es.cic.bootcamp.ejercicio002;

public class Coche {
 
	private Motor motor;

	public int encender() {
		return motor.arrancar() / 7;
	}

	public Motor getMotor() {
		return motor;
	}

	public void setMotor(Motor motor) {
		this.motor = motor;
	}
}
