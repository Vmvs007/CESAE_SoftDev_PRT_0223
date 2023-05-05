public class Carro {

    // Atributos de instância
    private String marca;
    private String modelo;
    private int anoFabrico,potencia,cilindrada;
    private double consumoL100;
    private TipoCombustivel combustivel;

    // Método construtor


    public Carro(String marca, String modelo, int anoFabrico, int potencia, int cilindrada, TipoCombustivel combustivel, double consumoL100) {
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabrico = anoFabrico;
        this.potencia = potencia;
        this.cilindrada = cilindrada;
        this.consumoL100 = consumoL100;
        this.combustivel = combustivel;
    }


    /**
     * Método que imprime na consola que o carro está ligado
     */
    public void ligar(){

    }

    public void exibirDetalhes(){
        System.out.println("Marca: "+this.marca);
        System.out.println("Modelo: "+this.modelo);
        System.out.println("Ano Fabrico: "+this.anoFabrico);
        System.out.println("Potência: "+this.potencia+" HP");
        System.out.println("Cilindrada: "+this.marca+" cc");
        System.out.println("Tipo de Combustível: "+this.combustivel);
        System.out.println("Consumo (L/100): "+this.consumoL100);
    }

    public Carro corrida(Carro adversario){
        if(this.potencia>adversario.potencia){ //Ganha o Carro por potencia
            return this;
        } else if (adversario.potencia>this.potencia) { // Ganha o adversário por potencia
            return adversario;
        } else { // Empate de potencia
            if(this.cilindrada>adversario.cilindrada){ //Ganha o Carro por cilindrada
                return this;
            } else if (adversario.cilindrada>this.cilindrada) { // Ganha o adversario por cilindrada
                return adversario;
            } else { // Empate de cilindrada
                if(this.anoFabrico>adversario.anoFabrico){ // Ganha o carro por ser mais recente
                    return this;
                } else if (adversario.anoFabrico>this.anoFabrico) { // Ganha o adversario por ser mais recente
                    return adversario;
                }
            }
        }

return null;
    }


}
