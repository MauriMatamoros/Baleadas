/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author MauricioMatamoros
 */
public class Lista {
    private static Scanner input;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        input = new Scanner(System.in);
        boolean valid = false;
        ArrayList<List> listas = new ArrayList();
        Nodo node = new Nodo();
        List lista = new List();
        while (!valid) {
            int opcion = menu();
            if (opcion == 1) {
                System.out.println(lista.first().toString());
            } else if (opcion == 2) {
                System.out.println(listas);
                int choice = listas_menu();
                if (choice == 1) {
                    System.out.println("Ingrese valor de head: ");
                    int valor = input.nextInt();
                    node = new Nodo(valor);
                    lista = new List(node);
                    listas.add(lista);
                    lista = new List();
                    node = new Nodo();
                    
                    
                }else if (choice == 2) {
                    
                } else if (choice == 3) {
                    int lista1;
                    int lista2;
                    System.out.println("Ingrese lista a quien concatenar: ");
                    lista1 = input.nextInt();
                    System.out.println("Ingrese que lista concatenar: ");
                    lista2 = input.nextInt();
                    listas.get(lista1).concat(listas.get(lista2));
                }
                
            } else if (opcion == 3) {
                int position = 0;
                int obj = 0;
                System.out.println("Ingrese posicion donde insertar: ");
                position = input.nextInt();
                System.out.println("Ingrese valor: ");
                obj = input.nextInt();
                node.setValue(obj);
                lista.insert(position, node);

            } else if (opcion == 4) {
                int obj;
                System.out.println("Ingrese numero a encontrar: ");
                obj = input.nextInt();
                System.out.println(lista.find(obj));

            } else if (opcion == 5) {
                int position= 0;
                System.out.println("Ingrese posticion: ");
                position = input.nextInt();
                System.out.println(lista.get(position));

            } else if (opcion == 6) {
                int position;
                System.out.println("Ingrese posicion a eliminar: ");
                position = input.nextInt();
                lista.remove(position);

            } else {
                valid = true;
            }
        }
        
    }
    private static int menu(){
        input = new Scanner(System.in);
	System.out.println("1. first");
        System.out.println("2. menu listas");
        System.out.println("3. insert");
        System.out.println("4. find");
        System.out.println("5. get");
        System.out.println("6. remove");
        System.out.println("7. salir");
        int opcion = input.nextInt();
        return opcion;
    }
      private static int listas_menu(){
        input = new Scanner(System.in);
	System.out.println("1. Crear");
        System.out.println("2. Borrar");
        System.out.println("3. Concat");
        System.out.println("4. salir");
        int opcion = input.nextInt();
        return opcion;
    }
    
}
