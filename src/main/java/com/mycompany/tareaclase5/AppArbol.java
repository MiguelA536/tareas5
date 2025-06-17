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
    Scanner entrada = new Scanner(System.in);

    public void ejecutar1() {
        System.out.println("Árbol Binario: insertar 7 valores (ej. 50 30 40 50 60 70)");

        for (int i = 0; i < 7; i++) {
            System.out.println("Valor " + (i + 1) + ": ");
            int valor = entrada.nextInt();
            ab1.insertar(valor);
        }

        System.out.println("\n=== Recorridos del árbol ===");
        ab1.inorden();
        ab1.preorden();
        ab1.postorden();
    }
}
