import java.util.Scanner;
//9,10 = Sobresaliente
// 7,8 = Notable
// 6 = Bien
// 5 = Aprobado
// 0-4 = Suspenso

public class MarcaNumericaSwitch
{
  public static void main (String[]args)
  {
        Scanner  scanner = new Scanner(System.in);
	    System.out.println("Ingresa su marca numerica: ");
	    int marca= scanner.nextInt();
	    
	    switch(marca)
	    {
	        case 9:
	        case 10:
	            System.out.println("Sobresaliente ");
	        break;
	        case 7:
	        case 8:
	            System.out.println("Notable ");
	        break;
	        case 6:
	             System.out.println("Bien ");
	        break;
	        case 5:
	            System.out.println("Aprobado ");
	        break;
	        case 0:
	        case 1:
	        case 2:
	        case 3:
	        case 4:
	            System.out.println("Suspenso ");
	        break;
	    }
  }
}