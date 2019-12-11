package EjerciciosExam;
import java.util.ArrayList;
import java.util.List;

public class Ejercicio4 {
	public static void main(String[] args) {

		int[] k={1,3,3};
		int[] j={1,6,3};
	
		List<Integer> lista = new ArrayList<Integer>();
		
		lista.add(0, k[1]);
		lista.add(1, j[1]);

		System.out.println(lista);
		
	}
}
