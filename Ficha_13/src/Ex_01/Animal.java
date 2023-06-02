package Ex_01;

public abstract class Animal {
    String nome, especie;

    public Animal(String nome, String especie) {
        this.nome = nome;
        this.especie = especie;
    }

    public abstract void emitirSom();
}
