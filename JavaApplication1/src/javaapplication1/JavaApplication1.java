/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author Andy
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     RegistroDeAnimales registro = new RegistroDeAnimales();

     registro.agregarAnimales(registro.arrAnimales);
     registro.mostrarAnimales(registro.arrAnimales);
     registro.modificarAnimales(registro.arrAnimales);
     registro.eliminarAnimal();
     registro.mostrarAnimales(registro.arrAnimales);
    }
    
}
