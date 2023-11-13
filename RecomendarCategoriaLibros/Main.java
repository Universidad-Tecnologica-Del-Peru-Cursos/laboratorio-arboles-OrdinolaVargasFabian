package RecomendarCategoriaLibros;

public class Main {
    public static void main(String[] args) {
        Arbol arbol = new Arbol();

        // Crear preguntas y categorías
        NodoArbol raiz = new NodoArbol(new Pregunta(1, "¿Prefieres ficción sobre realidad?"));
        
        NodoArbol nodoFiccion = new NodoArbol(new Pregunta(2, "¿Te gustan las historias de otro mundo?"));
        NodoArbol nodoRealidad = new NodoArbol(new Pregunta(3, "¿Prefieres historias con un trasfondo histórico?"));
        
        NodoArbol nodoCienciaFiccion = new NodoArbol(new Pregunta(4, "¿Te interesan la ciencia y el futuro?"));
        NodoArbol nodoFantasia = new NodoArbol(new Pregunta(5, "¿Te gustan los mundos mágicos y las criaturas fantásticas?"));
        
        NodoArbol nodoHistoria = new NodoArbol(new Pregunta(6, "Historia"));
        NodoArbol nodoBiografia = new NodoArbol(new Pregunta(7, "Biografía"));
        
        NodoArbol nodoEspacio = new NodoArbol(new Pregunta(8, "Ciencia Ficción: Espacio"));
        NodoArbol nodoDistopia = new NodoArbol(new Pregunta(9, "Ciencia Ficción: Distopía"));
        
        NodoArbol nodoMagia = new NodoArbol(new Pregunta(10, "Fantasía: Magia"));
        NodoArbol nodoAventuraFantastica = new NodoArbol(new Pregunta(11, "Fantasía: Aventura"));

        // Construir el árbol
        raiz.setIzquierdo(nodoFiccion);
        raiz.setDerecho(nodoRealidad);

        nodoFiccion.setIzquierdo(nodoCienciaFiccion);
        nodoFiccion.setDerecho(nodoFantasia);

        nodoRealidad.setIzquierdo(nodoHistoria);
        nodoRealidad.setDerecho(nodoBiografia);

        nodoCienciaFiccion.setIzquierdo(nodoEspacio);
        nodoCienciaFiccion.setDerecho(nodoDistopia);

        nodoFantasia.setIzquierdo(nodoMagia);
        nodoFantasia.setDerecho(nodoAventuraFantastica);

        arbol.setRaiz(raiz);

        // Realizar la operación
        String categoria = arbol.realizarOperacion();
        System.out.println("La categoría recomendada es: " + categoria);
    }
}
