package Ex_2;

import java.util.Scanner;

public class RestauranteMexicano {
    public static void main(String[] args) {

        // Scanner
        Scanner input = new Scanner(System.in);

        // Declarar Variáveis
        String escolha;

        System.out.println("Qual o tipo de taco (Carne Vaca, Carne Frango, Vegetariano, Pimentos): ");
        escolha= input.nextLine();

        Taco tacoUser = TacoFactory.createTaco(escolha.toUpperCase());

        tacoUser.prepare();
        tacoUser.bake();
        tacoUser.box();
         tacoUser.eat();
    }
}
