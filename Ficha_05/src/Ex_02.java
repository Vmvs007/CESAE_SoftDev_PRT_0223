import java.util.Scanner;
public class Ex_02 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Declara as variáveis
        double[] precos = new double[10]; // Declarar um array inteiro com 10 posições
        double total=0;

        System.out.println("***** Ficha 5 - Exercicio 2 *****");

        // Ciclo que vai iterar 10 vezes - Lê o número double para cada uma das 10 posições
        for(int i=0;i<10;i++){

            //Lê o preço para cada posição do array "precos"
            System.out.print("Introduza o preço no precos["+i+"]: ");
            precos[i]= input.nextDouble();

            //Adicionar à variável total o valor introduzido
            total=total+precos[i];
        }

        System.out.println("O total dos preços introduzidos é: "+total);
    }
}