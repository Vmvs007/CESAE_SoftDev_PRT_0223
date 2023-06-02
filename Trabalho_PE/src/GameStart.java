import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class GameStart {

// A função 'function1' é responsável por apresentar todo o conteúdo do ficheiro 'GameStart_V2.txt' na consola
    public static void function1() throws FileNotFoundException {

// O conteúdo do ficheiro 'GameStart_V2.txt' é lido

        File Ficheiro = new File("src/GameStart_V2.txt");
        Scanner in = new Scanner(Ficheiro);

// Através deste ciclo 'while' é efetuada a leitura integral do ficheiro, linha após linha

        while (in.hasNextLine()) {

// Cada linha é gravada/alocada com o formato 'String' dentro da variável 'linha' e é de seguida printado directamente para a consola

            String linha = in.nextLine();
            System.out.println(linha);
        }
        in.close();
    }

// Função que imprime quantas vendas foram executadas e o seu valor total
    public static void function2() throws FileNotFoundException {

        File Ficheiro = new File("src/GameStart_V2.txt");
        Scanner in = new Scanner(Ficheiro);

// Instanciamento de váriaveis

        int countVendas = 0;
        double totalVendas = 0;
        double totalCadaVenda = 0;

// Esta linha foi inserida para ler e ignorar o cabeçalho do ficheiro .txt

        in.nextLine();

        System.out.println();
// Ciclo 'while' que lê todas as linhas do ficheiro

        while (in.hasNextLine()) {

// Cada linha é gravada/alocada com o formato 'String' dentro da variável 'linha'. Após a leitura é efetuada a sua contagem através de 'countVendas++'

            String linha = in.nextLine();
            countVendas++;

// Estas três linhas de código fazem a criação de múltiplos arrays a partir de cada linha do ficheiro, em que cada indice do array está separado por virgula.
// O indice 8 do array sendo o valor de cada venda é efetuada de seguida o somatório para determinar o seu total, linha após linha, para uma variável 'totalVendas'

            String[] itensDaLinha = linha.split(",");
            totalCadaVenda = Double.parseDouble(itensDaLinha[8]);
            totalVendas += totalCadaVenda;

        }
// Impressão do número de vendas e o total em '€' com duas casas decimais

        System.out.println("O número total de vendas é: " + countVendas);
        System.out.println();
        System.out.printf("O valor total de vendas é: %.2f €" ,totalVendas);
        System.out.println();
        in.close();
    }

// Função que determina o lucro total da empresa 'GameStart' sabendo que representa 10% do valor de cada jogo
    public static void function3() throws FileNotFoundException {

        File Ficheiro = new File("src/GameStart_V2.txt");
        Scanner in = new Scanner(Ficheiro);

// Instanciamento de váriaveis

        double totalVendas = 0;
        double totalCadaVenda = 0;

// Esta linha foi inserida para ler e ignorar o cabeçalho do ficheiro .txt

        in.nextLine();

        System.out.println();
// Ciclo 'while' que lê todas as linhas do ficheiro

        while (in.hasNextLine()) {

// Cada linha é gravada/alocada com o formato 'String' dentro da variável 'linha'. Criação de múltiplos arrays a partir de cada linha do ficheiro, em que cada indice do array está separado por virgula.

            String linha = in.nextLine();
            String[] itensDaLinha = linha.split(",");

// O indice 8 do array sendo o valor de cada venda é efetuada de seguida o somatório para determinar o seu total, linha após linha, para uma variável 'totalVendas'

            totalCadaVenda = Double.parseDouble(itensDaLinha[8]);
            totalVendas += totalCadaVenda;

        }
// Cálculo do lucro total fazendo 10% do total das vendas executadas e respectiva impressão na consola

        double lucro = 0.10 * totalVendas;
        System.out.printf("O total de lucro é: %,.2f €", lucro);
        System.out.println();
        in.close();
    }

// Função que recebe um 'id' de cliente e retorna os dados respectivos (nome, email, contacto)
    public static void function4() throws FileNotFoundException {

        File Ficheiro = new File("src/GameStart_V2.txt");
        Scanner in = new Scanner(Ficheiro);

        Scanner input = new Scanner(System.in);

// Input do 'id' do cliente

        System.out.println();
        System.out.println("Insira o idCliente que deseja consultar");
        int idCliente = input.nextInt();

// Instanciamento de variáveis

        String name = "";
        int contacto = 0;
        String email = "";

// Esta linha foi inserida para ler e ignorar o cabeçalho do ficheiro .txt

        in.nextLine();

// Ciclo 'while' que lê todas as linhas do ficheiro

        while (in.hasNextLine()) {

// Cada linha é gravada/alocada com o formato 'String' dentro da variável 'linha'. Criação de múltiplos arrays a partir de cada linha do ficheiro, em que cada indice do array está separado por virgula.

            String linha = in.nextLine();
            String[] itensDaLinha = linha.split(",");

// Condição que avalia se existe ou não um 'match' entre o valor inserido pelo utilizador e um 'id' presente no ficheiro.
// Se existir, nomeia 'name', 'contacto' e 'email' aos valores do array correspondentes

            if (Integer.parseInt(itensDaLinha[1]) == idCliente) {

                name = itensDaLinha[2];
                contacto = Integer.parseInt(itensDaLinha[3]);
                email = itensDaLinha[4];

            }
        }

// Impressão das respectivas variáveis para a consola

        System.out.println(name);
        System.out.println(contacto);
        System.out.println(email);

        in.close();
    }

// Função que dado um nome de uma Editora, printa todos os géneros e respectivos jogos
    public static void function5() throws FileNotFoundException {

        File Ficheiro = new File("src/GameStart_V2.txt");
        Scanner in = new Scanner(Ficheiro);

        Scanner input = new Scanner(System.in);

// Input do nome da Editora

        System.out.println();
        System.out.println("Insira a editora que deseja consultar");
        String editora = input.nextLine();

// Instanciamento das variáveis necessárias para o bom funcionamento do programa

        String genero = "";
        String jogo = "";

// 'jogoArray' e 'catArray' foram dois arrays criados para guardar os jogos e categorias de uma dada Editora, respectivamente

        String[] jogoArray = new String[100];
        String[] catArray = new String[100];

// Instanciamento do comprimento inicial dos arrays 'jogoArray' e 'catArray'

        int jogos = 0;
        int cats = 0;

// Esta linha foi inserida para ler e ignorar o cabeçalho do ficheiro .txt

        in.nextLine();

        System.out.println("\n |||--- Categorias e Jogos da " + editora + " ---|||");

// Ciclo 'while' que lê todas as linhas do ficheiro

        while (in.hasNextLine()) {

// Cada linha é gravada/alocada com o formato 'String' dentro da variável 'linha'. Criação de múltiplos arrays a partir de cada linha do ficheiro, em que cada indice do array está separado por virgula.

            String linha = in.nextLine();
            String[] itensDaLinha = linha.split(",");

// Instanciamento de duas variáveis booleanas; 'jogoFound' e 'catFound'.
// Servem para detectar se no caso de já existir um dado jogo ou categoria/género dentro de cada array, passarem para 'true' e travarem a iteração do programa

            boolean jogoFound = false;
            boolean catFound = false;

// Condição que avalia se existe ou não um 'match' entre a String inserida pelo utilizador e a String com o nome de uma dada Editora

            if (itensDaLinha[5].equals(editora)) {

// Se existir, nomeia 'genero' e 'jogo' aos valores do array correspondentes

                genero = itensDaLinha[6];
                jogo = itensDaLinha[7];

// Ciclo 'for' faz o loop pelo array 'catArray' e analisa se uma dada categoria/género já foi guardada dentro do mesmo de modo a não haver repetições

                for (int k = 0; k < cats; k++) {

// Se já existe no array 'catArray', 'catFound' passa a 'true' e sai do loop

                    if (catArray[k].equals(genero)) {
                        catFound = true;
                    }
                }
// Se uma dada categoria ainda não se encontra no array, adiciona ao mesmo e printa na consola

                if(!catFound){
                    System.out.println();
                    System.out.println(genero);
                    System.out.println();
                    catArray[cats] = genero;
                    cats++;
                }


// Ciclo 'for' faz o loop pelo array 'jogoArray' e analisa se um dado jogo já foi guardado dentro do mesmo de modo a não haver repetições

                for (int i = 0; i < jogos; i++) {

// Se já existe no array 'jogoArray', 'jogoFound' passa a 'true' e sai do loop

                    if (jogoArray[i].equals(jogo)) {
                        jogoFound = true;
                    }
                }
// Se um dado jogo ainda não se encontra no array, adiciona ao mesmo e printa na consola

                if (!jogoFound) {
                    System.out.println(jogo);
                    jogoArray[jogos] = jogo;
                    jogos++;

                }
            }
        }
        in.close();
    }


// Função que imprime o jogo mais caro e os clientes que o compraram
    public static void function6() throws FileNotFoundException {

        File file = new File("src/GameStart_V2.txt");
        Scanner in = new Scanner(file);

// Esta linha foi inserida para ler e ignorar o cabeçalho do ficheiro .txt

        in.nextLine();

// Foi criada uma matriz de Strings com um tamanho 100 x 9 que guardará os dados oriundos do ficheiro .txt

        String[][] matriz = new String[100][9];

// Foi criado um array de Strings para guardar os nomes dos clientes com 100 elementos de tamanho.

        String[] clientesArray = new String[100];

// Foi criada a variável 'j' para efectuar o controlo do número de linhas que advém do ficheiro .txt

        int j = 0;

// As variáveis 'clienteFound' e 'cliente' fazem o controlo se o nome do cliente já existe no array ou não

        boolean clienteFound = false;
        int cliente = 0;

        System.out.println();

// Ciclo 'while' que lê todas as linhas do ficheiro

        while (in.hasNextLine()) {

// Cada linha é gravada/alocada com o formato 'String' dentro da variável 'linha'. Criação de múltiplos arrays a partir de cada linha do ficheiro, em que cada indice do array está separado por virgula.

            String linha = in.nextLine();
            String[] itensDaLinha = linha.split(",");

// Esta condição verifica se o número de linhas da matriz ultrapassou o seu tamanho inicial de '100'.
// Se sim, invoca a função 'resizeMatriz()' para efectuar um redimensionamento à mesma.

            if (j >= matriz.length){
                matriz = resizeMatriz(matriz);
            }
// A partir do array 'itensDaLinha' acima criado, assignou se cada indice do mesmo a cada coluna da matriz para cada linha

            matriz[j][0] = itensDaLinha[0];
            matriz[j][1] = itensDaLinha[1];
            matriz[j][2] = itensDaLinha[2];
            matriz[j][3] = itensDaLinha[3];
            matriz[j][4] = itensDaLinha[4];
            matriz[j][5] = itensDaLinha[5];
            matriz[j][6] = itensDaLinha[6];
            matriz[j][7] = itensDaLinha[7];
            matriz[j][8] = itensDaLinha[8];

// A variável 'j' faz o incremento de modo que seja possível iterar por todas as linhas do ficheiro

            j++;
        }

// Assignou se à variável 'precoInicial' o tipo double e o valor da última coluna e primeira linha da matriz

        double precoInicial = Double.parseDouble(matriz[0][8]);

// Instanciou se a variável 'precoNovo' a '0'

        double precoNovo = 0;
// Inicia um ciclo que vai iterar por todas as linhas da matriz enquanto o indice for inferior ao número de linhas da matriz
        for (int w = 0; w < j; w++) {
// Assignou se um novo valor à variável 'precoNovo' do tipo double para se efectuar uma verificação
            precoNovo = Double.parseDouble(matriz[w][8]);
// Se 'precoNovo' for maior ou igual a 'precoInicial', 'precoInicial' assume o valor de 'precoNovo'
            if (precoNovo >= precoInicial) {
                precoInicial = precoNovo;
            }
        }

        System.out.println(precoInicial + " €");

// Ciclo 'for' que vai iterar pelas linhas da matriz mais uma vez

        for (int k = 0; k < j; k++) {

// Assignou se novamente ma variável desta vez 'newPreco' do tipo double com o indice da matriz correspondente ao valor do jogo
// E uma variável 'nome' com o indice correspondente ao nome do cliente

            double newPreco = Double.parseDouble(matriz[k][8]);
            String nome = matriz[k][2];

// Este ciclo 'for' vai iterar pelo array 'clientesArray' até ao indice 'cliente' e vai procurar se existe algum 'match' entre o nome do cliente encontrado pela iteração pela matriz e o array 'clientesArray'. Se existir, 'clienteFound = true' e rompe o ciclo.

            for (int i = 0; i < cliente; i++) {

                if (clientesArray[i].equals(nome)) {
                    clienteFound = true;
                }
            }

// No caso de 'clienteFound' permanecer 'false' o ciclo continuará a iterar e haver um 'match' entre 'newPreco' e 'precoInicial', é printado na consola o nome do cliente respectivo e guardado no array 'clientesArray' para evitar que seja printado novamente por maior que seja o tamanho do ficheiro .txt

            if (newPreco == precoInicial && !clienteFound) {
                System.out.println(nome);
                clientesArray[cliente]= nome;
                cliente++;
            }

        }

        in.close();
    }

// Função responsável por pegar na matriz inicial e aumentar para o dobro o tamanho de linhas de modo a conseguir receber o ficheiro .txt no caso deste ter mais de 100 linhas

    public static String[][] resizeMatriz(String[][] matriz){

        String[][] newArray = new String[2 * matriz.length][9];

// Ciclo 'for' que copia o conteúdo antigo da matriz para uma nova matriz redimensionada. Esta nova matriz 'newArray' é de seguida retornada

        for (int i = 0; i < matriz.length; i++){
            newArray[i] = matriz[i];
        }
        return newArray;

    }


// Dentro da função 'menu' foi criado um ciclo 'do-while' que apresenta repetidamente um menu com 6 opções até ser escolhida uma opção válida
    public static void menu() throws FileNotFoundException {

        Scanner input = new Scanner(System.in);
        int opcao;
        String op = null;

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
// Depois do utilizador seleccionar uma opção válida, foi utilizada uma condição 'switch' que encaminha para a função correspondente (ver acima)
            switch (opcao) {

                case 1:
                    function1();
                break;
                case 2:
                    function2();
                break;
                case 3:
                    function3();
                break;
                case 4:
                    function4();
                break;
                case 5:
                    function5();
                break;
                case 6:
                    function6();
                break;
            }
// Após ter sido seleccionado a opção respectiva, é apresentado ao utilizador uma mensagem a questionar se pretende efectuar outra operação ou se pretende terminar o programa premindo uma tecla qualquer que não seja 'S'
            System.out.println();
            System.out.println(" |||--- Deseja efetuar mais alguma operação? Prima 'S' para continuar ---|||");
            op = input.next();
            op = op.toUpperCase();

        } while(op.equals("S"));
    }

// Esta função 'main' invoca a função 'menu' acima. No caso do ficheiro de leitura necessário para que o programa funcione não seja encontrado, foi implementada uma exceção que envia uma mensagem 'Ficheiro não encontrado' ao utilizador.
    public static void main(String[] args) {

        try {
            menu();
        } catch (FileNotFoundException exc) {
            System.out.println("Ficheiro não encontrado");
        }

    }
}