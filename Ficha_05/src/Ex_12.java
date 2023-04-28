import java.util.Scanner;

public class Ex_12 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Declara as variáveis
        int[][] matriz = new int[3][3]; // Declarar uma matriz inteira com 9 posições (3 linhas x 3 colunas)
int menor, maior;

        System.out.println("***** Ficha 5 - Exercicio 12 *****");

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
                System.out.print(matriz[linha][coluna]+"\t|\t");
            }
            System.out.println("");
        }

        menor=matriz[0][0];
        maior=matriz[0][0];

// Ciclo que vai iterar 3 vezes - 1x para cada linha
        for(int linha=0;linha<3;linha++){
            // Ciclo que vai iterar 3 vezes - 1x para cada coluna
            for(int coluna=0; coluna<3;coluna++) {

                //Condição para encontrar o menor elemento
                if(matriz[linha][coluna]<menor){
                    menor=matriz[linha][coluna];
                }

                //Condição para encontrar o maior elemento
                if(matriz[linha][coluna]>maior){
                    maior=matriz[linha][coluna];
                }
            }
        }

        System.out.println("O menor elemento da matriz é: "+menor);
        System.out.println("O maior elemento da matriz é: "+maior);



    }
}