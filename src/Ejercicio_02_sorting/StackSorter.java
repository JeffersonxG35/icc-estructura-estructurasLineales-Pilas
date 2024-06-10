package Ejercicio_02_sorting;

import java.util.Stack;

public class StackSorter {
    public Stack<Integer> stack;


    //CONSTRUCTOR
    public StackSorter() {
        stack = new Stack<>();
    }

    //METODO PUSH
    public void push(int value) {
        stack.push(value);
    }

    //METODO POP
    public int pop() {
        if (!isEmpty()) {
            return stack.pop();
        } else {
            throw new RuntimeException("Pop de un stack vacio");
        }
    }

    //Metodo para saber si esta vacio o no?
    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public int peek() {
        if (!isEmpty()) {
            return stack.peek();
        } else {
            throw new RuntimeException("Peek de una stack que esta vacio");
        }
    }

    //Metodo que ordena el Stack 
    public void sortStack() {
        if (!stack.isEmpty()) {
            int temp = stack.pop();
            sortStack();
            insertSorted(temp);
        }
    }

    // Metodo para ingresar elementos de forma ordenada
    private void insertSorted(int value) {
        if (stack.isEmpty() || stack.peek() <= value) {
            stack.push(value);
        } else {
            int temp = stack.pop();
            insertSorted(value);
            stack.push(temp);
        }
    }

   
}
