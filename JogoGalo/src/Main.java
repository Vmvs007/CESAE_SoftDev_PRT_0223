// Jogo do Galo
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;

public class Main {

    static String[] tabuleiro;
    static String turno;


    // Verifica qual o vencedor
    static String verificaVencedor() {
        for (int a = 0; a < 8; a++) {
            String linha = null;

            switch (a) {
                case 0:
                    linha = tabuleiro[0] + tabuleiro[1] + tabuleiro[2];
                    break;
                case 1:
                    linha = tabuleiro[3] + tabuleiro[4] + tabuleiro[5];
                    break;
                case 2:
                    linha = tabuleiro[6] + tabuleiro[7] + tabuleiro[8];
                    break;
                case 3:
                    linha = tabuleiro[0] + tabuleiro[3] + tabuleiro[6];
                    break;
                case 4:
                    linha = tabuleiro[1] + tabuleiro[4] + tabuleiro[7];
                    break;
                case 5:
                    linha = tabuleiro[2] + tabuleiro[5] + tabuleiro[8];
                    break;
                case 6:
                    linha = tabuleiro[0] + tabuleiro[4] + tabuleiro[8];
                    break;
                case 7:
                    linha = tabuleiro[2] + tabuleiro[4] + tabuleiro[6];
                    break;
            }
            // Para X Vencedor
            if (linha.equals("XXX")) {
                return "X";
            }

            // Para O Vencedor
            else if (linha.equals("OOO")) {
                return "O";
            }
        }

        for (int a = 0; a < 9; a++) {
            if (Arrays.asList(tabuleiro).contains(
                    String.valueOf(a + 1))) {
                break;
            }
            else if (a == 8) {
                return "Empate";
            }
        }

        // Para colocar X ou O no tabuleiro
        System.out.print("Turno do Jogador: "+turno+"\nEscolha um lugar do tabuleiro para colocar " + turno + ": ");
        return null;
    }

    // Imprimir o tabuleiro
	/*
	|---|---|---|
	| 1 | 2 | 3 |
	|-----------|
	| 4 | 5 | 6 |
	|-----------|
	| 7 | 8 | 9 |
	|---|---|---|*/

    static void imprimirTabuleiro()
    {
        System.out.println("\n-------------");
        System.out.println("| " + tabuleiro[0] + " | " + tabuleiro[1] + " | " + tabuleiro[2] + " |");
        System.out.println("|-----------|");
        System.out.println("| " + tabuleiro[3] + " | " + tabuleiro[4] + " | " + tabuleiro[5] + " |");
        System.out.println("|-----------|");
        System.out.println("| " + tabuleiro[6] + " | " + tabuleiro[7] + " | " + tabuleiro[8] + " |");
        System.out.println("-------------\n");
    }


    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        tabuleiro = new String[9];
        turno = "X";
        String vencedor = null;

        for (int a = 0; a < 9; a++) {
            tabuleiro[a] = String.valueOf(a + 1);
        }

        System.out.println("\n***** Bem-vindo/a ao Jogo do Galo!*****");
        imprimirTabuleiro();

        System.out.print("X joga primeiro. Escolha um número para colocar X: ");

        while (vencedor == null) {
            int numInput;

            // Exception handling.
            // numInput vai ler o número do utilizador de 1 a 9.
            // Se não for entre 1 e 9, mostra erro
            try {
                numInput = in.nextInt();
                if (!(numInput > 0 && numInput <= 9)) {
                    System.out.print("Erro - Colocar novamente: ");
                    continue;
                }
            }
            catch (InputMismatchException e) {
                System.out.println("Erro - Colocar Novamente:");
                continue;
            }

            // Este jogo é de dois jogadores
            // Aqui está a lógica para decidir o turno
            if (tabuleiro[numInput - 1].equals(
                    String.valueOf(numInput))) {
                tabuleiro[numInput - 1] = turno;

                if (turno.equals("X")) {
                    turno = "O";
                }
                else {
                    turno = "X";
                }

                imprimirTabuleiro();
                vencedor = verificaVencedor();
            }
            else {
                System.out.println("Espaço ocupado, colocar novamente:");
            }
        }

        // Se ninguém ganhar, então mostra empate
        if (vencedor.equalsIgnoreCase("Empate")) {
            System.out.println("Foi um empate! Obrigado por jogar!");
        }

        // Mensagem de parabéns para o vencedor
        else {
            System.out.println("Parabéns! Jogador " + vencedor+ " venceu! Obrigado por jogar.");
        }
        in.close();
    }
}
