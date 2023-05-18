package poo_fp11.PizzaRestaurant;

import poo_fp11.PizzaRestaurant.Ingredients.Ingredient;

public class PizzaIngredients {
    private Ingredient ingredient;
    private double quantity;

    public PizzaIngredients(Ingredient ingredient, double quantity) {
        this.ingredient = ingredient;
        this.quantity = quantity;
    }

    public Ingredient getIngredient() {
        return ingredient;
    }

    public void setIngredient(Ingredient ingredient) {
        this.ingredient = ingredient;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }
}
