import java.util.Scanner;
public class Ex_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("***** Ficha 4 - Exercicio 3 *****");

        // Declara as variáveis
        int segredo, tentativa, num_tentativas=0;

        //Ciclo vai executar até o jogador 1 introduzir um número válido
        do {
            //Ler o número do jogador 1
            System.out.print("Jogador 1 - Introduza um número secreto (entre 0 e 100): ");
            segredo = input.nextInt();

        }while(segredo<0 ||segredo>100);


        do {
            //Ler o número do jogador 2
            System.out.print("Jogador 2 - Tente adivinhar o número secreto: ");
            tentativa = input.nextInt();

            //Dar feedback ao jogador 2 (se a tentativa é maior ou menor)
            if (tentativa < segredo) {
                System.out.println("Muito baixo, sobe um pouco");
            } else if (tentativa > segredo) {
                System.out.println("Muito alto, desce um pouco");
            }

            //Incremento o numero de tentativas
            num_tentativas++;

        }while(tentativa!=segredo);

        System.out.println("Parabéns! Adivinhou com "+num_tentativas+" tentativas!");

    }
}
