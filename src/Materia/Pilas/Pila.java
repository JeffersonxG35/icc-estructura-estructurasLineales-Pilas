package Materia.Pilas;

import java.util.EmptyStackException;
import Materia.Models.Node;
import Materia.Models.NodoGenerico;

public class Pila {
    private Node top;

    public Pila() {
        top = null;
    }

    // PUSH= AGREGAR ELEMENTO A LA PILA
    public void Push(int value) {
        Node nuevoNodo = new Node(value);
        nuevoNodo.next = top;
        top = nuevoNodo;
    }

    public int pop() {
        if (top == null) {
            System.out.println("La pila esta vacia");
            throw new EmptyStackException();
        } else {
            int value = top.value;
            top = top.next;
            return value;
        }
    }

    public int peek() {
        if (top == null) {
            System.out.println("La pila esta vacia");
            throw new EmptyStackException();
        }
        return top.value;
    }

    public boolean isEmpty() {
        return top == null;
    }
    public int size() {
        int tamanio = 0;

        Node actual = top;

        while (actual != null) {
            tamanio++;
            actual = actual.next;
        }
        return tamanio;

    }
}

