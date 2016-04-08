package Grupo4;

public class Pantalon implements Tipo {
	private double cantTela;
	
	public Pantalon(double cantTela) {
		this.cantTela = cantTela;
	}
	public double precioBase(){
		return 250+cantTela;
	}
}
