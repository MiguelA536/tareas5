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

    public void ejecutar2() {
        System.out.println("Ingrese cuántos vértices deseas agregar:");
        int n = sc.nextInt();
        sc.nextLine();

        List<String> nombreVertices = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese nombre del vértice " + (i + 1) + ": ");
            System.out.println("Preferentemente ingrese la primer letra Mayúscula con fines estéticos");
            nombreVertices.add(sc.nextLine().trim()); //Eliminar espacios
        }

        // Ordenamos alfabéticamente sin considerar mayúsculas
        Collections.sort(nombreVertices, String.CASE_INSENSITIVE_ORDER);

        // Agregamos vértice y arista hacia el siguiente
        for (int i = 0; i < nombreVertices.size(); i++) {
            String origen = nombreVertices.get(i);
            grafo.agregarVertice(origen);
            if (i < nombreVertices.size() - 1) {
                String destino = nombreVertices.get(i + 1);
                grafo.agregarArista(origen, destino);
            }
        }

        System.out.println("\n=== Resultado del Grafo ===");

        // Finalmente lo mostramos
        grafo.mostrar();
    }


}
