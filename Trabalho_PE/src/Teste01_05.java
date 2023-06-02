import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


/*Elabore um menu, que permita ao utilizador escolher o que pretende fazer, sendo que as opções terão de corresponder
ao número do exercício seguido da sua descrição. (Todos os exercícios devem abrir o ficheiro acima mencionado, e devem
ser uma função própria (objeto de valorização)).
        1. Imprima o seu conteúdo na consola.
        2. Imprima quantas vendas foram executadas e o seu valor total.
        3. Sabendo que a GameStart tem 10% de lucro em cada jogo, calcule o total de lucro.
        4. Dado um idCliente, imprima todas as informações associadas a esse cliente (nome, contacto, email).
        5. Dada uma Editora, imprima todos géneros e os respetivos jogos.
        6. Imprima qual o jogo mais caro e os clientes que o compraram.*/
public class Teste01_05 {

    public static Scanner input = new Scanner(System.in);

    public static void usingPrintWriter() throws FileNotFoundException {
        //O scanner serve para ler o ficheiro CSV
        Scanner sc = new Scanner(new File("GameStart.csv"));

//Declaração de variaveis
        int menu, l = 0;
        String linha;
        String[][] matriz = new String[linhas()][9];
////Ler o conteudo do ficheiro, enquanto tiver linhas seguintes.
        while (sc.hasNextLine()) {
            linha = sc.nextLine();
//A cada ponto e virgulo, é definido um array
            String[] array = linha.split(";");
//O ciclo for está a guardar o conteudo na linha e coluna
            for (int c = 0; c < array.length; c++) {
                matriz[l][c] = array[c];
                //System.out.println("posiçao[" + l + "]" + "[" + c +"]"+matriz[l][c]);
            }
            //l++ serve para no proximo ciclo a linha estar a posição seguinte
            l++;
        }

//O primeiro "do" vai ser inicializado enquanto não for selecionada a opção 7, ou seja sair
        do {
            /*O segundo "do" vai mostrar as opções do menu enquando forem selecionadas opções que não estejam presente
            no menu. Após escolher uma opção válido dentro do "while", o programa prossgue para os casos*/
            do {
                System.out.println("Escolha uma das seguintes opções:");
                System.out.println("1. Imprima o seu conteúdo na consola.");
                System.out.println("2. Imprima quantas vendas foram executadas e o seu valor total.");
                System.out.println("3. Sabendo que a GameStart tem 10% de lucro em cada jogo, calcule o total de lucro.");
                System.out.println("4. Dado um idCliente, imprima todas as informações associadas a esse cliente (nome, contacto, email).");
                System.out.println("5. Dada uma Editora, imprima todos géneros e os respetivos jogos.");
                System.out.println("6. Imprima qual o jogo mais caro e os clientes que o compraram.");
                System.out.println("7. Sair");
                //Inicialização do menu
                menu = input.nextInt();
            } while (menu < 1 || menu > 7);
            switch (menu) {
                case 1:
                    //Ivocação da função
                    case1();
                    break;

                case 2:
                    //Ivocação da função
                    case2();
                    break;

                case 3:
                    //Ivocação da função
                    case3();
                    break;

                case 4:
                    //Leitura do ficheiro CSV
                    Scanner sc4 = new Scanner(new File("GameStart.csv"));

                    //Declaração de variaveis
                    String id;
                    System.out.println("Qual é o IdCliente?");
                    input.nextLine();
                    id = input.nextLine();

                    /*Dentro do ciclo "for", quando a variavel "id" for igual a string presente na linha da coluna 1,
                    imprime na consola a linha correspondente na coluna do nome, contacto e email*/
                    for (int i = 0; i < matriz.length; i++) {
                        if (id.equals(matriz[i][1])) {
                            System.out.println((matriz[i][2]) + ";" + matriz[i][3] + ";" + matriz[i][4]);
                            //Este break, serve para apenas me mostrar um resultado e parar de imprimir resultado repetidos
                            break;
                        }
                    }
                    break;

                case 5:
                    //Leitura do ficheiro CSV
                    Scanner sc5 = new Scanner(new File("GameStart.csv"));

                    //Declaração de variaveis
                    String editora;
                    System.out.println("Qual é a Editora do jogo?");
                    input.nextLine();
                    editora = input.nextLine();

                    //O primeira ciclo for esta a correr o valores da matriz
                    for (int i = 1; i < matriz.length; i++) {
                        //A variavel contador está igualada a 0
                        int contador = 0;
                        //O segundo for esta correr no mesmo ciclo do for anterior, mas com uma linha de avanço
                        for (int z = i + 1; z < matriz.length; z++) {
                            /*Na condição "if" indica que, se o valor do primeiro "for" na coluna 7 (DO JOGO) é igual
                             ao valor do segundo "for" na coluna 7(também do jogo), o "contadar" passa a 1.
                             Ou seja, todas a vezes que tem jogos repetidos para além dos verificados no contador 0,
                             não vão ser impressos*/
                            if (matriz[i][7].equals(matriz[z][7])) {
                                contador = 1;
                            }
                        }
                        /* Nesta condição "if", se apenas se corre o primeiro "for" e o valor da "editora"
                         é igual ao presente na coluna 5, imprime a categoria e o jogo*/
                        if (contador == 0 && editora.equals(matriz[i][5])) {
                            System.out.println((matriz[i][6]) + ";" + matriz[i][7]);

                        }

                    }
                    break;

                case 6:
                    //Leitura do ficheiro CSV
                    Scanner sc6 = new Scanner(new File("GameStart.csv"));

                    //Declaração de variaveis
                    String cliente = "", cliente2 = "";
                    double maximo = 0.0, max = 0.0, maximo2 = 0.0, max2 = 0.0;
                    //Inicia o ciclo for
                    for (int i = 1; i < matriz.length; i++) {

                        //Na variavel "máximo" é guardado o resultado da coluna 8 e convertido de String para Double
                        maximo = Double.parseDouble(matriz[i][8]);

                        /*Se o resultado da coluna 8 foi maior que o "max"(sendo ele 0.0 antes da primeira iteração),
                        o "maximo" fica armazenado no "max"*/
                        if (maximo >= max) {
                            max = maximo;
                            //Na variavel "cliente", também fica armazenado o resultado que corresponde a linha do "max"
                            cliente = matriz[i][2];
                        }
                        /*Voltei a fazer o mesmo prcesso do "if" anterior, mas desta vez apenas com o sinal de maior">",
                          pois como existem dois máximos com o mesmo resultado, mas com clientes diferentes,
                          foi a unica forma que me ocorreu de mostrar o resutado*/
                        maximo2 = Double.parseDouble(matriz[i][8]);
                        if (maximo2 > max2) {
                            max2 = maximo2;
                            cliente2 = matriz[i][2];
                        }
                    }

                    //Imprimir os resultados
                    System.out.println("O jogo mais caro, custa " + max + "€ comprado pelos clientes:");
                    System.out.println(cliente + " e " + cliente2);

            }

        } while (menu != 7);
        System.out.println("Programa terminado");
    }

    //Aqui está declarado o método "linhas" com um tipo de retorno "int", para depois ser usado en outras funções.
    public static int linhas() throws FileNotFoundException {
        //scanner para ler o ficheiro
        Scanner sc0 = new Scanner(new File("GameStart.csv"));

        //Declaração de variaveis
        int linhas = 0;
        String linha;

        //enquanto o ficheiro encontra uma proxima linha, o ciclo "while" vai-se repetindo e armazena o numero de linhas
        //na variavel "linhas"
        while (sc0.hasNextLine()) {
            linha = sc0.nextLine();
            linhas++;

        }
        //retorna o numero total de linhas para depois ser usado en outras funções
        return linhas;

    }

    //Aqui está declarado o método "case1", do tipo void, pois não é preciso retornar nada, apenas que seja invocada no switch case
    public static void case1() throws FileNotFoundException {
        //scanner para ler o ficheiro CSV
        Scanner sc = new Scanner(new File("GameStart.csv"));
        //Declaração da variavel linha
        String linha;
        //Ler o conteudo do ficheiro, enquanto tiver linhas seguintes. No fim de casa ciclo while,imprimin a linha
        while (sc.hasNextLine()) {
            linha = sc.nextLine();
            System.out.println(linha);
        }
    }

    //Declaração do método "case 2", também do tipo void, pois não precisa returnar nada, apenas de ser invocada no switch case
    public static void case2() throws FileNotFoundException {
        //scanner para ler o ficheiro
        Scanner sc2 = new Scanner(new File("GameStart.csv"));
//Declaração de variaveis
        String linha;
        Double total1 = 0.0;
        int vendas = 0;
        //esta linha serve para saltar a primeira linha do cabeçalho
        linha = sc2.nextLine();
        //Agora tem o ciclo while para ler as linhas do ficheiro
        while (sc2.hasNextLine()) {
//Esta variavel linha é para avançar as linhas
            linha = sc2.nextLine();
            //Este abaixo serve para definir os index do array ao fim de cada ";"
            String[] array = linha.split(";");

            /*Nesta condição "if", quando o conteudo da linha chegar a coluna 8, esse conteudo é passado para double, pois
             não posso realizar operações aritemeticas com Strings,e é armazenado na variavel "total". */
            if (linha.contains(array[8])) {
                Double total = Double.parseDouble(array[8]);
                //A variavel "total1" serve de somatario, para armazenar todos os valores da coluna 8
                total1 = total + total1;
                //A variavel "vendas" vai incrementado, de forma a sabermos no final o numero total de vendas
                vendas++;
            }

        }
        //Faz-se a impressão na consola dos resultados
        System.out.println("Foram feitas " + vendas + " vendas, resulttando num valor total de " + total1 + "€");
    }

    ////Declaração do método "case 3", também do tipo void, pois não precisa returnar nada, apenas de ser invocada no switch case
    public static void case3() throws FileNotFoundException {
        //scanner para ler o ficheiro
        Scanner sc3 = new Scanner(new File("GameStart.csv"));

        //Declaração de variaveis
        String linha;
        Double total2 = 0.0;

        //esta linha serve para saltar a primeira linha do cabeçalho
        linha = sc3.nextLine();

        //= ciclo while para ler as linhas do ficheiro
        while (sc3.hasNextLine()) {

            //A variavel linha é para avançar as linhas
            linha = sc3.nextLine();
            //Abaixo serve para definir os index do array ao fim de cada ";"
            String[] array = linha.split(";");

            /*Nesta condição "if", quando o conteudo da linha chegar a coluna 8, esse conteudo é passado para double, pois
             não posso realizar operações aritemeticas com Strings,e é armazenado na variavel "total". */
            if (linha.contains(array[8])) {
                Double total = Double.parseDouble(array[8]);
                //A variavel "total2" serve de somatario, para armazenar todos os valores da coluna 8
                total2 = total + total2;
            }

        }
        //Apenas faço a impressão do resultado total multiplicado por 0.1, de forma a representar os 10% de lucro
        System.out.println("Tendo em conta 10% de lucro sobre as vendas, o lucro foi de " + (total2 * 0.1) + "€");
    }

    public static void main(String[] args) {

        //O bloco try-catch serve para a captura os erros que ocarram dentro do método " usingPrintWriter"
        try {
            usingPrintWriter();

        } catch (FileNotFoundException exc) {
            System.out.println("Ficheiro não encontrado");
        }

    }
}
