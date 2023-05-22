package poo_fp11.PizzaRestaurant;

import poo_fp11.PizzaRestaurant.Enums.*;
import poo_fp11.PizzaRestaurant.Ingredients.*;

public class PizzaDemo {

    public static void main(String[] args) {

        // Instanciar Ingredientes
        Base baseFinaItaly = new Base(1,"Base Fina Italian Style",2,PizzaBase.FINA,"Massa Fina Italiana");
        Vegetable tomateCherry = new Vegetable(2,"Tomate Cherry",IngredientMeasureUnits.GRAMAS,0.5,IngredientOrigin.NACIONAL,VegetableType.TOMATE);
        Vegetable ananasAcores = new Vegetable(3,"Ananas dos Açores", IngredientMeasureUnits.GRAMAS,0.7,IngredientOrigin.NACIONAL,VegetableType.ANANAS);
        Meat fiambre = new Meat(4,"Fiambre de Frango", IngredientMeasureUnits.GRAMAS, 3, IngredientOrigin.NACIONAL,MeatType.FRANGO);
        Cheese mozzarella = new Cheese(5,"Queijo Mozzarella President", IngredientMeasureUnits.GRAMAS, 10, IngredientOrigin.NACIONAL,CheeseType.MOZZARELLA);

        // Instanciar Pizzas
        Pizza havaiana = new Pizza(100,5,"Havaiana","Pizza do Havai c/ Ananás",15, PizzaSize.KING);


        // Adicionar à Pizza Havaiana os seus Ingredientes
        havaiana.addIngredient(new PizzaIngredients(baseFinaItaly,150));
        havaiana.addIngredient(new PizzaIngredients(tomateCherry,50));
        havaiana.addIngredient(new PizzaIngredients(ananasAcores,100));
        havaiana.addIngredient(new PizzaIngredients(fiambre,100));
        havaiana.addIngredient(new PizzaIngredients(mozzarella, 150));

        havaiana.printPizza();
        havaiana.setIngredientQuantity(3,110);
        havaiana.printPizza();
        System.out.println("Kcal da Pizza: "+havaiana.countKcal());
    }

}
