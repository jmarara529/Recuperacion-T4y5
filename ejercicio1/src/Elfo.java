public class Elfo extends Criatura{

    public Elfo(String nombre, int edad) {
        super(nombre, edad);
    }

    public String realizarAccion(){
        return getNombre() + " dispara una flecha";
    }

}
