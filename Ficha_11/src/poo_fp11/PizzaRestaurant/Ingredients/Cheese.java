package poo_fp11.PizzaRestaurant.Ingredients;

import poo_fp11.PizzaRestaurant.Enums.CheeseType;
import poo_fp11.PizzaRestaurant.Enums.IngredientMeasureUnits;
import poo_fp11.PizzaRestaurant.Enums.IngredientOrigin;

public class Cheese extends Topping{
    private CheeseType type;

    /**
     *
     * @param id
     * @param name
     * @param measureUnit
     * @param calories
     * @param origin
     * @param type
     */
    public Cheese(int id, String name, IngredientMeasureUnits measureUnit, double calories, IngredientOrigin origin, CheeseType type) {
        super(id, name, measureUnit, calories, origin);
        this.type = type;
    }
}
