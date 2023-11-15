/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s07_31cristhianrojas;

import javax.swing.JOptionPane;

/**
 *
 * @author CristhianRojas
 */
public class Persona2_31 {
    //clases
    private boolean peso;
    private int edad;
    private String nombre;
    
    //Metodos
    public Persona2_31(String nombre, int edad, boolean aprobado) {
    this.nombre = nombre;
    this.edad = edad;
    this.peso = peso;
    }
    public String getNombre() {
    return nombre;
    }
    public void setNombre(String nombre) {
    this.nombre = nombre;
    }
    public int getEdad() {
    return edad;
    }
    public void setEdad(int edad) {
    this.edad = edad;
    }
    public boolean peso() {
    return peso;
    }
    public void setpeso(boolean peso) {
    this.peso = peso;
    }
    public void mostrarDatos() {
    String edad = null;
    JOptionPane.showMessageDialog(null, "Nombre: " + nombre + "\nEdad: " + edad + "\nAprobado: " + peso);
    }
}
