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
public class Ingredientes {
    private String nombre;
    private String descripcion;

    public Ingredientes(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }
    
    
    @Override
    public String toString() {
        return ""+nombre;
    }
    
    
}
