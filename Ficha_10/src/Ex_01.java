import java.util.Scanner;

public class Ex_01 {


    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        // Permitir ao utilizador introduzir informações para 2 carros
        Carro carro1 = Carro.introduzirCarro();
        Carro carro2 = Carro.introduzirCarro();

        // Imprimir informações dos carros
        System.out.println("\n***** Carro 1 *****");
        carro1.exibirDetalhes();
        System.out.println("\n***** Carro 2 *****");
        carro2.exibirDetalhes();

// Fazer a corrida
        Carro vencedor = carro1.corrida(carro2);
        System.out.println("\nCorrida a acontecer...");

        // Apresentar o vencedor
        if(vencedor==null){ // Caso empate
            System.out.println("Empate");
        }else {
            System.out.println("Vencedor:");
            vencedor.exibirDetalhes();
        }

        // Calcular o consumo para o carro vencedor
        // Se não houver vencedor vair dar erro, para ficar bem convém estar num menu com as devidas verificações
        System.out.print("\n\nDeseja calcular o consumo em quantos kms: ");
        double distancia = input.nextDouble();

        // Apresenta o consumo
        System.out.println("Consome: "+ vencedor.calcularConsumo(distancia)+" litros.");
    }
}
