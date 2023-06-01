package Ex_2;

public class TacoPimentos extends Taco{

    /**
     * Método para imprimir na consola que o taco está a ser preparado
     */
    @Override
    public void prepare() {
        System.out.println("A preparar Taco de Pimentos...");
    }

    /**
     * Método para imprimir na consola que o taco está a ser cozinhado
     */
    @Override
    public void bake() {
        System.out.println("A cozinhar Taco de Pimentos...");
    }

    /**
     * Método para imprimir na consola que o taco está a ser embalado
     */
    @Override
    public void box() {
        System.out.println("A embalar Taco de Pimentos...");
    }
    @Override
    public void eat(){
        System.out.println("A comer taco e a ir ao WC...");

    }
}
