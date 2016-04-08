package Grupo4;
import Grupo4.Negocio;
import Grupo4.Prenda;

import java.util.Calendar;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
public class TestNegocio {
	private Prenda saco;
	private Negocio macowins;
@Before
public void init(){
	saco=new Prenda(new Saco(3));
	saco.setImportada(true);
	macowins= new Negocio();
	macowins.realizarVenta(saco, 10);
	macowins.realizarVenta(saco, 4);
}
@Test
	public void creacionPrenda(){
		Assert.assertEquals(true, saco.isImportada());
	}
@Test
	public void pruebaGanancia(){
	Assert.assertEquals(7826, macowins.gananciasDelDia(calcularFecha()), 0);
}
private String calcularFecha(){
	Calendar c1 = Calendar.getInstance();
	String dia = Integer.toString(c1.get(Calendar.DATE));
	String mes = Integer.toString((c1.get(Calendar.MONTH)+1));
	String anio = Integer.toString(c1.get(Calendar.YEAR));
	return dia+"/"+mes+"/"+anio;
	
}
	
	
}
