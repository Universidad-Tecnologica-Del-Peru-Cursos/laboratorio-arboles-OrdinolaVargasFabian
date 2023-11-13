package ArbolPaises;

class Nodo {
    Pais pais;
    Nodo izquierda, derecha;

    public Nodo(Pais pais) {
        this.pais = pais;
        izquierda = derecha = null;
    }

    // Método para insertar un nuevo nodo en el árbol
    public void insertar(Pais pais) {
        if (pais.getId() < this.pais.getId()) {
            if (izquierda == null) {
                izquierda = new Nodo(pais);
            } else {
                izquierda.insertar(pais);
            }
        } else if (pais.getId() > this.pais.getId()) {
            if (derecha == null) {
                derecha = new Nodo(pais);
            } else {
                derecha.insertar(pais);
            }
        }
    }
}
