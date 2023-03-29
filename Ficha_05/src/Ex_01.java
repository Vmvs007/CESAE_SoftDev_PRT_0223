import java.util.Scanner;
public class Ex_01 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Declara as variáveis
        int[] array = new int[10]; // Declarar um array inteiro com 10 posições


        System.out.println("***** Ficha 5 - Exercicio 1 *****");

        // Ciclo que vai iterar 10 vezes - Lê o número inteiro para cada uma das 10 posições
        for(int i=0;i<10;i++){
            System.out.print("Introduza o numero no array["+i+"]: ");
            array[i]= input.nextInt();
        }

        //Imprime um enter *para ficar bonito*
        System.out.println(" ");

        // Ciclo que vai iterar 10 vezes - Imprime o array
        for(int i=0;i<10;i++){
            System.out.println("Array["+i+"]: "+array[i]);
        }

    }
}
