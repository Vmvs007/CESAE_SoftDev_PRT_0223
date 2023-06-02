import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ex {

    public static void metodo1(String pathFile) throws FileNotFoundException {

        //Abre o ficheiro
        File file = new File(pathFile);
        //Lê o ficheiro
        Scanner readFile = new Scanner(file);

        //Cilco while para ler o ficheiro enquanto houver linhas
        while (readFile.hasNextLine()) {
            System.out.println(readFile.nextLine());
        }
        readFile.close();
    }

    public static void metodo2(String pathFile) throws FileNotFoundException {
        //Abre o ficheiro
        File file = new File(pathFile);
        //Lê o ficheiro
        Scanner readFile = new Scanner(file);

        //Declarar variáveis
        String linha;
        int quantTotalVenda = 0;
        double total = 0;

        readFile.nextLine();
        while (readFile.hasNextLine()) {
            linha= readFile.nextLine();
            String[] itemsLinha =linha.split(";");
            for (int i = 0; i < itemsLinha.length; i++) {
                total+=Double.parseDouble(itemsLinha[8]);
            }
            quantTotalVenda++;
        }
        readFile.close();
        DecimalFormat df = new DecimalFormat("#,###.00");
        System.out.println("Foram executadas um total de " + quantTotalVenda + " vendas.");
        System.out.println("O valor total das vendas foi de €" + df.format(total) + ".");
    }

    public static void metodo3(String pathFile) throws FileNotFoundException {
        //Abre o ficheiro
        File file = new File(pathFile);
        //Lê o ficheiro
        Scanner readFile = new Scanner(file);

        //Declarar variáveis
        String linha;
        double total = 0, lucro = 0;

        //Saltar o cabeçalho
        readFile.nextLine();
        //Ciclo para percorrer o ficheiro
        while (readFile.hasNextLine()) {
            linha= readFile.nextLine();
            //Array que vai conter cada linha do ficheiro
            String[] itemsLinha =linha.split(";");
            //Ciclo for para iterar o array anterior
            for (int i = 0; i < itemsLinha.length; i++) {
                total+=Double.parseDouble(itemsLinha[8]);
                lucro=total*0.10;
            }
        }
        readFile.close();
        DecimalFormat df = new DecimalFormat("#,###.00");
        System.out.println("O lucro total das vendas foi de €" + df.format(lucro) + ".");
    }

    public static void metodo4(String pathFile, int idCliente) throws FileNotFoundException {
        //Abre o ficheiro
        File file = new File(pathFile);
        //Lê o ficheiro
        Scanner readFile = new Scanner(file);

        //Declarar variáveis
        String linha, nome = "", email = "", contacto="";

        readFile.nextLine();
        while (readFile.hasNextLine()) {
            linha= readFile.nextLine();
            //Array que vai conter cada linha do ficheiro
            String[] itemsLinha =linha.split(";");
                if(Integer.parseInt(itemsLinha[1]) == idCliente ){
                    nome=itemsLinha[2];
                    email=itemsLinha[4];
                    contacto=itemsLinha[3];
                }
            }
        readFile.close();
        System.out.println("O nome do cliente " + "[" +idCliente + "] é " + nome + ".");
        System.out.println("O email do cliente "+ "[" +idCliente + "] é " + email + ".");
        System.out.println("O contacto do cliente "+ "[" +idCliente + "] é " + contacto + ".");
    }

    public static void metodo5(String pathFile, String editora) throws FileNotFoundException {

        File file = new File(pathFile);
        Scanner readfile = new Scanner(file);

        String line;
        int totalLines=0, i=0;

        while(readfile.hasNextLine()) {
            readfile.nextLine();
            totalLines++;
        }
        readfile.close();

        String[][] matrix = new String[totalLines][9];

        Scanner readFileAgain= new Scanner(file);

        readFileAgain.nextLine();
        while(readFileAgain.hasNextLine()){
            line = readFileAgain.nextLine();
            String[] itemsOfTheLine = line.split(";");
            matrix[i][0] = itemsOfTheLine[0];
            matrix[i][1] = itemsOfTheLine[1];
            matrix[i][2] = itemsOfTheLine[2];
            matrix[i][3] = itemsOfTheLine[3];
            matrix[i][4] = itemsOfTheLine[4];
            matrix[i][5] = itemsOfTheLine[5];
            matrix[i][6] = itemsOfTheLine[6];
            matrix[i][7] = itemsOfTheLine[7];
            matrix[i][8] = itemsOfTheLine[8];
            i++;
        }

        //Variável para determinar total de jogos vendidos
        int jogoVendido=0;
        //Booleano para verificar jogo repetido
        boolean jogoRepetido=false;
        for (int j = 0; j < matrix.length-1; j++) {
            if (matrix[j][5].equals(editora)) {
                //Usado para debugg: System.out.println("Valor encontrado na coluna 5: " + matrix[j][5]);
                // ciclo for para voltar a ler a linha do ciclo for anterior
                for (int k = 0; k < j; k++) {
                    if(matrix[j][7].equals(matrix[k][7])){
                        //Usado para debugg: System.out.println("Valor encontrado na coluna 7: " + matrix[k][7]);
                        jogoRepetido=true;
                        break;
                    }
                }
                if(!jogoRepetido){
                    System.out.println("Categoria: " + matrix[j][6]);
                    System.out.println("Jogo: " + matrix[j][7]);
                }
                jogoVendido++;
            }
        }
        readFileAgain.close();
        System.out.println("Foram vendidos " + jogoVendido + " jogos da editora " + editora);
    }

    public static void metodo6(String pathFile) throws FileNotFoundException {

        File file = new File(pathFile);
        Scanner readfile = new Scanner(file);

        String line;
        int totalLines=0, i=0;

        while(readfile.hasNextLine()) {
            readfile.nextLine();
            totalLines++;
        }
        readfile.close();

        String[][] matrix = new String[totalLines][9];

        Scanner readFileAgain= new Scanner(file);

        readFileAgain.nextLine();
        while(readFileAgain.hasNextLine()){
            line = readFileAgain.nextLine();
            String[] itemsOfTheLine = line.split(";");
            matrix[i][0] = itemsOfTheLine[0];
            matrix[i][1] = itemsOfTheLine[1];
            matrix[i][2] = itemsOfTheLine[2];
            matrix[i][3] = itemsOfTheLine[3];
            matrix[i][4] = itemsOfTheLine[4];
            matrix[i][5] = itemsOfTheLine[5];
            matrix[i][6] = itemsOfTheLine[6];
            matrix[i][7] = itemsOfTheLine[7];
            matrix[i][8] = itemsOfTheLine[8];
            i++;
        }

        double preco;
        double maior=0;

        for (int j = 0; j < matrix.length-1; j++) {
                preco = Double.parseDouble(matrix[j][8]);
                if(preco>maior) {
                    maior = preco;
                }
                readFileAgain.close();
        }

        for (int j = 0; j < matrix.length-1; j++) {
            if(maior == Double.parseDouble(matrix[j][8])){
                System.out.println("O jogo " + matrix[j][7] + " é o mais caro, com o valor de €" + matrix[j][8] +" e foi comprado pelo cliente " + matrix[j][2] + ".");
            }
        }
    }
    public static void menu(){
        int op = 0;

        Scanner input = new Scanner(System.in);

        do {

            do {
                System.out.println("\n------------Menu------------");
                System.out.println("1. Imprima o seu conteúdo na consola");
                System.out.println("2. Imprima quantas vendas foram executadas e o seu valor total");
                System.out.println("3. Sabendo que a GameStart tem 10% de lucro em cada jogo, calcule o total de lucro");
                System.out.println("4. Dado um idCliente, imprima todas as informações associadas a esse cliente (nome, contacto, email)");
                System.out.println("5. Dada uma Editora, imprima todos géneros e os respetivos jogos");
                System.out.println("6. Imprima qual o jogo mais caro e os clientes que o compraram");
                System.out.println("7. Sair");

                try{
                    System.out.println("\nEscolha uma das opções do menu\n");
                    op = input.nextInt();
                    System.out.println("Escolheu a opção " + op + " do menu\n");
                }catch (InputMismatchException exc) {
                    if (op < 1 || op > 7) {
                        System.out.println("Opção inválida. Escolha uma opção válida do Menu\n");
                        input.next(); //Limpa o buffer do Scanner
                    }
                }
            }while(op < 1 || op > 7);

            switch(op){
                case 1:
                    try{
                        metodo1("GameStart.csv");
                    } catch (FileNotFoundException exc) {
                        System.out.println("Ficheiro não encontrado!");
                    }
                    break;
                case 2:
                    try{
                        metodo2("GameStart.csv");
                    } catch (FileNotFoundException exc) {
                        System.out.println("Ficheiro não encontrado!");
                    }
                    break;
                case 3:
                    try{
                        metodo3("GameStart.csv");
                    } catch (FileNotFoundException exc) {
                        System.out.println("Ficheiro não encontrado!");
                    }
                    break;
                case 4:
                    try{
                        int idCliente;
                        System.out.println("Introduza o ID do cliente: ");
                        idCliente = input.nextInt();
                        metodo4("GameStart.csv", idCliente);
                    } catch (FileNotFoundException esc) {
                        System.out.println("Ficheiro não encontrado!");
                    }
                    break;
                case 5:
                    try{
                        String editora;
                        System.out.println("Introduza o nome da editora: ");
                        input.nextLine();
                        editora = input.nextLine();
                        metodo5("GameStart.csv", editora);
                    } catch (FileNotFoundException exc) {
                        System.out.println("Ficheiro não encontrado!");
                    }
                    break;
                case 6:
                    try{
                        metodo6("GameStart.csv");
                    } catch (FileNotFoundException exc) {
                        System.out.println("Ficheiro não encontrado!");
                    }
                    break;
                case 7:
                    System.out.println("O programa encerrou.");
                    break;
                default:
                    System.out.println("Invalid option");
            }
        }while(op != 7);
    }


    public static void main(String[] args) {

        menu();
    }
}