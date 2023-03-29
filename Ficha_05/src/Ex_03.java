import java.util.Scanner;
public class Ex_03 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Declara as variáveis
        int[] array = new int[10]; // Declarar um array inteiro com 10 posições
        int maior;

        System.out.println("***** Ficha 5 - Exercicio 3 *****");

        //Lê o array[0] para inicializar a variável maior
        //Resolve o problema se o utilizador colocar só números negativos
        System.out.print("Introduza o numero no array[0]: ");
        array[0]= input.nextInt();
        maior=array[0];

        // Ciclo que vai iterar 9 vezes - Lê o número inteiro para cada uma das 9 posições (1-9)
        for(int i=1;i<10;i++){
            System.out.print("Introduza o numero no array["+i+"]: ");
            array[i]= input.nextInt();

            //Se o valor introduzido for maior que o maior, então esse próprio valor passa a ser maior
            if(array[i]>maior){
                System.out.println("O valor do maior mudou");
                maior=array[i];
            }
        }

        System.out.println("O maior é: "+maior);
    }
}
