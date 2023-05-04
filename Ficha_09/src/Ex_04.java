import java.util.Objects;
import java.util.Scanner;
public class Ex_04 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        double raio;
        String escolha;

        // Instanciar o círculo
        Circulo circunferencia = new Circulo(0);


        do {
            // Ler o raio do utilizador
            System.out.print("Introduza um raio: ");
            raio = input.nextDouble();

            // Mudar o raio para o inserido pelo utilizador
            circunferencia.setRaio(raio);

            // Imprimir info do círculo
            System.out.println("Raio: " + circunferencia.getRaio());
            System.out.println("Diametro: " + circunferencia.diametro());
            System.out.println("Circunferencia/Perimetro: " + circunferencia.circunferencia());
            System.out.println("Área: " + circunferencia.areaCirculo());

            // Parte opcional para explicar o set
            System.out.println("Deseja alterar o raio? (s/n):");
            escolha = input.next();

        }while(!escolha.equals("n"));
    }
}
