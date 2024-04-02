public class Fiesta {

    private int glamur = 0;
    private int aforo;

    public void entrar(){
        Invitado invitado = new Invitado("antonio",2);
        glamur += invitado.getFama();
    }

    public void salir(){



    }

    public String mostrarGlamur(){
        return "Glamur: "+ glamur;
    }

}
