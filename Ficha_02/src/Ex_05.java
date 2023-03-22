// Import obrigatório do package para fazer a leitura das introduções de dados do utilizador
import java.util.Scanner;

class Ex_05 {
    public static void main(String[] args) {

        System.out.println("\n***** Ficha 2 - Exercicio 5 ******\n");

        // Instância obrigatória da classe para fazer a leitura das introduções de dados do utilizador
        Scanner input = new Scanner(System.in);

        // Declarar as variáveis
        int lugar;

        //Ler o lugar
        System.out.print("Insira o lugar: ");
        lugar = input.nextInt();

        // Switch para selecionar qual o caso que se adequa ao lugar lido
        switch(lugar){
            case 1:
                System.out.println("Obteve 10 pontos");
                break;

            case 2:
                System.out.println("Obteve 8 pontos");
                break;

            case 3:
                System.out.println("Obteve 6 pontos");
                break;

            case 4:
                System.out.println("Obteve 5 pontos");
                break;

            case 5:
                System.out.println("Obteve 4 pontos");
                break;

            case 6:
                System.out.println("Obteve 3 pontos");
                break;

            case 7:
                System.out.println("Obteve 2 pontos");
                break;

            case 8:
                System.out.println("Obteve 1 pontos");
                break;

            default:
                System.out.println("Não obteve pontos!");
                break;

        }

    }
}