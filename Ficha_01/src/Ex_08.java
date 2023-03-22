
// Import obrigatório do package para fazer a leitura das introduções de dados do utilizador
import java.util.Scanner;

class Ex_08 {
    public static void main(String[] args) {

        System.out.println("\n***** Ficha 1 - Exercicio 8 ******\n");

        // Instância obrigatória da classe para fazer a leitura das introduções de dados do utilizador
        Scanner input = new Scanner(System.in);

        // Declarar as variáveis
        int m1, s1, m2, s2, m3, s3, m4, s4, m5, s5, total_m, total_s, horas, minutos,
                segundos;

        // Leitura das 5 musicas
        // Ler a musica 1
        System.out.print("Introduza MINUTOS da Musica 1: ");
        m1 = input.nextInt();
        System.out.print("Introduza SEGUNDOS da Musica 1: ");
        s1 = input.nextInt();

        // Ler a musica 2
        System.out.print("Introduza MINUTOS da Musica 2: ");
        m2 = input.nextInt();
        System.out.print("Introduza SEGUNDOS da Musica 2: ");
        s2 = input.nextInt();

        // Ler a musica 3
        System.out.print("Introduza MINUTOS da Musica 3: ");
        m3 = input.nextInt();
        System.out.print("Introduza SEGUNDOS da Musica 3: ");
        s3 = input.nextInt();

        // Ler a musica 4
        System.out.print("Introduza MINUTOS da Musica 4: ");
        m4 = input.nextInt();
        System.out.print("Introduza SEGUNDOS da Musica 4: ");
        s4 = input.nextInt();

        // Ler a musica 5
        System.out.print("Introduza MINUTOS da Musica 5: ");
        m5 = input.nextInt();
        System.out.print("Introduza SEGUNDOS da Musica 5: ");
        s5 = input.nextInt();

        // Calcular o total do album em segundos
        ///total_s=(m1*60)+(m2*60)+(m3*60)+(m4*60)+(m5*60)+s1+s2+s3+s4+s5;
        total_s = ((m1 + m2 + m3 + m4 + m5) * 60) + s1 + s2 + s3 + s4 + s5;

        // Calcular as horas dividindo os segundos totais por 3600 (numero de segundos numa hora)
        horas = total_s / 3600;
        // Calcular os minutos dividindo os segundos totais por 60 ((numero de segundos num minuto)
        // Devo retirar as horas multiplicadas por 60
        minutos = (total_s / 60) - (horas * 60);
        // Calcular segundos
        // Devo retirar as horas multiplicadas por 3600 e os minutos multiplicados por 60
        segundos = (total_s) - (minutos * 60) - (horas * 3600);

        //Apresentar resultados
        System.out.println("\nO album tem " + total_s + " segundos no total");
        System.out.println("O album tem " + horas + " horas, " + minutos + " minutos, " + segundos + " segundos");
        System.out.println("Duracao do album: "+horas+"h "+minutos+"m "+segundos+"s");

        //Também dava para resolver através do resto da divisão inteira
    }
}