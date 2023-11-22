/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package S08_Private;

/**
 *
 * @author CristhianRojas
 */
public class S08_Private {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                // Instancia de la clase
        Clasepriv privateClase = new Clasepriv();

        // Se intenta acceder al atributoprivate
        System.out.println(privateClase.atributoPrivate);

        // Se intenta llamar al método 
        privateClase.metodoPrivate();
    }
    
}
