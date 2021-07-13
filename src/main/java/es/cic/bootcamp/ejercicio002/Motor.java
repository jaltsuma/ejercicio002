package es.cic.bootcamp.ejercicio002;

public class Motor {

	private int potencia;
	
	public Motor() {
		this.potencia = generarPotenciaEntre20y40();
	}

	public int arrancar() {
		return potencia;
	}
	
	
	private int generarPotenciaEntre20y40() {
		return (int) Math.floor(Math.random() * 21) + 20;
	}
}
