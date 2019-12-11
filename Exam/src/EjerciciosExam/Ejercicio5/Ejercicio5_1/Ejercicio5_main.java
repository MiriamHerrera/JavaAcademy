/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio5_1;

import Ejercicio5.Ejercicio5_Interfaz;

public class Ejercicio5_main implements Ejercicio5_Interfaz {
    public static void main(String[] args) {
        int NumeroUno = 30;
        int NumeroDos = 6;

        Ejercicio5_main Operaciones = new Ejercicio5_main();

        Operaciones.suma(NumeroUno, NumeroDos);
        Operaciones.resta(NumeroUno, NumeroDos);
        Operaciones.mult(NumeroUno, NumeroDos);
        Operaciones.div(NumeroUno, NumeroDos);
    }
}
