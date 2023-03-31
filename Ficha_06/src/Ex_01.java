import java.util.Scanner;

public class Ex_01 {

    /**
     * Função que verificar a paridade de um número
     * @param num
     * @return true se par || false se impar
     */
    public static boolean par(int num){

        // Verifica o resto da divisão inteira por 2
        if(num%2==0){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {

        // Declarar variáveis
        int num;

        Scanner input = new Scanner(System.in);

        System.out.println("***** Ficha 06 - Exercicio 1 *****");

        //Ler número inteiro do utilizador
        System.out.print("Introduza um número: ");
        num=input.nextInt();

        // Invocar a função "par" e imprime a paridade do número
        if(par(num)){
            System.out.println("É par");
        }else{
            System.out.println("É ímpar");
        }


    }

}
