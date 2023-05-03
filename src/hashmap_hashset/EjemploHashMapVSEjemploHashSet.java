/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hashmap_hashset;

import java.util.HashSet;
import java.util.HashMap;

public class EjemploHashMapVSEjemploHashSet {

    public static void main(String[] args) {

        ///////////////////HashSet//////////////////////////////////
System.out.println("\n EJEMPLO: HashSet \n");

        
        HashSet<Integer> conjunto = new HashSet<>();

        conjunto.add(1);
        conjunto.add(2);
        conjunto.add(3);
        conjunto.add(1);

        System.out.println("Tamano: "+conjunto.size()); // 3
        System.out.println("contiene 1?: "+conjunto.contains(1)); // true
        System.out.println("contiene 4?: "+conjunto.contains(4)); // false

        conjunto.remove(2);

        System.out.println("Nuevo Tamano: "+conjunto.size()); // 2    

        ///////////////////HashSet//////////////////////////////////
        System.out.println("\n EJEMPLO: HashMap \n"); 

        
        HashMap<String, Integer> mapa = new HashMap<>();

        mapa.put("Juan", 25);
        mapa.put("María", 30);
        mapa.put("Pedro", 28);

        System.out.println(mapa.get("Juan")); // 25
        System.out.println(mapa.get("María")); // 30
        System.out.println(mapa.get("Pedro")); // 28

        mapa.remove("Juan");

        System.out.println(mapa.containsKey("Juan")); // false
        System.out.println(mapa.size()); // 2

    }
}
