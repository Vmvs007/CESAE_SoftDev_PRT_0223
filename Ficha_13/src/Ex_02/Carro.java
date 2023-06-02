package Ex_02;

public class Carro extends Veiculo implements Transporte{
    public Carro(String marca, int ano) {
        super(marca, ano);
    }

    @Override
    public void acelerar() {
        System.out.println("Carro a acelerar...");
    }

    @Override
    public void travar() {
        System.out.println("Carro a travar...");
    }

    @Override
    public void transportar() {
        System.out.println("A transportar passageiros de carro...");
    }
}
