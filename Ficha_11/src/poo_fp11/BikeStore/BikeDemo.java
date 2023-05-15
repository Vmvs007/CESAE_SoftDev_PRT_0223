package poo_fp11.BikeStore;

import poo_fp11.BikeStore.Bicycle;
import poo_fp11.BikeStore.BicycleManagement;

import java.util.ArrayList;

public class BikeDemo {
    public static void main(String[] args) {

        // Declarar o ArrayList com as ferramentas iniciais
        ArrayList<BikeTools> firstTools_Monte1 = new ArrayList<BikeTools>();

        // Adicionar as ferramentas iniciais
        firstTools_Monte1 .add(BikeTools.BIDON_AGUA);
        firstTools_Monte1.add(BikeTools.KIT_REPARACAO_PNEUS);

        // Declarar o ArrayList com as ferramentas iniciais
        ArrayList<BikeTools> firstTools_Monte2 = new ArrayList<BikeTools>();

        // Adicionar as ferramentas iniciais
        firstTools_Monte2 .add(BikeTools.BIDON_AGUA);
        firstTools_Monte2.add(BikeTools.KIT_REPARACAO_PNEUS);

        // Instanciar bicicletas de monte
        MountainBike bikeMonte1 = new MountainBike(100,2,29,2.4,800,"Preto",true,2, MountainBikeSuspension.DUPLA, firstTools_Monte1 );
        MountainBike bikeMonte2 = new MountainBike(101,3,27.5,2.5,1500,"Laranja",true,3, MountainBikeSuspension.DUPLA,firstTools_Monte2);



        // Declarar o ArrayList com os patrocinios iniciais
        ArrayList<Sponsors> sponsors = new ArrayList<Sponsors>();

        // Adicionar os sponsors inicias
        sponsors.add(Sponsors.PIZZAHUT);

   // Instanciar uma bicicleta de distribuição
        DeliveryBike bikePizzas1 = new DeliveryBike(200,5,29,2.2,300,"Vermelha",false,false,30,sponsors);


        // Imprimir as bicicletas
        System.out.println("Bike Monte 1: ");
        bikeMonte1.exibirDetalhes();

        System.out.println("\nBike Monte 2: ");
        bikeMonte2.exibirDetalhes();

        System.out.println("\nBike Entregas 1: ");
        bikePizzas1.exibirDetalhes();

        System.out.println("\n");

        // Manipular as ferramentas
        bikeMonte2.addBikeTool(BikeTools.CHAVE_FENDAS);

        //bikeMonte2.setBikeTool(poo_fp11.BikeStore.BikeTools.BUZINA);

        // Imprimir novamente as bicicletas
        System.out.println("\nBike Monte 1: ");
        bikeMonte1.exibirDetalhes();

        System.out.println("\nBike Monte 2: ");
        bikeMonte2.exibirDetalhes();

        System.out.println("\nBike Entregas 1: ");
        bikePizzas1.exibirDetalhes();


        // Declarar um ArrayList de Bicicletas
        ArrayList<Bicycle> bicicletas = new ArrayList<Bicycle>();

        // Adicionar bicicletas ao array
        bicicletas.add(bikeMonte1);
        bicicletas.add(bikeMonte2);
        bicicletas.add(bikePizzas1);

        // Instanciar uma loja
        BicycleManagement lojaBikes = new BicycleManagement(bicicletas);
        lojaBikes.exibirBicicletasCompleto();
    }
}
