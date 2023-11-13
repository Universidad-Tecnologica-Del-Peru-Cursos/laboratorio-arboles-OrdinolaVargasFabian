package ArbolEnteros;

class Arbol {
    Nodo raiz;

    public void insertar(int valor) {
        if (raiz == null) {
            raiz = new Nodo(valor);
        } else {
            raiz.insertar(valor);
        }
    }

    public void recorrerEnOrden() {
        recorrerEnOrden(raiz);
    }

    private void recorrerEnOrden(Nodo nodo) {
        if (nodo != null) {
            recorrerEnOrden(nodo.izquierda);
            System.out.print(nodo.valor + " ");
            recorrerEnOrden(nodo.derecha);
        }
    }

    public void recorrerPreOrden() {
        recorrerPreOrden(raiz);
    }

    private void recorrerPreOrden(Nodo nodo) {
        if (nodo != null) {
            System.out.print(nodo.valor + " ");
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
            System.out.print(nodo.valor + " ");
        }
    }

    
}

