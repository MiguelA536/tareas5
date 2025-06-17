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
        adyacencias = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);
    }

    public void agregarVertice(String vertice){
        adyacencias.putIfAbsent(vertice, new ArrayList<>());
    }

    public void agregarArista(String origen, String destino){
        if (!adyacencias.containsKey(origen)) {
            agregarVertice(origen);
        }
        if (!adyacencias.containsKey(destino)) {
            agregarVertice(destino);
        }
        adyacencias.get(origen).add(destino);
    }

    public void mostrar(){
        System.out.println("Grafo dirigido:");
        for (String vertice : adyacencias.keySet()) {
            List<String> adyacente = adyacencias.get(vertice);
            adyacente.sort(String.CASE_INSENSITIVE_ORDER);
            System.out.println("- " + vertice + " -> " + adyacente);
        }
    }
}

