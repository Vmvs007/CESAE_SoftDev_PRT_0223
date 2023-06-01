import java.io.*;

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
    public void writeToFile(String content) throws IOException {
        FileWriter writer = new FileWriter(this.file, true); // O segundo parâmetro "true" indica que iremos fazer uma escrita incremental no arquivo.

        writer.write(content+"\n"); // Escreve o conteúdo no arquivo.

        writer.close(); // Fecha o escritor.
    }
}
