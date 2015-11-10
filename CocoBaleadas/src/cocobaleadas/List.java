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
public class List {

     public List(Object value) {
        this.head = new Nodo(value);
    }
    public List() {
    }
    public void insert(int posicion, Object valor){
        if(posicion > 0){
            if(!head.hasNext()){
                if(posicion == 1){
                    head.setNext(new Nodo(valor));
                }
                else{
                    Nodo temp = head;
                    head.setValue(valor);
                    head.setNext(temp);
                }
            }
            else{
                Nodo temp = head;
                int cont = 0;
                if(size() >= posicion){
                    while(cont < posicion-1){
                        temp = temp.getNext();
                        cont++;
                    }
                    Nodo nuevo = new Nodo(valor);
                    if(temp.hasNext()){
                        Nodo temp2 = temp.getNext();
                        nuevo.setNext(temp2);                        
                    }
                    temp.setNext(nuevo);
                }
            }
        }
        else if(posicion == 0){
            if(head != null){
                Nodo temp = head;
                setHead(new Nodo(valor));
                head.setNext(temp);
            }
            else{
                setHead(new Nodo(valor));
            }
        }
    }
    public int find(Object valor){
        int contador = 0;
	Nodo temp = head;
	while(temp.hasNext()){
            if(temp.getValue() == valor)
                return contador;
            temp = temp.getNext();
            contador++;
	}
	return -1;
    }
    public Nodo get(int posicion){
        int contador = 0;
	Nodo temp = head;
        if(size() > posicion){
            if(posicion == 0){
                return head;
            }
            while(contador < posicion){
                temp = temp.getNext();
                contador++;
            }
            return temp;
        }
	return new Nodo();
    }
    public void remove(int posicion){
        if(size() > posicion){
            if(posicion == 0){
                setHead(head.getNext());
            }
            else if(posicion == 1){
                Nodo temp = head;
                temp = temp.getNext();
                temp = temp.getNext();
                head.setNext(temp);
            }
            else{
                int contador = 0;
                Nodo temp = head;
                while(contador < posicion-1){
                    temp = temp.getNext();
                    contador++;
                }
                Nodo temp2 = temp.getNext();
                Nodo temp3 = temp2.getNext();
                temp.setNext(temp3);
            }
        }
        
    }
    public Nodo first(){
        return head;
    }
    public void concat(List lista){
        Nodo temp = head;
	while(temp.hasNext())
            temp = temp.getNext();
	temp.setNext(lista.first());
    }
    public void print(){
        if(head != null){
            if(head.hasNext()){
                System.out.print("[");
                Nodo temp = head;
                for (int i = 0; i < size(); i++) {
                    if(temp.hasNext()){
                        System.out.print(temp.toString()+",");
                        temp = temp.getNext();
                    }
                    else{
                        System.out.print(temp.toString()+"]"); 
                    }
                }
            }
            else{
                System.out.println("["+head.toString()+"]");
            }
        }
    }
    public int size(){
        int size = 0;
        if(head != null){
            size++;
            Nodo temp = head;
            while(temp.hasNext()){
                size++;
                temp = temp.getNext();
            }
        }
        return size;
    }
    public void pushback(Object value){
        insert(size(),value);
    }
    public void setHead(Nodo head){
        this.head = head;
    }
    public Nodo Last(){
        return get(size()-1);
    }
    
    public boolean hasHead(){
        if (this.head == null) {
            return false;
        }else{
            return true;
        }
    }
    
    private Nodo head;
}
