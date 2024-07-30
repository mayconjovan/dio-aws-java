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

}
