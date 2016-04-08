package Grupo4;

public class Zapato implements Tipo{
	private int talle;
	
	public Zapato(int talle) {
		this.talle = talle;
	}

	public float precioBase(){
		return 400+(5*talle);
	}
}
