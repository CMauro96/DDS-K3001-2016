package Grupo4;

public class Sombrero implements Tipo {
	private float coefMetro;

	
	public Sombrero(float coefMetro) {
		this.coefMetro = coefMetro;
	}

	public float precioBase(){
		return 150+(1+coefMetro);
	}
}
