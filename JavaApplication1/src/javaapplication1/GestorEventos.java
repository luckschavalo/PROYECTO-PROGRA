/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eventos;

import javax.swing.JOptionPane;

/**
 *
 * @author
 */
public class GestorEventos {
    private Evento eventos[] = new Evento[1000];
    private int contador;

    // Constructor
    public GestorEventos(int capacidad) {
        
        contador = 0;
    }
    
    // Método para verificar si un ID ya existe
    private boolean idrepetido(int id) {
        for (int i = 0; i < contador; i++) {
            if (eventos[i].getId() == id) {
                return true;
            }
        }
        return false;
    }

    // Método para agregar un evento
    public void agregarEvento(Evento evento) {
        
            if (contador < eventos.length) {
                
                    Evento agregar = new Evento();
                    
                    agregar.setId(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID del evento:")));
                    if (idrepetido(agregar.getId())) {
                        JOptionPane.showMessageDialog(null, "El ID del evento ya existe. Ingrese un ID diferente.");
                    } else {
                    
                    agregar.setNombre(JOptionPane.showInputDialog("Ingrese el nombre del evento:"));
                    agregar.setFecha(JOptionPane.showInputDialog("Ingrese la fecha del evento:"));
                    agregar.setDescripcion(JOptionPane.showInputDialog("Ingrese la descripción del evento:"));
                    eventos[contador] = agregar;
                    contador++;
         
                }
                
            }
        }


    // Método para mostrar todos los eventos
    public void mostrarEventos() {
        String eventosTexto = "";
        for (int i = 0; i < contador; i++) {
            eventosTexto = eventosTexto + eventos[i].toString() + "\n";
        }
        JOptionPane.showMessageDialog(null, eventosTexto);
    }

    // Método para modificar un evento por ID
    public void modificarEvento(int id, String nuevoNombre, String nuevaFecha, String nuevaDescripcion) {
        for (int i = 0; i < contador; i++) {
            if (eventos[i].getId() == id) {
                eventos[i].setNombre(nuevoNombre);
                eventos[i].setFecha(nuevaFecha);
                eventos[i].setDescripcion(nuevaDescripcion);
                JOptionPane.showMessageDialog(null, "Evento modificado.");
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "Evento con ID " + id + " no encontrado.");
    }

    
}
