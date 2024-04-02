public class Mago extends Criatura{

    int nivelMagico;

    public Mago(String nombre, int edad, int nivelMagico) {
        super(nombre, edad);
        this.nivelMagico = nivelMagico;
    }

    public String realizarAccion(){

        if (nivelMagico >= 50){

            return getNombre() + " lanza un poderoso hechizo";

        }else {

            return getNombre() + " genera una pequeña chispa";

        }

    }

}
