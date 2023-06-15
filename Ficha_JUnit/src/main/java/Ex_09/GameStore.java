package Ex_09;
import java.util.ArrayList;
public class GameStore {
    private ArrayList<VideoGame> stock;
    private ArrayList<VideoGame> sales;
    public GameStore() {
        stock = new ArrayList<>();
        sales = new ArrayList<>();
    }

    public ArrayList<VideoGame> getStock() {
        return stock;
    }

    public ArrayList<VideoGame> getSales() {
        return sales;
    }

    public void addGameToStock(VideoGame game) {
        stock.add(game);
    }

    public void sellGame(int index) {
        VideoGame game = stock.remove(index);
        sales.add(new VideoGame(game.getName(), game.getPublisher(), game.getCostPrice(), game.getSellingPrice()));
    }
    public void displayStock() {
        System.out.println("Stock:");
        for (VideoGame game : stock) {
            System.out.println("Name: " + game.getName());
            System.out.println("Publisher: " + game.getPublisher());
            System.out.println("Cost Price: " + game.getCostPrice());
            System.out.println("Selling Price: " + game.getSellingPrice());
            System.out.println("---------------------------");
        }
    }
    public void displaySales() {
        System.out.println("Sales:");
        for (VideoGame game : sales) {
            System.out.println("Name: " + game.getName());
            System.out.println("Publisher: " + game.getPublisher());
            System.out.println("Cost Price: " + game.getCostPrice());
            System.out.println("Selling Price: " + game.getSellingPrice());
            System.out.println("---------------------------");
        }
    }

    public double calcularLucro(){

        double lucroTotal=0, lucroJogo=0;

        for(VideoGame game: this.sales){
            lucroJogo=game.getSellingPrice()- game.getCostPrice();
            lucroTotal+=lucroJogo;
        }
        return lucroTotal;

    }


}