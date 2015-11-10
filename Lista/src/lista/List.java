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
public class List {

    private Nodo head;

    public List() {
    }

    public List(Nodo head) {
        this.head = head;
    }

    public void insert(int position, Nodo obj) {
        int contador = 0;
        Nodo n1;
        n1 = this.head;
        while (n1.getNext() != null) {
            if (contador == position - 1) {
                break;
            }
            contador++;
        }
        Nodo n2 = n1.getNext();
        n1.setNext(obj);
        obj.setNext(n2);

    }

    public int find(int obj) {
        Nodo n1;
        n1 = this.head;
        while (n1.hasNext() && n1.getValue() != obj) {
            n1 = n1.getNext();
        }
        return n1.getValue();
    }

    public int get(int position) {
        Nodo n1;
        n1 = head;
        int contador = 0;
        if (position == 0) {
            return head.getValue();
        } else {
            while (contador < position) {
                n1 = n1.getNext();
                contador++;
            }
            return n1.getValue();
        }
    }

    public void remove(int position) {
        int contador = 0;
        Nodo n1;
        n1 = head;
        Nodo n2 = new Nodo();
        while (contador < position) {
            n1 = n1.getNext();
            if (contador == position - 1) {
                n2 = n1.getNext();
                n2 = n2.getNext();
                n1.setNext(n2);
            }
            contador++;
        }
    }

    public Nodo first() {
        return this.head;
    }

    public void concat(List l) {
        Nodo n1;
        n1 = head;
        while (n1.hasNext()) {
            n1 = n1.getNext();
        }
        n1.setNext(l.first());
    }
    
    public void pushback(Nodo n){
        Nodo n1 = this.head;
        while(n1.hasNext()){
            n1 = n1.getNext();
        }
        n1.setNext(n);
    
    }
    
    public Nodo Last (){
        Nodo n1 = this.head;
        while(n1.hasNext()){
            n1 = n1.getNext();
        }   
        return n1;
    }
    
    public int size(){
        int contador = 0;
        Nodo n1;
        n1 = this.head;
        while(n1.hasNext()){
            n1 = n1.getNext();
            contador++;
        }
        
        return contador;
    }
    
    

}
