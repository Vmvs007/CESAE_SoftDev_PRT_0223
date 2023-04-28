import java.sql.Array;
import java.util.Scanner;

public class Ex_04 {

    public static int[] encontraRepetidos(int[] array) {
        int[] repetidos = new int[array.length];

        int indice = 0;

        for (int i = 0; i < array.length; i++) {
            int contador = 0;

            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    contador++;
                }
            }
            if (contador > 0) {
                boolean jaAdicionado = false;
                for (int k = 0; k < indice; k++) {
                    if (array[i] == repetidos[k]) {
                        jaAdicionado = true;
                        break;
                    }
                }
                if (!jaAdicionado) {
                    repetidos[indice] = array[i];
                    indice++;
                }
            }
        }

    // Cria um novo array com os valores repetidos encontrados
    int[] resultado = new int[indice];
        for (int i = 0; i < indice; i++) {
        resultado[i] = repetidos[i];
    }

        for(int i=0; i<repetidos.length;i++){
            System.out.println("Resultado:"+repetidos[i]);
        }

        return resultado;
    }

    public static void main(String[] args) {

        int[] array = new int[10];
        Scanner input = new Scanner(System.in);

        for(int i=0; i<array.length;i++){
            array[i]=input.nextInt();
        }

        encontraRepetidos(array);

    }
}
