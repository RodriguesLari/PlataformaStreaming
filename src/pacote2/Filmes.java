package pacote2;

public class Filmes extends Conteudo {
    private String diretor; 

    public Filmes(String titulo, String categoria, int duracao, String diretor){
        super(titulo, categoria, duracao);
        this.diretor = diretor;
    }
        
    @Override
    public void exibirInformacoes(){
        super.exibirInformacoes();
        System.out.println("Diretor: " + diretor);
    }
}
