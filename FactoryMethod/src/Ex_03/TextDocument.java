package Ex_03;

public class TextDocument extends Document{

    public TextDocument(String autor, String nome) {
        super(autor, nome, ".docx");
    }

    /**
     * Método para abrir um documento de texto
     */
    @Override
    public void open() {
        System.out.println("A abrir o documento de Texto "+getNome()+getExtensao());
        // Código específico para abrir um documento de texto
    }

    /**
     * Método para gravar um documento de texto
     */
    @Override
    public void save() {
        System.out.println("Alterações do "+getAutor()+" gravadas.");
        // Código específico para gravar um documento de texto
    }

    /**
     * Método para fechar um documento de texto
     */
    @Override
    public void close() {
        System.out.println("A fechar o documento de Texto");
        // Código específico para fechar um documento de texto
    }
}
