Algoritmo sin_titulo
	Definir i Como Entero
	Definir v1 Como Real
	Definir v2 Como Real
	Dimension v1[4]
	Dimension v2[4]
	
	
	Para i<-1 Hasta 4  Con Paso 1 hacer 
		Escribir i,'digite el componente A'
		Leer v1[i]
	FinPara
	
	Para i<-1 Hasta 4  Con Paso 1 hacer 
		Escribir i,'digite el componente B'
		Leer v2[i]
	FinPara
	
	Para i<-1 Hasta 2  Con Paso 1 hacer 
		suma_a <- v1[i]+v2[i]
		Para i<-2 Hasta 3  Con Paso 1 hacer 
			suma_b <- v1[i]+v2[i] 
			Para i<-3 Hasta 4  Con Paso 1 hacer 
				suma_c <- v1[i]+v2[i]
				Para i<-1 Hasta 4 Con Paso 1 hacer 
					suma_d <- v1[i]+v2[i]
				FinPara
				
			FinPara
			
		FinPara
	FinPara
	
	
	Escribir  'A+B :[",suma_a,"]","[",suma_b,"],[",suma_c,"]","[",suma_d,"] " 
	
	
FinAlgoritmo
