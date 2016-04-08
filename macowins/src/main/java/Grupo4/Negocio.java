package Grupo4;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.stream.Collectors;

//Macowins

public class Negocio {
	List<Venta> ventas = new ArrayList<>();

	public double precioFinal(Prenda unaPrenda) {
		return unaPrenda.getPrecioFinalPrenda();
	}

	public void realizarVenta(Prenda unaPrenda, int cantidad) {
		String fecha = calcularFecha();
		Venta unaVenta = new Venta(unaPrenda, cantidad, fecha);
		this.registrarVenta(unaVenta);
	}

	private void registrarVenta(Venta unaVenta) {
		ventas.add(unaVenta);
	}

	public double gananciasDelDia(String fecha) { // Formato Fecha dd/m/aaaa
		List<Venta> ventasDelDia = new ArrayList<>();
		double ganancia;
		ventasDelDia = ventas.stream().filter(unaVenta -> unaVenta.getFecha().equals(fecha))
				.collect(Collectors.toList());
		ganancia = ventasDelDia.stream().mapToDouble(unaVenta -> (unaVenta.getPrecioFinal())).sum();
		return ganancia;
	}

	private String calcularFecha() {
		Calendar c1 = Calendar.getInstance();
		String dia = Integer.toString(c1.get(Calendar.DATE));
		String mes = Integer.toString((c1.get(Calendar.MONTH) + 1));
		String anio = Integer.toString(c1.get(Calendar.YEAR));
		return dia + "/" + mes + "/" + anio;
	}
}
