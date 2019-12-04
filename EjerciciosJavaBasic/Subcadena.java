public class Subcadena
{
	public static void main(String[] args)
	{
		if (args.length > 0){
			String cadenaOriginal = args[0];
			String subcadena = "";
			if(cadenaOriginal.length() < 2)
			{
				System.out.println(cadenaOriginal);
			}
			else
			{
				subcadena = cadenaOriginal.substring(0,1);
				System.out.println("La subcadena es: " + subcadena);
			}		
		}
		else
		{
			System.out.println("Gracias por participar.");
		}
	}
}