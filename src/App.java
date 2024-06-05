import Materia.Cola.Cola;
import Materia.Cola.ColaGenerica;
import Materia.Models.Pantalla;
import Materia.Pilas.Pila;
import Materia.Pilas.PilaGenerica;

public class App {
    public static void main(String[] args) throws Exception {
        Pila pila = new Pila();
        pila.Push(10);
        pila.Push(20);
        pila.Push(30);
        pila.Push(40);

        System.out.println("Elemento en la cima de la pila es: " + pila.peek());
        System.out.println("Elemento eliminado de la pila es: " + pila.pop());
        System.out.println("Elemento en la cima de la pila es: " + pila.peek());
        System.out.println("El tamaño de la pila es: "+pila.size());

        System.out.println();

        //// IMPLEMENTACION DE PILA GENERICA
        PilaGenerica<Pantalla> pilaPantallas = new PilaGenerica<Pantalla>();
        pilaPantallas.push(new Pantalla("Home page", "/home"));
        pilaPantallas.push(new Pantalla("Menu page", "/home/menu"));
        pilaPantallas.push(new Pantalla("Settings page", "/home/menu/settings"));

        System.out.println("Estoy en la pantalla:\n\t --> " + pilaPantallas.peek().getNombre());
        System.out.println("Destruir pantalla:\n\t --> " + pilaPantallas.pop().getNombre());
        System.out.println("Estoy en la pantalla:\n\t --> " + pilaPantallas.peek().getNombre());
        pilaPantallas.push(new Pantalla("User page", "/home/menu/settings"));
        System.out.println("Estoy en la pantalla:\n\t --> " + pilaPantallas.peek().getNombre());
        System.out.println("El tamaño de la pila es: "+pilaPantallas.size());
        System.out.println();

        //// AÑADIR ELEMENTOS A LA COLA
        Cola queue = new Cola();
        queue.addNode(10);
        queue.addNode(15);
        queue.addNode(25);

        System.out.println("Elemento en la cima de la cola es: " + queue.peek());
        System.out.println("Elemento eliminado de la cola es: " + queue.remove());
        System.out.println("Elemento en la cima de la cola es: " + queue.peek());
        System.out.println("El tamaño de la cola es: "+queue.size());



        System.out.println();

        //// IMPLEMENTACION DE COLA GENERICA TIPO PANTALLA
        ColaGenerica<Pantalla> colaPantallas = new ColaGenerica<>();
        colaPantallas.addNode(new Pantalla("Home page", "/home"));
        colaPantallas.addNode(new Pantalla("Menu page", "/home/menu"));
        colaPantallas.addNode(new Pantalla("Settings page", "/home/menu/settings"));

        System.out.println();

        System.out.println("Estoy en la pantalla:\n\t --> " + colaPantallas.peek().getNombre());
        System.out.println("Destruir pantalla:\n\t --> " + colaPantallas.remove().getNombre());
        System.out.println("Estoy en la pantalla:\n\t --> " + colaPantallas.peek().getNombre());
        colaPantallas.addNode(new Pantalla("User page", "/home/menu/settings"));
        System.out.println("Estoy en la pantalla:\n\t --> " + colaPantallas.peek().getNombre());

        System.out.println("El tamaño de la cola es: "+colaPantallas.size());
        System.out.println();

    }
}
