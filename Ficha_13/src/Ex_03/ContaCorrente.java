package Ex_03;


public class ContaCorrente extends ContaBancaria implements Transferivel {
    public ContaCorrente(String titular, double saldo) {
        super(titular, saldo);
    }

    @Override
    public void transferir(double valor, ContaBancaria contaDestino) {

     // Verificar se a Conta Remetente tem saldo suficiente para a operação
        if(this.getSaldo()>=valor){

            // Diminuir o saldo da conta remetente
            this.setSaldo(this.getSaldo()-valor);

            // Aumentar o saldo da conta destino
            contaDestino.setSaldo(contaDestino.getSaldo()+valor);
        }else{
            System.out.println("Não tem saldo suficiente");
        }
    }
}
