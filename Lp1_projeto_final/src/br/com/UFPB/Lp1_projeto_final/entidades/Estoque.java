package br.com.UFPB.Lp1_projeto_final.entidades;

import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author arthur
 */

public class Estoque {
    
    List<Produto> estoque ;

    public Estoque() {
        estoque = new ArrayList<>();
    }
    
    public void cadastrarProduto(int cod_produto, String nome, String secao, String unidade, int estoque, double precoCusto, double precoVenda, BufferedImage imagem){    
        Produto produto = new Produto(cod_produto,nome,secao,unidade,estoque,precoCusto,precoVenda,imagem);  
        this.estoque.add(produto);
  
    }
    
    public void deletarProduto(int i){
        this.estoque.remove(i);
    
    }

    public List<Produto> getEstoque() {
        return estoque;
    }
    
    
    
    
    
    
    
    
}