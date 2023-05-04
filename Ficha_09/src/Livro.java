public class Livro {

    // Atributos de instância
    private String titulo, autor, categoria;
    private int paginas, isbn;

    // Método construtor
    public Livro(String titulo, String autor, String categoria, int paginas, int isbn ){
        this.titulo=titulo;
        this.autor=autor;
        this.categoria=categoria;
        this.paginas=paginas;
        this.isbn=isbn;
    }

    public void setAutor(String autor){
        this.autor=autor;
    }

    /**
     * Imprime na consola os detalhes do livro
     */
    public void exibirDetalhes(){
        System.out.println("Título: "+this.titulo);
        System.out.println("Autor: "+this.autor);
        System.out.println("Categoria: "+this.categoria);
        System.out.println("Número de Páginas: "+this.paginas);
        System.out.println("ISBN: "+this.isbn);
    }
}
