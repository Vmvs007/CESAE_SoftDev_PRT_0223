import java.util.Scanner;

public class Ex_14 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("***** Ficha 5 - Exercicio 14 *****");

        // Declara as variáveis
        int[][] matriz = new int[4][4]; // Declarar uma matriz inteira com 16 posições (4 linhas x 4 colunas)
int somatorio=0;

        // Ciclo que vai iterar 4 vezes - 1x para cada linha
        for(int linha=0;linha<4;linha++){
            // Ciclo que vai iterar 4 vezes - 1x para cada coluna
            for(int coluna=0; coluna<4;coluna++) {
                System.out.print("Introduza o numero na matriz[" + linha + "][" + coluna + "]: ");
                matriz[linha][coluna] = input.nextInt();
            }
        }

        // Ciclo que vai iterar 4 vezes - 1x para cada linha
        for(int linha=0;linha<4;linha++){
            // Ciclo que vai iterar 4 vezes - 1x para cada coluna
            for(int coluna=0; coluna<4;coluna++) {
                if(linha==coluna){
                    somatorio+=matriz[linha][coluna];
                }
            }
        }

        for(int i=0; i<4;i++){
            somatorio+=matriz[i][i];
        }

        System.out.println("A soma dos elementos da diagonal principal é: "+somatorio);

    }
}