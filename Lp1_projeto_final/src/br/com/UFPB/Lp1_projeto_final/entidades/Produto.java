package br.com.UFPB.Lp1_projeto_final.entidades;

import java.awt.image.BufferedImage;

/**
 *
 * @author arthur
 */
public class Produto {
    
    private int cod_produto;
    private String nome;
    private String secao;
    private String unidade;
    private int estoque;
    private double precoCusto;
    private double precoVenda;
    private BufferedImage imagem;

    public Produto(int cod_produto, String nome, String secao, String unidade, int estoque, double precoCusto, double precoVenda, BufferedImage imagem) {
        this.cod_produto = cod_produto;
        this.nome = nome;
        this.secao = secao;
        this.unidade = unidade;
        this.estoque = estoque;
        this.precoCusto = precoCusto;
        this.precoVenda = precoVenda;
        this.imagem = imagem;
    }  
     public void alterarProduto(int cod_produto, String nome, String secao, String unidade, int estoque, double precoCusto, double precoVenda, BufferedImage imagem) {
        this.cod_produto = cod_produto;
        this.nome = nome;
        this.secao = secao;
        this.unidade = unidade;
        this.estoque = estoque;
        this.precoCusto = precoCusto;
        this.precoVenda = precoVenda;
        this.imagem = imagem;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public String getNome() {
        return nome;
    }

    public String getSecao() {
        return secao;
    }

    public String getUnidade() {
        return unidade;
    }
}