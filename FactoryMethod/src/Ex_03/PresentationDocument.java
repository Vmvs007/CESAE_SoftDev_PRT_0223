package Ex_03;

public class PresentationDocument extends Document{
    public PresentationDocument(String autor, String nome) {
        super(autor, nome, ".pptx");
    }

    /**
     * Método para abrir um documento de apresentação
     */
    @Override
    public void open() {
        System.out.println("A abrir o documento de Apresentação "+getNome()+getExtensao());
        // Código específico para abrir um documento de apresentação
    }

    /**
     * Método para gravar um documento de apresentação
     */
    @Override
    public void save() {
        System.out.println("Alterações do "+getAutor()+" gravadas.");
        // Código específico para gravar um documento de apresentação
    }

    /**
     * Método para fechar um documento de apresentação
     */
    @Override
    public void close() {
        System.out.println("A fechar o documento de Apresentação");
        // Código específico para fechar um documento de apresentação
    }
}
