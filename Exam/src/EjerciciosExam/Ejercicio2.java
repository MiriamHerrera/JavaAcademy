package EjerciciosExam;

import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Ingresa el primer numero entero: ");
		int n1 = entrada.nextInt();
		System.out.print("Ingresa el segundo numero entero: ");
		int n2 = entrada.nextInt();
		
		if(n1 > n2 && n1 < 21)
		
			System.out.println("El numero mas cercano a 21 es " + n1);
		
		else if(n2 > n1 && n2 < 21)
		
			System.out.println("El numero más cercano a 21 es " + n2);
		
		else if(n1 == n2 && n2 < 21)
			System.out.println("Ambos numeros son igual de cercanos: " + n2);
		else
			System.out.println("\n"+0);
	}
}
