package Grupo4;

import java.util.Calendar;

public class Venta {
	private Prenda p1;
	private int cantidad;
	private String fecha;
	private float precioFinal;

	public Venta(Prenda p1, int cantidad) {
		super();
		this.p1 = p1;
		this.cantidad = cantidad;
		this.fecha = calcularFecha();
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
	private String calcularFecha(){
		Calendar c1 = Calendar.getInstance();
		String dia = Integer.toString(c1.get(Calendar.DATE));
		String mes = Integer.toString((c1.get(Calendar.MONTH)+1));
		String anio = Integer.toString(c1.get(Calendar.YEAR));
		return dia+"/"+mes+"/"+anio;
		
	}
	public void setPrecioFinal(float precioTotal) {
		this.precioFinal=precioTotal;
		
	}
	public float getPrecioFinal() {
		return precioFinal;
	}
}
