import java.io.*;
import java.util.Scanner;

public class GameStartStore{

    /**
     * - - - -  FUNÇÃO PARA FAZER "STORE" DO FICHEIRO NUM ARAY 2D   - - - -
     * @return
     */
    public static String [][] lerFicheiro(){
        String [][] ficheiro = null;
        try {
            Scanner input = new Scanner(new File("GameStart.csv"));
            int numLinha = 0;
            input.nextLine();
            while (input.hasNextLine()){
                input.nextLine();
                numLinha++;
            }
            input.close();

            ficheiro = new String[numLinha][9];
            input = new Scanner(new File("GameStart.csv"));
            input.nextLine();
            int linha = 0;
            while (input.hasNextLine()){
                String linhasFicheiro = input.nextLine();
                String[] campo = linhasFicheiro.split(";");
                for (int coluna = 0; coluna < campo.length; coluna++){
                    ficheiro[linha][coluna] = campo[coluna];
                }
                linha++;
            }
            input.close();
        } catch (IOException exc){
            System.out.println("ERROR - File does not exist.");
        }
        return ficheiro;
    }

    /**
     * - - - - FUNÇÃO IMPRIMIR, DE FORMA MAIS LEGÍVEL E ORGANIZADA, O FICHEIRO (CORRESPONDE À QUESTÃO 1)   - - - -
     * @param ficheiro
     */
    public static void imprimeFicheiro(String[][] ficheiro){

        int[] larguraMax = new int[ficheiro[0].length];
        for (int coluna = 0; coluna < ficheiro[0].length; coluna++){
            int max = 0;
            for (int linha = 0; linha < ficheiro.length; linha++){
                int tamanho = ficheiro[linha][coluna].length();
                if (tamanho > max) {
                    max = tamanho;
                }
            }
            larguraMax[coluna] = max;
        }

        for (int linha = 0; linha < ficheiro.length; linha++){
            for (int coluna = 0; coluna < ficheiro[linha].length; coluna++){
                System.out.print(String.format("%-" + larguraMax[coluna] + "s", ficheiro[linha][coluna]));
                if (coluna < ficheiro[linha].length - 1){
                    System.out.print(" | | ");
                }
            }
            System.out.println();
        }
    }

    /**
     *  - - - - FUNÇÃO QUE MOSTRA O TOTAL DAS VENDAS + O VALOR DAS MESMAS (CORRESPONDE À QUESTÃO 2)  - - - -
     * @param ficheiro
     */
    public static void vendasTotais(String[][] ficheiro){
        int nVendas = ficheiro.length;
        double valorTotal = 0;
        for (int i = 0; i < ficheiro.length; i++){
            valorTotal = valorTotal + Double.parseDouble(ficheiro[i][8]);
        }
        System.out.println("\nO número total de vendas é:\n" + nVendas + ".");
        System.out.println("\nValor total em euros das vendas é:\n" + valorTotal + "€");
    }

    /** - - - - FUNÇÃO QUE MOSTRA A O LUCRO DA LOJA - 10 % do valor total das vendas. (CORRESPONDE À QUESTÃO 3)  - - - -
     * @param ficheiro
     */
    public static void lucro (String[][] ficheiro){
        double lucroTotal = 0;
        for (int i = 0; i < ficheiro.length; i++){
            double valorVenda = Double.parseDouble(ficheiro[i][8]);
            double lucro = valorVenda * 0.1;
            lucroTotal = lucroTotal + lucro;
        }
        System.out.println("\nO total do lucro da loja foi:\n"+ lucroTotal + "€");
    }

    /**
     *  - - - - FUNÇÃO QUE MOSTRA A INFORMAÇÃO DO CLIENTE APÓS SER INSERIDO O NÚMERO ID (CORRESPONDE À QUESTÃO 4)  - - - -
     * @param ficheiro
     */
    public static void infoCliente(String[][] ficheiro){
        Scanner input = new Scanner(System.in);
        System.out.print("\n Por favor, insira o número do cliente que procura: ");
        String idCliente = input.nextLine();


        for (int i = 0; i < ficheiro.length -1; i++){
            if (ficheiro[i][1].equals(idCliente)) {
                System.out.println("\nNome: " + ficheiro[i][2]);
                System.out.println("\nContacto: " + ficheiro[i][3]);
                System.out.println("\nE-mail: " + ficheiro[i][4]);
                break;
            }
        }
    }
    /**
     * - - - - FUNÇÃO QUE MOSTRA A INFORMAÇÃO DO GÉNERO DO JOGO (CORRESPONDE À QUESTÃO 5)  - - - -
     * @param ficheiro
     */
    public static void generoJogo(String[][] ficheiro){
        Scanner input = new Scanner(System.in);
        System.out.print("Por favor, insira o nome da editora do jogo que está à procura:");
        String editora = input.nextLine();
        String[][] jogos = new String[ficheiro.length][2];

        int indice = 0;
        for (int i = 0; i < ficheiro.length; i++){
            if (ficheiro[i][5].equals(editora)) {
                String jogo = ficheiro[i][7];
                String genero = ficheiro[i][6];
                boolean show = false;
                for (int linha = 0; linha < indice; linha++){
                    if (jogos[linha][0].equals(jogo)){
                        show = true;
                        break;
                    }
                }
                if (!show){
                    jogos[indice][0] = jogo;
                    jogos[indice][1] = genero;
                    indice++;
                }
            }
        }
        for (int i = 0; i < indice; i++){
            System.out.println("O jogo que escolheu é: " + jogos[i][0] + "\n O seu respetivo género é: " + jogos[i][1]);
        }
    }

    /**
     *- - - - FUNÇÃO QUE MOSTRA A INFORMAÇÃO DO JOGO MAIS CARO NA LISTA (CORRESPONDE À QUESTÃO 6)  - - - -
     * @param ficheiro
     */
    public static void jogoMaisCaro(String[][] ficheiro){

        String clientesLoja = "";
        String jogoCaro = "";
        double precoAlto = Double.NEGATIVE_INFINITY;
        for (int i = 0; i < ficheiro.length; i++){
            double preco = Double.parseDouble(ficheiro[i][8]);
            if (preco > precoAlto){
                precoAlto = preco;
                jogoCaro = ficheiro[i][7];
            }
        }
        for (int i = 0; i < ficheiro.length; i++){
            if (ficheiro[i][7].equals(jogoCaro)){
                clientesLoja =  clientesLoja +  ficheiro[i][2] + " ";
            }
        }
        System.out.println("\nO jogo mais caro da nossa loja é:\n" + jogoCaro + "\nOs clientes que compraram o jogo foram:\n"+  clientesLoja +"\n");
    }

    /**
     * - - - - FUNÇÃO MENU - O MENU FUNCIONA DO 1 - 6 ; SENDO QUE O NÚMERO 7 QUANDO É ESCOLHIDO O PROGRAMA ACABA - - - -
     * @param ficheiro
     */
    public static void menu (String[][] ficheiro){
        Scanner input = new Scanner(System.in);
        int op=0;
        System.out.println("\n- - - - - - - - *. BEM-VINDO À GAMESTART .* - - - - - - - -\n");

        do {
            System.out.println("\n - - - Por favor escolha uma das seguintes opções para aceder ao nosso programa  - - - ");
            System.out.println("1 - Impressão organizada do nosso ficheiro de jogos.");
            System.out.println("2 - O nosso número total de vendas e o total de jogos vendidos.");
            System.out.println("3 - O nosso lucro total das vendas (10% das compras totais).");
            System.out.println("4 - Quer consultar a informação de um cliente? Insira o ID.");
            System.out.println("5 - Escolha uma editora e iremos mostrar o jogo.");
            System.out.println("6 - O jogo mais caro e o respetivo comprador.");
            System.out.println("7 - Sair do programa.");
            System.out.print("Insira o número que pretende: ");


            if (input.hasNextInt()){
                op = input.nextInt();
                if (op >= 1 || op <= 7){
                    switch(op){
                        case 1:
                            imprimeFicheiro(ficheiro);
                            break;
                        case 2:
                            vendasTotais(ficheiro);
                            break;
                        case 3:
                            lucro(ficheiro);
                            break;
                        case 4:
                            infoCliente(ficheiro);
                            break;
                        case 5:
                            generoJogo(ficheiro);
                            break;
                        case 6:
                            jogoMaisCaro(ficheiro);
                            break;
                        case 7:
                            System.out.println("- - - - - - - - *. OBRIGADA POR TER ESCOLHIDO A GAMESTART! ATÉ À PRÓXIMA! .* - - - - - - - -");
                            break;
                    }
                }else{
                    System.out.println("\nA opção que escolheu não é válida. Escolha um número entre 1 e 7.\n");
                }
            }
        } while (op != 7);
    }

    /**
     * - - - - FUNÇÃO MAIN  - - - -
     * @param args
     */
    public static void main(String[] args){
        String[][] ficheiro = lerFicheiro();
        menu(ficheiro);
    }
}