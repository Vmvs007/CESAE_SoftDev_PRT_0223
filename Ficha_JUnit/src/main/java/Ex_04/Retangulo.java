package Ex_04;

public class Retangulo {

    // Definir os atributos
    private double largura;
    private double altura;


    // Método construtor
    public Retangulo(double largura, double altura){
        this.largura=largura;
        this.altura=altura;
    }

    /**
     * Método que calcula o perimetro do retangulo
     * @return Perimetro do retângulo
     */
    public double calcularPerimetro() {
        if(this.largura>0 && this.altura>0) {
            // Variável perimetro é redundante pois podemos retornar diretamente o cálculo
            double perimetro = (this.largura * 2) + (this.altura * 2);
            return perimetro;
        }else{
            throw new IllegalArgumentException("Nao pode ser 0 ou inferior");
        }
    }

    /**
     * Método que calcula a área do retangulo
     * @return Area do retângulo
     */
    public double calcularArea(){
        if(this.largura>0 && this.altura>0) {
            return this.largura * this.altura;
        }else{
            throw new IllegalArgumentException("Nao pode ser 0 ou inferior");
        }
    }

}