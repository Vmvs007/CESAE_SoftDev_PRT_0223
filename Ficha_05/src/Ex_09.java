import java.util.Scanner;
public class Ex_09 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Declara as variáveis
        int[][] matriz = new int[3][3]; // Declarar uma matriz inteira com 9 posições (3 linhas x 3 colunas)


        System.out.println("***** Ficha 5 - Exercicio 9 *****");

        // Ciclo que vai iterar 3 vezes - 1x para cada linha
        for(int linha=0;linha<3;linha++){
            // Ciclo que vai iterar 3 vezes - 1x para cada coluna
            for(int coluna=0; coluna<3;coluna++) {
                System.out.print("Introduza o numero na matriz[" + linha + "][" + coluna + "]: ");
                matriz[linha][coluna] = input.nextInt();
            }
        }

        //Imprime um enter *para ficar bonito*
        System.out.println(" ");

        // Ciclo que vai iterar 3 vezes - 1x para cada linha
        for(int linha=0;linha<3;linha++){
            // Ciclo que vai iterar 3 vezes - 1x para cada coluna
            for(int coluna=0; coluna<3;coluna++) {
                System.out.print(matriz[linha][coluna]+" ");
            }
            System.out.println("");
        }

    }
}