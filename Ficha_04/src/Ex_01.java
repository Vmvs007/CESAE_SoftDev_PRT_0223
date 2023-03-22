import java.util.Scanner;
public class Ex_01 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        // Declara as variáveis
        double num1=0, num2=0;
        String opcao,continuar;

        System.out.println("***** Ficha 4 - Exercicio 1 *****");

        // Menu
        do { //Linha importante para começar o menu

            // Ler num1
            System.out.print("Insira 1º número: ");
            num1=input.nextDouble();

            // Ler num2
            System.out.print("Insira 2º número: ");
            num2=input.nextDouble();

            do {
                // Imprimir opções do menu
                System.out.println("+ - Soma");
                System.out.println("- - Subtração");
                System.out.println("* - Multiplicação");
                System.out.println("/ - Divisão");

                //Ler opcao do utilizador
                System.out.print("\nIntroduza a opção: ");
                opcao=input.next();

            } while (!opcao.equals("+") && !opcao.equals("-") && !opcao.equals("*") && !opcao.equals("/"));
            // Só deixa avançar se a opção for válida

            switch (opcao) {
                case "+":
                    System.out.println("\n*****Soma*****\n");
                    System.out.println(num1 + num2);
                    break;

                case "-":
                    System.out.println("\n*****Subtração*****\n");
                    System.out.println(num1 - num2);
                    break;

                case "*":
                    System.out.println("\n*****Multiplicação*****\n");
                    System.out.println(num1 * num2);
                    break;

                case "/":
                    System.out.println("\n*****Divisão*****\n");
                    System.out.println(num1 / num2);
                    break;
            }

            //Linhas importantes para ler se o utilizador quer novamente o menu
            System.out.println("\nDeseja continuar? (s/n): ");
            continuar=input.next();

        } while (continuar.equals("s")); // Linha importante para fechar o menu e terminar o programa
        // Só deixa sair se opção for a de saída
    }
}
