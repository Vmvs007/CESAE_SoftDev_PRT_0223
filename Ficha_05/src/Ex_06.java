import java.util.Scanner;
public class Ex_06 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Declara as variáveis
        int[] array = new int[10]; // Declarar um array inteiro com 10 posições
        boolean crescente=true;

        System.out.println("***** Ficha 5 - Exercicio 6 *****");

        //Lê o array[0]
        System.out.print("Introduza o numero no array[0]: ");
        array[0]= input.nextInt();

        // Ciclo que vai iterar 10 vezes - Lê o número inteiro para cada uma das 10 posições
        for(int i=1;i<10;i++){
            System.out.print("Introduza o numero no array["+i+"]: ");
            array[i]= input.nextInt();

            //Comparar o elemento lido com o elemento lido anteriormente
            //Se o novo valor for menor que o anterior, então não está em ordem crescente
            if(array[i]<array[i-1]){
                System.out.println("Deixou de ser crescente");
                crescente=false;
            }
        }

        //Verificar se a variável crescente se manteve true
        if(crescente){
            System.out.println("Os elementos estão em ordem crescente");
        }else{
            System.out.println("Os elementos não estão em ordem crescente");
        }


    }
}