import java.util.Scanner;

public class Ex_11 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Declara as variáveis
        int[][] matriz = new int[4][5]; // Declarar uma matriz inteira com 20 posições (4 linhas x 5 colunas)
int escolha, repeticoes=0;

        System.out.println("***** Ficha 5 - Exercicio 11 *****");

        // Ciclo que vai iterar 4 vezes - 1x para cada linha
        for(int linha=0;linha<4;linha++){
            // Ciclo que vai iterar 5 vezes - 1x para cada coluna
            for(int coluna=0; coluna<5;coluna++) {
                System.out.print("Introduza o numero na matriz[" + linha + "][" + coluna + "]: ");
                matriz[linha][coluna] = input.nextInt();
            }
        }

        System.out.print("Qual o número a verificar as suas repetições na matriz: ");
        escolha=input.nextInt();

        // Ciclo que vai iterar 4 vezes - 1x para cada linha
        for(int linha=0;linha<4;linha++){
            // Ciclo que vai iterar 5 vezes - 1x para cada coluna
            for(int coluna=0; coluna<5;coluna++) {
                if(matriz[linha][coluna]==escolha){
                    repeticoes++;
                }
            }
        }

        System.out.println("O número "+escolha+" aparece "+ repeticoes+" vezes na matriz");
    }
}