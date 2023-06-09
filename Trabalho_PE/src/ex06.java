import java.io.FileNotFoundException;

public class ex06 {
    public String ex06(String[][] c) throws FileNotFoundException {
        //declaração e atribuição do valor (valor) que corresponde ao nome da coluna correspondente ao preço do jogos, nome do cliente e nome do jogo
        String v = "valor", n ="jogo", nc = "nomeCliente";
        //declaração e ainicialização da variável que armazena o indice do novo array a preencher e a varável a guardar a posição da coluna relativa aos diferentes preços dos jogos
        int count = 0, u = 0, l=0, k=0;
        //tratamento de exceções
        try {
            //iteração na primeira linha que guarda o cabeçalho do ficheiro
            for (int i = 0; i < 1; i++) {
                for (int j = 0; j < c[i].length; j++) {
                    //validar qual a coluna relativa aos preços de cada venda e armazenar a posição da sua coluna no array
                    if (v.equals(c[i][j])) {
                        u = j;
                    }
                    if(n.equals(c[i][j])){
                        l = j;
                    }
                    if (nc.equals(c[i][j])){
                        k=j;
                    }
                }
            }
        } catch (ArrayIndexOutOfBoundsException exc) {
            System.out.println("Algo correu errado. Verifique o índice do array!");
        } catch (NullPointerException exc) {
            System.out.println("Algo correu errado. Está a tentar usar uma referência de objeto de valor nulo");
        }
        //declaração da matriz a receber nome do cliente, nome e preço dos diferentes jogos presentes no ficheiro e atribuição do seu tamanho tendo em conta o número de vendas registadas no ficheiro (linhas da matriz) e os 3 valores a guardar (colunas matriz)
        String[][] valor = new String[c.length - 1][3];
        try {
            for (int i = 1; i < c.length; i++) {
                for (int j = u; j < c[i].length; j += 8) {
                    //armazenar nome cliente
                    valor[count][2] = c[i][j];
                    //armazenar nome jogo
                    valor[count][1] = c[i][j-(u-l)];
                    //armazenar preço do jogo
                    valor[count][0] = c[i][j - (u-k)];
                    //incrementar indice do novo array
                    count++;
                }
            }
        } catch (ArrayIndexOutOfBoundsException exc) {
            System.out.println("Algo correu errado. Verifique o índice do array!");
        } catch (NullPointerException exc) {
            System.out.println("Algo correu errado. Está a tentar usar uma referência de objeto de valor nulo");
        }
        //declaração da variável que vai ser comparada com os diferentes preços de cada venda e inicialização do seu valor a zero
        double maior = 0;
        //declaraºão da variável que vair receber o nome do jogo mais caro
        String nomeJogo = "";
        //tratamento de exceções
        try {
            //iteração pelas diferentes vendas do ficheiro
            for (int i = 0; i < valor.length; i++) {
                for (int j = 0; j < valor[i].length; j++) {
                    //validação se o valor presente na variãvel é maior que o preço de cada linha
                    if (Double.parseDouble(valor[i][2]) > maior) {
                        //se o valor da venda foi superior ao valor da variável maior, atribuição desse valor à variãvel
                        maior = Double.parseDouble(valor[i][2]);
                        //guardar nome do jogo sempre que for encontrada uma venda mais cara que a anterior
                        nomeJogo = valor[i][1];
                    }
                }
            }
        } catch (ArrayIndexOutOfBoundsException exc) {
            System.out.println("Algo correu errado. Verifique o índice do array!");
        } catch (NullPointerException exc) {
            System.out.println("Algo correu errado. Está a tentar usar uma referência de objeto de valor nulo");
        }
        //retornar nome do jogo mais caro encontrado
        return nomeJogo;
    }
}
