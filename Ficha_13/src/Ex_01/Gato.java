package Ex_01;

public class Gato extends Animal implements Terrestre,Agilidade{
    public Gato(String nome, String especie) {
        super(nome, especie);
    }

    @Override
    public void emitirSom() {
        System.out.println("Miau!");
    }

    @Override
    public void andar() {
        System.out.println("Gato a andar...");
    }

    @Override
    public void saltar() {
        System.out.println("Gato a saltar!");
    }


}
