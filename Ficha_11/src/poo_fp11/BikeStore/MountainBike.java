package poo_fp11.BikeStore;

import poo_fp11.BikeStore.Bicycle;

import java.util.ArrayList;
import java.util.Scanner;

public class MountainBike extends Bicycle {

private int numberOfLights;
private MountainBikeSuspension suspension;
private ArrayList<BikeTools> bikeTools;

    public MountainBike(int id, int numberOfGears, double wheelSize, double bikeLenght, double price, String mainColor, boolean adjustableSeatpost, int numberOfLights, MountainBikeSuspension suspension, ArrayList<BikeTools> bikeTools) {
        super(id, numberOfGears, wheelSize, bikeLenght, price, mainColor, adjustableSeatpost);
        this.numberOfLights = numberOfLights;
        this.suspension = suspension;
        this.bikeTools = bikeTools;
    }

    public int getNumberOfLights() {
        return numberOfLights;
    }

    public void setNumberOfLights(int numberOfLights) {
        this.numberOfLights = numberOfLights;
    }

    public MountainBikeSuspension getSuspension() {
        return suspension;
    }

    public void setSuspension(MountainBikeSuspension suspension) {
        this.suspension = suspension;
    }

    public ArrayList<BikeTools> getBikeTools() {
        return bikeTools;
    }

    public void setBikeTools(ArrayList<BikeTools> bikeTools) {
        this.bikeTools = bikeTools;
    }

    /**
     * Método que recebe uma <b>bikeTool</b> e adiciona ao <i>array</i>
     * @param toolToAdd - Uma BikeTool
     */
    public void addBikeTool(BikeTools toolToAdd){
        this.bikeTools.add(toolToAdd);
    }

    /**
     * Método que recebe um ArrayList de poo_fp11.BikeStore.BikeTools e adiciona ao array
     * @param toolsToAdd - Um Array de poo_fp11.BikeStore.BikeTools
     */
    public void addBikeTool(ArrayList<BikeTools> toolsToAdd){
        for (BikeTools tools : toolsToAdd) {
            this.bikeTools.add(tools);
        }
    }

    /**
     * Imprimir as poo_fp11.BikeStore.BikeTools com o respetivo index
     */
    public void printBikeTools(){
        int contador=0;
        System.out.println("Ferramentas da Bicicleta: ");
        for( BikeTools tool :this.bikeTools){
            System.out.println(contador+". "+tool);
            contador++;
        }
    }

    /**
     * Método para substituir uma ferramenta das poo_fp11.BikeStore.BikeTools
     * @param toolToSet
     */
    public void setBikeTool(BikeTools toolToSet){
        // Scanner
        Scanner input = new Scanner(System.in);

        // Imprimir na consola as ferramentas com o respetivo indice
        printBikeTools();

        // Ler do utilizador o indice da ferramenta a substituir
        System.out.println("Qual a ferramenta que quer substituir: ");
        int opcao= input.nextInt();

        // Substituimos a ferramenta
        this.bikeTools.set(opcao,toolToSet);
    }

    /**
     * Método para remover uma BikeTool
     */
    public void removeBikeTool(){
        // Scanner
        Scanner input = new Scanner(System.in);

        // Imprimir na consola as ferramentas com o respetivo indice
        printBikeTools();

        // Ler do utilizador o indice da ferramenta a remover
        System.out.println("Qual a ferramenta que quer remover: ");
        int opcao= input.nextInt();

        // Remover a ferramenta
        this.bikeTools.remove(opcao);
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

        System.out.println("Numero de Luzes: "+this.numberOfLights);
        System.out.println("Suspensão: "+this.suspension);
        printBikeTools();
    }
}
