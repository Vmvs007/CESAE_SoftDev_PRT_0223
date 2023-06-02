import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*1.Imprima o seu conteúdo na consola.
2.Imprima quantas vendas foram executadas e o seu valor total.
3.Sabendo que a GameStart tem 10% de lucro em cada jogo, calcule o total de lucro.
4.Dado um idCliente, imprima todas as informações associadas a esse cliente (nome, contacto, email).
5.Dada uma Editora, imprima todos géneros e os respetivos jogos.
6.Imprima qual o jogo mais caro e os clientes que o compraram.*/


public class trabalho {

    public static void printFile(String pathFile) throws FileNotFoundException {

        //Abrir o ficheiro
        File file = new File(pathFile);
        //Ler o ficheiro
        Scanner readFile = new Scanner(file);

        //Enquanto houver nova linha, continua a ler a linha seguinte
        while (readFile.hasNextLine()) {
            //Imprime as linhas todas na consola
            System.out.println(readFile.nextLine());
        }
    }

    public static void totalSales(String pathFile) throws FileNotFoundException {

        //Abrir o ficheiro
        File file = new File(pathFile);
        //Ler o ficheiro
        Scanner readFile = new Scanner(file);

        //Declarar varável "line"
        String line;
        //Variável "salesNumber" corresponde ao nº de linhas/nº de arrays, exceto a primeira.
        int salesNumber = 0;
        //Varíavel "totalSales" corresponde à soma dos valores de todas as vendas.
        double totalSales = 0;

        //Avançamos a primeira linha
        readFile.nextLine();

        //Ciclo para ler o ficheiro e contar o número total de linhas
        while (readFile.hasNextLine()) {
            //Definimos cada linha como array de 9 posições dividos por (;)
            line = readFile.nextLine();
            String[] itemsOfTheLine = line.split(";");
            //Ao total das vendas (que começa em 0), somamos o valor da venda de cada iteração seguinte.
            //As venndas estão nos nossos arrays na posição 8. usámos o parse Double para transformar String em número.
            totalSales += Double.parseDouble(itemsOfTheLine[8]);
            //Contagem das iterações que correspondem ao nº de vendas
            salesNumber++;
        }

        readFile.close();
        System.out.println("Total number of sales is: " + salesNumber);
        System.out.println("Total value of sales is: " + totalSales);
    }

    public static void totalProfit(String pathFile) throws FileNotFoundException {

        //Abrir o ficheiro
        File file = new File(pathFile);
        //Ler o ficheiro
        Scanner readFile = new Scanner(file);

        //Declarar varável "line"
        String line;
        //Varável para o lucro total e para o valor total das vendas.
        double totalProfit = 0, totalSales = 0;

        readFile.nextLine();

        while (readFile.hasNextLine()) {
            line = readFile.nextLine();
            String[] itemsOfTheLine = line.split(";");
            totalSales += Double.parseDouble(itemsOfTheLine[8]);
            //Lucro total corresponde a 10% das vendas portanto basta fazer a conta.
            totalProfit = totalSales * 0.1;

        }
        readFile.close();
        //Imprimir o lucro total
        System.out.println("Total profit is: " + totalProfit);
    }

    public static void clientInfo(String pathFile, int clientID) throws FileNotFoundException {

        //variável clientID é o número que o utilizador vai introduzir no programa

        //Abrir o ficheiro
        File file = new File(pathFile);
        //Ler o ficheiro
        Scanner readFile = new Scanner(file);

        //Declarar varável "line", e inicializar variáveis como String vazia.
        String line, name = "", contact = "", email = "";

        readFile.nextLine();

        while (readFile.hasNextLine()) {

            line = readFile.nextLine();
            String[] itemsOfTheLine = line.split(";");
            /*Criamos uma condição que nos diz que se algum dos valores da posição 1 dos arrays
            corresponder ao clientID, o programa devolve-nos os valores corresponcentes das posições
            2, 3 e 4 (como Strings)*/
            if (Integer.parseInt(itemsOfTheLine[1]) == (clientID)) {

                name = (itemsOfTheLine[2]);
                contact = (itemsOfTheLine[3]);
                email = (itemsOfTheLine[4]);
            }
        }

        readFile.close();
        //Imprimir o nome, contacto e e-mail que corresponde a um certo ID
        System.out.println("Name: " + name);
        System.out.println("Contact: " + contact);
        System.out.println("E-mail: " + email);

    }

    public static void GameEditor(String pathFile, String editor) throws FileNotFoundException {

        //Variável String editor introduzida pelo utilizador

        // Abrir o ficheiro
        File file = new File(pathFile);
        // Ler o ficheiro
        Scanner readFile = new Scanner(file);

        //Variáveis para os outputs categoria e jogo.
        String line, category, game;
        /*Criamos um array de 101 posições que corresponde a todos os nomes dos jogos. Ou seja,
        um array com os valores todos de posição 7 dos outros arrays*/
        String[] printedGames = new String[101];
        //Variável para o número de jogos já impressos
        int numPrintedGames = 0;

        // Ciclo para ler o ficheiro e contar o número total de linhas
        while (readFile.hasNextLine()) {

            line = readFile.nextLine();
            String[] itemsOfTheLine = line.split(";");

            /*Verifica se o input editor corresponde ao valor da posição 5, que são as editoras
            e devolve a categoria e o nome do jogo correspondente. */
            if ((itemsOfTheLine[5]).equals(editor)) {

                category = (itemsOfTheLine[6]);
                game = (itemsOfTheLine[7]);
                //Neste momento, temos vários jogos repetidos.

                //Criamos uma variável boolean para verificar se o jogo já foi impresso.
                boolean gameAlreadyPrinted = false;
                //Criamos um ciclo para correr todos os jogos já impressos
                for (int i = 0; i < numPrintedGames; i++) {
                    //Se encontrar algum nome de jogo igual, o booleano assume o valor true (já foi impresso).
                    if (game.equals(printedGames[i])) {
                        gameAlreadyPrinted = true;
                        break;
                    }
                }

                // Se o jogo ainda não foi impresso, imprime o jogo e a categoria e adiciona ao array
                if (!gameAlreadyPrinted) {
                    System.out.println("Game: " + game);
                    System.out.println("Category: " + category);
                    printedGames[numPrintedGames] = game;
                    numPrintedGames++;
                }
            }
        }
        readFile.close();
    }


    public static void MostValuableGame(String pathFile) throws FileNotFoundException {

        //Abrir o ficheiro
        File file = new File(pathFile);
        //Ler o ficheiro
        Scanner readFile = new Scanner(file);

        //Declarar varável "line"
        String line;
        //Varáveis para os outputs que vamos querer(nome do jogo mais valioso e clientes que o compraram)
        String maxValuableGame = "", clients = "";
        //Varável para o valor de jogo mais alto encontrado
        double maxValue = 0;
        //Variável para os valores dos jogos
        double value;

        readFile.nextLine();

        while (readFile.hasNextLine()) {

            line = readFile.nextLine();
            String[] itemsOfTheLine = line.split(";");
            //Dizemos que os valores dos nossos jogos correspondem aos da posição 8 dos arrays
            value = Double.parseDouble(itemsOfTheLine[8]);

            /*Criamos uma condição para dizer que se o valor encontrado em cada linha for superior ao valor
            * máximo que começa em 0, o valor máximo passa a ser esse novo valor.*/
            if (value > maxValue) {
                maxValue = value;

                /*Devolve-nos o valor (string) correspondente da poiçao 7 (nome do jogo)
                Apenas nos devolve o nome do jogo que aparece na primeira venda mais valiosa*/
                maxValuableGame = itemsOfTheLine[7];
                /*Devolve-nos o nome do cliente correspondente a essa primeira venda
                Ou seja, ainda nos falta garantir que o programa nos dá os nomes dos clientes todos
                que compraram esse jogo*/
                clients = itemsOfTheLine[2];

                /*Para além de imprimir o nome do jogo e o primeiro cliente que comprou o jogo mais caro,
                usmos um else if para dizer que também queremos que o programa nos encontre todos os clientes que
                compraram esse jogo. Dizemos então, que se ele encontrar algum valor igual ao nosso valor máximo,
                ele vai imprimir o primeiro cliente que encontrar mais os clientes que também compraram esse jogo.*/
            } else if (value == maxValue) {

                clients += itemsOfTheLine[2];
            }
        }


        System.out.println("Most expensive game is "+ maxValuableGame + " and costs "+ maxValue + "$ and the clients are " + clients);

    }

    public static void menu() throws FileNotFoundException {

        Scanner input = new Scanner(System.in);
        int opcao;
        String sim;

        do {
            do {
                System.out.println("Seleccione uma das opções");
                System.out.println("Prima 1 para imprimir conteúdo do ficheiro na consola");
                System.out.println("Prima 2 para imprimir quantas vendas foram executadas e o seu valor total");
                System.out.println("Prima 3 para saber o total de lucro da GameStart");
                System.out.println("Prima 4 para imprimir todas as informações de um dado cliente da GameStart");
                System.out.println("Prima 5 para imprimir todos os géneros e respetivos jogos de uma dada Editora");
                System.out.println("Prima 6 para imprimir o jogo mais caro e os clientes que o compraram");

                opcao = input.nextInt();

            } while (opcao < 1 || opcao > 6);

            switch (opcao) {

                case 1:
                    printFile("GameStart.csv");
                    break;
                case 2:
                    totalSales("GameStart.csv");
                    break;
                case 3:
                    totalProfit("GameStart.csv");
                    break;
                case 4:
                    Scanner inputID = new Scanner(System.in);
                    int clientID;
                    System.out.println("Choose an ID");
                    clientID = inputID.nextInt();

                    clientInfo("GameStart.csv", clientID);

                    break;
                case 5:
                    Scanner inputED = new Scanner(System.in);
                    String editor;
                    System.out.println("Choose an editor");
                    editor = inputED.next();

                    GameEditor("GameStart.csv", editor);
                    break;
                case 6:
                    MostValuableGame("GameStart.csv");
                    break;
            }
            System.out.println("\nEscreva 'sim' se desejar fazer mais alguma operação");
            sim = input.next();

        } while(sim.equals("sim"));

    }

    public static void main(String[] args) {

        try {
            menu();
        } catch (FileNotFoundException exc) {
            System.out.println("Can't read file!");
        }
    }
}