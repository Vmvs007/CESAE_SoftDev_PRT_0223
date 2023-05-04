public class Ex_07 {
    public static void main(String[] args) {

        // Instanciar Livros
        Livro javaHeadsFirst = new Livro("Heads First Java", "Kathy Sierra", "Programação", 600, 11110022);
        Livro tresPorquinhos = new Livro("Os Três Porquinhos", "Desconhecido", "Infantil",10,22220033);

        javaHeadsFirst.exibirDetalhes();
        System.out.println();
        tresPorquinhos.exibirDetalhes();
    }
}
