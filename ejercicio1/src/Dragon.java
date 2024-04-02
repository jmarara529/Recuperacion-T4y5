public class Dragon extends Criatura implements Volar{

    public Dragon(String nombre, int edad) {
        super(nombre, edad);
    }

    public String realizarAccion(){
        return getNombre() + " escupe fuego";
    }

    @Override
    public String volar() {
        return getNombre() + " vuela ágilmente sobre los árboles";
    }
}
