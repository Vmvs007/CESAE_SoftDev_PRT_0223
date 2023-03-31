import java.util.Scanner;

public class Ex_05 {

    public static boolean par(int num){

        if(num%2==0){
            return true;
        }else{
            return false;
        }
    }

    public static boolean positivo(int num){

        if(num>=0){
            return true;
        }else{
            return false;
        }
    }

    public static boolean primo(int num){

        // Declara as variáveis
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
