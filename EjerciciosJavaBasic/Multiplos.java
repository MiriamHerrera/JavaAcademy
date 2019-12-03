package com.softtek.java.academy.Exercises;

import java.util.Scanner;

public class Multiplos {
	public static void main(String ... args)
	{
		  Scanner  scanner = new Scanner(System.in);
	      System.out.println("Dame un numero del 1 al 100: ");
	      int numero= scanner.nextInt();
	      int suma = 0;
	      if(numero <= 100)
	      {
	    	  for(int i = 0 ; i<numero ; i++)
	    	  {
	    		  if(i % 5 ==0 || i % 3 == 0)
	    			  suma += i;
	    	  }
	    	  System.out.println("La suma de los multiplos de 3 y 5 hasta " + numero + " = " + suma);
	      }
	}
}
