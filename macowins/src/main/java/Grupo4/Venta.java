package Grupo4;

public class Venta {
	private Prenda p1;
	private int cantidad;
	private String fecha;
	private float precioFinal;

	public Venta(Prenda p1, int cantidad, String fecha) {
		super();
		this.p1 = p1;
		this.cantidad = cantidad;
		this.fecha = fecha;
	}
	public Prenda getP1() {
		return p1;
	}
	public void setP1(Prenda p1) {
		this.p1 = p1;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public void setPrecioFinal(float valorNegocio) {
		this.precioFinal=cantidad*(p1.getPrecioFinalPrenda(valorNegocio));
	}
	public float getPrecioFinal() {
		return precioFinal;
	}
}
