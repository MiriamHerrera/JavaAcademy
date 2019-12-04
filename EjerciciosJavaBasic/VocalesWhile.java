public class VocalesWhile
{
	public static void main(String[] args)
	{
		String cadena = args[0];
		int contador = 0 ;
		for(int i=0; i < cadena.length(); i++)
		{
			char subcadena = cadena.charAt(i);
			
			if (cadena.charAt(i) == 'a' || cadena.charAt(i) == 'e' || cadena.charAt(i) == 'i' || cadena.charAt(i) == 'o' || cadena.charAt(i) == 'u' || cadena.charAt(i) == 'A' || cadena.charAt(i) == 'E' || cadena.charAt(i) == 'I' || cadena.charAt(i) == 'O' || cadena.charAt(i) == 'U')
			{
				contador ++;
			}		
		}
			System.out.println("La palabra tiene " + contador + " vocales");

	}
}