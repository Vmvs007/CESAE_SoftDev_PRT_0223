import java.util.Scanner;

//Escreva uma função que recebe um array de inteiros como parâmetro e retorna o maior valor do array.

class Recursividade {

    public static int [] criarPreencher(){

        return  insert(tamanho());

    }
    public static int[] tamanho ( ) {
        Scanner input = new Scanner(System.in);

        int i, maior = 0,count;

        System.out.print("Insira o tamanho do array: ");
        count = input.nextInt();

        int[] array = new int[count];
        return array;
    }

    public static int[] insert (int[] array){
        Scanner input = new Scanner(System.in);


        for  (int i=0; i< array.length; i++){
            System.out.print("Insira o numero do array, posição ["+i+"]: ");
            array[i]=input.nextInt();
        }

        return array;

    }

    public static void printArray (int[] array){
        Scanner input = new Scanner(System.in);


        for  (int i=0; i< array.length; i++){
            System.out.print(array[i]);
        }

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        printArray(criarPreencher());







    }

}