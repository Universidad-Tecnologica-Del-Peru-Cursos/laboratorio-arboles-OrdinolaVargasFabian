package ArbolNombres;

class Nodo {
    String nombre;
    Nodo izquierda, derecha;

    public Nodo(String nombre) {
        this.nombre = nombre;
        izquierda = derecha = null;
    }

    // Método para insertar un nuevo nodo en el árbol
    public void insertar(String nombre) {
        if (nombre.compareTo(this.nombre) < 0) {
            if (izquierda == null) {
                izquierda = new Nodo(nombre);
            } else {
                izquierda.insertar(nombre);
            }
        } else if (nombre.compareTo(this.nombre) > 0) {
            if (derecha == null) {
                derecha = new Nodo(nombre);
            } else {
                derecha.insertar(nombre);
            }
        }
    }
}
