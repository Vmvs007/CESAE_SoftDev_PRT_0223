import java.util.Scanner;
public class Ex_06 {

    public static int maiorElemento (int[] array){
        int maior=array[0];

        for(int i=0;i<array.length;i++){
            if(array[i]>maior){
                maior=array[i];
            }
        }

        return maior;
    }


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        //Declarar variáveis
        int tamanhoArray;

        System.out.print("Quantos números quer introduzir: ");
        tamanhoArray=input.nextInt();

        int[] array= new int[tamanhoArray];

        for(int i=0; i<array.length;i++){
            System.out.print("Introduza um numero no array["+i+"]: ");
            array[i]=input.nextInt();
        }

        System.out.println("O maior elemento do array é: "+ maiorElemento(array));
    }
}
