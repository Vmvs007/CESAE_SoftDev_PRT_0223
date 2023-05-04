public class Ex_02 {

    public static void main(String[] args) {

        // Instanciar 3 objetos da Classe Cão
        Cao bobby = new Cao("Bobby", "Beagle");
        Cao bolinhas = new Cao("Bolinhas","Caniche");
        Cao max = new Cao("Max","Pastor Alemão");

        // Imprimir o nome e raça do primeiro cão
        System.out.println("Nome do primeiro cão: "+bobby.getNome());
        System.out.println("Raça do primeiro cão: "+bobby.getRaca());

        System.out.println();

        // Imprimir o nome e raça do segundo cão
        System.out.println("Nome do segundo cão: "+bolinhas.getNome());
        System.out.println("Raça do segundo cão: "+bolinhas.getRaca());

        System.out.println();

        // Imprimir o nome e raça do terceiro cão
        System.out.println("Nome do terceiro cão: "+max.getNome());
        System.out.println("Raça do terceiro cão: "+max.getRaca());


        // Alterar a raça do bobby para Golden Retriever
        bobby.setRaca("Golden Retriever");

        // Alterar a raça do max para Serra da Estrela
        max.setRaca("Serra da Estrela");

        System.out.println("\n Valores atualizados\n");

        // Imprimir o nome e raça do primeiro cão
        System.out.println("Nome do primeiro cão: "+bobby.getNome());
        System.out.println("Raça do primeiro cão: "+bobby.getRaca());

        System.out.println();

        // Imprimir o nome e raça do segundo cão
        System.out.println("Nome do segundo cão: "+bolinhas.getNome());
        System.out.println("Raça do segundo cão: "+bolinhas.getRaca());

        System.out.println();

        // Imprimir o nome e raça do terceiro cão
        System.out.println("Nome do terceiro cão: "+max.getNome());
        System.out.println("Raça do terceiro cão: "+max.getRaca());

        bobby.latir();
    }
}
