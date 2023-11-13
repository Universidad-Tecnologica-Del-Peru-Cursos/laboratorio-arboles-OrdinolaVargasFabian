package ArbolPaises;

class Pais {
    private int id;
    private String nombre;

    public Pais(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Pais{" + "id=" + id + ", nombre='" + nombre + '\'' + '}';
    }
}
