import java.util.Scanner;
public class Ex_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("***** Ficha 4 - Exercicio 2 *****");

        // Declara as variáveis
        int opcao;


        do{
            do{
                //Aprssenta as opções do menu
                System.out.println("1 - Criar");
                System.out.println("2 - Atualizar");
                System.out.println("3 - Eliminar");
                System.out.println("4 - Sair");

                //Lê a escolha do utilizador
                System.out.print("Escolha uma das opções: ");
                opcao=input.nextInt();

                //Se a opção escolhida for inválida
                if(opcao<1 || opcao >4){
                    System.out.println("OPÇÃO INVÁLIDA");
                }

                //Apresentar novamente o menu se a opção não for válida
            }while(opcao<1 || opcao >4);

                switch(opcao){
                    case 1:
                        System.out.println("Criar");
                        break;

                    case 2:
                        System.out.println("Atualizar");
                        break;

                    case 3:
                        System.out.println("Eliminar");
                        break;

                    case 4:
                        System.out.println("Sair");
                        break;
                }

                //Volto a repetir o programa enquanto opção não for 4
        }while(opcao!=4);

    }
}
