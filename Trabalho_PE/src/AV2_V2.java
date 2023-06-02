import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class AV2_V2{


    public static void main(String[] args){

        
        System.out.println(" ");
        System.out.println("Avaliação 2 de Algoritmia e Programação - Programação Estruturada");
        System.out.println(" ");

        String[][] data = readData(); // receive the matrix provided from readData method
        functionMenu(data);


    }


// ------------------------- Functions/Methods ------------------------------------------------*/

    public static void functionMenu(String[][] data){
        // ****** MENU ******
        Scanner input = new Scanner(System.in); // Initializing the scanner

        int menuOption = -1;
        do {
            System.out.println("****** Menu GameStart ******");
            System.out.println("1 - Imprimir o conteúdo da base de data");
            System.out.println("2 - Imprimir  o nº total de vendas e o valor total");
            System.out.println("3 - Calcular o lucro total de todas as vendas");
            System.out.println("4 - Imprimir as informações de um cliente");
            System.out.println("5 - Imprimir os gêneros e os jogos de uma determinada publisher");
            System.out.println("6 - Imprimir o jogo mais caro e os clientes que o cobmpraram");
            System.out.println("7 - Sair");
            System.out.print("Escolha uma das opções acima: ");

            // declare variables 
            if (input.hasNextInt()) {                       // integer control
                menuOption = input.nextInt();

                if (menuOption >= 1 && menuOption <= 7) {   // check if the number is within the desired range
                    switch(menuOption){

                        case 1: {
                            printData(data);
                            break;
                        }
                        case 2:
                            try {
                                totalSalesAndTotalValue(data);
                            } catch (NumberFormatException exc) {
                                System.out.println("Erro: os dados de venda não puderam ser calculados porque alguns valores não são numéricos.");
                            }
                            break;
                        case 3:
                            try {
                                totalProfit(data);
                            } catch (NumberFormatException e) {
                                System.out.println("Erro: os dados de lucro não puderam ser calculados porque alguns valores não são numéricos.");
                            }
                            break;
                        case 4:
                            customerInformation(data);
                            break;
                        case 5:
                            genresAndGamesByPublisher(data);
                            break;
                        case 6:
                            mostExpensiveGameAndClients(data);
                            break;
                        case 0:
                            break;
                
                    }

                } else {
                    System.out.println("Opção inválida. Escolha um número entre 0 e 6.");
                }
            } else {
                System.out.println("Opção inválida. Escolha um número entre 0 e 6.");
                input.next(); // Descartar a entrada não válida do usuário
            }

        } while (menuOption != 7);

    }

    // read data and store 
    public static String [][] readData(){

        // ***this part counts how many lines the file has***
        String [][] data = null;            // creating an empty data to receive the data
        try {
            Scanner input = new Scanner(new File("GameStart_V2.txt"));
            int lineNum = 0;
        input.nextLine();                   // not read the header
            while (input.hasNextLine()) {
                input.nextLine();
                lineNum++;                  // count the number of lines
            }
            input.close();

            // this part reads the data and stores it in the data
            data = new String[lineNum][9];  // size of data with the correct number of lines
            input = new Scanner(new File("GameStart.csv"));
            input.nextLine();               // not read the header
            int row = 0;                    // variable to zero because all the lines will have to be traversed
            while (input.hasNextLine()) {   // read while exists new lines
                String dataLine = input.nextLine();              // read the next line from the file and store it in "dataLine"
                String[] fields = dataLine.split(";");     // split the line into fields based on the ";" character and store in "fields"
                for (int col = 0; col < fields.length; col++) {  // traverse each field of the line
                    data[row][col] = fields[col];                // store each field in the "data" array in the correct position
                }
                row++;
            }
            input.close();
        } catch (IOException exc) {
            System.out.println("Erro ao ler o arquivo: " + exc.getMessage());
        }
        return data;
    }

/**
 * This method takes a two-dimensional array of Strings as input and prints its contents to the console.
 * @param data
 */    
// case 1
public static void printData(String[][] data) {
        // Calculate the maximum width for each column
        int[] maxColWidths = new int[data[0].length];       // array to store the maximum width for each column
        for (int col = 0; col < data[0].length; col++) {    // loop through each column
            int max = 0;                                    // variable to store the maximum width of the current column
            for (int row = 0; row < data.length; row++) {   // loop through each row in the current column
                int len = data[row][col].length();          // get the length of the current field
                if (len > max) {                            // if the length is greater than the current maximum
                    max = len;                              // set the maximum to the current length
                }
            }
            maxColWidths[col] = max;                        // store the maximum width for the current column
        }
        
        // Print the data with aligned columns
        for (int row = 0; row < data.length; row++) {       // loop through each row
            for (int col = 0; col < data[row].length; col++) { // loop through each column in the current row
                System.out.printf("%-" + maxColWidths[col] + "s ", data[row][col]); // Use printf to specify a fixed width for each field
            }
            System.out.println();                           // move to the next row
        }
    }
    

    /**
     * This function returns the total sales and the total sales amount
     * @param data
     */
    // case 2
    public static void totalSalesAndTotalValue(String[][] data) {
        int numOfSales = data.length; // count the number of sales, the number of rows in the data)

        double totalValue = 0; // initialize the total value of sales to zero

        // loop over each row in the data and add the value of the sale (stored in column 8) to the total value
        for (int i = 0; i < data.length; i++) {
            totalValue += Double.parseDouble(data[i][8]);
        }

        // print the number of sales and the total value of sales (formatted as a currency with two decimal places)
        System.out.println(data.length);
        System.out.printf("O nº total de vendas registrado na base de data é: %d \n", numOfSales);
        System.out.printf("Valor total de vendas: %.2f EUR\n", totalValue); // formating and round the value to 2 decimal
    }

    /**
     * This function returns the total sales profit
     * @param data
     */
    // case 3
    public static void totalProfit(String[][] data) {
        double totalProfit = 0;
    
        for (int i = 0; i < data.length; i++) {
            double saleValue = Double.parseDouble(data[i][8]);
            double profit = saleValue * 0.1;
            totalProfit += profit;
        }
    
        System.out.printf("Total de lucro: %.2f EUR\n", totalProfit);
    }


        /**
         * This function returns customer information.
         * @param data
         */
        // case 4
        public static void customerInformation(String[][] data) {
            Scanner input = new Scanner(System.in);
            System.out.print("Digite o ID do Cliente: ");
            String IdCliente = input.nextLine();
    
            boolean found = false;                                      // global variable initialized false to control the loop
    
            for (int i = 0; i < data.length -1; i++) {                  // loop traversing line by line
                if (data[i][1].equals(IdCliente)) {                     // check each line in column 2 or position 1 of the database to see if the entered value matches the value in the database.
                    System.out.println("Nome: " + data[i][2]);          // print the column 3 or position 2
                    System.out.println("Contacto: " + data[i][3]);
                    System.out.println("Email: " + data[i][4]);
                    found = true;                                       // keep going while found is true
                    break;                                              // if you want show only the first one
                }
            }
    
            if (!found) {                                           // if found is false, that IdCliente does not exist
                System.out.println("Não existe informação sobre esse cliente " + IdCliente);
            }
        }
        
        /**
         * This function returns game and genres by publisher
         * @param data
         */
        // case 5
        public static void genresAndGamesByPublisher(String[][] data) {
            Scanner input = new Scanner(System.in);
            System.out.print("Insira o nome da publisher: ");
            String publisher = input.nextLine();
        
            String[][] gamesFound = new String[data.length-1][2]; // -1 para não contar o cabeçalho
        
            int index = 0;
            for (int i = 0; i < data.length-1; i++) {
                if (data[i][5].equals(publisher)) {                     // publisher index
                    String game = data[i][7];
                    String genre = data[i][6];
                    boolean added = false;                              // boolean for loop control
                    for (int line = 0; line < index; line++) {
                        if (gamesFound[line][0].equals(game)) {
                            added = true;
                            break;
                        }
                    }
                    if (!added) {
                        gamesFound[index][0] = game;
                        gamesFound[index][1] = genre;
                        index++;
                    }
                }
            }
        
            if (index == 0) {
                System.out.printf("Não foram encontrados jogos para a editora %s ", publisher);
            } else {
                for (int i = 0; i < index; i++) {
                    System.out.println("Jogo: " + gamesFound[i][0] + ", Gênero: " + gamesFound[i][1]);
                }
            }
        }

        /**
         * This function returns the most expensive game
         * @param data
         */
        // case 6
        public static void mostExpensiveGameAndClients(String[][] data) {
            double maxPrice = Double.MIN_VALUE;                         // initializes the maximum price to the smallest possible value
            String mostExpensiveGame = "";                              // initializes the name of the most expensive game as an empty string
            String clientsWhoBought = "";                               // initializes the string of clients who bought the most expensive game as an empty string

            // finds the most expensive game
            for (int i = 0; i < data.length; i++) {                     
                double currentPrice = Double.parseDouble(data[i][8]);   // gets the current game price as a double

                if (currentPrice > maxPrice) {                          // if the current price is greater than the maximum price
                    maxPrice = currentPrice;                            // sets the maximum price to the current price
                    mostExpensiveGame = data[i][7];                     // sets the name of the most expensive game to the name of the current game
                }
            }
            // finds the clients who bought the most expensive game
            for (int i = 0; i < data.length-1; i++) {                  
                if (data[i][7].equals(mostExpensiveGame)) {             // if the name of the current game matches the name of the most expensive game
                    clientsWhoBought += data[i][2] + ", ";              // adds the name of the client who bought the game to the string of clients
                }
            }
            // prints the result
            System.out.printf("O jogo mais caro é %s que custa €%.2f e foi comprado pelos seguintes clientes: %s\n", mostExpensiveGame, maxPrice, clientsWhoBought);

        }
    } 
