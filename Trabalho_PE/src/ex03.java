import java.io.FileNotFoundException;

public class ex03 {
    public double ex03(double []a) throws FileNotFoundException {
        //declaração da variável lucro e atribuição do valor 0,1 correspondente aos 10%
        double l = 0.1;
        //tratamento de exceções. validar se o index se encontra dentro dos limites do array e se existe a tentativa de manipulação de valores nulos
        try {
            //iteração pelos dados guardados no array construído no exercico 3 relativo ao somatório do preço as vendas e número de vendas
            for (int i = 0; i < 1; i++) {
                //aplicar percentagem do lucro à primeira posição do array que guarda o valor com o total das vendas
                l *= a[i];
            }
        } catch (ArrayIndexOutOfBoundsException exc) {
            System.out.println("Algo correu errado. Verifique o índice do array!");
        } catch (NullPointerException exc){
            System.out.println("Algo correu errado. Está a tentar usar uma referência de objeto de valor nulo");
        }

        return l;
    }
}
