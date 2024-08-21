/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eventos;

import javax.swing.JOptionPane;

/**
 *
 * @author
 */
public class Eventos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Evento evento = new Evento();
        GestorEventos gestor = new GestorEventos(1000); // Capacidad alta para evitar limitaciones

        int opcion;
        do {
            String opcionStr = JOptionPane.showInputDialog(null, "Gestión de eventos\n1. Agregar evento\n2. Mostrar eventos\n3. Modificar evento\n4. Salir\nSeleccione una opción:");
            opcion = Integer.parseInt(opcionStr);

            switch (opcion) {
                case 1:{
                    
                    gestor.agregarEvento(evento);
                    break;
                }
                case 2:{
                    gestor.mostrarEventos();
                    break;
                }
                case 3:{
                    
                    int idModificar = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID del evento a modificar:"));
                    String nuevoNombre = JOptionPane.showInputDialog("Ingrese el nuevo nombre del evento:");
                    String nuevaFecha = JOptionPane.showInputDialog("Ingrese la nueva fecha del evento:");
                    String nuevaDescripcion = JOptionPane.showInputDialog("Ingrese la nueva descripción del evento:");

                    gestor.modificarEvento(idModificar, nuevoNombre, nuevaFecha, nuevaDescripcion);
                    break;
                }
                case 4:{
                    break;
                   
                }
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 4);

    }
    
}
