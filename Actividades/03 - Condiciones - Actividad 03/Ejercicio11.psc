Algoritmo Ejercicio11
	Definir cade Como Caracter;
	Definir num Como Real;
	
	Escribir "Ingrese un n�mero:";
	Leer cade;
	
	num = CONVERTIRANUMERO(cade);
	
	Si num <> 0 Entonces
		Si num % 2 = 0 Entonces
			Escribir "El n�mero es par";
		SiNo
			Escribir "El n�mero es impar";
		FinSi
	SiNo
		Escribir "La cadena ingresada no es un n�mero v�lido";
	FinSi
FinAlgoritmo
