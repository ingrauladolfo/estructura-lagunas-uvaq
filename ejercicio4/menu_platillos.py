menu = 0
platillo = " "
ingrediente1 = " "
ingrediente2 = " "
ingrediente3 = " "
ingrediente_buscar = " "
platillo_eliminar = " "
platillos = []
ingredientes = []
bandera = True

while(bandera == True):
	menu = int(input("Dame un número \n 1.- Agregar platillo \n 2.- Buscar ingrediente \n 3.- Eliminar platillo \n 4.- Salir:\n"))
	if(menu == 1):
		platillo = input("Dame el nombre del platillo:\n")
		ingrediente1 = input("Dame el nombre de tu primer ingrediente:\n")
		ingrediente2 = input("Dame el nombre de tu segundo ingrediente:\n")
		ingrediente3 = input("Dame el nombre de tu tercer ingrediente:\n")
		platillos.extend([platillo])
		n = platillos.index(platillo)
		ingredientes.extend([n,ingrediente1,ingrediente2,ingrediente3])
		print(platillos)
		print(ingredientes)
	elif(menu == 2):
		ingrediente_buscar = input("Dame el ingrediente a buscar:\n")
		n_ingrediente = int(ingredientes.index(ingrediente_buscar) / 4)
		print("El ingrediente "+ ingrediente_buscar+" pertenece al platillo "+ platillos[n_ingrediente])
	elif(menu == 3):
		platillo_eliminar = input("Dame el platillo a eliminar:\n")
		eliminar_platillo = platillos.index(platillo_eliminar)
		platillos.remove(platillo_eliminar)
		eliminar_ingrediente = ingredientes.index(eliminar_platillo)
		ingredientes.pop(ingredientes.index(eliminar_platillo)+3)
		ingredientes.pop(ingredientes.index(eliminar_platillo)+2)
		ingredientes.pop(ingredientes.index(eliminar_platillo)+1)
		ingredientes.pop(ingredientes.index(eliminar_platillo))
		print("Te muestro la nueva lista:")
		print (platillos)
		print(ingredientes)
	else:
		break