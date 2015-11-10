/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cocobaleadas;



/**
 *
 * @author MauricioMatamoros
 */
public class Platos {
    private String nombre;
    private String descripcion;
    private double precio;
    private List ingredientes = new List();
    private int tiempo;

    public Platos(String nombre, String descripcion, double precio, int tiempo) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.tiempo = tiempo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public List getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(List ingredientes) {
        this.ingredientes.pushback(ingredientes);
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    @Override
    public String toString() {
        return ""+ nombre;
    }
    
    
            
}
