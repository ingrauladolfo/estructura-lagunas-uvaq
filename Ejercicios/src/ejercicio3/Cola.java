package ejercicio3;

import java.util.*;
public class Cola extends ArrayList
{
	public void encolar(Object dato)
	{
		if(dato != null)
		{
			
			this.add(dato);
		}
		else
		{
			System.out.println("Introduzca un dato no nulo");
		}  
	 }
	public void desencolar()
	{
		if(this.size() > 0)
		{
			this.remove(0);
		}
	}
	public Object frente()
	{
		Object datoAuxiliar = null;
		if(this.size() > 0)
		{
			datoAuxiliar = this.get(0);
		}
		return datoAuxiliar;  
	}
	 
	 //devuelve cierto si la pila está vacía o falso en caso contrario (empty).
	 public boolean vacia(){
	  return this.isEmpty();
	 }
	}