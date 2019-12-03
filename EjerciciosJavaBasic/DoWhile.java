package com.softtek.java.academy.Exercises;

import java.util.Scanner;

public class DoWhile {
	public static void main(String ... args)
	{
		int bandera=0;
		do {
			
		Scanner  scanner = new Scanner(System.in);
	      System.out.println("Dame un primer numero: ");
	      int NumberOne= scanner.nextInt();
	      System.out.println("Dame un segundo numero: ");
	      int NumberTwo= scanner.nextInt();
	      int suma = NumberOne + NumberTwo;
	    System.out.println("La suma de los numeros =  " + suma );
	    System.out.println();
	    
	    System.out.println("Ingresa 0 para continuar,cualquier otro para terminar");
	    bandera = scanner.nextInt();
		}while(bandera==0);
	}
}
