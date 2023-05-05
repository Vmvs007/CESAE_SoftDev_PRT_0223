import java.util.Scanner;

public class Ex_01 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("***** Carro 1 *****");
        System.out.print("Insira a Marca: ");
        String marca = input.next();

        System.out.print("Insira o Modelo: ");
        String modelo = input.next();

        System.out.print("Insira o Ano de Fabrico: ");
        int ano = input.nextInt();

        System.out.print("Insira a Potência: ");
        int potencia = input.nextInt();

        System.out.print("Insira a Cilindrada: ");
        int cilindrada = input.nextInt();

        System.out.print("Insira o tipo de combustível do carro (GASOLINA, DIESEL ou GPL): ");
        TipoCombustivel tipoCombustivel = TipoCombustivel.valueOf(input.next().toUpperCase());

        System.out.print("Insira o Consumo: ");
        double consumoL100 = input.nextDouble();

        Carro carro1 = new Carro(marca,modelo,ano,potencia,cilindrada,tipoCombustivel, consumoL100);

        System.out.println("\n***** Carro 2 *****");
        System.out.print("Insira a Marca: ");
         marca = input.next();

        System.out.print("Insira o Modelo: ");
        modelo = input.next();

        System.out.print("Insira o Ano de Fabrico: ");
        ano = input.nextInt();

        System.out.print("Insira a Potência: ");
        potencia = input.nextInt();

        System.out.print("Insira a Cilindrada: ");
        cilindrada = input.nextInt();

        System.out.print("Insira o tipo de combustível do carro (GASOLINA, DIESEL ou GPL): ");
        tipoCombustivel = TipoCombustivel.valueOf(input.next().toUpperCase());

        System.out.print("Insira o Consumo: ");
        consumoL100 = input.nextDouble();

        Carro carro2 = new Carro(marca,modelo,ano,potencia,cilindrada,tipoCombustivel, consumoL100);

        System.out.println("\n***** Carro 1 *****");
        carro1.exibirDetalhes();
        System.out.println("\n***** Carro 2 *****");
        carro2.exibirDetalhes();


        Carro vencedor = carro1.corrida(carro2);
        System.out.println("\nCorrida a acontecer...");
        System.out.println("Vencedor:");

        if(vencedor==null){
            System.out.println("Empate");
        }else {
            vencedor.exibirDetalhes();
        }
    }
}
