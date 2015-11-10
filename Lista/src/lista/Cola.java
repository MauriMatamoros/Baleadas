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
public class Cola {
    private List lista;
    
    public void Queue(int valor){
        Nodo temp = new Nodo();
        temp.setValue(valor);
        this.lista.pushback(temp);
    }
    
    public int Peek(){
        return this.lista.first().getValue();
    }
    
    public Nodo DeQueue(){
        
        Nodo valor = this.lista.first();
        List temp = new List();
        temp.pushback(this.lista.first().getNext());
        this.lista = temp;
        return valor;
    }
    
}
