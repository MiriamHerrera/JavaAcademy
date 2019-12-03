import java.util.Scanner;
//9,10 = Sobresaliente
// 7,8 = Notable
// 6 = Bien
// 5 = Aprobado
// 0-4 = Suspenso

public class MarcaNumerica
{
  public static void main (String[]args)
  {
        Scanner  scanner = new Scanner(System.in);
	    System.out.println("Ingresa su marca numerica: ");
	    int marca= scanner.nextInt();
	    
	    if (marca == 9 || marca == 10)
	        System.out.println("Sobresaliente ");
            else if (marca == 7 || marca == 8)
                System.out.println("Notable ");
                else if (marca == 6 )
                    System.out.println("Bien ");
                    else if (marca == 5)
                        System.out.println("Aprobado ");
                        else if (marca == 4 || marca == 0 )
                            System.out.println("Suspenso ");
  }
}