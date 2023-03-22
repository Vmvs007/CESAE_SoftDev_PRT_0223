// Import obrigatório do package para fazer a leitura das introduções de dados do utilizador
import java.util.Scanner;

class Ex_03 {
    public static void main(String[] args) {

        System.out.println("\n***** Ficha 1 - Exercicio 3 ******\n");

        // Instância obrigatória da classe para fazer a leitura das introduções de dados do utilizador
        Scanner input = new Scanner(System.in);

        // Declarar as variáveis
        double comprimento, largura, area, perimetro, pi = 3.141596, raio, base, altura;

        // Podemos colocar a mensagem toda no mesmo System.out.println
        // Usamos o operador +

        // Retângulo
        // Ler o comprimento
        System.out.print("Introduza o comprimento do retângulo: ");
        comprimento = input.nextDouble();

        // Ler a largura
        System.out.print("Introduza a largura do retângulo: ");
        largura = input.nextDouble();

        // Calcular a área
        area = comprimento * largura;

        // Apresentar a área
        System.out.println("A area do retangulo é: "+ area);

        // Calcular o perímetro
        perimetro = (2 * comprimento) + (2 * largura);

        // Apresentar o perímetro
        System.out.println("O perimetro do retangulo é: "+ perimetro);

        // Circunferência
        // Ler o raio
        System.out.print("\nIntroduza o raio da circunferencia: ");
        raio = input.nextDouble();

        // Calcular a área
        area = pi * (raio * raio);

        // Apresentar a área
        System.out.println("A area da circunferencia é: "+ area);

        // Triângulo
        // Introduzir a base
        System.out.print("\nIntroduza a base do triangulo: ");
        base = input.nextDouble();

        // Introduzir a altura
        System.out.print("Introduza a altura do triangulo: ");
        altura = input.nextDouble();

        // Calcular a área
        area = (base * altura) / 2;

        // Apresentar a área
        System.out.println("A área do triângulo é: "+ area);

        //Podemos usar a mesma variável área para as três formas geométricas
    }
}