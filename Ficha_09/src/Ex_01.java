import java.util.Scanner;

public class Ex_01 {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        // Declarar variáveis
        String nome = "Vitor";
        int idade= 23;
        double altura= 1.7;

        // Instanciar um objeto da classe Pessoa
        Pessoa vitor = new Pessoa(nome,idade,altura);

        // Instanciar um objeto da classe Pessoa
        Pessoa ana = new Pessoa("Ana",20, 1.6);

        // Imprimir as informações da primeira pessoa
        System.out.println("Nome da primeira pessoa: " + vitor.getNome());
        System.out.println("Idade da primeira pessoa: " +vitor.getIdade());
        System.out.println("Altura da primeira pessoa: " + vitor.getAltura());

        // Imprimir enter *para ficar bonito*
        System.out.println();

        // Imprimir as informações da segunda pessoa
        System.out.println("Nome da segunda pessoa: " + ana.getNome());
        System.out.println("Idade da segunda pessoa: " +ana.getIdade());
        System.out.println("Altura da segunda pessoa: " + ana.getAltura());

        System.out.println("\n_________________________________________\n");

        // Pergunta ao utilizador informações para criar uma pessoa
        System.out.print("Insira o nome da pessoa: ");
        String nomePessoa=input.next();

        System.out.print("Insira a idade da pessoa: ");
        int idadePessoa=input.nextInt();

        System.out.print("Insira a altura da pessoa: ");
        double alturaPessoa = input.nextDouble();

        // Instanciar um objeto da classe Pessoa
        Pessoa pessoaInputUtilizador = new Pessoa(nomePessoa,idadePessoa,alturaPessoa);

        // Imprimir as informações da pessoa criada pelo utilizador
        System.out.println("O nome da pessoa é "+pessoaInputUtilizador.getNome());
        System.out.println("Tem "+pessoaInputUtilizador.getIdade()+" anos");
        System.out.println("E "+ pessoaInputUtilizador.getAltura()+" metros de altura");

    }
}