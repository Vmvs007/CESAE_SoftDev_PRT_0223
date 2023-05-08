import java.util.Scanner;

public class Animal {

    public String nome, especie, paisOrigem;
    public double peso;
    public String[] alimentacao= new String[20];

    public Animal(String nome, String especie, String paisOrigem, double peso, String[] alimentacao) {
        this.nome = nome;
        this.especie = especie;
        this.paisOrigem = paisOrigem;
        this.peso = peso;
        this.alimentacao = alimentacao;
    }

    public Animal (){
        Scanner input = new Scanner(System.in);

        String[] alimentos = new String[20];

        System.out.print("Introduza o Nome do Animal: ");
        String nome= input.next();

        System.out.print("Introduza a Espécie do Animal: ");
        String especie= input.next();

        System.out.print("Introduza o País do Animal: ");
        String pais= input.next();

        System.out.print("Introduza o Peso (Kg) do Animal: ");
        double peso= input.nextDouble();

        System.out.print("Quantos alimentos come: ");
        int quantidadeAlimentos= input.nextInt();

        for(int i =0; i<quantidadeAlimentos;i++){
            System.out.print("Quantos alimentos come: ");
            alimentos[i]= input.next();
        }
    }
}
