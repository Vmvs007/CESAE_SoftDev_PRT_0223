import java.util.Scanner;


public class Ex_12 {

    public static void main(String[] args) {

        // Declara as variáveis
        int quant, cont=1, numAntigo,numNovo;
        boolean crescente=true;

        Scanner input = new Scanner(System.in);

        System.out.print ("Quantos números quer introduzir: ");
        quant= input.nextInt();

        System.out.print ("Introduz um número: ");
        numAntigo= input.nextInt();

        while(cont<quant){
            System.out.print ("Introduz um número: ");
            numNovo= input.nextInt();
            cont++;

            if(numNovo<=numAntigo){
                System.out.println("Atenção, deixou de ser crescente");
                crescente=false;
            }
            numAntigo=numNovo;
        }

        if(crescente==true){
            System.out.println("Crescente");
        }else{
            System.out.println("Não crescente");
        }
    }

}
