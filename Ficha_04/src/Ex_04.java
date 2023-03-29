import java.util.Scanner;
public class Ex_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("***** Ficha 4 - Exercicio 4 *****");

        // Declara as variáveis
        int num, divisor=2;
        boolean primo = true;

        System.out.println("Introduza um número: ");
        num= input.nextInt();

        //Considerar exceções como 0, 1 e números negativos
        if(num<=1){
            primo=false;
        }

        //Vou dividir o numero por todos os números entre 2 e num-1
        while(divisor<num){

            //Perceber se a divisão inteira
            if(num%divisor==0){
                primo=false;
            }
            divisor++;
        }

        //Apresento feedback para se o número é primo ou não
        //Para variáveis do tipo boolean, podemos usar condições com o seguinte aspeto
        if(primo){
            System.out.println("O número é primo!");
        }else{
            System.out.println("O número não é primo");
        }

    }
}
