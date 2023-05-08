import java.util.Scanner;
public class Conta {
    private String numeroConta, titular;
    private double saldo, margemEmprestimo, divida;
    private int anoAbertura;

    public Conta(String numeroConta, String titular, double saldo) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = saldo;
        this.margemEmprestimo=saldo*0.9;
        this.anoAbertura=2023;
        this.divida=0;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getMargemEmprestimo() {
        return margemEmprestimo;
    }

    public double getDivida() {
        return divida;
    }

    public int getAnoAbertura() {
        return anoAbertura;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
        this.margemEmprestimo=this.saldo*0.9;
    }

    public void setMargemEmprestimo(double margemEmprestimo) {
        this.margemEmprestimo = margemEmprestimo;
    }

    public void setDivida(double divida) {
        this.divida = divida;
    }


    /**
     * Método para transferir saldo de uma conta para a outra
     * @param valor Valor a transferir
     * @param contaDestino Conta que irá receber o valor
     * @return True se a operação foi executada | False se deu erro
     */
    public boolean transferencia (double valor, Conta contaDestino){

        // Verificar se a conta remetente tem saldo suficiente
        if(this.saldo>=valor){
            // Subtraio ao saldo da conta remetente
            this.setSaldo(this.getSaldo()-valor);
            // Incremento ao saldo da conta destino
            contaDestino.setSaldo(contaDestino.getSaldo()+valor);
            // Mensagem de sucesso
            System.out.println("Transferência Concluida");
            return true;
        }else{
            // Mensagem de erro
            System.out.println("Erro ao Transferir");
            return false;
        }
    }

    /**
     * Método para levantar dinheiro de uma conta
     * @param valor - Valor a levantar
     * @return True se a operação foi executada | False se deu erro
     */
    public boolean levantar (double valor){
        // Verificar se a conta tem saldo suficiente
        if(this.saldo>=valor){
            // Subtraio ao saldo da conta
            this.setSaldo(this.getSaldo()-valor);
            // Mensagem de sucesso
            System.out.println("Levantamento Concluido");
            return true;
        }else{
            // Mensagem de erro
            System.out.println("Erro ao Levantar");
            return false;
        }
    }

    /**
     * Método para depositar numa conta
     * @param valor - Valor a depositar
     */
    public void depositar(double valor){
        // Incremento ao saldo da conta
        this.setSaldo(this.getSaldo()+valor);
    }

    /**
     * Método para exibir o saldo de uma conta
     */
    public void exibirSaldo(){
        System.out.println("Saldo Atual: "+this.getSaldo());
    }

    /**
     * Método para pedir um empréstimo
     * @param valor - Valor a pedir
     * @return True se a operação foi executada | False se deu erro
     */
    public boolean pedirEmprestimo(double valor){
        if(this.margemEmprestimo<=valor && this.divida==0){ // Tem margem de empréstimo suficiente e nenhuma dívida pendente
            // Atualizar o saldo da conta
            this.setSaldo(this.getSaldo()+valor);
            // Atualizo o valor em dívida
            this.divida+=valor;

            return true;
        }else{ // Não é possível pedir o empréstimo
            return false;
        }
}

    /**
     * Método para introduzir uma nova conta
     * @return Conta criada
     */
    public static Conta introduzirConta(){
        Scanner input = new Scanner(System.in);

    System.out.print("Insira o Número da Conta: ");
    String numeroConta = input.next();

    System.out.print("Insira o Titular da Conta: ");
    String titularConta = input.next();

    System.out.print("Insira o Saldo da Conta: ");
    double saldo = input.nextDouble();

    Conta novaConta = new Conta(numeroConta,titularConta,saldo);
    return novaConta;

}

}
