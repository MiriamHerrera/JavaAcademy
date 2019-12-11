package EjerciciosExam;
import java.util.Scanner;

public class Ejercicio3 {
 public static void main(String[] args) 
 {
	Scanner entrada = new Scanner(System.in);
	
	System.out.print("Ingresa una palabra: ");
	String cadena = entrada.nextLine();
	
	int i = 0;
	int j = cadena.length()-1;
	boolean bandera = true;
	
	while ((i<j) && (bandera))
	{
		if(cadena.length()-1<50) {
			if (cadena.charAt(i)==cadena.charAt(j))
			{				
				i++;
				j--;
			}
			else
			{
				bandera = false;
			}		
		}
	}
	 if (bandera)
		System.out.println("Si");
	else
		System.out.println("No");
 }
}
