package Grupo4;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//Macowins

public class Negocio 
{		
	List <Venta> ventas=new ArrayList<>();
	private float valorFijoNegocio;
    public float precioFinal(Prenda unaPrenda){
    		float precioFinal= unaPrenda.getPrecioBase() + valorFijoNegocio;
    		if(unaPrenda.isImportada())
    		{
    			return  (float) (precioFinal*(1.3));
    		}
    		else{
    			return precioFinal;
    		}
    }
    
    
    public float getValorFijoNegocio() {
		return valorFijoNegocio;
	}
	public void setValorFijoNegocio(float valorFijoNegocio) {
		this.valorFijoNegocio = valorFijoNegocio;
	}
	public void realizarVenta(Prenda unaPrenda,int cantidad){
    	Venta unaVenta= new Venta(unaPrenda,cantidad);
    	float precioTotal= precioFinal(unaPrenda);
    	unaVenta.setPrecioFinal(precioTotal);
    	registrarVenta(unaVenta);
    }
    public void registrarVenta(Venta unaVenta){
    	ventas.add(unaVenta);
    }
    public float gananciasDelDia(String fecha){ //Formato Fecha dd/m/aaaa
    	List <Venta> ventasDelDia=new ArrayList<>();
    	float ganancia;
    	ventasDelDia=ventas.stream().filter(unaVenta->unaVenta.getFecha().equals(fecha)).collect(Collectors.toList());
    	ganancia=(float) ventasDelDia.stream().mapToDouble(unaVenta->(unaVenta.getPrecioFinal())*(unaVenta.getCantidad())).sum();
    	return ganancia;
    }
}
