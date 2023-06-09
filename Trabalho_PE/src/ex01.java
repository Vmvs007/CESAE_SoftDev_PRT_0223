import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ex01 {
    public String[][] ex01() {
        String conteudo[][] = new String[0][0];
        // tratamento de exceções. Validar se o ficheiro pretendido está presente no caminho definido
        try {
            File ficheiro = new File("GameStart.csv");
            Scanner in = new Scanner(ficheiro);
            //cabeçalho do ficheiro
            String linha = in.nextLine() + ";";
            //criação de array com palavras encontradas no cabeçalho do ficheiro separando por (;)
            String[] p = linha.split(";");
            //guardar o tamanho do array de forma a saber quantas colunas a contruir na matriz
            int l = linha.split(";").length;
            //declaração da variável a guardar o número de linhas da matriz. Atribuição do valor 1 referente à primeira linha, o cabeçalho
            int nLinha = 1;
            //leitura das várias linhas do ficheiro. Guardar dados lidos na variável linha e incrementação da variável do número de linhas
            while (in.hasNextLine()) {
                linha += in.nextLine() + ";";
                nLinha++;
            }

            int count = p.length;
            //passar o valor da variável que guarda os dados das linhas do documento para um array dividindo cada linha por (;)
            for (int i = 0; i < count; i++) {
                p = linha.split(";");
            }
            //inicialização da matriz a guardar conteudo do ficheiro lido e atribuição do tamanho (linhas e colunas)
            conteudo = new String[nLinha][l];
            //variavel que guarda o indice do array relativo às linhas do conteudo do ficheiro
            count = 0;
            //tratamento de exceções. validar se o index se encontra dentro dos limites do array e se existe a tentativa de manipulação de um valor nulo
            try {
                for (int i = 0; i < nLinha; i++) {
                    for (int j = 0; j < l; j++) {
                        conteudo[i][j] = p[count];
                        count++;
                    }
                }

            } catch (ArrayIndexOutOfBoundsException exc) {
                System.out.println("Algo correu errado. Verifique o índice do array!");
            } catch (NullPointerException exc) {
                System.out.println("Algo correu errado. Está a tentar usar uma referência de objeto de valor nulo");
            }

        } catch (FileNotFoundException exc) {
            System.out.println("Ficheiro não encontrado Error!!!!!");
        }
        return conteudo;
    }
}
