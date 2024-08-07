/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

import javax.swing.JOptionPane;

/**
 *
 * @author Andy
 */
public class RegistroDeAnimales {

    int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de animales a agregar: "));
    Animales[] arrAnimales = new Animales[cantidad];

    public void agregarAnimales(Animales[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            JOptionPane.showMessageDialog(null, "A continuación se solicitará la información del animal #" + (i + 1));
            String nombre = JOptionPane.showInputDialog("Ingrese el nombre del animal: ");
            String especie = JOptionPane.showInputDialog("Ingrese la especie del animal: ");
            int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del animal: "));
            String habitat = JOptionPane.showInputDialog("Ingrese el habitat del animal: ");
            String grupo = JOptionPane.showInputDialog("Ingrese el grupo animal al que pertenece: ");
            arreglo[i] = new Animales(nombre, especie, edad, habitat, grupo);
            JOptionPane.showMessageDialog(null, "¡El animal ha sido agregado exitosamente!");
        }
    }

    public void mostrarAnimales(Animales[] arrAnimales) {
        for (int i = 0; i < arrAnimales.length; i++) {
            JOptionPane.showMessageDialog(null,
                    "Animal #" + (i + 1) + ":\n"
                    + "Nombre → " + arrAnimales[i].getNombre() + "\n"
                    + "Especie → " + arrAnimales[i].getEspecie() + "\n"
                    + "Edad → " + arrAnimales[i].getEdad() + "\n"
                    + "Habitat → " + arrAnimales[i].getHabitat() + "\n"
                    + "Grupo animal → " + arrAnimales[i].getGrupo());
        }
    }

    public void modificarAnimales(Animales[] arrAnimales) {
        int num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el # asignado al animal que desea modificar: "));
        for (int i = 0; i < arrAnimales.length; i++) {
            if (num == (i + 1)) {
                JOptionPane.showMessageDialog(null, "A continuación se solicitará la nueva información del animal #" + (i + 1));
                String newNombre = JOptionPane.showInputDialog("Ingrese el nuevo nombre: ");
                String newEspecie = JOptionPane.showInputDialog("Ingrese la nueva especie: ");
                int newEdad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la nueva edad: "));
                String newHabitat = JOptionPane.showInputDialog("Ingrese el nuevo habitat: ");
                String newGrupo = JOptionPane.showInputDialog("Ingrese el nuevo grupo animal al que pertence: ");
                arrAnimales[i] = new Animales(newNombre, newEspecie, newEdad, newHabitat, newGrupo);
                JOptionPane.showMessageDialog(null, "¡El animal ha sido modificado exitosamente!");
            }

        }
    }
    public void eliminarAnimal(){
        arrAnimales = eliminarAnimal(arrAnimales);
    }
    
    
    private Animales[] eliminarAnimal(Animales[] arrAnimales) {
        int num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el # asignado al animal que desea eliminar: "));
        if (num >= 1 && num <= arrAnimales.length) {
            Animales[] nuevoArrAnimales = new Animales[arrAnimales.length - 1];
            int j = 0;
            for (int i = 0; i < arrAnimales.length; i++) {
                if (i != num - 1) {
                    nuevoArrAnimales[j++] = arrAnimales[i];
                }
            }
            arrAnimales = nuevoArrAnimales;
            JOptionPane.showMessageDialog(null, "¡El animal ha sido eliminado con exito!");
            return nuevoArrAnimales;
        } else {
            JOptionPane.showMessageDialog(null, "No se logró eliminar el animal.");
            return arrAnimales;
        }  
    }
}
