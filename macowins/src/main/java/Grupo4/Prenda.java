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

	public float getPrecioBase() {
		return precioBase;
	}
	public float getPrecioFinalPrenda(float valorDeNegocio){
		float precioFinal= this.getPrecioBase() + valorDeNegocio;
		if(this.isImportada())
		{
			return  (float) (precioFinal*(1.3));
		}
		else{
			return precioFinal;
		}
	}
}
