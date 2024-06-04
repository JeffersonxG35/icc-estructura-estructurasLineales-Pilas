import Materia.Models.Pantalla;
import Materia.Pilas.Pila;
import Materia.Pilas.PilaGenerica;

public class App {
    public static void main(String[] args) throws Exception {
        Pila pila = new Pila();
        pila.push(10);
        pila.push(20);
        pila.push(30);
        pila.push(40);

    System.out.println("Elemento en la cima de la pila es: " +pila.peek());
    System.out.println("Elemento eliminado de la pila es: " +pila.pop());
    System.out.println("Elemento en la cima de la pila es: " +pila.peek());

    System.out.println();

    //// IMPLEMENTACION DE PILA GENERICA
    PilaGenerica<Pantalla> pilaPantallas=new PilaGenerica<Pantalla>();
    pilaPantallas.push(new Pantalla("Home page", "/home"));
    pilaPantallas.push(new Pantalla("Menu page", "/home/menu"));
    pilaPantallas.push(new Pantalla("Settings page", "/home/menu/settings"));

    System.out.println("Estoy en la pantalla:\n\t --> "+pilaPantallas.peek().getNombre());
    System.out.println("Destruir pantalla:\n\t --> "+pilaPantallas.pop().getNombre());
    System.out.println("Estoy en la pantalla:\n\t --> "+pilaPantallas.peek().getNombre());
    pilaPantallas.push(new Pantalla("User page", "/home/menu/settings"));
    System.out.println("Estoy en la pantalla:\n\t --> "+pilaPantallas.peek().getNombre());

}
}
