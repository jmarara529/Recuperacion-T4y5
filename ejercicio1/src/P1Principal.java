public class P1Principal {

    public static void main(String[] args) {

        Dragon dragon = new Dragon("Rodolfo",5);

        Elfo elfo = new Elfo("Antonio", 20);

        HombreLobo hombreLobo = new HombreLobo("Manuel", 23);

        Mago mago = new Mago("Segilfredo", 43,50);

        System.out.println(mago.realizarAccion());
        System.out.println(hombreLobo.realizarAccion());
        System.out.println(elfo.realizarAccion());
        System.out.println(dragon.realizarAccion());
        System.out.println(dragon.volar());

    }

}
