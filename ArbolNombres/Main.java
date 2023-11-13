package ArbolNombres;

public class Main {
    public static void main(String[] args) {
        Arbol arbol = new Arbol();

        // Insertar nombres en el árbol
        arbol.insertar("Carlos");
        arbol.insertar("Ana");
        arbol.insertar("Elena");
        arbol.insertar("Pedro");
        arbol.insertar("Sofía");
        arbol.insertar("Juan");
        arbol.insertar("Lucía");

        // Recorridos
        System.out.println("Recorrido en Orden:");
        arbol.recorrerEnOrden();

        System.out.println("\nRecorrido PreOrden:");
        arbol.recorrerPreOrden();

        System.out.println("\nRecorrido PostOrden:");
        arbol.recorrerPostOrden();
    }
}
