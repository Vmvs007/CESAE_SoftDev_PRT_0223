package Ex_02;

public class Mota extends Veiculo implements Transporte{
    public Mota(String marca, int ano) {
        super(marca, ano);
    }

    @Override
    public void acelerar() {
        System.out.println("Mota a acelerar...");
    }

    @Override
    public void travar() {
        System.out.println("Mota a travar...");
    }

    @Override
    public void transportar() {
        System.out.println("A transportar passageiro de mota...");
    }
}
