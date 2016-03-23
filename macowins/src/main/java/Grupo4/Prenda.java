package Grupo4;

public class Prenda {
	private boolean importada;
	public float precioBase;

	public Prenda(float precioBase) {
		this.precioBase=precioBase;
		
	}

	
	public boolean isImportada() {
		return importada;
	}
	public void setImportada(boolean importada) {
		this.importada = importada;
	}
	public void setPrecioBase(float precioBase){
		this.precioBase=precioBase;
	}

	public float getPrecioBase() {
		return precioBase;
	}
	
	
}
