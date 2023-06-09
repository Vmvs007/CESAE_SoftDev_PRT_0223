import java.io.FileNotFoundException;

public class ex05 {
    String option ="";
    public String[] ex05_01(String[][] m, String e) {
        //atribuição do valor relativo à coluna editora que armazena os nomes das diferentes editoras presentes nas diferentes linhas do ficheiro
        option = e;
        //declaração e atribuição do valor à variável a guardar o número da posição relativa à coluna com o nome das diferentes editoras
        int o =0;;
        //tratamento de exceções. validar se o index se encontra dentro dos limites do array e se existe a tentativa de manipulação de valores nulos
        try {
            //iteração pelos diferentes dados guardados na primeira linha do ficheiro relativos ao cabeçalho e validação da posiçáo relativa à coluna com os nomes das diferentes colunas
            for (int i = 0; i < 1; i++) {
                for (int j = 0; j < m[i].length; j++) {
                    if (option.equals(m[i][j])) {
                        o=j;
                    }
                }
            }
        } catch (ArrayIndexOutOfBoundsException exc) {
            System.out.println("Algo correu errado. Verifique o índice do array!");
        } catch (NullPointerException exc){
            System.out.println("Algo correu errado. Está a tentar usar uma referência de objeto de valor nulo");
        }

        //atribuição do valor zero à variãvel que armazena o número de linhas com dados relativos aos nomes das diferentes editoras
        int count = 0;
        //tratamento de exceções
        try {
            //iteração pela coluna que armazena dados dos nomes das diferentes editoras
            for (int i = 1; i < m.length; i++) {
                for (int j = o; j < m[i].length; j = j + 8) {
                    //incrementação da variável relativa ao número de editoras
                    count++;
                }
            }
        } catch (ArrayIndexOutOfBoundsException exc) {
            System.out.println("Algo correu errado. Verifique o índice do array!");
        } catch (NullPointerException exc){
            System.out.println("Algo correu errado. Está a tentar usar uma referência de objeto de valor nulo");
        }
        //declaração da variável a guardar dados das diferentes editoras presentes no ficheiro e atribuição do tamanho
        String[] editoras = new String[count];
        //atribuição do valor zero à variável relativa ao indíce do novo array
        count = 0;
        //tratamento d eexceções
        try {
            //iteração pelos coluna que armazena os dados relativos ao nome das diferentes editoras e atribuição dos diferentes valores encontrados ao novo array
            for (int i = 1; i < m.length; i++) {
                for (int j = o; j < m[i].length; j = j + 8) {
                    //atribuição do valor com dados dos diferentes nomes das editoras no novo array
                    editoras[count] = m[i][j];
                    //incrementação do indíce do array a guardar os valores das editoras encontradas no ficheiro
                    count++;
                }
            }
        } catch (ArrayIndexOutOfBoundsException exc) {
            System.out.println("Algo correu errado. Verifique o índice do array!");
        } catch (NullPointerException exc){
            System.out.println("Algo correu errado. Está a tentar usar uma referência de objeto de valor nulo");
        }
        //atribuição do valor zero à variável que guarda o número de vezes em que o nome das editoras lidas são diferentes
        count = 0;
        //declaração e inicialização da variável que sinaliza se o nome das duas últimas editoras comparadas são iguais ou diferentes
        String eIgual = "não";
        //tratamento de exeções. Validação se o index se encontra dentro dos limites do array e se existe a tentativa de manipular valores nulos do array
        try {
            //iteração pelo array que armazena o valor das várias editoras presentes em cada linha do array com o objetivo de encontrar o número de vezes que existem editoras com diferentes nomes
            for (int i = 0; i < editoras.length; i++) {
                //atribuição do valor (não) à variável que sinaliza se o nome das duas últimas editoras comparadas são iguais. reset da variável para o valor (não)
                eIgual = "não";
                for (int j = i + 1; j < editoras.length; j++) {
                    //comparação entre a os dados guardados no array com o nome das editoras. Comparação entre uma posição e a posição seguinte e validação se os nomes são iguais
                    if (editoras[i].equals(editoras[j])) {
                        //atribuição do valor (sim) à variável que sinaliza se o nome das duas últimas editoras comparadas são iguais no caso dos nomes serem iguais
                        eIgual = "sim";
                        break;
                    }
                }
                //incrementação da variável que guarda o número de vezes que o nome das editoras comparadas são diferentes
                if (eIgual.equals("não") && !editoras[i].isEmpty()) {
                    count++;
                }
            }
        } catch (ArrayIndexOutOfBoundsException exc) {
            System.out.println("Algo correu errado. Verifique o índice do array!");
        } catch (NullPointerException exc){
            System.out.println("Algo correu errado. Está a tentar usar uma referência de objeto de valor nulo");
        }
        //declaração do array a guardar o nome das diferentes editoras encontradas e atribuição do seu tamanho
        String editora[] = new String[count + 1];
        //atribuição do valor 1 à variável que representa o indíce do novo array
        count = 1;
        //tratamento de exeções. Validação se o index se encontra dentro dos limites do array e se existe a tentativa de manipular valores nulos do array
        try {
            //iteração pelo array que armazena o valor das várias editoras presentes em cada linha do array com o objetivo de atribuir o valor ao novo array sempre que existem editoras com diferentes nomes
            for (int i = 0; i < editoras.length; i++) {
                eIgual = "não";
                for (int j = i + 1; j < editoras.length; j++) {
                    //atribuição à primeira possiçáo do novo array do nome da primeira editora encontrada
                    if (i == 0 && j == 1) {
                        editora[i] = editoras[i];
                    }
                    if (editoras[i].equals(editoras[j])) {
                        eIgual = "sim";
                        break;
                    }
                }
                //atribuição do nome da editora ao novo array sempre que os valores comparados não forem iguais
                if (eIgual.equals("não")) {
                    editora[count] = editoras[i];
                    //incrementação da variável relativa ao indíce do novo array sempre que um novo valor for atribuído ao array
                    count++;
                }
            }
        } catch (ArrayIndexOutOfBoundsException exc) {
            System.out.println("Algo correu errado. Verifique o índice do array!");
        } catch (NullPointerException exc){
            System.out.println("Algo correu errado. Está a tentar usar uma referência de objeto de valor nulo");
        }
        return editora;
    }

    public String[] ex05(String[][] a, String ed) throws FileNotFoundException {
        //declaração e atribuição do valor à variável a guardar o número da posição relativa à coluna que armazena o nome das diferentes editoras
        int o =0;
        //tratamento de exceções
        try {
            //iteração pelos diferentes dados guardados na primeira linha do ficheiro relativos ao cabeçalho e validação da posiçáo relativa à coluna com os nomes das diferentes colunas
            for (int i = 0; i < 1; i++) {
                for (int j = 0; j < a[i].length; j++) {
                    //atribuição do número relativo à posição da coluna que armazena o nome das editoras no matriz que armazena dados do ficheiro
                    if (option.equals(a[i][j])) {
                        o=j;
                    }
                }
            }
        } catch (ArrayIndexOutOfBoundsException exc) {
            System.out.println("Algo correu errado. Verifique o índice do array!");
        } catch (NullPointerException exc){
            System.out.println("Algo correu errado. Está a tentar usar uma referência de objeto de valor nulo");
        }

        System.out.println("Editora " + ed + "\n");
        //declaração da variável relativa ao indíce do novo array e atribuição do valor zero que corresponde à primeira posição
        int count = 0;
        //declaração e inicialização da variável que armazenará os dados  relativos ao nome e categoria do jogo presentes nas diferentes linhas com o nome da editora selecionada pelo utilizador
        String linhaEditora = "";
        //declaração e inicialização da variável que sinaliza se o nome das duas últimas editoras comparadas são iguais ou diferentes
        String eIgual = "não";
        //tratamento de exceções
        try {
            //iteração pelos diferentes dados guardados na primeira linha do ficheiro relativos ao cabeçalho e validação da posiçáo relativa à coluna com os nomes das diferentes colunas
            for (int i = 1; i < a.length; i++) {
                //reset da variável que sinaliza se o nome das duas últimas editoras comparadas são iguais ou diferentes
                eIgual = "não";
                for (int j = o; j < a[i].length; j = j + 8) {
                    if (ed.equals(a[i][j])) {
                        linhaEditora += a[i][j + 1] + ";";
                        linhaEditora += a[i][j + 2] + ";";
                        count += 2;
                    }
                }
            }
        } catch (ArrayIndexOutOfBoundsException exc) {
            System.out.println("Algo correu errado. Verifique o índice do array!");
        } catch (NullPointerException exc){
            System.out.println("Algo correu errado. Está a tentar usar uma referência de objeto de valor nulo");
        }

        String[] temp = new String[count];
        temp = linhaEditora.split(";");
        //variavél responsável por incrementar o indice do array a construir e inicializar a vari+avel na posição dois uma vez que o primeiro registo correspondente aos dois primeiros indices é preenchido manualmente na linha 203 e 204
        count = 2;

        try {
            //iteração para determinar valor da varianvel count (que vai definir o tamanho do novo array)
            for (int i = 3; i < temp.length; i += 2) {
                eIgual = "não";
                for (int j = i + 2; j < temp.length; j += 2) {
                    if(temp[i].equals(temp[i-2])){
                        break;
                    }
                    if (temp[i].equals(temp[j])) {
                        eIgual = "sim";
                        break;
                    }
                    break;
                }
                if (eIgual.equals("sim")) {
                    count += 2;

                }
            }
        } catch (ArrayIndexOutOfBoundsException exc) {
            System.out.println("Algo correu errado. Verifique o índice do array!");
        } catch (NullPointerException exc){
            System.out.println("Algo correu errado. Está a tentar usar uma referência de objeto de valor nulo");
        }

        String[] res = new String[count];
        //atribuição dos primeiros dados do array ao novo array
        res[0] = temp[0];
        res[1] = temp[1];
        count = 2;

        try {
            for (int i = 3; i < temp.length; i += 2) {
                eIgual = "não";
                for (int j = i + 2; j < temp.length; j += 2) {
                    //verificar sempre se o novo nome do jogo jã existe no novo array, ou seja, se é o mesmo da posição anterior do array
                    if(temp[i].equals(temp[i-2])){
                        break;
                    }
                    //validar se os nomes comparados são iguais e se sim, alterar o valor da variavel que sinaliza a igualdade ou diferença entre nome de jogos
                    if (temp[i].equals(temp[j])) {
                        eIgual = "sim";
                        break;
                    }
                    break;
                }
                if (eIgual.equals("sim")) {
                    //atribuição dos dados ao novo array sempre que os nomes comparados forem iguais
                    res[count] = temp[i - 1];
                    res[count + 1] = temp[i];
                }
            }
        } catch (ArrayIndexOutOfBoundsException exc) {
            System.out.println("Algo correu errado. Verifique o índice do array!");
        } catch (NullPointerException exc){
            System.out.println("Algo correu errado. Está a tentar usar uma referência de objeto de valor nulo");
        }

        return res;
    }
}
