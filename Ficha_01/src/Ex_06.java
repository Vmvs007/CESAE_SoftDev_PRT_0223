// Import obrigatório do package para fazer a leitura das introduções de dados do utilizador
import java.util.Scanner;

class Ex_06 {
    public static void main(String[] args) {

        //"Quebra-cabeças"
        System.out.println("\n***** Ficha 1 - Exercicio 6 ******\n");

        // Instância obrigatória da classe para fazer a leitura das introduções de dados do utilizador
        Scanner input = new Scanner(System.in);

        // Declarar as variáveis
        int valor1, valor2;

        // Ler o valor1
        System.out.print("Introduza o valor 1: ");
        valor1 = input.nextInt();

        // Ler o valor2
        System.out.print("Introduza o valor 2: ");
        valor2 = input.nextInt();

        //Código mágico
        //valor1 passa a diferença entre os dois
        valor1 = valor1 - valor2;
        //valor2 passa a valor2 mais a diferença (ou seja, já está como valor1)
        valor2 = valor2 + valor1;
        //valor1 passa ao valor2 (agora com valor1) mais o negativo de valor1 no momento (diferença entre os dois), ou seja, ao antigo valor2
        //valor1 = valor2 + (valor1 * (-1);
        valor1=valor2-valor1;

        //Imprimir o resultado
        System.out.println("\nPermuta de variaveis em progresso...\n");

        System.out.println("Valor 1 neste momento: "+ valor1);
        System.out.println("Valor 2 neste momento: "+ valor2);

    }
}