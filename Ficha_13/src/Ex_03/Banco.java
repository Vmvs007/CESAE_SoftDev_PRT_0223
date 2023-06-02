package Ex_03;

public class Banco {
    public static void main(String[] args) {

        // Instanciar as contas
        ContaCorrente contaCorrente_1 = new ContaCorrente("Vitor",100);
        ContaCorrente contaCorrente_2 = new ContaCorrente("Antonio",200);

        ContaPoupanca contaPoupanca_1 = new ContaPoupanca("Ana", 500);

        // Mostrar saldo de todas as contas
        System.out.println("_________________________________________");
        System.out.println("\nConta Corrente 1: ");
        contaCorrente_1.mostrarSaldo();

        System.out.println("\nConta Corrente 2: ");
        contaCorrente_2.mostrarSaldo();

        System.out.println("\nConta Poupança 1: ");
        contaPoupanca_1.mostrarSaldo();

        // Depositar
        contaCorrente_1.depositar(300);
        contaCorrente_2.depositar(500);
        contaPoupanca_1.depositar(250);


        // Mostrar saldo de todas as contas
        System.out.println("_________________________________________");
        System.out.println("\nConta Corrente 1: ");
        contaCorrente_1.mostrarSaldo();

        System.out.println("\nConta Corrente 2: ");
        contaCorrente_2.mostrarSaldo();

        System.out.println("\nConta Poupança 1: ");
        contaPoupanca_1.mostrarSaldo();

        // Levantar
        contaCorrente_1.levantar(9000);
        contaCorrente_2.levantar(50);

        // Mostrar saldo de todas as contas
        System.out.println("_________________________________________");
        System.out.println("\nConta Corrente 1: ");
        contaCorrente_1.mostrarSaldo();

        System.out.println("\nConta Corrente 2: ");
        contaCorrente_2.mostrarSaldo();

        System.out.println("\nConta Poupança 1: ");
        contaPoupanca_1.mostrarSaldo();

        // Transferir
        contaCorrente_1.transferir(100,contaCorrente_2);
        contaCorrente_2.transferir(3000,contaCorrente_1);
        contaCorrente_1.transferir(200, contaPoupanca_1);

        // Mostrar saldo de todas as contas
        System.out.println("_________________________________________");
        System.out.println("\nConta Corrente 1: ");
        contaCorrente_1.mostrarSaldo();

        System.out.println("\nConta Corrente 2: ");
        contaCorrente_2.mostrarSaldo();

        System.out.println("\nConta Poupança 1: ");
        contaPoupanca_1.mostrarSaldo();

    }
}
