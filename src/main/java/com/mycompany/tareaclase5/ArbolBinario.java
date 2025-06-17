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
    //Es una variable privada llamada raiz de la case Nodo 
    private Nodo raiz;

    //Método donde se va a insertar el valor de raiz dentro de nuestra lógica de árbol binario
    public void insertar (int valor){
        raiz = instarRecursivo (raiz, valor);
    }

    //Método de logica de nuestro árbol binario
    private Nodo instarRecursivo(Nodo nodo, int valor){
        if (nodo == null){
            return  new Nodo (valor);
        }
        if (valor < nodo.valor){
            nodo.izquierda = instarRecursivo(nodo.izquierda, valor);
        } else if (valor > nodo.valor) {
            nodo.derecha = instarRecursivo(nodo.derecha, valor);
        }
        return nodo;
    }

    //Lógica de funcionamiento de busqueda inorden dentro de árbol binario
    public void inorden(){
        System.out.println("Recorrido inorden: ");
        inordenRec(raiz);
        System.out.println();
    }
    
    private void inordenRec(Nodo nodo){
        if (nodo != null){
            inordenRec(nodo.izquierda);
            System.out.println(nodo.valor + " ");
            inordenRec(nodo.derecha);
        }
    }

    //Lógica de funcionamiento de busqueda preorden dentro de árbol binario
    public void preorden(){
        System.out.println("recorrido preorden: ");
        preordenRec(raiz);
        System.out.println();
    }

    private void preordenRec(Nodo nodo){
        if (nodo != null){
            System.out.println(nodo.valor + " ");
            preordenRec(nodo.izquierda);
            preordenRec(nodo.derecha);
        }
    }

    //Lógica de funcionamiento de busqueda postorden dentro de árbol binario
    public void postorden(){
        System.out.println("Recorrido postorden: ");
        postordenRec(raiz);
        System.out.println();
    }

    private void postordenRec(Nodo nodo){
        if (nodo != null){
            postordenRec(nodo.izquierda);
            postordenRec(nodo.derecha);
            System.out.println(nodo.valor + " ");
        }
    }
}
