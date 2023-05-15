package poo_fp11.BikeStore;

import poo_fp11.BikeStore.Bicycle;

import java.util.ArrayList;

public class BicycleManagement {

    private ArrayList<Bicycle> bicicletasLoja;

    public BicycleManagement(ArrayList<Bicycle> bicicletasLoja) {
        this.bicicletasLoja = bicicletasLoja;
    }

    /**
     * Adicionar bicicletas à loja
     * @param bikeToAdd - Bicicleta a adicionar
     */
    public void addBike(Bicycle bikeToAdd){
        this.bicicletasLoja.add(bikeToAdd);
    }

    /**
     * Método que imprime as biciletas da loja de forma simples
     */
    public void exibirBicicletasSimples(){
        System.out.println("\n***** Todas as bicicletas da loja *****");
        for(Bicycle bicycle: this.bicicletasLoja){
            System.out.println("ID: "+bicycle.getId());
            System.out.println("Cor: "+bicycle.getMainColor());
            System.out.println("Preço: "+bicycle.getPrice());

            if(bicycle instanceof MountainBike){
                MountainBike bikeMonte = (MountainBike) bicycle;
                System.out.println("Número de Luzes: "+ bikeMonte.getNumberOfLights());
                System.out.println("Suspensão: "+bikeMonte.getSuspension());
            }

            if(bicycle instanceof DeliveryBike){
                DeliveryBike bikeEntregas = (DeliveryBike) bicycle;
                System.out.println("Capacidade do Cesto: "+bikeEntregas.getBasketDelivery()+"L");
            }
        }
    }

    /**
     * Método que imprime todos os detalhes das bicicletas da loja
     */
    public void exibirBicicletasCompleto(){
        System.out.println("\n***** Todas as bicicletas da loja *****");
        for(Bicycle bicycle: this.bicicletasLoja){

            if(bicycle instanceof MountainBike){
                System.out.println("Tipo da Bicicleta: Bicicleta de Monte");
                MountainBike bikeMonte = (MountainBike) bicycle;
                bikeMonte.exibirDetalhes();
            }

            if(bicycle instanceof DeliveryBike){
                System.out.println("Tipo da Bicicleta: Bicicleta de Entregas");
                DeliveryBike bikeEntregas = (DeliveryBike) bicycle;
                bikeEntregas.exibirDetalhes();
            }
            System.out.println("");
        }

    }
}
