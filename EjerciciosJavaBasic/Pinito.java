package com.softtek.java.academy.Exercises;
import java.util.Scanner;

public class Pinito {
	public static void main(String ... args)
	{
		  Scanner  scanner = new Scanner(System.in);
	      System.out.println("Dame un numero del 1 al 10: ");
	      int longitud= scanner.nextInt();
	      if (longitud <= 10) {
	    	  for(int i = longitud; i > 0 ; i--)
	    	  {
	    		  for(int j = 0; j < i ; j++) 
	    		  {
	    			  System.out.print("*");
	    		  }
	    		  System.out.println();
	    	  }
	      }
	}
}
