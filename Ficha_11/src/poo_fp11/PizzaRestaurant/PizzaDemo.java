package poo_fp11.PizzaRestaurant;

import poo_fp11.PizzaRestaurant.Enums.*;
import poo_fp11.PizzaRestaurant.Ingredients.*;

public class PizzaDemo {

    public static void main(String[] args) {

        // Instanciar Ingredientes
        Base baseFina = new Base(1,"Base Fina",90,PizzaBase.FINA,"Massa Fina Italiana");
        Vegetable tomate = new Vegetable(2,"Tomate Cherry",IngredientMeasureUnits.GRAMAS,5,IngredientOrigin.NACIONAL,VegetableType.TOMATE);
        Vegetable ananas = new Vegetable(3,"Ananas dos Açores", IngredientMeasureUnits.GRAMAS,12,IngredientOrigin.NACIONAL,VegetableType.ANANAS);

        // Instanciar Pizzas
        Pizza havaiana = new Pizza(100,5,"Havaiana","Pizza do Havai c/ Ananás",15, PizzaSize.KING);

        // Adicionar à Pizza Havaiana os seus Ingredientes
        havaiana.addIngredient(new PizzaIngredients(baseFina,150));
        havaiana.addIngredient(new PizzaIngredients(tomate,50));
        havaiana.addIngredient(new PizzaIngredients(ananas,100));


    }

}
