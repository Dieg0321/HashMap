/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hashmap_hashset;

import java.util.HashMap;

public class EjemploHashMap {

    public static void main(String[] args) {
        // Crear un objeto HashMap
        HashMap<String, Integer> miHashMap = new HashMap<>();

        // Agregar elementos al HashMap
        miHashMap.put("Manzanas", 10);
          
        miHashMap.put("Naranjas", 5);
        miHashMap.put("Plátanos", 8);
        miHashMap.put("Peras", 3);
        miHashMap.put("Peras", 3);
        miHashMap.put("Peras", 3);
        miHashMap.put("Peras", 3);

        // Obtener el valor asociado a una clave
        int numManzanas = miHashMap.get("Manzanas");
        System.out.println("Numero de manzanas: " + numManzanas);

        // Actualizar el valor asociado a una clave
        miHashMap.put("Naranjas", 6);

        // Eliminar un elemento del HashMap
        miHashMap.remove("Plátanos");

        // Recorrer los elementos del HashMap
        for (String clave : miHashMap.keySet()) {
            int valor = miHashMap.get(clave);
            System.out.println(clave + ": " + valor);
        }
    }
}