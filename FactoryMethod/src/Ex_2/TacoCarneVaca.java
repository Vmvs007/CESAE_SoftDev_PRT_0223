package Ex_2;

public class TacoCarneVaca extends Taco{

    /**
     * Método para imprimir na consola que o taco está a ser preparado
     */
    @Override
    public void prepare() {
        System.out.println("A preparar Taco de Carne de Vaca...");
    }

    /**
     * Método para imprimir na consola que o taco está a ser cozinhado
     */
    @Override
    public void bake() {
        System.out.println("A cozinhar Taco de Carne de Vaca...");
    }

    /**
     * Método para imprimir na consola que o taco está a ser embalado
     */
    @Override
    public void box() {
        System.out.println("A embalar Taco de Carne de Vaca...");
    }
}
