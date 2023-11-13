package ArbolEstudiantes;

class Nodo {
    Estudiante estudiante;
    Nodo izquierda, derecha;

    public Nodo(Estudiante estudiante) {
        this.estudiante = estudiante;
        izquierda = derecha = null;
    }

    // Método para insertar un nuevo nodo en el árbol
    public void insertar(Estudiante estudiante) {
        if (estudiante.getId() < this.estudiante.getId()) {
            if (izquierda == null) {
                izquierda = new Nodo(estudiante);
            } else {
                izquierda.insertar(estudiante);
            }
        } else if (estudiante.getId() > this.estudiante.getId()) {
            if (derecha == null) {
                derecha = new Nodo(estudiante);
            } else {
                derecha.insertar(estudiante);
            }
        }
    }
}
