import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;

class Main {
/////////////////////////////////////////////////
/////////////////////////////////////////////////
  
  // Opcao 1 - Imprimir conteúdo do ficheiro na consola:
  public static void lerFicheiro() throws FileNotFoundException {

    // Ler ficheiro
    Scanner ler_vendas = new Scanner(new File("GameStart.csv"));

    // Imprimir linha a linha
    while (ler_vendas.hasNextLine()) {
      String linha = ler_vendas.nextLine();
      System.out.println(linha);
    }
    ler_vendas.close();
  }

/////////////////////////////////////////////////
/////////////////////////////////////////////////

  // Criar Matriz:
  public static String[][] matrix() throws FileNotFoundException, NumberFormatException {

    // Primeiro Scanner para contar linhas(sem a do titulo)
    Scanner contarLinhas = new Scanner(new File("GameStart.csv"));
    String linha = contarLinhas.nextLine();

    int contador = 0, i = 0, j;
    // Encontrar int tamanho da linha para definir comprimento do array
    int comprimento = linha.split(";").length;
    // System.out.println(comprimento);

    // Criar array com comprimento da linha
    String[] array = new String[comprimento];
    // System.out.println(array.length);

    // Conta as linhas em cada loop até nao haver mais linhas
    while (contarLinhas.hasNextLine()) {
      linha = contarLinhas.nextLine();
      contador++;
    }

    // Criar matriz (contador+1 = numero de linhas (para incluir a lnha dos titulos)
    // e array.length é o numero de colunas)
    String[][] matrix = new String[contador + 1][array.length];

    contarLinhas.close();

    // Segundo Scanner para voltar ao inicio do ficheiro
    Scanner preencherMatriz = new Scanner(new File("GameStart.csv"));
    int posicao = 0;

    // Enquanto o ficheiro tiver uma proxima linha, adiciona alinha ao array e faz a
    // divisao onde houver ';'
    while (preencherMatriz.hasNextLine()) {
      linha = preencherMatriz.nextLine();
      array = linha.split(";");
      // System.out.println(linha);

      for (j = 0; j < array.length; j++) {
        matrix[i][j] = array[j];
        // System.out.print(matrix[i][j]);
      }
      // System.out.println();
      i++;
    }

    preencherMatriz.close();

    return matrix;
  }

/////////////////////////////////////////////////
/////////////////////////////////////////////////

  /* Encontrar coluna de titulo: */

  public static int encontrarColuna(String[][] matrix, String nomeColuna) {

    int coluna = 0;

    // Recebe a funcao da matriz e o nome da coluna e procura na linha 0 (linha dos
    // titulos) nas colunas até encontrar o nome e atribui o numero da posicao a
    // variavel coluna
    for (int j = 0; j < matrix[j].length; j++) {
      if (matrix[0][j].equalsIgnoreCase(nomeColuna)) {
        coluna = j;
      }
    }
    return coluna;
  }

/////////////////////////////////////////////////
/////////////////////////////////////////////////

  /* Opcao 2 - Contar quantas vendas foram executadas e calcular valor final: */

  public static Float somaVendas(String[][] matriz) throws FileNotFoundException, NumberFormatException {

    Scanner soma = new Scanner(new File("GameStart.csv"));

    int i = 0;
    Float somatorio = 0.0f;

    // Chama a funcao encontrarColuna para procurar a posicao da coluna 'valor'
    int posicaoValor = encontrarColuna(matriz, "valor");

    // Ignora a linha 0 que corresponde aos titulos e vai incrementando a variavel
    // 'somatorio' com as strings apenas da posicao da coluna 'valor' convertidos
    // para Floats
    for (i = 1; i < matriz.length; i++) {
      somatorio += Float.parseFloat(matriz[i][posicaoValor]);
    }

    return somatorio;
  }

/////////////////////////////////////////////////
/////////////////////////////////////////////////

  /* Opcao 3 - Calcular o total de lucro de 10% sobre cada venda: */

  // Recebe o valor da soma da funcao da opcao 2
  public static Float totalLucro(Float soma) throws FileNotFoundException {

    Float valorLucro = 0.00f;
    valorLucro = soma * 0.10f;

    System.out.println("\nO total de 10% de lucro é de: " + valorLucro);

    return valorLucro;
  }

/////////////////////////////////////////////////
/////////////////////////////////////////////////

  // Opcao 4 - Imprimir informacao (nome, contacto e email) baseada no idCliente
  // inserido pelo user:

  public static void infoCliente(String[][] matrizVendas, String numCliente)
      throws FileNotFoundException, NumberFormatException {

    // Booleano para nao imprimir informacao de cliente duplicada
    Boolean duplicado = false;
    int contador = 0;

    // Cria um string para ser preenchido com as informacoes do cliente pedido pelo
    // user
    String[] idCliente = new String[matrizVendas.length - 1];
    String[] nomeCliente = new String[matrizVendas.length - 1];
    String[] emailCliente = new String[matrizVendas.length - 1];
    String[] contactoCliente = new String[matrizVendas.length - 1];

    // Atribui o numero da posicao da coluna procurada é variavel
    int cliente = encontrarColuna(matrizVendas, "idCliente");
    int nome = encontrarColuna(matrizVendas, "nomeCliente");
    int contacto = encontrarColuna(matrizVendas, "contacto");
    int email = encontrarColuna(matrizVendas, "email");

    // Percorre as linhas da matriz na tabela 'cliente' para encontrar o idCliente
    // pretendido pelo user
    for (int i = 1; i < matrizVendas.length; i++) {
      if (matrizVendas[i][cliente].equals(numCliente)) {

        // Preenche os arrays com as informacoes do cliente das colunas correspondentes
        // se a informacao da linha corresponder ao idCliente
        idCliente[contador] = matrizVendas[i][cliente];
        emailCliente[contador] = matrizVendas[i][email];
        contactoCliente[contador] = matrizVendas[i][contacto];
        nomeCliente[contador] = matrizVendas[i][nome];
        // Contador incrementa o tamanho do array se a informacao corresponder a
        // pesquisa
        contador++;
      }
    }

    // Se o contador nao incrementar = nao encontrou informacao procurada
    if (contador == 0) {
      System.out.println("\nCliente " + numCliente + " nao tem jogos comprados.");
    }
    // Se contador incrementar, vai percorrer o array comparando as posicoes para
    // saber se ha informacao duplicada
    else {
      for (int i = 0; i < contador; i++) {
        // inicializacao do booleano como falso
        duplicado = false;
        for (int j = i + 1; j < contador; j++) {
          if (nomeCliente[i].equals(nomeCliente[j])) {
            // Caso a informacao esteja duplicada o booleano passa a true e sai do loop
            duplicado = true;
            break;
          }
        }
        // Imprime os valores caso nao tenha encontrado duplicados
        if (!duplicado) {
          System.out.println("\nCliente id[" + numCliente + "]:");
          System.out.println("\n- Nome: " + nomeCliente[i]);
          System.out.println("- Contacto: " + contactoCliente[i]);
          System.out.println("- Email: " + emailCliente[i] + "\n");
        }
      }
    }
  }

/////////////////////////////////////////////////
/////////////////////////////////////////////////

  // Opcao 5 - Géneros e jogos de uma editora:

  public static void infoEditora(String[][] matrizSales, String editora) throws FileNotFoundException {

    int contador = 0;
    // Booleano para saber se os jogos estao duplicados
    Boolean duplicado = false;

    // Chama a funcao para encontrar a posicao da coluna pretendida baseada na
    // informacao da matriz e atribui a posicao a variavel
    int colunaEditora = encontrarColuna(matrizSales, "editora");
    int colunaJogo = encontrarColuna(matrizSales, "jogo");
    int colunaCategoria = encontrarColuna(matrizSales, "categotria");

    // Arrays para guardar a informacao da coluna com os dados correspondentes
    String[] listaJogos = new String[matrizSales.length - 1];
    String[] listaCategorias = new String[matrizSales.length - 1];

    for (int i = 1; i < matrizSales.length; i++) {
      // Caso encontrar o nome da editora inserido pelo user, guarda a informacao no
      // array correspondente
      if (matrizSales[i][colunaEditora].equalsIgnoreCase(editora)) {
        listaJogos[contador] = matrizSales[i][colunaJogo];
        listaCategorias[contador] = matrizSales[i][colunaCategoria];
        // Iteracao do contador sempre que a informacao corresponder a pesquisa para
        // determinar o tamanho dos arrays
        contador++;
      }
    }

    // Caso o contador se mantenha 0 = nao foram encontrados os dados da pesquisa
    if (contador == 0) {
      System.out.println("\nEditora " + editora + " nao tem jogos vendidos.");
    } else {
      for (int i = 0; i < contador; i++) {
        // inicializacao do booleano como falso
        duplicado = false;

        for (int j = i + 1; j < contador; j++) {
          // caso a informacao das duas posicoes do array forem iguais, o booleano passa a
          // true e sai do loop indicando que ha duplicados
          if (listaJogos[i].equals(listaJogos[j])) {
            duplicado = true;
            break;
          }
        }
        // Caso ao terminar o ciclo nao haja duplicados imprime os dados
        if (!duplicado) {
          System.out.println("\nJogo: " + listaJogos[i] + " || Categoria: " + listaCategorias[i]);
        }
      }
    }
  }

/////////////////////////////////////////////////
/////////////////////////////////////////////////

  // Opcao 6 - Encontrar o jogo mais caro e os compradores:
  public static void maisCaro(String[][] matrizLoja) throws FileNotFoundException {

    // Chama funcao para encontrar a posicao do titulo da coluna pretendida e guarda
    // na variavel
    int colunaValor = encontrarColuna(matrizLoja, "valor");
    int colunaEditora = encontrarColuna(matrizLoja, "editora");
    int colunaJogo = encontrarColuna(matrizLoja, "jogo");
    int colunaCliente = encontrarColuna(matrizLoja, "nomeCliente");

    Double maior = 0.0;
    String nomeEditora = "", nomeJogo = "";

    for (int i = 1; i < matrizLoja.length - 1; i++) {
      // caso o valor na linha e coluna pretendidos for maior que o maior, a variavel
      // maior passa a ter esse valor
      if (Double.parseDouble(matrizLoja[i][colunaValor]) > maior) {
        maior = Double.parseDouble(matrizLoja[i][colunaValor]);
        // vai guardando o nome da editora e jogo mais caro nas variaveis
        nomeEditora = matrizLoja[i][colunaEditora];
        nomeJogo = matrizLoja[i][colunaJogo];
      }
    }
    // imprime a informacao do jogo mais caro
    System.out.println("\nO jogo mais caro: ");
    System.out.println("- Empresa: " + nomeEditora);
    System.out.println("- Jogo: " + nomeJogo);
    System.out.println("- Preço [EUR " + maior + "]");

    // loop para encontrar os compradores do jogo mais caro
    System.out.print("\nCompradores: \n");
    for (int i = 1; i < matrizLoja.length - 1; i++) {
      // corre as linhas da colunaValor na matriz e imprime o nome dos clientes cuja
      // compra seja = ao valor guardado na variavel 'maior'
      if (Double.parseDouble(matrizLoja[i][colunaValor]) == maior) {
        System.out.println("- " + matrizLoja[i][colunaCliente]);
      }

    }
  }

/////////////////////////////////////////////////
/////////////////////////////////////////////////

  // Menu:

  public static void menu() {

    // Receber userinput
    Scanner input = new Scanner(System.in);

    int opcao;
    Boolean sair = false;
    String voltarMenu = "s";

    // Menu de opcoes disponiveis
    do {
      System.out.println("\nEscolha uma das opçoes: ");
      System.out.println("\n1 - Imprimir conteúdo; ");
      System.out.println("2 - Calcular número de vendas e valor total; ");
      System.out.println("3 - Calcular o total de 10% de lucro; ");
      System.out.println("4 - Imprimir informações associadas a um cliente; ");
      System.out.println("5 - Géneros e jogos de uma editora; ");
      System.out.println("6 - Jogo mais caro e compradores.\n");

      // Repete até o user colocar um valor numérico
      while (!input.hasNextInt()) {
        System.out.println("opcao invalida - Escolha uma das opcoes.");
        input.next();
      }

      // Recebe opcao do user quando for um int
      opcao = input.nextInt();
      System.out.println();

      // Opera apenas o case da opcao inserida pelo user
      switch (opcao) {

        case 1:
          try {
            lerFicheiro();
          }
          // Caso nome do ficheiro nao corresponda a pesquisa/nao seja encontrado
          catch (FileNotFoundException exc) {
            System.out.println("Atencao - Ficheiro nao encontrado.");
          }
          break;

        case 2:
          try {
            // Chama a funcao da matriz e imprime a contagem das linhas vendas(sem contar
            // com a linha do cabeçalho)
            System.out.println("\nForam realizadas: [" + (matrix().length - 1) + "] vendas");

            // Chama a funcao que calcula a soma dos valores da coluna das vendas + chama a
            // matriz para ir buscar informacao das colunas para o calculo
            System.out.println("\nA soma das vendas tem como resultado: [EUR " + somaVendas(matrix()) + "]");

          } catch (FileNotFoundException exc2) {
            System.out.println("Atencao - Ficheiro nao encontrado.");

            // Caso o valor da string da coluna nao seja parseable
          } catch (NumberFormatException exc2) {
            System.out.println("Atencao - valor para calculo nao numerico");
          }
          break;

        case 3:
          try {
            // Chama funcao totalLucro para calculo de 10% do valor da funcao somaVendas
            totalLucro(somaVendas(matrix()));

          } catch (FileNotFoundException exc3) {
            System.out.println("Atencao - Ficheiro nao encontrado.");
          }
          break;

        case 4:
          try {
            // Booleano para garantir que o user apenas insere valor >0
            Boolean condicao = false;

            // Repete o loop enquanto o input nao for >0
            while (!condicao) {
              System.out.println("Indique um idCliente >0: ");
              String cliente = input.next();

              // Opera se input >0
              if (Integer.parseInt(cliente) > 0) {
                condicao = true;
                try {
                  // Chama funcao para pesquisa da informacao do cliente na matriz baseado no
                  // input do user
                  infoCliente(matrix(), cliente);

                } catch (FileNotFoundException exc4) {
                  System.out.println("\nAtencao - Ficheiro nao encontrado.");
                }
              }
              // Se input <0
              else {
                System.out.println("\nIdCliente invalido.\n");
              }
            }
          } catch (NumberFormatException exc4) {
            System.out.println("\nAtencao - valor para calculo nao numerico");
          }
          break;

        case 5:
          try {
            // Pede ao user o nome da editora a pesquisar
            System.out.println("\nNome editora: \n");

            // Permite receber mais que uma palavra na string para pesquisa
            String cliente = input.nextLine();
            cliente = input.nextLine();
            // System.out.println(cliente);

            // Chama funcao da pesquisa da editora na matriz baseada no user input
            infoEditora(matrix(), cliente);

          } catch (FileNotFoundException exc5) {
            System.out.println("\nAtencao - Ficheiro nao encontrado.");
          }
          break;

        case 6:
          try {
            // Chama funcao que calcula qual o jogo mais caro baseada na informacao da
            // matriz
            maisCaro(matrix());

          } catch (FileNotFoundException exc3) {
            System.out.println("\nAtencao - Ficheiro nao encontrado.");
          }
          break;

        // Quando user insere valor numerico nao disponivel no menu
        default:
          System.out.println("\nOpcao invalida");
      }

      // Pergunta ao user se quer voltar ao menu ou sair do menu
      System.out.println("\nPara voltar para o menu prima 's', para sair prima qualquer tecla:");
      voltarMenu = input.next();

      // Sai do menu ao premir qualquer tecla
      if (!voltarMenu.equalsIgnoreCase("s")) {
        sair = true;
      }

      // Volta sempre para o menu enquanto o user nao indicar para sair
    } while (!sair);

  }

/////////////////////////////////////////////////
/////////////////////////////////////////////////

  public static void main(String[] args) {

    // Chama funcao para display do menu
    menu();
  }
}
