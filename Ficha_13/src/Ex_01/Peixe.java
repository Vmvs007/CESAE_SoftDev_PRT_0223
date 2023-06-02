package Ex_01;

public class Peixe extends Animal implements Aquatico{

    public Peixe(String nome, String especie) {
        super(nome, especie);
    }

    @Override
    public void emitirSom() {
        System.out.println("Glub Glub!");
    }

    @Override
    public void nadar() {
        System.out.println("Peixe a nadar...");
    }
}
