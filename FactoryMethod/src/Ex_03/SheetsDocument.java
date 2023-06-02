package Ex_03;

public class SheetsDocument extends Document{
    public SheetsDocument(String autor, String nome) {
        super(autor, nome, ".xlsx");
    }

    /**
     * Método para abrir um documento de Folha de Cálculo
     */
    @Override
    public void open() {
        System.out.println("A abrir o documento de Folha de Cálculo "+getNome()+getExtensao());
        // Código específico para abrir um documento de Folha de Cálculo
    }

    /**
     * Método para gravar um documento de Folha de Cálculo
     */
    @Override
    public void save() {
        System.out.println("Alterações do "+getAutor()+" gravadas.");
        // Código específico para gravar um documento de Folha de Cálculo
    }

    /**
     * Método para fechar um documento de Folha de Cálculo
     */
    @Override
    public void close() {
        System.out.println("A fechar o documento de Folha de Cálculo");
        // Código específico para fechar um documento de Folha de Cálculo
    }
}
