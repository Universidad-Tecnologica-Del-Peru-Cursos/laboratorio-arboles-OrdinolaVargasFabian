package ArbolPaises;

class Arbol {
    Nodo raiz;

    public void insertar(Pais pais) {
        if (raiz == null) {
            raiz = new Nodo(pais);
        } else {
            raiz.insertar(pais);
        }
    }

    public Pais buscar(int id) {
        return buscar(raiz, id);
    }

    private Pais buscar(Nodo nodo, int id) {
        if (nodo == null) {
            return null;
        } else if (nodo.pais.getId() == id) {
            return nodo.pais;
        } else if (id < nodo.pais.getId()) {
            return buscar(nodo.izquierda, id);
        } else {
            return buscar(nodo.derecha, id);
        }
    }

    // Método para eliminar un nodo (País) del árbol
    public void eliminar(int id) {
        raiz = eliminar(raiz, id);
    }

    private Nodo eliminar(Nodo nodo, int id) {
        // Si el nodo actual es nulo, simplemente regresamos nulo.
        if (nodo == null) {
            return null;
        }

        // Descender por el árbol según el valor de ID
        if (id < nodo.pais.getId()) {
            // Si el ID es menor que el ID del nodo actual, vamos a la izquierda
            nodo.izquierda = eliminar(nodo.izquierda, id);
        } else if (id > nodo.pais.getId()) {
            // Si el ID es mayor que el ID del nodo actual, vamos a la derecha
            nodo.derecha = eliminar(nodo.derecha, id);
        } else {
            // Encontramos el nodo a eliminar

            // Caso 1: El nodo tiene máximo un hijo
            if (nodo.izquierda == null) {
                return nodo.derecha;
            } else if (nodo.derecha == null) {
                return nodo.izquierda;
            }

            // Caso 2: El nodo tiene dos hijos

            // Encontrar el sucesor (el nodo más pequeño en el subárbol derecho)
            nodo.pais = valorMinimo(nodo.derecha);

            // Eliminar el sucesor del subárbol derecho
            nodo.derecha = eliminar(nodo.derecha, nodo.pais.getId());
        }
        return nodo;
    }

    // Método auxiliar para encontrar el valor mínimo en un subárbol
    private Pais valorMinimo(Nodo nodo) {
        // Caso base: Si el nodo izquierdo es nulo, hemos encontrado el mínimo
        if (nodo.izquierda == null) {
            return nodo.pais;
        } else {
            // Llamada recursiva hacia el nodo izquierdo
            return valorMinimo(nodo.izquierda);
        }
    }
    

    // Métodos de recorrido
    public void inorden() {
        inorden(raiz);
    }

    private void inorden(Nodo nodo) {
        if (nodo != null) {
            inorden(nodo.izquierda);
            System.out.println(nodo.pais);
            inorden(nodo.derecha);
        }
    }

    public void preorden() {
        preorden(raiz);
    }

    private void preorden(Nodo nodo) {
        if (nodo != null) {
            System.out.println(nodo.pais);
            preorden(nodo.izquierda);
            preorden(nodo.derecha);
        }
    }

    public void postorden() {
        postorden(raiz);
    }

    private void postorden(Nodo nodo) {
        if (nodo != null) {
            postorden(nodo.izquierda);
            postorden(nodo.derecha);
            System.out.println(nodo.pais);
        }
    }
}
