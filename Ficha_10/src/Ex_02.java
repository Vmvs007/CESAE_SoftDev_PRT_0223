import java.util.Scanner;

public class Ex_02 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int opcao;
        double valor;

        // Instanciar Conta do Utilizador
        System.out.println("Abertura de Conta");
        Conta conta1 = Conta.introduzirConta();

        // Contas de Exemplo
        Conta conta2 = new Conta("100100","Cristiano Ronaldo",250300300);
        Conta conta3 = new Conta("200200","Joaquim Alberto", 50);

        do{
            do{
                System.out.println("\n**** Banco Fantástico *****");
                System.out.println("1 - Ver Saldo");
                System.out.println("2 - Depositar");
                System.out.println("3 - Levantar");
                System.out.println("4 - Transferir para Joaquim Alberto");
                System.out.println("0 - Sair");
                System.out.print("Escolha uma opção: ");
                opcao=input.nextInt();
            }while(opcao<0||opcao>4);

            switch (opcao){
                case 1: conta1.exibirSaldo();
                break;

                case 2:
                    System.out.print("Valor a Depositar: ");
                    valor=input.nextDouble();
                    conta1.depositar(valor);
                break;

                case 3:
                    System.out.print("Valor a Levantar: ");
                    valor=input.nextDouble();
                    conta1.levantar(valor);
                break;

                case 4:
                    System.out.print("Valor a Transferir: ");
                    valor=input.nextDouble();
                    conta1.transferencia(valor,conta3);
            }
        }while(opcao!=0);

        System.out.println("\n");
        System.out.println("Sua Conta: ");
        conta1.exibirSaldo();

        System.out.println("Conta do Cristiano Ronaldo: ");
        conta2.exibirSaldo();

        System.out.println("Conta do Joaquim Alberto: ");
        conta3.exibirSaldo();

    }

}
