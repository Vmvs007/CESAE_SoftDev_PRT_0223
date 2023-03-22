
// Import obrigatório do package para fazer a leitura das introduções de dados do utilizador
import java.util.Scanner;

class Ex_05 {
    public static void main(String[] args) {

        System.out.println("\n***** Ficha 1 - Exercicio 5 ******\n");

        // Instância obrigatória da classe para fazer a leitura das introduções de dados do utilizador
        Scanner input = new Scanner(System.in);

        // Declarar as variáveis
        double valor1, valor2, valor3, media;

        // Ler o valor1
        System.out.print("Introduza o valor 1: ");
        valor1 = input.nextDouble();

        // Ler o valor2
        System.out.print("Introduza o valor 2: ");
        valor2 = input.nextDouble();

        // Ler o valor3
        System.out.print("Introduza o valor 3: ");
        valor3 = input.nextDouble();

        // Calcular a media aritmetica
        media = (valor1 + valor2 + valor3) / 3;

        // Imprimir a media aritmetica
        System.out.println("Media aritmetica: " + media);

        // Imprimir a media aritmetica - segunda explicacao
    /* Podemos imprimir logo resultados de operações
    no entanto, é boa prática separar a lógica */

        //System.out.println("Media aritmetica: " + (valor1 + valor2 + valor3) / 3);


        // Calcular a media ponderada
        media = ((valor1*0.2) + (valor2*0.3) + (valor3*0.5));
        // Imprimir a media ponderada
        System.out.println("Media ponderada: " + media);
    }
}