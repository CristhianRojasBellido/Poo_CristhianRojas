/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package S08_Protect;

/**
 *
 * @author CristhianRojas
 */
public class S08_protetec {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ejemplo claseProtegida = new ejemplo();
        // Se accede al atributo 
        System.out.println(claseProtegida.atributoProtegido);
        // Se llama al método 
        claseProtegida.metodoProtegido();
    }
    
}
