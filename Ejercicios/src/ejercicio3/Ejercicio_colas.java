package ejercicio3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import javax.swing.JOptionPane;

import ejercicio2.Pila;

public class Ejercicio_colas 
{
	public static void main(String[] args)
	{
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		Cola tails = new Cola();
		char dato;
		Object proceso;
		String pal;
		int nucleos = 0;
		try
		{
			Cola nucleo0 = new Cola();
			Cola nucleo1 = new Cola();
			Cola nucleo2 = new Cola();
			Cola nucleo3 = new Cola();
			System.out.print("Teclea los procesos: ");
			System.out.flush();
			pal = entrada.readLine();
			for(int i = 0; i < pal.length();i++)
			{
				dato = pal.charAt(i);
				tails.encolar(dato);
				System.out.println(i+" "+dato);
			}
			for(int i = 0; i < pal.length();i++)
			{
				switch (nucleos)
				{
					case 0:
						dato = (char) tails.frente();
						nucleo0.encolar(dato);
						tails.desencolar();
						nucleos++;
						break;
					case 1:
						dato = (char) tails.frente();
						nucleo1.encolar(dato);
						tails.desencolar();
						nucleos++;
						break;
					case 2:
						dato = (char) tails.frente();
						nucleo2.encolar(dato);
						tails.desencolar();
						nucleos++;
						break;
					case 3:
						dato = (char) tails.frente();
						nucleo3.encolar(dato);
						tails.desencolar();
						nucleos = 0;
						break;
				}
			}
			System.out.println("Procesos del núcleo 0: ");
			do
			{
				System.out.println(nucleo0.frente());
				nucleo0.desencolar();
			}while(nucleo0.size() != 0);
			System.out.println("Procesos del núcleo 1: ");
			do
			{
				System.out.println(nucleo1.frente());
				nucleo1.desencolar();
			}while(nucleo1.size() != 0);
			System.out.println("Procesos del núcleo 2: ");
			do
			{
				System.out.println(nucleo2.frente());
				nucleo2.desencolar();
			}while(nucleo2.size() != 0);
			System.out.println("Procesos del núcleo 3: ");
			do
			{
				System.out.println(nucleo3.frente());
				nucleo3.desencolar();
			}while(nucleo3.size() != 0);
		}
			catch (Exception er) 
			{
				System.err.println("Exception: " + er);
			}
	}

}
