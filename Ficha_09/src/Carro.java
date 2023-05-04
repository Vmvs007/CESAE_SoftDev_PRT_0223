public class Carro {

    // Atributos de instância
    private String marca;
    private String modelo;
    private int anoFabrico;

    // Método construtor
    public Carro(String marca, String modelo, int anoFabrico){
        this.marca=marca;
        this.modelo=modelo;
        this.anoFabrico=anoFabrico;
    }

    /**
     * Método que imprime na consola que o carro está ligado
     */
    public void ligar(){
        System.out.println("O carro está ligado!");

    }

}
