import java.util.Scanner;

public class Ex_05 {

    /**
     * Função que verificar a paridade de um número
     *
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

    /**
     * Função menu
     */
    public static void menu(){
        Scanner input = new Scanner(System.in);

        // Declara as variáveis
        int opcao,num;

        do{

            //Lê o número do utilizador
            System.out.print("Introduza um número: ");
            num=input.nextInt();

            do{
                //Apresenta as opções do menu
                System.out.println("1 - Par");
                System.out.println("2 - Positivo");
                System.out.println("3 - Primo");
                System.out.println("4 - Sair");

                //Lê a escolha do utilizador
                System.out.print("Escolha uma das opções: ");
                opcao=input.nextInt();

                //Se a opção escolhida for inválida
                if(opcao<1 || opcao >4){
                    System.out.println("Opção Inválida");
                }

                //Apresentar novamente o menu se a opção não for válida
            }while(opcao<1 || opcao >4);

            switch(opcao){
                case 1: // Par
                    if(par(num))
                        System.out.println("***** Par *****");
                    else
                        System.out.println("***** Impar *****");
                    break;

                case 2:
                    System.out.println("Atualizar");
                    break;

                case 3:
                    System.out.println("Eliminar");
                    break;

                case 4:
                    System.out.println("Sair");
                    break;
            }

            //Volto a repetir o programa enquanto opção não for 4
        }while(opcao!=4);

    }


    public static void main(String[] args) {

        // Declarar variáveis
        int num;

        // Declaro o Scanner
        Scanner input = new Scanner(System.in);

        System.out.println("***** Ficha 06 - Exercicio 5 *****");


    }
}
