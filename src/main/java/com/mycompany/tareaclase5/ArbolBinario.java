/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tareaclase5;

/**
 *
 * @author migue
 */
public class ArbolBinario {
    // Raíz del árbol
    private Nodo raiz;

    // Insertar un nuevo valor
    public void insertar(String valor) {
        raiz = insertarRecursivo(raiz, valor);
    }

    // Función recursiva para insertar el nuevo valor
    private Nodo insertarRecursivo(Nodo nodo, String valor) {
        if (nodo == null) {
            return new Nodo(valor);
        }
        if (valor.compareToIgnoreCase(nodo.valor) < 0) {
            nodo.izquierda = insertarRecursivo(nodo.izquierda, valor);
        } else if (valor.compareToIgnoreCase(nodo.valor) > 0) {
            nodo.derecha = insertarRecursivo(nodo.derecha, valor);
        }
        return nodo;
    }

    // Recorrido inorden
    public void inorden(){
        System.out.println("Recorrido inorden: ");
        inordenRec(raiz);
        System.out.println();
    }
    
    private void inordenRec(Nodo nodo){
        if (nodo != null){
            inordenRec(nodo.izquierda);
            System.out.print(nodo.valor + "   ");
            inordenRec(nodo.derecha);
        }
    }

    // Recorrido preorden
    public void preorden(){
        System.out.println("Recorrido preorden: ");
        preordenRec(raiz);
        System.out.println();
    }

    private void preordenRec(Nodo nodo){
        if (nodo != null){
            System.out.print(nodo.valor + "   ");
            preordenRec(nodo.izquierda);
            preordenRec(nodo.derecha);
        }
    }

    // Recorrido postorden
    public void postorden(){
        System.out.println("Recorrido postorden: ");
        postordenRec(raiz);
        System.out.println();
    }

    private void postordenRec(Nodo nodo){
        if (nodo != null){
            postordenRec(nodo.izquierda);
            postordenRec(nodo.derecha);
            System.out.print(nodo.valor + "   ");
        }
    }
}
