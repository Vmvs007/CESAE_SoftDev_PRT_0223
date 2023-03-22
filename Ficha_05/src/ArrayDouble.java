import java.util.Scanner;
public class ArrayDouble {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Declara as variáveis
        double[] array = new double[10]; // Declarar um array inteiro com 10 posições


        System.out.println("***** Ficha 5 - Exercicio 1 *****");

        // Ciclo que vai iterar 10 vezes - Lê o numero inteiro para cada uma das 10 posições
        for(int i=0;i<10;i++){
            //Ler numero do utilizador - o separador decimal é a virgula!!! ¯\_(ツ)_/¯
            System.out.print("Introduza o numero no array["+i+"]: ");
            array[i]= input.nextDouble();
        }

        //Imprime um enter *para ficar bonito*
        System.out.println(" ");

        // Ciclo que vai iterar 10 vezes - Imprime o array
        for(int i=0;i<10;i++){
            System.out.println("Array["+i+"]: "+array[i]);
        }

    }
}