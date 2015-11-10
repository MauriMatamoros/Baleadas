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
public class Pila {
    private List lista;
    
    
    public Pila(List l){
        this.lista = l;
    }
    
    public void Push(int value){
        Nodo n1 = new Nodo();
        n1.setValue(value);
        this.lista.pushback(n1);
        
    }
    
    public int POP(){
        int size = this.lista.size();
        int valor = this.lista.Last().getValue();
        this.lista.remove(size-1);
        return valor;
    }
    
    public int Peek(){
        return this.lista.Last().getValue();
    }
}
