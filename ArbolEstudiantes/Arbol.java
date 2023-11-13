package ArbolEstudiantes;

class Arbol {
    Nodo raiz;

    public void insertar(Estudiante estudiante) {
        if (raiz == null) {
            raiz = new Nodo(estudiante);
        } else {
            raiz.insertar(estudiante);
        }
    }

    public void recorrerEnOrden() {
        recorrerEnOrden(raiz);
    }

    private void recorrerEnOrden(Nodo nodo) {
        if (nodo != null) {
            recorrerEnOrden(nodo.izquierda);
            System.out.println(nodo.estudiante);
            recorrerEnOrden(nodo.derecha);
        }
    }

    public void recorrerPreOrden() {
        recorrerPreOrden(raiz);
    }

    private void recorrerPreOrden(Nodo nodo) {
        if (nodo != null) {
            System.out.println(nodo.estudiante);
            recorrerPreOrden(nodo.izquierda);
            recorrerPreOrden(nodo.derecha);
        }
    }

    public void recorrerPostOrden() {
        recorrerPostOrden(raiz);
    }

    private void recorrerPostOrden(Nodo nodo) {
        if (nodo != null) {
            recorrerPostOrden(nodo.izquierda);
            recorrerPostOrden(nodo.derecha);
            System.out.println(nodo.estudiante);
        }
    }

    public Estudiante buscar(int id) {
        return buscar(raiz, id);
    }

    private Estudiante buscar(Nodo nodo, int id) {
        if (nodo == null) {
            return null;
        } else if (nodo.estudiante.getId() == id) {
            return nodo.estudiante;
        } else if (id < nodo.estudiante.getId()) {
            return buscar(nodo.izquierda, id);
        } else {
            return buscar(nodo.derecha, id);
        }
    }
}
