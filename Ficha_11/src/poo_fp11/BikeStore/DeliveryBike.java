package poo_fp11.BikeStore;

import poo_fp11.BikeStore.Bicycle;

import java.util.ArrayList;
import java.util.Scanner;

public class DeliveryBike extends Bicycle {
private boolean isFrontBasket;
private double basketDelivery;
private ArrayList<Sponsors> sponsors;

    public DeliveryBike(int id, int numberOfGears, double wheelSize, double bikeLenght, double price, String mainColor, boolean adjustableSeatpost, boolean isFrontBasket, double basketDelivery, ArrayList<Sponsors> sponsors) {
        super(id, numberOfGears, wheelSize, bikeLenght, price, mainColor, adjustableSeatpost);
        this.isFrontBasket = isFrontBasket;
        this.basketDelivery = basketDelivery;
        this.sponsors = sponsors;
    }

    public boolean isFrontBasket() {
        return isFrontBasket;
    }

    public void setFrontBasket(boolean frontBasket) {
        isFrontBasket = frontBasket;
    }

    public double getBasketDelivery() {
        return basketDelivery;
    }

    public void setBasketDelivery(double basketDelivery) {
        this.basketDelivery = basketDelivery;
    }

    public ArrayList<Sponsors> getSponsors() {
        return sponsors;
    }

    public void setSponsors(ArrayList<Sponsors> sponsors) {
        this.sponsors = sponsors;
    }

    /**
     * Método que recebe um Sponsor e adiciona ao array
     * @param sponsorToAdd - Sponsor a adicionar
     */
    public void addSponsor(Sponsors sponsorToAdd){
        this.sponsors.add(sponsorToAdd);
    }

    /**
     * Método que recebe um ArrayList de poo_fp11.BikeStore.Sponsors e adiciona ao array
     * @param sponsorsToAdd - ArrayList de poo_fp11.BikeStore.Sponsors a adicionar
     */
    public void addSponsor(ArrayList<Sponsors> sponsorsToAdd){
        for (Sponsors sponsor : sponsorsToAdd) {
            this.sponsors.add(sponsor);
        }
    }

    /**
     * Imprimir os poo_fp11.BikeStore.Sponsors com o respetivo index
     */
    public void printSponsors(){
        int contador=0;
        System.out.println("Patrocinios da Bicicleta: ");
        for(Sponsors sponsor : this.sponsors){
            System.out.println(contador+". "+sponsor);
            contador++;
        }
    }

    /**
     * Método para substituir um Sponsor da bicicleta
     * @param sponsor
     */
    public void setSponsor(Sponsors sponsor){
        // Scanner
        Scanner input = new Scanner(System.in);

        // Imprimir na consola os patrocinadores com o respetivo indice
        printSponsors();

        // Ler do utilizador o indice do patrocinio a substituir
        System.out.println("Qual o patrocinio que quer substituir: ");
        int opcao= input.nextInt();

        // Substituimos o patrocinio
        this.sponsors.set(opcao,sponsor);
    }

    /**
     * Método para remover um Sponsor
     */
    public void removeSponsor(){
        // Scanner
        Scanner input = new Scanner(System.in);

        // Imprimir na consola as ferramentas com o respetivo indice
        printSponsors();

        // Ler do utilizador o indice da ferramenta a remover
        System.out.println("Qual o patrocinio que quer remover: ");
        int opcao= input.nextInt();

        // Remover a ferramenta
        this.sponsors.remove(opcao);
    }

    /**
     * Método que imprime os detalhes da bicicleta
     */
    public void exibirDetalhes(){
        System.out.println("ID: "+ this.getId());
        System.out.println("Número de Mudanças: "+ this.getNumberOfGears());
        System.out.println("Tamanho da Roda: "+this.getWheelSize());
        System.out.println("Comprimento da Bicicleta: "+ this.getBikeLenght());
        System.out.println("Preço: "+ this.getPrice());
        System.out.println("Cor: "+ this.getMainColor());
        System.out.println("Selim Ajudatável: "+ this.isAdjustableSeatpost());

        System.out.println("O cesto é à frente: "+this.isFrontBasket);
        System.out.println("Capacidade do Cesto: "+this.basketDelivery+"L");
        printSponsors();
    }
}
