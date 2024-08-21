/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eventos;

/**
 *
 * @author
 */
public class Evento {
    private String nombre;
    private String fecha;
    private int id;
    private String descripcion;

    // Constructor
    public Evento(){
        this.nombre = "";
        this.fecha = "";
        this.id = 0;
        this.descripcion = "";
    }
    
    public Evento(String nombre, String fecha, int id, String descripcion) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.id = id;
        this.descripcion = descripcion;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    // Método para mostrar la información del evento
    
    public String toString() {
        return "Evento [ID=" + id + ", Nombre=" + nombre + ", Fecha=" + fecha + ", Descripción=" + descripcion + "]";
    }
}

