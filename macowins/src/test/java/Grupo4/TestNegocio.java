package Grupo4;

import Grupo4.Negocio;
import Grupo4.Prenda;
import Grupo4.Venta;

import java.util.Calendar;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestNegocio {
	private Prenda saco;
	private Negocio macowins;
	private Venta venta;
	private Venta venta2;

	@Before
	public void init() {
		saco = new Prenda(new Saco(3), new Sarkany());
		saco.setImportada(true);
		macowins = new Negocio();
		venta = new Venta(saco, 4, calcularFecha());
		venta2 = new Venta(saco, 0, calcularFecha());
		macowins.realizarVenta(saco, 10);
		macowins.realizarVenta(saco, 4);
	}

	@Test
	public void creacionPrenda() {
		Assert.assertEquals(true, saco.isImportada());
	}

	@Test
	public void pruebaGanancia() {
		Assert.assertEquals(10565, macowins.gananciasDelDia(calcularFecha()), 0.2);
	}

	@Test
	public void precioPrenda() {
		Assert.assertEquals(754.6, saco.getPrecioFinalPrenda(), 0.2);
	}

	@Test
	public void precioFinalVenta() {
		Assert.assertEquals(3018.4, venta.getPrecioFinal(), 0.3);
	}

	@Test
	public void ventaQueNoDeberiaHacerse() {// No deberia poder hacerse una
											// venta de cantidad 0, osea, fui a
											// mirar y no compre (?)
		Assert.assertEquals(0, venta2.getPrecioFinal(), 0.3);
	}

	private String calcularFecha() {
		Calendar c1 = Calendar.getInstance();
		String dia = Integer.toString(c1.get(Calendar.DATE));
		String mes = Integer.toString((c1.get(Calendar.MONTH) + 1));
		String anio = Integer.toString(c1.get(Calendar.YEAR));
		return dia + "/" + mes + "/" + anio;

	}

}
