import java.util.Scanner;

public class Ex_13 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("***** Ficha 5 - Exercicio 13 *****");

        // Declara as variáveis
        int[] array1 = new int[10];
        int[] array2 = new int[10];
        int[][] matriz = new int[10][2]; // Declarar uma matriz inteira com 20 posições (10 linhas x 2 colunas)

//Ler valores do utilizador para array1
        for (int i = 0; i < 10; i++) {
            System.out.print("Insira um número no array1["+i+"]: ");
            array1[i]=input.nextInt();
        }

        //Ler valores do utilizador para array2
        for (int i = 0; i < 10; i++) {
            System.out.print("Insira um número no array2["+i+"]: ");
            array2[i]=input.nextInt();
        }

        for(int i=0;i<10;i++){
                matriz[i][0]=array1[i];
                matriz[i][1]=array2[i];
        }


        //Imprime um enter *para ficar bonito*
        System.out.println(" ");

        // Ciclo que vai iterar 10 vezes - 1x para cada linha
        for(int linha=0;linha<10;linha++){
            // Ciclo que vai iterar 2 vezes - 1x para cada coluna
            for(int coluna=0; coluna<2;coluna++) {
                System.out.print(matriz[linha][coluna]+" ");
            }
            System.out.println("");
        }

        /*
        // Ciclo que vai iterar 10 vezes - 1x para cada linha
        for(int linha=0;linha<10;linha++){
                System.out.print(matriz[linha][0]+" ");
                System.out.print(matriz[linha][1]+" ");
            }
            System.out.println("");
        }
        */
    }
}