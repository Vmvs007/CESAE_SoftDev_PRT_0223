import java.util.Scanner;

public class Ex_03 {

    /**
     * Função que verifica se um número é primo
     * @param num
     * @return true se primo || false se não primo
     */
    public static boolean primo(int num){

        // Declara as variáveis locais
        int divisor=2;


        //Considerar exceções como 0, 1 e números negativos
        if(num<=1){
            return false;
        }

        //Vou dividir o numero por todos os números entre 2 e num-1
        while(divisor<num){

            //Perceber se a divisão inteira
            if(num%divisor==0){
                return false;
            }
            divisor++;
        }

        return true;
    }

    public static void main(String[] args) {

        // Declarar variáveis
        int num;

        // Declaro o Scanner
        Scanner input = new Scanner(System.in);

        System.out.println("***** Ficha 06 - Exercicio 3 *****");

        //Ler número inteiro do utilizador
        System.out.print("Introduza um número: ");
        num=input.nextInt();

        // Invocar a função "par"
        if(primo(num)){
            System.out.println("É primo");
        }else{
            System.out.println("Não é primo");
        }




    }

}