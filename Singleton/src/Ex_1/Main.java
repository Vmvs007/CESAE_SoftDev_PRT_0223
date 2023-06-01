package Ex_1;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        // Instanciar um Ex_1.Logger pela primeira vez
        Logger logger = Logger.getInstance("application_log.txt");

        // Tentar escrever logs no ficheiro
        logger.writeToFile("Mensagem de log 2");

        Logger logger_2 = Logger.getInstance("app_log_2.txt");

        logger_2.writeToFile("Mensagem de log 200");


    }
}