import java.util.Scanner;

public class Ex_10 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        double aumento;

        // Instanciar um funcionário
        Funcionario vitor = new Funcionario("Vitor Santos", 1000, "Formação");

        // Exibir os dados
        vitor.exibirDados();

        // Imprime um enter
        System.out.println();

        // Ler percentagem de aumento
        System.out.print("Percentagem de Aumento: ");
        aumento = input.nextDouble();

        // Aumentar o salário
vitor.aumentarSalario(aumento);

// Imprimir um enter
        System.out.println();

        // Exibir os dados
        vitor.exibirDados();

    }
}
