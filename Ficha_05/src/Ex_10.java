import java.util.Scanner;

public class Ex_10 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Declara as variáveis
        int[][] matriz = new int[5][5]; // Declarar uma matriz inteira com 25 posições (5 linhas x 5 colunas)
int somatorio=0;

        System.out.println("***** Ficha 5 - Exercicio 10 *****");


    // Ciclo que vai iterar 5 vezes - 1x para cada linha
        for(int linha=0;linha<5;linha++){
            // Ciclo que vai iterar 5 vezes - 1x para cada coluna
            for(int coluna=0; coluna<5;coluna++) {
                System.out.print("Introduza o numero na matriz[" + linha + "][" + coluna + "]: ");
                matriz[linha][coluna] = input.nextInt();
            }
        }


        // Ciclo que vai iterar 5 vezes - 1x para cada linha
        for(int linha=0;linha<5;linha++) {
            // Ciclo que vai iterar 5 vezes - 1x para cada coluna
            for (int coluna = 0; coluna < 5; coluna++) {
                //somatorio=somatorio+matriz[linha][coluna];
                somatorio+=matriz[linha][coluna];
            }
        }

        System.out.println("A soma de todos os elementos da matriz: "+somatorio);

    }
}
