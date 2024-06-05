package Materia.Cola;

import java.util.NoSuchElementException;
import Materia.Models.NodoGenerico;

public class ColaGenerica<T> {
    private NodoGenerico<T> first;
    private NodoGenerico<T> last;

    public ColaGenerica() {
    }

    public ColaGenerica(NodoGenerico<T> first, NodoGenerico<T> last) {
        this.first = null;
        this.last = null;
    }

    // Metodo para agregar un Node a la cola
    public void addNode(T dato) {
        NodoGenerico<T> nuevoNodo = new NodoGenerico<>(dato);
        if (isEmpty()) {
            first = nuevoNodo;
            last = nuevoNodo;
        } else {
            last.next = nuevoNodo;
            last = nuevoNodo;
        }
    }

    public T remove() {
        if (isEmpty()) {
            throw new NoSuchElementException("La cola esta vacia");
        }
        T value = first.data;
        first = first.next;
        if (first == null) {
            last = null;
        }
        return value;
    }

    public T peek() {
        if (isEmpty()) {
            throw new NoSuchElementException("La cola esta vacia");
        }
        return first.data;
    }

    public boolean isEmpty() {
        return first == null;

    }

    public int size() {
        int tamanio = 0;

        NodoGenerico<T> actual = first;

        while (actual != null) {
            tamanio++;
            actual = actual.next;
        }
        return tamanio;

    }
}
