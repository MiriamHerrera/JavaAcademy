package EjerciciosExam;

import java.util.Scanner;

public class Ejercicio1 {
	
	public static void main(String[] args) {
		int mult=0;
		Scanner entrada = new Scanner(System.in);
		System.out.print("Ingresa un numero entero: ");
		int n = entrada.nextInt();
		for (int i = 1; i <= 10 ; i++) {
			mult = n * i;
			System.out.println(n + " x " + i + " = " + mult);
		}	
	}
}
