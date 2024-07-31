package set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroDeProdutos {

    private Set<Produto> produtoSet;

    public CadastroDeProdutos() {
        this.produtoSet = new HashSet<>();
    }

    public void adicionarProduto(long cod, String nome, double preco, int quantidade) {
        produtoSet.add(new Produto(nome, cod, preco, quantidade));
    }

    public Set<Produto> exibirProdutosPorNome() {
        Set<Produto> produtosPorNome = new TreeSet<>(produtoSet);
        return produtosPorNome;
    }

    public Set<Produto> exibirProdutosPorPreco() {
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtosPorPreco.addAll(produtoSet);
        return produtosPorPreco;
    }

    public static void main(String[] args) {
        CadastroDeProdutos cadastroDeProdutos = new CadastroDeProdutos();
        cadastroDeProdutos.adicionarProduto(1L, "Produto 5", 15d, 5);
        cadastroDeProdutos.adicionarProduto(2L, "Produto 0", 20d, 10);
        cadastroDeProdutos.adicionarProduto(1L, "Produto 3", 10d, 2);
        cadastroDeProdutos.adicionarProduto(9L, "Produto 9", 2d, 2);

        System.out.println(cadastroDeProdutos.produtoSet);

        System.out.println(cadastroDeProdutos.exibirProdutosPorNome());

        System.out.println(cadastroDeProdutos.exibirProdutosPorPreco());
    }

}



