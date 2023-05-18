package poo_fp11.PizzaRestaurant.Ingredients;

import poo_fp11.PizzaRestaurant.Enums.IngredientMeasureUnits;
import poo_fp11.PizzaRestaurant.Enums.IngredientOrigin;
import poo_fp11.PizzaRestaurant.Enums.SeafoodType;

public class Seafood extends Topping{

    private SeafoodType type;

    /**
     *
     * @param id
     * @param name
     * @param measureUnit
     * @param calories
     * @param origin
     * @param type
     */
    public Seafood(int id, String name, IngredientMeasureUnits measureUnit, double calories, IngredientOrigin origin, SeafoodType type) {
        super(id, name, measureUnit, calories, origin);
        this.type = type;
    }
}
