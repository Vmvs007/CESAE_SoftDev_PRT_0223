package poo_fp11.PizzaRestaurant.Ingredients;

import poo_fp11.PizzaRestaurant.Enums.IngredientMeasureUnits;
import poo_fp11.PizzaRestaurant.Enums.IngredientOrigin;
import poo_fp11.PizzaRestaurant.Enums.MeatType;

public class Meat extends Topping{
    private MeatType type;

    /**
     *
     * @param id
     * @param name
     * @param measureUnit
     * @param calories
     * @param origin
     * @param type
     */
    public Meat(int id, String name, IngredientMeasureUnits measureUnit, double calories, IngredientOrigin origin, MeatType type) {
        super(id, name, measureUnit, calories, origin);
        this.type = type;
    }
}
