package RecomendarCategoriaLibros;

public class NodoArbol {
    private Pregunta pregunta;
    private NodoArbol izquierdo=null;
    private NodoArbol derecho=null;

    public NodoArbol(Pregunta pregunta) {
        this.pregunta = pregunta;
    }

    public void insertar_elemento(Pregunta pregunta){
        if(this.pregunta.getId()<pregunta.getId()){
            if(this.izquierdo==null){
                this.izquierdo=new NodoArbol(pregunta);
            }else{
                this.izquierdo.insertar_elemento(pregunta);
            }
        }else if(this.pregunta.getId()>pregunta.getId()){
            if(this.derecho==null){
                this.derecho=new NodoArbol(pregunta);
            }else{
                this.derecho.insertar_elemento(pregunta);
            }
        }
    }

    public Pregunta getPregunta() {
        return pregunta;
    }
    public NodoArbol getIzquierdo() {
        return izquierdo;
    }
    public NodoArbol getDerecho() {
        return derecho;
    }
    public void setIzquierdo(NodoArbol izquierdo) {
        this.izquierdo = izquierdo;
    }
    public void setDerecho(NodoArbol derecho) {
        this.derecho = derecho;
    }
}

