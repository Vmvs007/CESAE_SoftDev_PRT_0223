import java.io.IOException;
import java.util.Scanner;

public class Ex_09 {

    public static void main(String[] args){

        Scanner input= new Scanner(System.in);

        // Declarar variáveis
        String nome;
        double preco;
int opcao,quantidade=0;


        System.out.print("Insira o nome do produto: ");
        nome=input.next();
        System.out.print("Insira o preço do produto: ");
        preco=input.nextDouble();

        Produto produto = new Produto(nome,preco);

        // Menu
        do{
            //Apresento as informações do Produto
            System.out.println("\nControlo do Produto: "+produto.getNome());
            System.out.println("Preço: "+produto.getPreco());
            do{
                // Imprimir Menu
                System.out.println("\n***** Menu *****");
                System.out.println("\n1 - Comprar ");
                System.out.println("2 - Vender");
                System.out.println("3 - Consultar Stock");
                System.out.println("4 - Sair");

                // Ler a escolha do utilizador
                System.out.print("\nEscolha uma opção: ");
                opcao=input.nextInt();

            }while(opcao<1||opcao>4);

            switch (opcao){
                case 1: // Comprar produto
                    System.out.println("\n***** Comprar *****");
                    System.out.print("Quantas unidades quer comprar: ");
                    quantidade = input.nextInt();
                    produto.comprar(quantidade);
                    break;

                case 2: // Vender produto
                    System.out.println("\n***** Vender *****");
                    System.out.print("Quantas unidades quer vender: ");
                    quantidade=input.nextInt();
                    produto.vender(quantidade);
                    break;

                case 3: // Apresentar stock
                    System.out.println("\nTem "+produto.getStock()+ " unidades em stock!\n");
                    break;

                case 4: // Sair
                    System.out.println("Até à próxima");
            }

        }while(opcao!=4);


    }
}
