/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s07_31cristhianrojas;

import java.util.Scanner;

/**
 *
 * @author CristhianRojas
 */
public class Persona1_31 {
    //clases
    String nombre;
    int edad;
   
    //Metodos
    public void preguntar3() {
        Scanner o =new Scanner(System.in);
        System.out.println("Ingrese el nombre: ");
         nombre = o.nextLine();
        System.out.println("Ingrese la edad: ");
         edad =o.nextInt();
    }

    public void responder3() {
        System.out.println("¿cual es su nombre " + nombre  +  edad);
        System.out.println("¿cual es su nombre " + nombre + " ¿ cual es su edad " +   edad);
        
 }  
}