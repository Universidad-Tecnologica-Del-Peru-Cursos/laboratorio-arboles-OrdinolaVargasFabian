package ArbolPaises;

public class Main {
    public static void main(String[] args) {
        Arbol miArbol = new Arbol();

        // Insertar países en el árbol
        miArbol.insertar(new Pais(1, "Perú"));
        miArbol.insertar(new Pais(4, "Argentina"));
        miArbol.insertar(new Pais(2, "Brasil"));
        miArbol.insertar(new Pais(3, "Chile"));
        miArbol.insertar(new Pais(5, "Ecuador"));
        miArbol.insertar(new Pais(6, "Colombia"));

        // Imprimir el árbol en inorden antes de eliminar
        System.out.println("Árbol en inorden antes de eliminar:");
        miArbol.inorden();

        // Eliminar un país (por ejemplo, Chile con ID 3)
        System.out.println("\nEliminando Chile (ID 3)...");
        miArbol.eliminar(3);

        // Imprimir el árbol en inorden después de eliminar
        System.out.println("\nÁrbol en inorden después de eliminar:");
        miArbol.inorden();
    }
}

