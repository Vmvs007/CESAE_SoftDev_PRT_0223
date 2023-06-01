import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        // Instanciar um Logger pela primeira vez
        Logger logger = Logger.getInstance("application_log.txt");

        // Tentar escrever logs no ficheiro

        logger.writeToFile("Mensagem de log 1");

        Logger logger_2 = Logger.getInstance("app_log_2.txt");

        logger.writeToFile("Mensagem de log 100");

        System.out.println("Erro no ficheiro...");

    }
}