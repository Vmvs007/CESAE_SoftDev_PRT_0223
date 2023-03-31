import java.util.Scanner;

class Recursividade {

    /**
     * Função que permite criar e preencher um array de inteiros
     * @return
     */
    public static int [] criarPreencherArray(){

        return  preencherArray(criarArray());

    }

    /**
     * Função que cria um array de inteiros com o tamanho pretendido
     * @return Array de inteiros com o tamanho pretendido
     */
    public static int[] criarArray( ) {
        Scanner input = new Scanner(System.in);

        int i, maior = 0,count;

        System.out.print("Insira o tamanho do array: ");
        count = input.nextInt();

        int[] array = new int[count];
        return array;
    }

    /**
     * Função que preenche um array de inteiros
     * @param array - Recebe um array de inteiros
     * @return Array de inteiros preenchido
     */
    public static int[] preencherArray (int[] array){
        Scanner input = new Scanner(System.in);


        for  (int i=0; i< array.length; i++){
            System.out.print("Insira o numero do array, posição ["+i+"]: ");
            array[i]=input.nextInt();
        }

        return array;

    }

    /**
     * Função que imprime um array de inteiros
     * @param array Array de inteiros a imprimir
     */
    public static void imprimirArray (int[] array){
        Scanner input = new Scanner(System.in);

        for  (int i=0; i< array.length; i++){
            System.out.print(array[i]);
        }
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        imprimirArray(criarPreencherArray());
    }
}