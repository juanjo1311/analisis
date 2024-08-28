package com.mycompany.numerosaleatorios;

import java.util.*;

public class NumerosAleatorios {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el tamaño de la matriz (m): ");
        int m = scanner.nextInt();
        

        int[][] matriz = new int[m][m];
        

        Random random = new Random();

        long startTime = System.currentTimeMillis();
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                matriz[i][j] = random.nextInt(100); 
            }
        }

        long endTime = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;
        

        System.out.println("Matriz de números aleatorios:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
//                System.out.print(matriz[i][j] + "\t"); 
            }
//            System.out.println();
        }
        
        System.out.println("Tiempo de ejecución: " + elapsedTime + " milisegundos");
        scanner.close();
    }
}
