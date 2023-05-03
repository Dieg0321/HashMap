/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hashmap_hashset;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class EjemploHashMapBufferedReader {

    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        Map<String, Integer> mapa = new HashMap<>();
        
        System.out.println("Ingresa el número de elementos a agregar en el mapa:");
        int numElementos = Integer.parseInt(br.readLine());
        
        for (int i = 0; i < numElementos; i++) {
            System.out.println("Ingresa la clave del elemento " + (i+1) + ":");
            String clave = br.readLine();
            System.out.println("Ingresa el valor del elemento " + (i+1) + ":");
            int valor = Integer.parseInt(br.readLine());
            mapa.put(clave, valor);
        }
        
        System.out.println("Los elementos del mapa son:");
        for (Map.Entry<String, Integer> entrada : mapa.entrySet()) {
            System.out.println("Clave: " + entrada.getKey() + " Valor: " + entrada.getValue());
        }
        
        br.close();
    }
}