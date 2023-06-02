package Ex_03;

public abstract class ContaBancaria {

    private String titular;
    private double saldo;

    public ContaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double valor){
        this.saldo+=valor; // this.saldo = this.saldo + valor;
    }

    public void levantar(double valor){
        if(this.saldo >= valor) {
            this.saldo -= valor;
        }else{
            System.out.println("Não tem saldo suficiente");
        }
    }

    public void mostrarSaldo(){
        System.out.println("Saldo: "+this.saldo);
    }
}
