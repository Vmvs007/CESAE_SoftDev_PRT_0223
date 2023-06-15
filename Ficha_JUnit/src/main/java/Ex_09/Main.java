package Ex_09;

public class Main {
    public static void main(String[] args) {
        GameStore gameStore = new GameStore();
// Adicionar jogos ao stock
        gameStore.addGameToStock(new VideoGame("Skyrim", "Beteshda", 10.0, 50.0));
        gameStore.addGameToStock(new VideoGame("GTA V", "Rockstar", 15.0, 70.0));
        gameStore.addGameToStock(new VideoGame("The Legend of Zelda: Breath of the Wild", "Nintendo", 30.0, 60.0));
        gameStore.addGameToStock(new VideoGame("Red Dead Redemption 2", "Rockstar Games", 40.0, 50.0));
        gameStore.addGameToStock(new VideoGame("FIFA 22", "Electronic Arts", 20.0, 45.0));
        gameStore.addGameToStock(new VideoGame("Assassin's Creed Valhalla", "Ubisoft", 35.0, 55.0));
        gameStore.addGameToStock(new VideoGame("Marvel's Spider-Man: Miles Morales", "Insomniac Games", 25.0, 40.0));
        gameStore.addGameToStock(new VideoGame("Grand Theft Auto V", "Rockstar Games", 25.0, 40.0));
        gameStore.addGameToStock(new VideoGame("Minecraft", "Mojang Studios", 15.0, 30.0));
        gameStore.addGameToStock(new VideoGame("The Witcher 3: Wild Hunt", "CD Projekt Red", 20.0, 35.0));
        gameStore.addGameToStock(new VideoGame("Call of Duty: Modern Warfare", "Activision", 30.0, 50.0));
        gameStore.addGameToStock(new VideoGame("Super Mario Odyssey", "Nintendo", 40.0, 60.0));
        gameStore.addGameToStock(new VideoGame("The Last of Us Part II", "Naughty Dog", 40.0, 60.0));
        gameStore.addGameToStock(new VideoGame("Final Fantasy VII Remake", "Square Enix", 30.0, 50.0));
        gameStore.addGameToStock(new VideoGame("Resident Evil Village", "Capcom", 35.0, 55.0));
        gameStore.addGameToStock(new VideoGame("Super Smash Bros. Ultimate", "Nintendo", 25.0, 40.0));
        gameStore.addGameToStock(new VideoGame("Ghost of Tsushima", "Sucker Punch Productions", 30.0, 45.0));
        gameStore.addGameToStock(new VideoGame("Horizon Zero Dawn", "Guerrilla Games", 20.0, 35.0));
        gameStore.addGameToStock(new VideoGame("Dark Souls III", "FromSoftware", 25.0, 40.0));
        gameStore.addGameToStock(new VideoGame("God of War", "Santa Monica Studio", 30.0, 50.0));
        gameStore.addGameToStock(new VideoGame("The Elder Scrolls V: Skyrim", "Bethesda Game Studios", 15.0, 30.0));
        gameStore.addGameToStock(new VideoGame("Persona 5", "Atlus", 30.0, 50.0));
        gameStore.addGameToStock(new VideoGame("Mario Kart 8 Deluxe", "Nintendo", 40.0, 60.0));
        gameStore.addGameToStock(new VideoGame("Animal Crossing: New Horizons", "Nintendo", 35.0, 55.0));
        gameStore.addGameToStock(new VideoGame("Cyberpunk 2077", "CD Projekt", 25.0, 40.0));
        gameStore.addGameToStock(new VideoGame("Uncharted 4: A Thief's End", "Naughty Dog", 20.0, 35.0));
        gameStore.addGameToStock(new VideoGame("Cyberpunk 2077", "CD Projekt", 25.0, 40.0));
        gameStore.addGameToStock(new VideoGame("Uncharted 4: A Thief's End", "Naughty Dog", 20.0, 35.0));
        gameStore.addGameToStock(new VideoGame("Hades", "Supergiant Games", 15.0, 30.0));
// Venda de jogos
        gameStore.sellGame(0);
        gameStore.sellGame(1);
// Exibir stock e vendas
        gameStore.displayStock();
        gameStore.displaySales();
    }
}