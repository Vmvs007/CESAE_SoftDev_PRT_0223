package Ex_03;

public class DocumentFactory {

    public static Document createDocument(String tipo, String nome, String autor){
        switch (tipo){
            case "TEXTO": return new TextDocument(autor,nome);

            case "CALCULO": return new SheetsDocument(autor,nome);

            case "APRESENTACAO": return new PresentationDocument(autor,nome);

            default: throw new IllegalArgumentException("Tipo de Documento Inválido: " + tipo);
        }
    }
}
