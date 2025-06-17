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

    // Dentro de Menu:

    private Scanner entrada = new Scanner(System.in);

    public void ejecutar() {
        int opcion = 0;

        do {
            System.out.println("\n__Aquí están las actividades de hoy__");

            System.out.println("1.- Para el Grafo.");
            System.out.println("2.- Árbol.");
            System.out.println("3.- Salir.");

            try {
                opcion = Integer.parseInt(entrada.nextLine()); // leer como línea y parsear
                switch (opcion) {
                    case 1:
                        AppGrafo apg = new AppGrafo();
                        apg.ejecutar2();
                        break;

                    case 2:
                        AppArbol aA = new AppArbol(entrada);
                        aA.ejecutar1();
                        break;

                    case 3:
                        System.out.println("Hasta luego.");
                        break;

                    default:
                        System.out.println("Valor no válido.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Valor no válido.");
            }
        } while (opcion != 3);

        entrada.close();
    }

}
