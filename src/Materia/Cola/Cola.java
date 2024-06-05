package Materia.Cola;

import java.util.NoSuchElementException;

import Materia.Models.Node;
import Materia.Models.NodoGenerico;

public class Cola {
    private Node first;
    private Node last;

    public Cola() {
        this.first = null;
        this.last = null;
    }

    // Metodo para agregar un Node a la cola
    public void addNode(int value) {
        Node nuevoNodo = new Node(value);
        if (isEmpty()) {
            first = nuevoNodo;
            last = nuevoNodo;
        } else {
            last.next = nuevoNodo;
            last = nuevoNodo;
        }
    }
    public int remove(){
        if(isEmpty()){
            throw new NoSuchElementException("La cola esta vacia");
        }
        int value = first.value;
        first= first.next;
        if(first==null){
            last=null;
        }
        return value;
    }

    public int peek() {
        if (isEmpty()) {
            throw new NoSuchElementException("La cola esta vacia");
        }
        return first.value;
    }

    public boolean isEmpty() {
        return first == null;

    }
     public int size() {
        int tamanio = 0;

        Node actual = first;

        while (actual != null) {
            tamanio++;
            actual = actual.next;
        }
        return tamanio;

    }
}
