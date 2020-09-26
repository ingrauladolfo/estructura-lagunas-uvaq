import java.util.ArrayList;
public class Pila extends ArrayList
{
	public void apilar(Object dato)
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
	public void desapilar()
	{
		if(size() > 0)
		{
			this.remove(this.size() - 1);
		}
	}
	public Object.cima()
	{
		Object datoAuxiliar = null;
		if(this.size() > 0)
		{
			datoAuxiliar = this.get(this.size() - 1)
		}
		return datoAuxiliar;
	}
	public boolean vacia()
	{
		return this.isEmpty();
	}
	public Ejercicio2()
	{
		public Pila pila1 = new Pila();
		public Pila pila2 = new Pila();
		public char letra;
		public char letras[24];
		public char signos[6];
		public int i =;
		public boolean salir;
		salir = False;
	}
}