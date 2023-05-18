package poo_fp11.PizzaRestaurant.Ingredients;

import poo_fp11.PizzaRestaurant.Enums.IngredientMeasureUnits;
import poo_fp11.PizzaRestaurant.Enums.PizzaBase;

public class Base extends Ingredient{

    private PizzaBase type;
    private String description;

    /**
     *
     * @param id Id do <b>Base</b>
     * @param name Nome do <b>Base</b>
     * @param calories Calorias do <b>Base</b>
     * @param type Tipo da <b>Base</b>
     * @param description Descrição da <b>Base</b>
     */
    public Base(int id, String name, double calories, PizzaBase type, String description) {
        super(id, name, IngredientMeasureUnits.GRAMAS, calories);
        this.type = type;
        this.description = description;
    }
}
