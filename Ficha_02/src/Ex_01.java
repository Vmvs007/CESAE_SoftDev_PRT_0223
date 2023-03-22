// Import obrigatório do package para fazer a leitura das introduções de dados do utilizador
import java.util.Scanner;

class Ex_01 {
    public static void main(String[] args) {

        System.out.println("\n***** Ficha 2 - Exercicio 1 ******\n");

        // Instância obrigatória da classe para fazer a leitura das introduções de dados do utilizador
        Scanner input = new Scanner(System.in);

        // Declarar as variáveis
        int num1, num2;

        // Ler o num1
        System.out.print("Introduza um numero: ");
        num1 = input.nextInt();

        // Ler o num2
        System.out.print("Introduza outro numero: ");
        num2 = input.nextInt();

        //Condição para verificar qual dos dois o maior
        if(num1>num2){
            //Caso o num1 seja maior
            System.out.println("O maior: "+ num1);
        }else{
            //Caso o num2 seja maior
            System.out.println("O maior: "+ num2);
        }

    }
}