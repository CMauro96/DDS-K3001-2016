package Grupo4;

public class Sarkany implements Marca {
	
	public double coeficienteMarca(double precioOriginal)
	{
		if (precioOriginal>=500) {
			return (precioOriginal*1.35);
		}
		
		return (precioOriginal*1.10);
		
	}	

}
