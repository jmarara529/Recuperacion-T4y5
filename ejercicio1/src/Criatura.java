public abstract class Criatura {
    private String nombre;
    private int edad;
    private int energia;

    public Criatura(String nombre, int edad) {
        anyadirNombre(nombre);
        anyadirEdad(edad);
    }

    private int anyadirEdad(int edad) {

        if (edad < 0){
            throw new IllegalArgumentException("edad no valida");
        }else this.edad = edad;

        return edad;
    }

    private String anyadirNombre(String nombre) {
        if (nombre.isBlank()){
            throw new IllegalArgumentException("Nombre no valido");
        }else this.nombre = nombre;
        return nombre;
    }

    public Criatura() {

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }
}
