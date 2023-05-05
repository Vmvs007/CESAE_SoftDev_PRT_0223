public class Conta {
    private String numeroConta, titular;
    private double saldo;

    public Conta(String numeroConta, String titular, double saldo) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = saldo;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


    public boolean transferencia (double valor, Conta contaDestino){

        // Verificar se a conta remetente tem saldo suficiente
        if(this.saldo>=valor){
            // Subtraio ao saldo da conta remetente
            this.saldo-=valor;
            // Incremento ao saldo da conta destino
            contaDestino.saldo+=valor;
            // Mensagem de sucesso
            System.out.println("Transferência Concluida");
            return true;
        }else{
            // Mensagem de erro
            System.out.println("Erro ao Transferir");
            return false;
        }
    }
}
