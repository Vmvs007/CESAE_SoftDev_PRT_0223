package Ex_01;

import java.util.Scanner;

public class Main {

    public static void estrategiaCombate(Unit jogador){
        Scanner input = new Scanner(System.in);
        System.out.print("Estratégia de combate a utilizar (MELEE, RANGED, MAGIC, FLEE): ");
        String estrategia = input.next();

        switch (estrategia.toUpperCase()){
            case "MELEE": jogador.setAttackStrategy(new MeleeAttackStrategy());
            break;

            case "RANGED": jogador.setAttackStrategy(new RangedAttackStrategy());
            break;

            case "MAGIC": jogador.setAttackStrategy(new MagicAttackStrategy());
            break;

            case "FLEE": jogador.setAttackStrategy(new FleeAttackStrategy());
                break;

            default:
                System.out.println("Estratégia indefinida");
                break;
        }

    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

/* Main que resolve o exercício
        Unit meleeUnit = new Unit(new MeleeAttackStrategy());
        meleeUnit.performAttack();


        Unit rangedUnit = new Unit(new RangedAttackStrategy());
        rangedUnit.performAttack();

        
        Unit magicUnit = new Unit(new MagicAttackStrategy());
        magicUnit.performAttack();
        */

        /*
        Unit jogador = new Unit(new MeleeAttackStrategy(),"Geralt");

        System.out.println(jogador.getNome() + " encontrou um inimigo humano, vai utilizar estratégia de combate curta");
        jogador.performAttack();

        System.out.println(jogador.getNome() + " encontrou um inimigo voador, vai utilizar estratégia de combate à distância");
        jogador.setAttackStrategy(new RangedAttackStrategy());
        jogador.performAttack();
        */

        System.out.print("Nome da personagem: ");
        String nome = input.next();

        Unit jogador = new Unit(new MeleeAttackStrategy(), nome);

        System.out.println("Bem-vindo "+ jogador.getNome()+" à aventura.");
        System.out.println("Encontras um soldado inimigo...");
        estrategiaCombate(jogador);
        jogador.performAttack();

        System.out.println("Encontras uma fera mágica...");
        estrategiaCombate(jogador);
        jogador.performAttack();
    }
}
