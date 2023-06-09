import java.io.FileNotFoundException;

public class ex04 {
    public String[] ex04(String [][]a, String c, String op) throws FileNotFoundException {
        //declaração e atribuição do valor 3 à variàvel que armazenará 3 valores referentes aos dados nome, contato e email do cliente e da variável a guardar o número da posição relativa à coluna do nome dos clientes
        int count = 3, o =0;;
        //tratamento de exceções. validar se o index se encontra dentro dos limites do array e se existe a tentativa de manipulação de valores nulos
        try {
            //iteração pelos dados guardados com o cabeçalho do ficheiro e validação do número da posição da coluna com a informação relativa aos nomes dos clientes
            for (int i = 0; i < 1; i++) {
                for (int j = 0; j < a[i].length; j++) {
                    if (op.equals(a[i][j])) {
                        o=j;
                    }
                }
            }
        } catch (ArrayIndexOutOfBoundsException exc) {
            System.out.println("Algo correu errado. Verifique o índice do array!");
        } catch (NullPointerException exc){
            System.out.println("Algo correu errado. Está a tentar usar uma referência de objeto de valor nulo");
        }

        //declaração e definição do tamanho do array a guardar dados do cliente com o id inserido pelo utilizador
        String []res = new String[count];
        //atribuição do valor zero à variàvel de forma a representar o indice do novo array
        count=0;

        try {
            //iteração pela dados guardados na coluna com o valor cliente guardando o valor nome, contacto e email do cliente com o id inserido pelo utilizador
            for (int i = 1; i < a.length; i++) {
                for (int j = 1; j < a[i].length; j = j + 8) {
                    if (c.equals(a[i][j])) {
                        res[count] = a[i][(j+1)];
                        res[count+1] = a[i][(j+2)] ;
                        res[count+2] = a[i][(j+2)];
                    }
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
