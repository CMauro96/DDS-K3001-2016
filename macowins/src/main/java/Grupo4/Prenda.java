package Grupo4;

public class Prenda {
	private boolean importada;
	public float precioBase;
	public Tipo prenda;
	public static float valorFijoNegocio=100;
	 

	public Prenda(Tipo tipoPrenda) {
		this.prenda=tipoPrenda;
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
	private float TasaDeImportacion(){
		if(this.isImportada())
		{
			return  (float) 1.3;
		}
		else{
			return 1;
		}
	}
	public float getPrecioFinalPrenda(){
		return (this.prenda.precioBase() + valorFijoNegocio)*this.TasaDeImportacion();
	}
}
