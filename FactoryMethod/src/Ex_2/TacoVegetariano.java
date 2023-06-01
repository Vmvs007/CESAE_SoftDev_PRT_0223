package Ex_2;

public class TacoVegetariano extends Taco{
    @Override
    public void prepare() {
        System.out.println("A preparar Taco Vegetariano...");
    }

    @Override
    public void bake() {
        System.out.println("A cozinhar Taco Vegetariano...");
    }

    @Override
    public void box() {
        System.out.println("A embalar Taco Vegetariano...");
    }
}
