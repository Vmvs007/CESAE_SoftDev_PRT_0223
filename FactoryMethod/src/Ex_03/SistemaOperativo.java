package Ex_03;

import java.util.Scanner;

public class SistemaOperativo {
    public static void main(String[] args) {

        // Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        String tipo, nome, autor, novoDocumento;
        int opcao=0;

        do {
            // Inquirir o utilizador
            System.out.print("Tipo de Documento (TEXTO, CALCULO, APRESENTACAO): ");
            tipo = input.next();

            System.out.print("Nome do Documento: ");
            nome = input.next();

            System.out.print("Autor: ");
            autor = input.next();

            Document documento = DocumentFactory.createDocument(tipo.toUpperCase(), nome, autor);

            documento.open();

            do {
                do {
                    System.out.println("1. Gravar Documento");
                    System.out.println("2. Fechar Documento");
                    System.out.print("Opção: ");
                    opcao = input.nextInt();
                } while (opcao < 1 || opcao > 2);
                switch (opcao) {
                    case 1:
                        documento.save();
                        break;

                    case 2:
                        documento.close();
                        break;

                    default:
                        System.out.println("Opção Inválida");

                }
            } while (opcao != 2);

            System.out.println("\nCriar novo Documento (s/n): ");
            novoDocumento=input.next();
            System.out.println("\n");

        }while(novoDocumento.equals("s"));
    }
}
