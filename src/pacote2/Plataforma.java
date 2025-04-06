package pacote2;


import java.util.ArrayList;
import java.util.List;

public class Plataforma {
private List<Conteudo> conteudos;

public Plataforma(){
    conteudos = new ArrayList<>();
}
public void adicionarConteudo(Conteudo conteudo){
    conteudos.add(conteudo);
}

public void removerConteudo(String titulo){
    conteudos.removeIf(c -> c.getTitulo().equalsIgnoreCase(titulo));
}

public void exibirTodos(){
    if(conteudos.isEmpty()){
        System.out.println("Nenhum conteúdo disponível.");
        return;
    }

    for (Conteudo c : conteudos){
        c.exibirInformacoes();
        System.out.println();
    }
}

public void exibirPorTitulo(String titulo){
    for(Conteudo c : conteudos){
        if(c.getTitulo().equalsIgnoreCase(titulo)){
            c.exibirInformacoes();
            System.out.println();
        }
    }
}

public void exibirPorCategoria(String categoria){
    for(Conteudo c : conteudos){
        if(c.getCategoria().equalsIgnoreCase(categoria)){
            c.exibirInformacoes();
            System.out.println();
        }
    }
}
public void exibirPorDuracao(int duracaoMax) {
    for (Conteudo c : conteudos) {
        if (c.getDuracao() <= duracaoMax) {
            c.exibirInformacoes();
            System.out.println();
        }
    }
}
public Conteudo buscarPorTitulo(String titulo) {
    for (Conteudo c : conteudos) {
        if (c.getTitulo().equalsIgnoreCase(titulo)) {
            return c;
        }
    }
    return null;
}
}
