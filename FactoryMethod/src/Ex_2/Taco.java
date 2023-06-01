package Ex_2;

public abstract class Taco {

    /**
     * Método para imprimir na consola que o taco está a ser preparado
     */
    public abstract void prepare();

    /**
     * Método para imprimir na consola que o taco está a ser cozinhado
     */
    public abstract void bake();

    /**
     * Método para imprimir na consola que o taco está a ser embalado
     */
    public abstract void box();
     public void eat(){
         System.out.println("A comer o taco...");
     }
}
