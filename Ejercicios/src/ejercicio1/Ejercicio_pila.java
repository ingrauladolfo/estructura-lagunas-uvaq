package ejercicio1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import ejercicio2.Pila;

public class Ejercicio_pila 
{
	public static void main(String args[])
	{
		Pila pilaAñadir;
		Pila pilaQuitar;
		char letra,invertir;
		String pal;
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		try
		{
			pilaAñadir = new Pila();
			pilaQuitar = new Pila();
			System.out.print("Teclea una expresión: ");
			System.out.flush();
			pal = entrada.readLine();
			System.out.println("Te muestro la pila normal: ");
			for (int i = 0; i< pal.length();i++)
			{
				letra = pal.charAt(i);
				pilaAñadir.insertar(letra);
				System.out.println(i+" "+letra);
			}
			System.out.println("Te muestro la pila invertida: ");
			for (int i = 0; i< pal.length();i++)
			{
				letra = pal.charAt(i);
				System.out.println(i+" "+pilaAñadir.quitar(letra));
			}
		}
		catch (Exception er) 
		{
			System.err.println("Exception: " + er);
		}
	}
}
