package poo_fp11.PizzaRestaurant.Ingredients;

import poo_fp11.PizzaRestaurant.Enums.IngredientMeasureUnits;
import poo_fp11.PizzaRestaurant.Enums.IngredientOrigin;
import poo_fp11.PizzaRestaurant.Enums.VegetableType;

public class Vegetable extends Topping{

    private VegetableType type;

    /**
     *
     * @param id
     * @param name
     * @param measureUnit
     * @param calories
     * @param origin
     * @param type
     */
    public Vegetable(int id, String name, IngredientMeasureUnits measureUnit, double calories, IngredientOrigin origin, VegetableType type) {
        super(id, name, measureUnit, calories, origin);
        this.type = type;
    }
}
