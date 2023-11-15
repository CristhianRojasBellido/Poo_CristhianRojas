/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s07_31cristhianrojas;

/**
 *
 * @author CristhianRojas
 */
public class S07_31CristhianRojas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Persona1_31 random = new Persona1_31();
        random.preguntar3();
        random.responder3();
        
        Persona2_31 persona1 = new Persona2_31("Cristhian", 18, false);
        System.out.println("Nombre del estudiante: " + persona1.getNombre());
        System.out.println("Edad del estudiante: " + persona1.getEdad());
        System.out.println("¿Está aprobado? " + persona1.peso());
    }
    
}
