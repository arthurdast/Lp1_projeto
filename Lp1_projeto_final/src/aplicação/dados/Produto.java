package aplicação.dados;

import java.io.Serializable;

public class Produto implements Serializable { //Classe com os atributos das especificações com metodos get/set e construtor padrões

    private int codigo;
    private String nome;
    private int quantidade;
    private double custo;
    private double preco;
    private String secao;
    private String unidade;
    private byte[] imagem;

    public Produto(int codigo, String nome, String unidade, String secao, int quantidade, double custo, double preco, byte[] imagem) {
        this.codigo = codigo;
        this.nome = nome;
        this.quantidade = quantidade;
        this.custo = custo;
        this.preco = preco;
        this.secao = secao;
        this.unidade = unidade;
        this.imagem = imagem;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getCusto() {
        return custo;
    }

    public void setCusto(double custo) {
        this.custo = custo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getSecao() {
        return secao;
    }

    public void setSecao(String secao) {
        this.secao = secao;
    }

    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }

    public byte[] getImagem() {
        return imagem;
    }

    public void setImagem(byte[] imagem) {
        this.imagem = imagem;
    }

    @Override
    public String toString() {
        return "Produto{" + "codigo=" + codigo + ", nome=" + nome + ", quantidade=" + quantidade + ", custo=" + custo + ", preco=" + preco + ", secao=" + secao + ", unidade=" + unidade + ", imagem=" + imagem + '}';
    }

}
