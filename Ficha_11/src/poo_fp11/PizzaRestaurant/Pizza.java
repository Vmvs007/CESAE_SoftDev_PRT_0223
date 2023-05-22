package poo_fp11.PizzaRestaurant;

import poo_fp11.PizzaRestaurant.Enums.PizzaSize;
import poo_fp11.PizzaRestaurant.Ingredients.Ingredient;

import java.util.ArrayList;

public class Pizza {

    private final int MAX_INGREDIENTS=5;
    private int id, numberOfIngredients;
    private String name, description;
    private double price;
    private PizzaSize size;
    private ArrayList<PizzaIngredients> ingredients;

    /**
     *
     * @param id - Código que identifica uma <b>Pizza</b>
     * @param numberOfIngredients Número de ingredientes de uma <b>Pizza</b>
     * @param name Nome da <b>Pizza</b>
     * @param description Descrição da <b>Pizza</b>
     * @param price Preço da <b>Pizza</b>
     * @param size Tamanho da <b>Pizza</b>
     */
    public Pizza(int id, int numberOfIngredients, String name, String description, double price, PizzaSize size) {
        this.id = id;
        this.numberOfIngredients = numberOfIngredients;
        this.name = name;
        this.description = description;
        this.price = price;
        this.size = size;
        this.ingredients = new ArrayList<PizzaIngredients>(MAX_INGREDIENTS);
    }

    /**
     * Método que permite adicionar ingredientes à Pizza
     * @param pizzaIngredient
     */
    public void addIngredient(PizzaIngredients pizzaIngredient){
        this.ingredients.add(pizzaIngredient);
    }

    /**
     * Permitir editar a quantidade de um dos ingredientes da Pizza
     * @param id Id do Ingrediente a editar
     * @param newQuantity Quantidade a editar
     */
    public void setIngredientQuantity(int id, double newQuantity){
this.ingredients.get(id).setQuantity(newQuantity);
    }

    /**
     * Permitir remover um ingrediente da Pizza
     * @param id Id do Ingrediente a remover
     */
    public void removeIngredient(int id){
this.ingredients.remove(id);
    }

    public void printPizza(){
        int count=0;
        System.out.println("Nome: "+ this.name);
        for(PizzaIngredients ingredient : this.ingredients){
            System.out.println("ID: "+count);
            System.out.println("Ingrediente: " +ingredient.getIngredient().getName());
            System.out.println("Quantidade: "+ingredient.getQuantity());
            System.out.println("");
            count++;
        }
    }

    public double countKcal(){
        int count=0;
        for(PizzaIngredients ingredient : this.ingredients){
           count+= ingredient.getQuantity()*ingredient.getIngredient().getCalories();
        }
        return count;
    }
}
