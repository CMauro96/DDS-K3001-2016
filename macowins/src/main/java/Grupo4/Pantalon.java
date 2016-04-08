package Grupo4;

public class Pantalon implements Tipo {
	private float cantTela;
	
	public Pantalon(float cantTela) {
		this.cantTela = cantTela;
	}
	public float precioBase(){
		return 250+cantTela;
	}
}
