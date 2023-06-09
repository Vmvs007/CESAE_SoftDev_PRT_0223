package org.example;

import java.util.Scanner;

public class Main {

        public static void main(String[] args) {

            Scanner input = new Scanner(System.in); Calculator calculator = new Calculator();
            int num1, num2;

            System.out.print("Primeiro número: ");
            num1= input.nextInt();

            System.out.print("Segundo número: ");
            num2= input.nextInt();

            System.out.println("Divisão: "+ calculator.divide(num1, num2)); }

}
