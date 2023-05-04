public class Aluno {

    // Atributos de instância
    private String nome, curso;
    private int idade;
    private double media;

    // Método construtor
    public Aluno(String nome, int idade, String curso, double media){
        this.nome=nome;
        this.idade=idade;
        this.curso=curso;
        this.media=media;
    }

    /**
     * Método que retorna se o aluno está ou não aprovado
     * @return true se aprovado || false se reprovado
     */
    public boolean situacao(){
        if(this.media>=9.5){
            System.out.println("Aprovado");
            return true;
        }else{
            System.out.println("Reprovado");
            return false;
        }
    }
}
