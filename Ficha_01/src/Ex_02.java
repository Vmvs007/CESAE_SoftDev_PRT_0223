//Import obrigatório do package para fazer a leitura das introduções de dados do utilizador
import java.util.Scanner;


class Ex_02 {
    public static void main(String[] args) {

        System.out.println("***** Ficha 1 - Exercicio 2 ******");

//Instância obrigatória da classe para fazer a leitura das introduções de dados do utilizador
        Scanner input = new Scanner(System.in);

        //Declarar variáveis
        int numero1, numero2, resultado;

        //System.out.println para imprimir mensagem e dar enter
        //System.out.print para imprimir mensagem sem enter no fim

        // "\n" para dar enter - consultar Escape Sequences
        // 04 - Input e Output - Algoritmia e Programação

        //Ler numero 1
        System.out.print("Insira um numero: ");
        numero1 = input.nextInt();

        //Ler numero 2
        System.out.print("Insira outro numero: ");
        numero2 = input.nextInt();

        //Somar numero1 e numero2
        resultado = numero1 + numero2;

        //Imprimir a soma
        System.out.print("Soma (+): ");
        System.out.println(resultado);

        //Subtrair numero1 e numero2
        resultado = numero1 - numero2;

        //Imprimir a subtração
        System.out.print("Subtracao (-): ");
        System.out.println(resultado);

        //Multiplicar numero1 e numero2
        resultado = numero1 * numero2;

        //Imprimir a multiplicação
        System.out.print("Multiplicacao (*): ");
        System.out.println(resultado);

        //Dividir numero1 e numero2
        resultado = numero1 / numero2;

        //Imprimir a divisão
        System.out.print("Divisao (/): ");
        System.out.println(resultado);
    }
}