Algoritmo Ejercicio12
    Definir precioOriginal, porcentajeDescuento, descuento, precioFinal como Real;
	
    Escribir "Ingrese el precio original de la compra: ";
    Leer precioOriginal;
	
    Escribir "Ingrese el porcentaje de descuento: ";
    Leer porcentajeDescuento;
	
    Si porcentajeDescuento >= 0 Y porcentajeDescuento <= 100 Entonces
        descuento = precioOriginal * porcentajeDescuento / 100;
        precioFinal = precioOriginal - descuento;
        Escribir "El descuento aplicado es: ", descuento;
        Escribir "El precio final con descuento es: ", precioFinal;
    Sino
        Escribir "El porcentaje de descuento ingresado no es válido";
    FinSi
FinAlgoritmo
