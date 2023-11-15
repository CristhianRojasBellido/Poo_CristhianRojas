/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s06_31;

import java.util.Scanner;

/**
 *
 * @author CristhianRojas
 */
public class S06_31 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //estudiante
        estudiante_31 estudiante = new estudiante_31("Crishian", "Rojas", 18);
        estudiante.mostrarInformacion();
        estudiante.saludar();
        estudiante.saludar("¡Hola a todos!");
        System.out.println("Nombre Completo: " + estudiante.obtenerNombreCompleto());
        
        //calculadora
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        double num1 = scanner.nextDouble();
        System.out.print("Ingrese el segundo número: ");
        double num2 = scanner.nextDouble();
        // Uso del constructor con valores predeterminados
        calculadora_31 calculadora = new calculadora_31(num1, num2);
    }
 }
    

