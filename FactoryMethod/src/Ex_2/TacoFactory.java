package Ex_2;

public class TacoFactory {
    public static Taco createTaco(String tipo){
        switch (tipo){
            case "CARNE VACA": return new TacoCarneVaca();

            case "CARNE FRANGO": return new TacoCarneFrango();

            case "VEGETARIANO": return new TacoVegetariano();
            case "PIMENTOS": return new TacoPimentos();
            default:
                throw new IllegalArgumentException("Não temos tacos desse tipo: " + tipo);

        }
    }
}
