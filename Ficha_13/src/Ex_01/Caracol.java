package Ex_01;

public class Caracol extends Animal implements Terrestre{
    public Caracol(String nome, String especie) {
        super(nome, especie);
    }

    @Override
    public void emitirSom() {
        System.out.println("Barulho lento...");
    }

    @Override
    public void andar() {
        System.out.println("Caracol a andar...");
    }
}
