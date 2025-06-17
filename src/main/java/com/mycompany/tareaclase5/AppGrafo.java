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
public class AppGrafo {
    Grafo grafo = new Grafo();
    Scanner sc = new Scanner(System.in);
    
    public void ejecutar2(){
        System.out.println("Grafo dirigido: Agregar conexiones entre nodos");

        System.out.println("¿Cuántas aristas deseas agregar?");

        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++){
            System.out.println("Origen: ");
            String origen = sc.nextLine();
            System.out.println("Destino: ");
            String destino = sc.nextLine();

            grafo.agregarArista(origen, destino);
        }

        System.out.println("\n=== Resultado del grafo ===");
        grafo.mostrar();
    }
}
