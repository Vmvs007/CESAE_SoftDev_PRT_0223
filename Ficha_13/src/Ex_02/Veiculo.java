package Ex_02;

public abstract class Veiculo {

    private String marca;
    private int ano;

    public Veiculo(String marca, int ano) {
        this.marca = marca;
        this.ano = ano;
    }

    public abstract void acelerar();
    public abstract void travar();
}
