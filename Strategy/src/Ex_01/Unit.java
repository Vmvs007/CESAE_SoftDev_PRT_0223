package Ex_01;

public class Unit {
    private AttackStrategy attackStrategy;
    private String nome;


    public Unit(AttackStrategy attackStrategy, String nome) {
        this.attackStrategy = attackStrategy;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setAttackStrategy(AttackStrategy attackStrategy) {
        this.attackStrategy = attackStrategy;
    }

    public void performAttack() {
        attackStrategy.attack();
    }
}
