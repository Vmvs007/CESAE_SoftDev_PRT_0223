import java.util.Scanner;

import static java.lang.Math.*;

public class Main {


    public static int soma(int num1, int num2){
        int soma =num1+num2;
        return(soma);
    }

    public static void main(String[] args) {

        int a,b;
        Scanner input = new Scanner(System.in);

        System.out.println("Introduza um número: ");
        a=input.nextInt();

        System.out.println("Introduza um número: ");
        b=input.nextInt();

        System.out.println(soma(a,b));

        System.out.println(sqrt(25));

        double r =Math.random();
        System.out.println("Random: "+ r);


    }
}