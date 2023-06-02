package Ex_01;

public class MeleeAttackStrategy implements AttackStrategy{

    @Override
    public void attack() {
        System.out.println("Realizar ataque corpo a corpo!");
    }
}
