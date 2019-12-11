/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio5;

public interface Ejercicio5_Interfaz {
    
    default void suma(int NumeroUno, int NumeroDos) 
    {
        int suma = NumeroUno + NumeroDos;
        System.out.println("Suma = " + suma);
    }
    default void resta(int NumeroUno, int NumeroDos) 
    {
        int resta = NumeroUno - NumeroDos;
        System.out.println("Resta = " + resta);
    }
    default void mult(int NumeroUno, int NumeroDos) 
    {
        int mult = NumeroUno * NumeroDos;
        System.out.println("Multiplicacion = " + mult);
    }
    default void div(int NumeroUno, int NumeroDos) 
    {
        int div = NumeroUno / NumeroDos;
        System.out.println("Division = "+ div);
    } 
}
