package Grupo4;

public class Prenda {
	private boolean importada;
	public double precioBase;
	public Tipo tipoPrenda;
	public Marca marcaPrenda;
	public static double valorFijoNegocio=100;
	
	 

	public Prenda(Tipo tipoPrenda,Marca marcaPrenda) {
		this.tipoPrenda=tipoPrenda;
		this.marcaPrenda=marcaPrenda;
	}

	public boolean isImportada() {
		return importada;
	}
	public void setImportada(boolean importada) {
		this.importada = importada;
	}

	public double getPrecioBase() {
		return precioBase;
	}
	private double TasaDeImportacion(){
		if(this.isImportada())
		{
			return 1.3;
		}
		else{
			return 1;
		}
	}
	public double precioOriginal(){
		return (this.tipoPrenda.precioBase() + valorFijoNegocio)*this.TasaDeImportacion();
	}
	public double getPrecioFinalPrenda(){
		return marcaPrenda.coeficienteMarca(precioOriginal());
	}
}
