import java.util.Scanner;

public class Ex_05 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String escolha;

        System.out.print("Insira a marca: ");
        String marca = input.next();

        System.out.print("Insira a modelo: ");
        String modelo = input.next();

        System.out.print("Insira o ano de fabrico: ");
        int ano = input.nextInt();


        // Instanciar um objeto da classe Carro
        Carro carroUtilizador = new Carro(marca,modelo,ano);

        // Perguntar ao utilizador se quer ligar o carro
        System.out.print("Deseja ligar o carro? (s/n): ");
        escolha= input.next();

        // Só ligo o carro se o utilizador quiser
        if(escolha.equals("s")) {
            // Ligar o carro
            carroUtilizador.ligar();
        }

    }
}
