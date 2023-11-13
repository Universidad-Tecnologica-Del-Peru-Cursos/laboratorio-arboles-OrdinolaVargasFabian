package ArbolEstudiantes;

public class Main {
    public static void main(String[] args) {
        Arbol arbol = new Arbol();

        // Insertar estudiantes en el árbol
        arbol.insertar(new Estudiante(1, "Carlos"));
        arbol.insertar(new Estudiante(2, "Ana"));
        arbol.insertar(new Estudiante(3, "Elena"));
        arbol.insertar(new Estudiante(4, "Pedro"));
        arbol.insertar(new Estudiante(5, "Sofía"));
        arbol.insertar(new Estudiante(6, "Juan"));
        arbol.insertar(new Estudiante(7, "Lucía"));

        // Recorridos
        System.out.println("Recorrido en Orden:");
        arbol.recorrerEnOrden();

        System.out.println("\nRecorrido PreOrden:");
        arbol.recorrerPreOrden();

        System.out.println("\nRecorrido PostOrden:");
        arbol.recorrerPostOrden();

        int idABuscar = 4; // Cambiar según se necesite
        Estudiante estudianteEncontrado = arbol.buscar(idABuscar);
        if (estudianteEncontrado != null) {
            System.out.println("Estudiante encontrado: " + estudianteEncontrado);
        } else {
            System.out.println("Estudiante con ID " + idABuscar + " no encontrado.");
        }
    }
}
