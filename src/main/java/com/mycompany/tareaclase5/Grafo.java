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
public class Grafo {
        private Map<String, List<String>> adyacencias;

    public Grafo(){
        adyacencias = new HashMap<>();
    }

    public void agregarVertice(String vertice){
        adyacencias.putIfAbsent(vertice, new ArrayList<>());
    }

    public void agregarArista(String origen, String destino){
        if (!adyacencias.containsKey(origen)){
            agregarVertice(origen);
        }
        if(!adyacencias.containsKey(destino)){
            agregarVertice(destino);
        }
        adyacencias.get(origen).add(destino); //Solo una dirección (grafo dirigido)
    }

    public void mostrar() {
        System.out.println("Grafo dirigido:");
        // Creamos una lista de las claves y las ordenamos
        List<String> vertices = new ArrayList<>(adyacencias.keySet());
        Collections.sort(vertices);

        // Recorremos cada vértice ya ordenado
        for (String vertice : vertices) {
            List<String> adyacente = adyacencias.get(vertice);
            Collections.sort(adyacente);
            System.out.println("- " + vertice + " -> " + adyacente);
        }
    }

}
