/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tareaclase5;
import java.util.*;

/**
 *
 * @author migue
 */
public class Menu {

    public void ejecutar() {
        Scanner entrada = new Scanner(System.in);
        int opcion;

        do {

            System.out.println("\n__Aquí estan las actividades de hoy__");
            System.out.println("1.- Para ver lo relacionado al grafo alfabético");
            System.out.println("2.- Para ver el programa relacionado al arbol binario");
            System.out.println("3 para salir");

            try {
                opcion = entrada.nextInt();
                switch (opcion) {
                    case 1:
                        System.out.println("El arbol alfabético no necesita un destino, ya que ordenará los elementos de manera alfabética");
                        System.out.println("La relación que hay el su propio orden alfabético");
                        AppGrafo apg1 = new AppGrafo();
                        apg1.ejecutar2();
                        break;
                    case 2:
                        System.out.println("E");
                        AppArbol aA1 = new AppArbol();
                        //aA1.ejecutar();
                        break;
                    case 3:
                        System.out.println("Hasta luego");
                        break;

                    default:
                        System.out.println("Opción no válida.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes ingresar un número entero.");
                entrada.next();
                opcion = 0;
            }
        } while (opcion != 3);
    }
}
