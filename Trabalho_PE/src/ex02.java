import java.io.FileNotFoundException;

public class ex02 {
    public double[] ex02(String [][]a, String op) throws FileNotFoundException {
        //declaração da variável total que pretende guardar o somatório do preço de cada venda
        double total = 0;
        //declaração da variável n que guarda o somatório de vendas e a variável o que guarda o valor da coluna relativa à coluna com dados relativos aos preços de cada venda
        int n =0, o =0;
        //tratamento de exceções. validar se o index se encontra dentro dos limites do array e se existe a tentativa de manipulação de valores nulos
        try {
            //iteração pelos dados guardados no cabeçalho relativos à primeira linha de dados guardados do ficheiro lido
            for (int i = 0; i < 1; i++) {
                for (int j = 0; j < a[i].length; j++) {
                    if (op.equals(a[i][j])) {
                        //atribuição do número da coluna que armazena os preços de cada venda
                        o=j;
                    }
                }
            }
        } catch (ArrayIndexOutOfBoundsException exc) {
            System.out.println("Algo correu errado. Verifique o índice do array!");
        } catch (NullPointerException exc){
            System.out.println("Algo correu errado. Está a tentar usar uma referência de objeto de valor nulo");
        }
        //tratamento de exceções. validar se o index se encontra dentro dos limites do array e se existe a tentativa de manipulação de valores nulos
        try {
            //iteração pelos diferentes dados guardados por cada linha guardada com a informação do ficheiro presentes na coluna valor
            for (int i = 1; i < a.length; i++) {
                for (int j = o; j < a[i].length; j += o){
                    //incrementar valor de cada venda na variável total
                    total += Double.parseDouble(a[i][j]);
                    //incrementar número de cada venda na variável n
                    n++;
                }
            }
        } catch (ArrayIndexOutOfBoundsException exc) {
            System.out.println("Algo correu errado. Verifique o índice do array!");
        } catch (NullPointerException exc){
            System.out.println("Algo correu errado. Está a tentar usar uma referência de objeto de valor nulo");
        }
        //declaração da variável do tipo array a guardar as duas variáveis: número de linhas e total de vendas
        double []res = new double[2];
        //tratamento de exceções. validar se o index se encontra dentro dos limites do array e se existe a tentativa de manipulação de valores nulos
        try {
            //iteração pelo array construido para guardar os dois valores relativos às vendas e número de vendas
            for (int i = 0; i <res.length ; i++) {
                if (i==0){
                    //guardar na primeira posição do array o valor relativo ao somatório das vendas
                    res[i]=total;
                }else{
                    //guardar na segunda posição do array o valor relativo ao número das vendas
                    res[i]=n;
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
