/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s07v2_31_cristhianrojas;

/**
 *
 * @author CristhianRojas
 */
public class S07v2_31_Cristhianrojas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Persona_31 persona1 = new Persona_31 ("Juan Garcia", 20, "045 Calle Principal");

        // Crear una instancia de Persona sin dirección
        Persona_31 persona2 = new Persona_31("Camila Palacios", 35);

        // Mostrar información de ambas personas
        
        boolean j = persona1.flot(true);
        boolean x = persona2.flot(false);
        System.out.println(x);
        System.out.println(j);
        persona1.mostrarInformacion();
        persona1.getNombre();
        System.out.println("-------------------------");
        persona2.mostrarInformacion();
        persona2.getNombre();
    }
    
}
