package Ex_03;

public class Animal {
    private String nome;
    private boolean comFome;
    private Alimento tipoAlimentacao;
    public Animal(String nome, Alimento tipoAlimentacao) {
        this.nome = nome;
        this.comFome = true;
        this.tipoAlimentacao = tipoAlimentacao;
    }
    public String getNome() {
        return this.nome;
    }
    public boolean estaComFome() {
        return this.comFome;
    }
    public Alimento getTipoAlimentacao() {
        return this.tipoAlimentacao;
    }
    public void comer(Alimento comida) {
        if (this.tipoAlimentacao == comida) {
            this.comFome = false;
            System.out.println(nome + " comeu " + comida + ".");
        } else {
            System.out.println(nome + " não come " + comida + ".");
        }
    }
}