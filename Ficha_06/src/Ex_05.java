import java.util.Scanner;

public class Ex_05 {

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

    /**
     * Função que verifica se um número é positivo
     * @param num
     * @return true se positivo || false se negativo
     */
    public static boolean positivo(int num){

        // Verifica se o número é igual ou superior a 0
        if(num>=0){
            return true;
        }else{
            return false;
        }
    }

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

        System.out.println("***** Ficha 06 - Exercicio 5 *****");


    }
}
