import java.util.Scanner;

public class Ex_03 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        double largura, altura;


        // Instanciar um retangulo chamado fixo
        Retangulo fixo = new Retangulo(10.5,50);

        // Pergunto ao utilizador largura
        System.out.print("Insira a largura:");
        largura=input.nextDouble();

        // Pergunto ao utilizador altura
        System.out.print("Insira a altura:");
        altura=input.nextDouble();



        // Instancio um retangulo "terreno" com os valores lidos do utilizador
        Retangulo variavel = new Retangulo(largura, altura);

        // Calcular perimetro
        System.out.println("Perímetro: "+variavel.calcularPerimetro());

        //Calcular area
        System.out.println("Área: "+variavel.calcularArea());


        // Exemplo (não estava no exercício):
        // Perceber qual o retangulo com maior area
        // O porquê de o método calcular não ser void
        if(fixo.calcularArea()> variavel.calcularArea()){
            System.out.println("O retangulo fixo é maior");
        }else{
            System.out.println("O retangulo do utilizador é maior");
        }

    }
}
