package ArbolEnteros;

class Nodo {
    int valor;
    Nodo izquierda, derecha;

    public Nodo(int valor) {
        this.valor = valor;
        izquierda = derecha = null;
    }

    // Método para insertar un nuevo nodo en el árbol
    public void insertar(int valor) {
        if (valor < this.valor) {
            if (izquierda == null) {
                izquierda = new Nodo(valor);
            } else {
                izquierda.insertar(valor);
            }
        } else if (valor > this.valor) {
            if (derecha == null) {
                derecha = new Nodo(valor);
            } else {
                derecha.insertar(valor);
            }
        }
    }
}


