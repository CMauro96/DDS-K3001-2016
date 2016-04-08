package Grupo4;

public class Saco implements Tipo {
	private int cantBotones;
	public Saco(int cantBotones){
		this.cantBotones=cantBotones;
	}
	
	public double precioBase(){
		return 300+(10*cantBotones);
	}
}
