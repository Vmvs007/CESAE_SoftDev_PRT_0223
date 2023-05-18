package poo_fp11.PizzaRestaurant.Enums;

public enum PizzaSize {

    SMALL,
    MEDIUM,
    BIG,
    KING;

    /**
     * Método para passar o tamanho da pizza como String
     * @param size - Tamanho da pizza
     * @return String com uma mensagem a informar o tamanho da pizza
     */
        public static String PizzaSizeToString(PizzaSize size){
            switch (size){
                case SMALL:
                    return "A pizza é pequena.";

                case MEDIUM:
                    return "A pizza é média.";

                case BIG:
                    return "A pizza é grande.";

                case KING:
                    return "A pizza é enorme.";

                default:
                    return "Tamanho desconhecido";
            }

        }
}
