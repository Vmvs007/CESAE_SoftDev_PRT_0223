// Import obrigatório do package para fazer a leitura das introduções de dados do utilizador
import java.util.Scanner;

class Ex_04 {
    public static void main(String[] args) {

        System.out.println("\n***** Ficha 2 - Exercicio 4 ******\n");

        // Instância obrigatória da classe para fazer a leitura das introduções de dados do utilizador
        Scanner input = new Scanner(System.in);

        // Declarar as variáveis
        int lugar;

        //Ler o lugar
        System.out.print("Insira o lugar: ");
        lugar = input.nextInt();

        //Se for lugar 1
        if(lugar==1){
            System.out.println("Obteve 10 pontos");
        }

        //Se for lugar 2
        if(lugar==2){
            System.out.println("Obteve 8 pontos");
        }

        //Se for lugar 3
        if(lugar==3){
            System.out.println("Obteve 6 pontos");
        }

        //Se for lugar 4
        if(lugar==4){
            System.out.println("Obteve 5 pontos");
        }

        //Se for lugar 5
        if(lugar==5){
            System.out.println("Obteve 4 pontos");
        }

        //Se for lugar 6
        if(lugar==6){
            System.out.println("Obteve 3 pontos");
        }

        //Se for lugar 7
        if(lugar==7){
            System.out.println("Obteve 2 pontos");
        }

        //Se for lugar 8
        if(lugar==8){
            System.out.println("Obteve 1 pontos");
        }

        //Se lugar maior que 8
        if(lugar>8){
            System.out.println("Não obteve pontos!");
        }


    }
}