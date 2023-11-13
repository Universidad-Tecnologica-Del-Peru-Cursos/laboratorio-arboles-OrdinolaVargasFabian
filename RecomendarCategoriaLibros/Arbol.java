package RecomendarCategoriaLibros;

import java.util.Scanner;

public class Arbol {
    private NodoArbol raiz;

    public Arbol() {
        this.raiz = null;
    }

    public void setRaiz(NodoArbol nodo) {
        this.raiz = nodo;
    }

    public String realizarOperacion() {
        Scanner scanner = new Scanner(System.in);
        String resultado = preorden(this.raiz, scanner);
        scanner.close();
        return resultado;
    }

    private String preorden(NodoArbol nodo, Scanner scanner) {
        if (nodo == null) {
            return "";
        }

        String respuesta;
        if (nodo.getIzquierdo() != null || nodo.getDerecho() != null) {
            System.out.println(nodo.getPregunta().getTexto() + " (Si/No)");
            respuesta = scanner.nextLine();
            if ("Si".equalsIgnoreCase(respuesta)) {
                return preorden(nodo.getIzquierdo(), scanner);
            } else {
                return preorden(nodo.getDerecho(), scanner);
            }
        } else {
            return nodo.getPregunta().getTexto();  // Esto debería ser una categoría final
        }
    }
}
