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
public class Stack {
    private List lista;
    private Nodo top;
     public Stack(Object value) {
        lista = new List(value);
        top = lista.first();
    }
    public Stack() {
        lista = new List();
    }
    public void push_back(Object value){
        lista.pushback(value);
        top = lista.Last();
    }
    public Nodo pop(){
        Nodo temp = lista.Last();
        lista.remove(lista.size()-1);
        top = lista.Last();
        return temp;
    }
    public Object peek(){
        return lista.Last().getValue();
    }
    public int size(){
        return lista.size();
    }
    
    
    
}
