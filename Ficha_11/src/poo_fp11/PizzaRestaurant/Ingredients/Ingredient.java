package poo_fp11.PizzaRestaurant.Ingredients;

import poo_fp11.PizzaRestaurant.Enums.IngredientMeasureUnits;

public class Ingredient {
    private int id;
    private String name;
    IngredientMeasureUnits measureUnit;
    double calories;

    /**
     *
     * @param id Id do <b>Ingrediente</b>
     * @param name Nome do <b>Ingrediente</b>
     * @param measureUnit Unidade da Medida do <b>Ingrediente</b>
     * @param calories Calorias do <b>Ingrediente</b>
     */
    public Ingredient(int id, String name, IngredientMeasureUnits measureUnit, double calories) {
        this.id = id;
        this.name = name;
        this.measureUnit = measureUnit;
        this.calories = calories;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public IngredientMeasureUnits getMeasureUnit() {
        return measureUnit;
    }

    public double getCalories() {
        return calories;
    }
}
