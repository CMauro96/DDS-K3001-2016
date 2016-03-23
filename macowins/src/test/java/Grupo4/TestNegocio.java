package Grupo4;
import Grupo4.Negocio;
import Grupo4.Prenda;
import Grupo4.Venta;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
public class TestNegocio {
	private Prenda saco;
	private Venta unaVenta;
	private Venta unaVenta2;
	private Negocio macowins;
@Before

public void init(){
	saco=new Prenda(300);
	saco.setImportada(true);
	unaVenta= new Venta(saco,4);
	unaVenta2= new Venta(saco,10);
	macowins= new Negocio();
	macowins.setValorFijoNegocio(100);
	unaVenta.setPrecioFinal(macowins.precioFinal(saco));
	unaVenta2.setPrecioFinal(macowins.precioFinal(saco));
}
@Test
	public void creacionPrenda(){
		Assert.assertEquals(true, saco.isImportada());
	}
@Test
	public void pruebaVenta(){
	Assert.assertEquals("23/3/2016", unaVenta.getFecha());
	Assert.assertEquals(520, unaVenta.getPrecioFinal(),0);
}
@Test
	public void pruebaGanancia(){
	macowins.realizarVenta(saco, 4);
	macowins.realizarVenta(saco, 10);
	Assert.assertEquals(7280, macowins.gananciasDelDia("23/3/2016"), 0);
}
	
	
}
