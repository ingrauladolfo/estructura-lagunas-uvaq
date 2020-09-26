liist = []
pedir = 1
intercambio = 0
i = 0
j = 0
bandera = True
tam = 0
while(bandera == True):
	pedir = int(input("Dame un número o -1 para salir:\n"))
	if(pedir != -1):
		liist.append(pedir)
	else:
		break
print("Te muestro la lista, tal cual, me la diste:\n"+str(liist))
for i in range(0,len(liist)-1):
	for j in range(i,len(liist)):
		if(liist[i] > liist[j]):
			intercambio = liist[j]
			liist[j] = liist[i]
			liist[i] = intercambio
		else:
			liist[i] = liist[i]
			liist[j] = liist[j]
print("Te muestro la lista ya ordenada:\n"+str(liist))