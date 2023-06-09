package org.example;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private ArrayList<String> items;
    private String codCliente;

    public ShoppingCart(String codCliente) {
        this.codCliente=codCliente;
        this.items = new ArrayList<>();
    }

    public void addItem(String item) {
        items.add(item);
    }

    public void removeItem(String item) {
        items.remove(item);
    }

    public boolean containsItem(String item) {
        return items.contains(item);
    }

    public int getItemCount() {
        return items.size();
    }

    public void clearCart() {
        items.clear();
    }
}

