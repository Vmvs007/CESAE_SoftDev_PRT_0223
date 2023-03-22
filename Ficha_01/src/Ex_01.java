//Import obrigatório do package para fazer a leitura das introduções de dados do utilizador
import java.util.Scanner;


class Ex_01 {
    public static void main(String[] args) {

        System.out.println("***** Ficha 1 - Exercicio 1 ******");

//Instância obrigatória da classe para fazer a leitura das introduções de dados do utilizador
        Scanner input = new Scanner(System.in);

        //Declarar variáveis
        int numero1, numero2, soma;

        //Ler numero 1
        System.out.println("Insira um numero:");
        numero1 = input.nextInt();

        //Ler numero 2
        System.out.println("Insira outro numero:");
        numero2 = input.nextInt();

        //Somar numero1 e numero2
        soma = numero1 + numero2;

        //Imprimir a soma
        System.out.println("A soma dos dois: ");
        System.out.println(soma);
    }
}