import Ex_09.GameStore;
import Ex_09.VideoGame;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GameStoreTest {

    private GameStore gs;

    @BeforeEach
    public void setUp(){
        this.gs= new GameStore();
    }

    @Test
    public void testAddGameToStock(){
        assertEquals(0, gs.getStock().size());

        gs.addGameToStock(new VideoGame("Skyrim", "Beteshda", 10.0, 50.0));
        gs.addGameToStock(new VideoGame("GTA V", "Rockstar", 15.0, 70.0));
        gs.addGameToStock(new VideoGame("The Legend of Zelda: Breath of the Wild", "Nintendo", 30.0, 60.0));
        gs.addGameToStock(new VideoGame("Red Dead Redemption 2", "Rockstar Games", 40.0, 50.0));
        gs.addGameToStock(new VideoGame("FIFA 22", "Electronic Arts", 20.0, 45.0));

        assertEquals(5, gs.getStock().size());

        gs.addGameToStock(new VideoGame("The Witcher 3: Wild Hunt", "CD Projekt Red", 20.0, 35.0));

        assertEquals(5, gs.getStock().size());
    }

    @Test
    public void testSellGame(){

        gs.addGameToStock(new VideoGame("Skyrim", "Beteshda", 10.0, 50.0));
        gs.addGameToStock(new VideoGame("GTA V", "Rockstar", 15.0, 70.0));
        gs.addGameToStock(new VideoGame("The Legend of Zelda: Breath of the Wild", "Nintendo", 30.0, 60.0));
        gs.addGameToStock(new VideoGame("Red Dead Redemption 2", "Rockstar Games", 40.0, 50.0));
        gs.addGameToStock(new VideoGame("FIFA 22", "Electronic Arts", 20.0, 45.0));

        assertEquals(5, gs.getStock().size());
        assertEquals(0, gs.getSales().size());

        gs.sellGame(2);

        assertEquals(4, gs.getStock().size());
        assertEquals(1, gs.getSales().size());

        gs.sellGame(0);
        gs.sellGame(1);
        gs.sellGame(0);

        assertEquals(1, gs.getStock().size());
        assertEquals(4, gs.getSales().size());

        gs.sellGame(0);

        assertEquals(0, gs.getStock().size());
        assertEquals(5, gs.getSales().size());

    }

    @Test
    public void testCalcularLucro(){

        assertEquals(0,gs.calcularLucro());

        gs.addGameToStock(new VideoGame("Skyrim", "Beteshda", 10.0, 50.0));
        gs.addGameToStock(new VideoGame("GTA V", "Rockstar", 15.0, 70.0));
        gs.addGameToStock(new VideoGame("The Legend of Zelda: Breath of the Wild", "Nintendo", 30.0, 60.0));
        gs.addGameToStock(new VideoGame("Red Dead Redemption 2", "Rockstar Games", 40.5, 50.0));
        gs.addGameToStock(new VideoGame("FIFA 22", "Electronic Arts", 20.0, 45.0));

        assertEquals(0,gs.calcularLucro());

        gs.sellGame(0);
        gs.sellGame(0);

        assertEquals(95,gs.calcularLucro());

        gs.sellGame(0);

        assertEquals(125,gs.calcularLucro());

        gs.sellGame(0);

        assertEquals(134.5,gs.calcularLucro());
    }

}
