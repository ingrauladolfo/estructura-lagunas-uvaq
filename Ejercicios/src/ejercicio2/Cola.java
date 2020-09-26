package ejercicio2;

public class Cola 
{
	char Cola[];
	int Frente;
	int Final;
	int Nulo;
	int max_cola = 50;
	public void Colita()
	{
		Cola = new char[max_cola+1];
		max_cola = max_cola-1;
		Nulo = -1;
		Frente = Nulo;
		Final = Nulo;
	}

	
	public void Meter(char Elemento)
	{
		if((Frente == 0 && Final == max_cola)||(Frente == (Final + 1)))
		{
			System.out.println("Desbordamiento de memoria");
			return;
		}
		else
		{
			if(Frente == Nulo)
			{
				Frente = 0;
				Final = 0;
			}
			else if(Final == max_cola)
			{
				Final = 0;
			}
			else
			{
				Final += 1;
			}
			Cola[Final]=Elemento;
		}
	}

	public char Sacar(char ch)
	{
		char aux;
		if(Frente == Nulo)
		{
			System.out.println("Cola Vacia");
			return 0;
		}else
		{
			aux = Cola[Frente];
			if(Frente == Final)
			{
				Frente = Nulo;
				Final= Nulo;
			}
			else if(Frente == max_cola)
			{
				Frente = 0;
			}
			else
			{
				Frente += 1;
			}
	return aux;
		}
	}

}
