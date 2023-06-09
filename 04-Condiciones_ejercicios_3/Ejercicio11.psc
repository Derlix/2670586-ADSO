Algoritmo Ejercicio11
	Definir cade Como Caracter;
	Definir num Como Real;
	
	Escribir "Ingrese un número:";
	Leer cade;
	
	num = CONVERTIRANUMERO(cade);
	
	Si num <> 0 Entonces
		Si num % 2 = 0 Entonces
			Escribir "El número es par";
		SiNo
			Escribir "El número es impar";
		FinSi
	SiNo
		Escribir "La cadena ingresada no es un número válido";
	FinSi
FinAlgoritmo
