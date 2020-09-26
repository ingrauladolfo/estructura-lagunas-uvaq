package ejercicio2;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Ejercicio_pila
{
	public static void main(String args[])
	{
		Pila pilaLetra;
		Pila pilaSigno;
		char letra,signo;
		String pal;
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		try
		{
			pilaLetra = new Pila();
			pilaSigno = new Pila();
			System.out.print("Teclea una expresión: ");
			System.out.flush();
			pal = entrada.readLine();
			for (int i = 0; i< pal.length();i = i+2)
			{
				if(i != pal.length())
				{
					letra = pal.charAt(i);
					pilaLetra.insertar(letra);
				}
				if(i+1 != pal.length())
				{
					signo = pal.charAt(i+1);
					pilaSigno.insertar(signo);
				}
			}
			if(pilaLetra.tamaño()-1 == pilaSigno.tamaño())
			{
				System.out.println("Expresión correcta");
			} 
			else
			{
				System.out.println("Expresión incorrecta");
			}
			
		}
		catch (Exception er) 
		{
			System.err.println("Exception: " + er);
		}
	}
}