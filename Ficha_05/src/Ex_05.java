import java.util.Scanner;
public class Ex_05 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Declara as variáveis
       double[] array= new double[10]; // Declarar um array inteiro com 10 posições
        double total=0, media=0;

        System.out.println("***** Ficha 5 - Exercicio 5 *****");

        // Ciclo que vai iterar 10 vezes - Lê o número double para cada uma das 10 posições
        for(int i=0;i<10;i++){

            //Lê o número para cada posição do array
            System.out.print("Introduza o numero no array["+i+"]: ");
            array[i]= input.nextDouble();

            //Adicionar à variável total o valor introduzido
            total=total+array[i];
        }

        media=total/10;
        System.out.println("A média é: " + media);
    }
}