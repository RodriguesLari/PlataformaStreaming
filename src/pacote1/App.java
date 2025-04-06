package pacote1;

import pacote2.*;
import java.util.Scanner;


public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Plataforma plataforma = new Plataforma();
        int opcao;

        do {
            System.out.println("\n****\nDisney+\n****\n");
            System.out.println("1 - Adicionar conteúdo");
            System.out.println("2 - Remover conteúdo");
            System.out.println("3 - Exibir todos os conteúdos");
            System.out.println("4 - Exibir por título");
            System.out.println("5 - Exibir por categoria");
            System.out.println("6 - Exibir por duração");
            System.out.println("7 - Buscar conteúdo por título");
            System.out.println("0 - Sair");
            System.out.println("Escolha uma das opções: ");
            opcao = input.nextInt();
            input.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Adicionar Filme (f) ou Série (s)?");
                    String tipo = input.nextLine();

                    System.out.print("Título: ");
                    String titulo = input.nextLine();

                    System.out.print("Categoria: ");
                    String categoria = input.nextLine();

                    System.out.print("Duração: ");
                    int duracao = input.nextInt();
                    input.nextLine();

                    if (tipo.equalsIgnoreCase("f")) {
                        System.out.print("Diretor: ");
                        String diretor = input.nextLine();
                        plataforma.adicionarConteudo(new Filmes(titulo, categoria, duracao, diretor));
                        System.out.println("Filme adicionado com sucesso!");
                    } else if (tipo.equalsIgnoreCase("s")) {
                        System.out.print("Temporada: ");
                        int temporada = input.nextInt();
                        input.nextLine();
                        plataforma.adicionarConteudo(new Serie(titulo, categoria, duracao, temporada));
                        System.out.println("Série adicionada com sucesso!");
                    } else {
                        System.out.println("Tipo inválido!");
                    }
                    break;

                case 2:
                    System.out.print("Título do conteúdo a remover: ");
                    String tituloRemover = input.nextLine();
                    plataforma.removerConteudo(tituloRemover);
                    System.out.println("Esse conteúdo não existe mais em nosso catálogo.");
                    break;

                case 3:
                    System.out.println("\nTodos os conteúdos:");
                    plataforma.exibirTodos();
                    break;

                case 4:
                    System.out.print("Título para exibir: ");
                    String tituloExibir = input.nextLine();
                    plataforma.exibirPorTitulo(tituloExibir);
                    break;

                case 5:
                    System.out.print("Categoria para exibir: ");
                    String cat = input.nextLine();
                    plataforma.exibirPorCategoria(cat);
                    break;

                case 6:
                    System.out.print("Duração: ");
                    int duracaoMax = input.nextInt();
                    input.nextLine();
                    plataforma.exibirPorDuracao(duracaoMax);
                    break;

                case 7:
                    System.out.print("Título para buscar: ");
                    String tituloBusca = input.nextLine();
                    Conteudo encontrado = plataforma.buscarPorTitulo(tituloBusca);
                    if (encontrado != null) {
                        System.out.println("Conteúdo encontrado:");
                        encontrado.exibirInformacoes();
                    } else {
                        System.out.println("Conteúdo não encontrado.");
                    }
                    break;

                case 0:
                    System.out.println("Encerrando programa.");
                    break;

                default:
                    System.out.println("Opção inválida.");
                    break;
            }

        } while (opcao != 0);

        input.close();
    }
}
