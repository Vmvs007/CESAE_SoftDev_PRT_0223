import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {
        // Instanciar um Logger pela primeira vez
        Logger logger = Logger.getInstance("application_log.txt");

        // Tentar escrever logs no ficheiro
       try {
           logger.log("Mensagem de log 1");
       }catch (FileNotFoundException exc){
           System.out.println("Erro no ficheiro...");
       }


       Logger logger_2 = Logger.getInstance("app_log_2.txt");
        try {
            logger.log("Mensagem de log 100");
        }catch (FileNotFoundException exc){
            System.out.println("Erro no ficheiro...");
        }
    }
}