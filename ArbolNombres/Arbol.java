package ArbolNombres;

class Arbol {
    Nodo raiz;

    public void insertar(String nombre) {
        if (raiz == null) {
            raiz = new Nodo(nombre);
        } else {
            raiz.insertar(nombre);
        }
    }

    public void recorrerEnOrden() {
        recorrerEnOrden(raiz);
    }

    private void recorrerEnOrden(Nodo nodo) {
        if (nodo != null) {
            recorrerEnOrden(nodo.izquierda);
            System.out.print(nodo.nombre + " ");
            recorrerEnOrden(nodo.derecha);
        }
    }

    public void recorrerPreOrden() {
        recorrerPreOrden(raiz);
    }

    private void recorrerPreOrden(Nodo nodo) {
        if (nodo != null) {
            System.out.print(nodo.nombre + " ");
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
            System.out.print(nodo.nombre + " ");
        }
    }
}
