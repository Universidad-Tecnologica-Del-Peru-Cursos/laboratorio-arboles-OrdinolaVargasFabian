package ArbolEnteros;

public class Main {
    public static void main(String[] args) {
        Arbol arbol = new Arbol();

        // Insertar valores en el árbol
        arbol.insertar(50);
        arbol.insertar(30);
        arbol.insertar(70);
        arbol.insertar(20);
        arbol.insertar(40);
        arbol.insertar(60);
        arbol.insertar(80);

        // Recorridos
        System.out.println("Recorrido en Orden:");
        arbol.recorrerEnOrden();

        System.out.println("\nRecorrido PreOrden:");
        arbol.recorrerPreOrden();

        System.out.println("\nRecorrido PostOrden:");
        arbol.recorrerPostOrden();
        
        
    }
}
