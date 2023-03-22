// Import obrigatório do package para fazer a leitura das introduções de dados do utilizador
import java.util.Scanner;

class Ex_02 {
    public static void main(String[] args) {

        System.out.println("\n***** Ficha 2 - Exercicio 2 ******\n");

        // Instância obrigatória da classe para fazer a leitura das introduções de dados do utilizador
        Scanner input = new Scanner(System.in);

        // Declarar as variáveis
        double salario;

        // Ler o salario
        System.out.print("Introduza o salario anual: ");
        salario = input.nextDouble();

        //Verifica se o salario é menor ou igual a 15000
        if(salario<=15000){
            //Caso seja menor ou igual que 15000
            System.out.println("Impostos: "+salario*0.2);
        }else{
            //Caso seja maior que 15000
            System.out.println("Impostos: "+salario*0.3);
        }

    }
}