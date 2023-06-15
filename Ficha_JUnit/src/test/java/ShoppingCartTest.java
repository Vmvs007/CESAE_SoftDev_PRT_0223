import Ex_08.ShoppingCart;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ShoppingCartTest {

    private ShoppingCart shoppingCart;

    @BeforeEach
    public void setUp(){
        this.shoppingCart= new ShoppingCart("A101");
    }

    @Test
    public void testAddItem(){

        // Carrinho ainda não tem itens, tem de ter tamanho 0
        assertEquals(0,shoppingCart.getItemCount(),"Teste AddItem: Carrinho tem de estar vazio");
        shoppingCart.addItem("Computador");
        assertEquals(1,shoppingCart.getItemCount(),"Teste AddItem: Carrinho tem de ter 1 item");
        shoppingCart.addItem("TV");
        shoppingCart.addItem("Torradeira");
        assertEquals(3,shoppingCart.getItemCount(),"Teste AddItem: Carrinho tem de ter 3 itens");
    }

    @Test
    public void testRemoveItem(){

        shoppingCart.addItem("Computador");
        shoppingCart.addItem("TV");
        assertEquals(2,shoppingCart.getItemCount(),"Teste RemoveItem: Carrinho tem de ter 2 itens");
        shoppingCart.removeItem("Computador");
        assertEquals(1,shoppingCart.getItemCount(),"Teste RemoveItem: Carrinho tem de ter 1 item");
        shoppingCart.removeItem("Escova Dentes");
        assertEquals(1,shoppingCart.getItemCount(),"Teste RemoveItem: Nao pode remover que nao existe");
    }

    @Test
    public void testContainsItem(){
        shoppingCart.addItem("Computador");
        shoppingCart.addItem("TV");

        assertTrue(shoppingCart.containsItem("TV"));
        assertFalse(shoppingCart.containsItem("Rato PC"));
    }

    @Test
    public void testGetItemCount(){
        assertEquals(0,shoppingCart.getItemCount());

        shoppingCart.addItem("Computador");
        shoppingCart.addItem("TV");

        assertEquals(2,shoppingCart.getItemCount());

        shoppingCart.removeItem("Computador");

        assertEquals(1,shoppingCart.getItemCount());
    }

    @Test
    public void testClearCart(){
        assertEquals(0,shoppingCart.getItemCount());
        shoppingCart.addItem("Computador");
        shoppingCart.addItem("TV");
        assertEquals(2,shoppingCart.getItemCount());

        shoppingCart.clearCart();

        assertEquals(0,shoppingCart.getItemCount());
    }


}
