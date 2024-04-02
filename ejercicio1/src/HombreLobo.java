public class HombreLobo extends Criatura{

    public HombreLobo(String nombre, int edad) {
        super(nombre, edad);
    }

    public String realizarAccion(){
        return getNombre() + " aúlla a la luna";
    }

}
