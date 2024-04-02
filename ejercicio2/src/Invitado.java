public class Invitado {

    private String nombre;
    private int fama;

    Fiesta fiesta = new Fiesta();

    public Invitado(String nombre) {
        this.nombre = nombre;
    }

    public Invitado(String nombre, int fama) {
        this.nombre = nombre;
        this.fama = fama;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getFama() {
        return fama;
    }

    public void setFama(int fama) {
        this.fama = fama;
    }

    @Override
    public String toString() {
        return "Invitado{ " + nombre + "(" + fama + ")}";
    }
}
