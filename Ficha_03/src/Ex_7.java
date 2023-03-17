import java.util.Scanner;

public class Ex_7 {

    public static void main(String[] args) {

        // Declara as variáveis
        int num=0, sum=0, cont=-1,media=0;

        Scanner input = new Scanner(System.in);

        // Ciclo executa até o utilizador introduzir o -1
        while(num!=-1) {

            //Acrescenta o numero ao somatorio
            sum=sum +num;
            //Contabiliza a quantidade de numeros (numero de execucoes do ciclo)
            cont++;

            System.out.println("Introduz um numero: ");
            num= input.nextInt();

        }

        System.out.println("Somatório: "+sum);
        System.out.println("Contador: "+cont);
        media=sum/cont;
        System.out.println("Média: "+media);
    }

}
