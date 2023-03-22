// Import obrigatório do package para fazer a leitura das introduções de dados do utilizador
import java.util.Scanner;

class Ex_07{
    public static void main(String[] args) {

        System.out.println("\n***** Ficha 1 - Exercicio 7 ******\n");

        // Instância obrigatória da classe para fazer a leitura das introduções de dados do utilizador
        Scanner input = new Scanner(System.in);

        // Declarar as variáveis
        double valor1, valor2, valor3, total;

        // Ler o valor1
        System.out.print("Introduza o valor 1: ");
        valor1 = input.nextDouble();

        // Ler o valor2
        System.out.print("Introduza o valor 2: ");
        valor2 = input.nextDouble();

        // Ler o valor3
        System.out.print("Introduza o valor 3: ");
        valor3 = input.nextDouble();

        //Calcular o total
        total=valor1+valor2+valor3;

        //Aplicar o desconto de 10%
        //Ou seja, paga 90% do valor total
        total=total*0.9;

        //Tudo condensado fica:
        //total=(valor1+valor2+valor3)*0.9;

        // Imprimir o valor com desconto
        System.out.println("Valor com desconto: " + total);

    }
}