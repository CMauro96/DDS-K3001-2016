package Grupo4;

public class Sombrero implements Tipo {
	private double coefMetro;

	
	public Sombrero(double coefMetro) {
		this.coefMetro = coefMetro;
	}

	public double precioBase(){
		return 150+(1+coefMetro);
	}
}
