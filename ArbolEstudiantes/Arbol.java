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

        public void eliminar(int id) {
            raiz = eliminar(raiz, id);
        }

        private Nodo eliminar(Nodo nodo, int id) {
            if (nodo == null) {
                return null;
            } else if (id < nodo.estudiante.getId()) {
                nodo.izquierda = eliminar(nodo.izquierda, id);
            } else if (id > nodo.estudiante.getId()) {
                nodo.derecha = eliminar(nodo.derecha, id);
            } else {
                if (nodo.izquierda == null) {
                    return nodo.derecha;
                } else if (nodo.derecha == null) {
                    return nodo.izquierda;
                }

                Nodo sucesor = valorMinimo(nodo.izquierda);
                nodo.estudiante = sucesor.estudiante;
                nodo.izquierda = eliminar(nodo.izquierda, sucesor.estudiante.getId());
            }

            return nodo;
        }

        private Nodo valorMinimo(Nodo nodo) {
            Nodo actual = nodo;
            while (actual.derecha != null) {
                actual = actual.derecha;
            }
            return actual;
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
