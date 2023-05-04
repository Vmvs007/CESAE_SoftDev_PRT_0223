public class Circulo {

    // Atributos de instância
private double raio;

    // Atributos de classe
  private static double pi=3.141592;

    // Método construtor
    public Circulo(double raio){
        this.raio=raio;
    }


    // Método get
    public double getRaio(){
        return this.raio;
    }

    // Método set
    public void setRaio(double raio){
        this.raio=raio;
    }


    public double diametro(){
        return 2*this.raio;
    }

    public double circunferencia(){
        return 2*pi*this.raio;
    }

    public double areaCirculo(){
        return pi*(this.raio*this.raio);
    }
}
