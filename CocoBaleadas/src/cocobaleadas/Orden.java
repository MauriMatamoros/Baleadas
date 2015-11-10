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
public class Orden {
    private int numero;
    private String nombre;
    private List platos;
    private double total;
    private int tiempo;

    public Orden(int numero, String nombre) {
        this.numero = numero;
        this.nombre = nombre;   
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List getPlatos() {
        return platos;
    }

    public void setPlatos(List platos) {
        this.platos = platos;
    }

    public double getTotal() {
        double cont = 0;
        for (int i = 0; i < this.platos.size(); i++) {
           // cont += ((Platos)platos.get(i)).getPrecio();
        }
        this.total = cont;
        return total;
    }

    public int getTiempo() {
        int cont = 0;
        for (int i = 0; i < this.platos.size(); i++) {
           // cont += ((Platos)platos.get(i)).getTiempo();
        }
        this.total = cont;
        return tiempo;
    }

    @Override
    public String toString() {
        return ""+ nombre; 
    }

    
    
    
    
    
}
