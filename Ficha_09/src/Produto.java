public class Produto {

    private String nome;
    private double preco;
    private int stock=0;

    // Método construtor
    public Produto(String nome, double preco){
        this.nome=nome;
        this.preco=preco;
    }

    // Métodos get
    public String getNome(){
        return this.nome;
    }

    public double getPreco(){
        return this.preco;
    }

    public int getStock(){
        return this.stock;
    }

    /**
     * Método permite comprar (incrementar) o stock
     * @param quantidade - Aumento de stock
     */
    public void comprar(int quantidade){
        this.stock+=quantidade;
    }

    /**
     * Método permite vender (subtrair) stock
     * @param quantidade - Diminuição de stock
     */
    public void vender(int quantidade){
        if(this.stock>=quantidade) {
            this.stock -= quantidade;
        }else{
            System.out.println("Não temos stock para essa venda");
        }
    }
}
