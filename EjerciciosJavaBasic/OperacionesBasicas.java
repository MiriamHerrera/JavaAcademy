import java.util.Scanner;

public class OperacionesBasicas
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingresa el primer numero :  ");
		int numero1 = scanner.nextInt();
	
		System.out.println("Ingresa el segundo numero :  ");
		int numero2 = scanner.nextInt();
		
		double suma = numero1 + numero2;
		double resta = numero1 - numero2;
		double mult = numero1 * numero2;
		double division = numero1 / numero2;
		
		System.out.println("Suma: " + suma );
		System.out.println("resta: " + resta );
		System.out.println("multiplicacion: " + mult );
		System.out.println("division:  " +  division);
	}
}