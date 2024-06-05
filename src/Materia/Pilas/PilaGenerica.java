package Materia.Pilas;

import java.util.EmptyStackException;
import Materia.Models.NodoGenerico;

public class PilaGenerica<T> {
    private NodoGenerico<T> top;

    public PilaGenerica() {

        top = null;
    }

    public void push(T dato) {
        NodoGenerico<T> nuevoNodo2 = new NodoGenerico<T>(dato);
        nuevoNodo2.next = top;
        top = nuevoNodo2;

    }

    public boolean isEmpty() {
        return top == null;

    }

    public T pop() {
        if (isEmpty()) {
            System.out.println("La pila esta vacia");
            throw new EmptyStackException();
        }
        T data = top.data;
        top = top.next;
        return data;
    }

    public T peek() {
        if (isEmpty()) {
            System.out.println("La pila esta vacia");
            throw new EmptyStackException();
        }
        return top.data;
    }
    public int size() {
        int tamanio = 0;

        NodoGenerico<T> actual = top;

        while (actual != null) {
            tamanio++;
            actual = actual.next;
        }
        return tamanio;

    }
}

