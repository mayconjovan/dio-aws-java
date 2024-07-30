package list.Search;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {

    private List<Livro> livros;

    public CatalogoLivros() {
        this.livros = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        livros.add(new Livro(titulo, autor, anoPublicacao));
    }


    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> livrosPorAutor = new ArrayList<>();
        if(!livros.isEmpty()) {
            for(Livro l : livros) {
                if (l.getAuthor().equalsIgnoreCase(autor)) {
                    livrosPorAutor.add(l);
                }
            }
        }
        return livrosPorAutor;
    }


    public List<Livro> pesquisaPorIntervaloAnos(int anoInicial, int anoFinal) {
        List<Livro> livrosPorIntervaloAno = new ArrayList<>();

        if(!livros.isEmpty()) {
            for(Livro l : livros) {
                if (l.getPublicationYear() >= anoInicial && l.getPublicationYear() <= anoFinal) {
                    livrosPorIntervaloAno.add(l);
                }
            }
        }
        return livrosPorIntervaloAno;
    }

    public Livro pesquisaPorTitulo(String titulo) {
        Livro livroPorTitulo = null;

        if(!livros.isEmpty()) {
            for (Livro k : livros) {
                if(k.getTitle().equalsIgnoreCase(titulo)) {
                    livroPorTitulo = k;
                    break;
                }
            }
        }
        return livroPorTitulo;


    }

    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();
        catalogoLivros.adicionarLivro("Livro 1", "Autor 1", 2021);
        catalogoLivros.adicionarLivro("Livro 1", "Autor 2", 2020);
        catalogoLivros.adicionarLivro("Livro 2", "Autor 2", 2022);
        catalogoLivros.adicionarLivro("Livro 3", "Autor 3", 2023);
        catalogoLivros.adicionarLivro("Livro 4", "Autor 4", 1994);


        System.out.println(catalogoLivros.pesquisarPorAutor("Autor 4"));
        System.out.println(catalogoLivros.pesquisaPorIntervaloAnos(2020, 2022));
        System.out.println(catalogoLivros.pesquisaPorTitulo("Livro 1"));

    }

}
