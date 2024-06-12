package Ejercicio_03_linkedLists;

import Materia.Models.Node;

public class LinkedListEjr {
     public Node head;

    public LinkedListEjr() {

    }

    // AGREGAR NODOS A LA LISTA
    public void addNode(int value) {
        if (head == null) {
            head = new Node(value);
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = new Node(value);
    }

    // METODO PARA ELIMINAR
    public void deleteNode(int value) {
        if (head == null)
            return; // No hay elementos no hagas nada
        if (head.value == value) {
            head = head.next;
            return;
        }
        Node current = head;
        while (current.next != null) {
            if (current.next.value == value) {
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
    }

    public int size() {
        int size = 0;
        Node current = head;
        while (current != null) {
            size++;
            current = current.next;
        }
        return size;
    }
    
    //METODO PARA OBTENER LA POSICION DE FORMA DESCENDENTE
    public int getByPos(int position){
        int tamanio= 0;
        Node current = head;

        while (current != null) {
            tamanio++;
            current = current.next;
        }

        if (position >= tamanio) {
            throw new IllegalArgumentException("La posición no existe");
        } 

        int targetPos = tamanio - position-1;
        current = head;
        for (int i = 0; i < targetPos; i++) {
            current = current.next;
        }
        return current.value;
    }


    public void imprimirNode (){
        if (head == null) {
            System.out.println("Lista vacía");
            return;
        }
        Node current = head;
        while (current.next != null) {
            System.out.println("Node -> " + current.value);
            current = current.next;
        }
        System.out.println("Node -> " + current.value);
    }
}
