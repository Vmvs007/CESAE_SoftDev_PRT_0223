import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Logger {


    // Único objeto desta classe
private static Logger instance;
    private File file;

    /**
     * Construtor privado que só vai executar a primeira vez
     * @param filename
     */
    private Logger(String filename) {
        file = new File(filename);
    }

    /**
     * Método de criação de objeto / Retorno do objeto criado
     * @param filename
     * @return
     */
    public static synchronized Logger getInstance(String filename) {
        if (instance == null) {
            instance = new Logger(filename);
        }
        return instance;
    }

    /**
     * Método para guardar uma linha de String no ficheiro
     * @param log_line
     * @throws FileNotFoundException
     */
    public void log(String log_line) throws FileNotFoundException {
        PrintWriter log_writer = new PrintWriter(this.file);

        log_writer.println(log_line);
        log_writer.close();
    }
}
