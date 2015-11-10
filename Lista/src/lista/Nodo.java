/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista;

/**
 *
 * @author MauricioMatamoros
 */
public class Nodo {

    private Nodo next;
    private Object value;

    public Nodo() {
    }
    
    
    public Nodo(Object value){
        this.value = value;
        
        
    }

    public Nodo getNext() {
        return this.next;
    }

    public void setNext(Nodo node) {
        this.next = node;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public Object getValue() {
        return this.value;
    }
    
    public boolean hasNext() {
        if (this.next != null) {
            return true;
        }
        return false;
    }

    @Override
    public String toString(){
        return ""+value;
    }
}
