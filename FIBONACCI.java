package fibonacci;

import java.util.Scanner;

public class FIBONACCI {

    public static void main(String[] args) {
	System.out.println("BIENVENIDO A TU MUESTREO DE FIBONACCI");
	    Scanner leer = new Scanner(System.in);
	System.out.println("Escribe el numero de números de la secuencia de fibonacci que quieres obtener");
	int secuencia;
	secuencia = leer.nextInt();
	int numeroAnterior = 0;
	int numeroActual = 1;
	System.out.println("Los " + secuencia + " primeros números de la secuencia Fibonacci son:");

	for (int i = 0; i <= secuencia; i++) {

	    System.out.println(numeroAnterior + " ");
		int siguientenumero = numeroAnterior + numeroActual;
		numeroAnterior = numeroActual;
		numeroActual = siguientenumero;
	}// for

    }//main    

}// clase
