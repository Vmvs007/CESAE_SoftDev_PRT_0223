package Ex_01;

public class Cao extends Animal implements Terrestre,Agilidade{
    public Cao(String nome, String especie) {
        super(nome, especie);
    }

    @Override
    public void emitirSom() {
        System.out.println("Au au au!");
    }

    @Override
    public void andar() {
        System.out.println("Cão a andar!");
    }

    @Override
    public void saltar() {
        System.out.println("Cão a saltar!");

    }
}
