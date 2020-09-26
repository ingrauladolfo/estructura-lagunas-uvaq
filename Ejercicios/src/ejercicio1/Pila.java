package ejercicio1;

import java.util.ArrayList;

public class Pila 
{
	public static final int TAMPILA = 10000;
	public int cima;
	public char []listaPila;
	public Pila()
	{
		cima = -1;
		listaPila= new char[TAMPILA];
	}

	public void insertar(char elemento) throws Exception
	{
		if (pilaLlena())
		{
			throw new Exception("Desbordamiento pila");
		}
		cima++;
		listaPila[cima] = elemento;
		System.out.println(listaPila[cima]);
	}

	public char quitar(char ch) throws Exception
	{
		char aux;
		if (pilaVacia())
		{
			throw new Exception ("La pila está vacía, no se puede extraer");
		}
		aux = listaPila[cima];
		cima--;
		return (aux);
	}

	public boolean pilaVacia()
	{
		return cima == -1;
	}

	public boolean pilaLlena()
	{
		return cima == TAMPILA-1;
	}
	public int tamaño() throws Exception
	{
		if (pilaLlena())
		{
			throw new Exception("Desbordamiento pila");
		}
		return cima++;
	}
	public char mostrar (char elemento) throws Exception
	{
		listaPila[cima] = elemento;
		return listaPila[cima];
	}
}
