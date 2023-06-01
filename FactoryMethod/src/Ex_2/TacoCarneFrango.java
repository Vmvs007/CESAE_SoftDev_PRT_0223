package Ex_2;

public class TacoCarneFrango extends Taco{
    @Override
    public void prepare() {
        System.out.println("A preparar Taco de Carne de Frango...");
    }

    @Override
    public void bake() {
        System.out.println("A cozinhar Taco de Carne de Frango...");
    }

    @Override
    public void box() {
        System.out.println("A embalar Taco de Carne de Frango...");
    }
}
