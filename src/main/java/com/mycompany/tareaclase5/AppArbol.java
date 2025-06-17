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
public class AppArbol {
    ArbolBinario ab1 = new ArbolBinario();
    Scanner entrada;

    AppArbol(Scanner entrada) {
        this.entrada = entrada;
    }

    public void ejecutar1(){
        System.out.println("Árbol Binario: insertar 7 nombre(s)");
        for(int i = 0; i < 7; i++) {
            System.out.print("Valor " + (i+1) + ": ");
            String valor = entrada.nextLine();
            ab1.insertar(valor);
        }

        System.out.println("\n=== Recorridos del árbol ===");

        ab1.inorden();
        System.out.println("\n");
        ab1.preorden();
        System.out.println("\n");
        ab1.postorden();
    }
}



