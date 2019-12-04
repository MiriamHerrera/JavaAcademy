public class TiposDeDatos
 {
	public static void main (String[] args)
	{
		int edad = 18;
		short peso = 70;
		String nombre = "Miriam";
		boolean esVip = false;
		boolean tieneCredencial = false;
		boolean puedoVotar = ((edad >= 18) && (tieneCredencial == true));
		
		System.out.println("Edad: " + edad);
		System.out.println("Peso: " + peso);
		System.out.println("Nombre: " + nombre);
		System.out.println("Es Vip: " + esVip);
		System.out.println("Tiene credencial: " + tieneCredencial);
		System.out.print( "¿Puedo votar?: "   + puedoVotar);
	}

}