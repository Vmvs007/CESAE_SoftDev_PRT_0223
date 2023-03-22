// Import obrigatório do package para fazer a leitura das introduções de dados do utilizador
import java.util.Scanner;

class Ex_03 {
    public static void main(String[] args) {

        System.out.println("\n***** Ficha 2 - Exercicio 3 ******\n");

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
            System.out.println("Impostos de 20: "+salario*0.2);
        }

        //Verifica se o salario está entre 15000 e 20000
        if(salario>15000 && salario <=20000){
            //Caso esteja entre 15000 e 20000
            System.out.println("Impostos de 30: "+salario*0.3);
        }

        //Verifica se o salario está entre 20000 e 25000
        if(salario>20000 && salario <=25000){
            //Caso esteja entre 20000 e 25000
            System.out.println("Impostos de 35: "+salario*0.35);
        }

        //Verifica se o salario é menor ou igual a 15000
        if(salario>25000){
            //Caso seja maior que 25000
            System.out.println("Impostos de 40: "+salario*0.4);
        }

        //Muita atenção às chavetas
    }
}
