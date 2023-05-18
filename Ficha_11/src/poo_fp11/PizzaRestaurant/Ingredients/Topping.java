package poo_fp11.PizzaRestaurant.Ingredients;

import poo_fp11.PizzaRestaurant.Enums.IngredientMeasureUnits;
import poo_fp11.PizzaRestaurant.Enums.IngredientOrigin;

public class Topping extends Ingredient{

    private IngredientOrigin origin;

    /**
     *
     * @param id Id do <b>Topping</b>
     * @param name Nome do <b>Topping</b>
     * @param measureUnit Unidade da Medida do <b>Topping</b>
     * @param calories Calorias do <b>Topping</b>
     * @param origin Origem do <b>Topping</b>
     */
    public Topping(int id, String name, IngredientMeasureUnits measureUnit, double calories, IngredientOrigin origin) {
        super(id, name, measureUnit, calories);
        this.origin = origin;
    }
}
