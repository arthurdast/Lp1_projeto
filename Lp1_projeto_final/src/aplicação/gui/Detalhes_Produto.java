/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicação.gui;

import aplicação.ferramentas.ManipularImagem;
import aplicação.dados.Produto;
import aplicação.dados.Estoque;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import java.text.DecimalFormat;

/**
 *
 * @author aluno
 */
public class Detalhes_Produto extends javax.swing.JInternalFrame {

    /**
     * Creates new form Janela_Cadastra_Produto
     */
    public Detalhes_Produto() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Janela_Cadastra_Produto = new javax.swing.JInternalFrame();
        Painel_Principal = new javax.swing.JPanel();
        T_Codigo = new javax.swing.JLabel();
        T_Nome = new javax.swing.JLabel();
        T_Quantidade = new javax.swing.JLabel();
        T_Unidade = new javax.swing.JLabel();
        T_Preco_Venda = new javax.swing.JLabel();
        T_Preco_Custo = new javax.swing.JLabel();
        T_Secao2 = new javax.swing.JLabel();
        Salvar = new javax.swing.JButton();
        Cancelar = new javax.swing.JButton();
        Imagem = new javax.swing.JLabel();
        Codigo = new javax.swing.JLabel();
        Nome = new javax.swing.JLabel();
        Quantidade = new javax.swing.JLabel();
        Unidade = new javax.swing.JLabel();
        Secao = new javax.swing.JLabel();
        P_Venda = new javax.swing.JLabel();
        P_Custo = new javax.swing.JLabel();

        Janela_Cadastra_Produto.setVisible(true);

        javax.swing.GroupLayout Janela_Cadastra_ProdutoLayout = new javax.swing.GroupLayout(Janela_Cadastra_Produto.getContentPane());
        Janela_Cadastra_Produto.getContentPane().setLayout(Janela_Cadastra_ProdutoLayout);
        Janela_Cadastra_ProdutoLayout.setHorizontalGroup(
            Janela_Cadastra_ProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        Janela_Cadastra_ProdutoLayout.setVerticalGroup(
            Janela_Cadastra_ProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        setClosable(true);
        setTitle("Detalhes de Produto");

        T_Codigo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        T_Codigo.setText("Código:");

        T_Nome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        T_Nome.setText("Nome:");

        T_Quantidade.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        T_Quantidade.setText("Quantidade:");

        T_Unidade.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        T_Unidade.setText("Unidade:");

        T_Preco_Venda.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        T_Preco_Venda.setText("Preço de Venda: R$");

        T_Preco_Custo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        T_Preco_Custo.setText("Preço de Custo: R$");

        T_Secao2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        T_Secao2.setText("Seção:");

        Salvar.setText("Editar");

        Cancelar.setText("Cancelar");

        Imagem.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout Painel_PrincipalLayout = new javax.swing.GroupLayout(Painel_Principal);
        Painel_Principal.setLayout(Painel_PrincipalLayout);
        Painel_PrincipalLayout.setHorizontalGroup(
            Painel_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Painel_PrincipalLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(Painel_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Painel_PrincipalLayout.createSequentialGroup()
                        .addComponent(T_Preco_Venda)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(P_Venda))
                    .addGroup(Painel_PrincipalLayout.createSequentialGroup()
                        .addComponent(T_Preco_Custo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(P_Custo))
                    .addGroup(Painel_PrincipalLayout.createSequentialGroup()
                        .addComponent(T_Secao2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Secao))
                    .addGroup(Painel_PrincipalLayout.createSequentialGroup()
                        .addComponent(T_Unidade)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Unidade))
                    .addGroup(Painel_PrincipalLayout.createSequentialGroup()
                        .addComponent(T_Quantidade)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Quantidade))
                    .addGroup(Painel_PrincipalLayout.createSequentialGroup()
                        .addComponent(T_Nome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Nome))
                    .addGroup(Painel_PrincipalLayout.createSequentialGroup()
                        .addComponent(T_Codigo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Codigo)))
                .addGap(18, 205, Short.MAX_VALUE)
                .addGroup(Painel_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Imagem, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(Painel_PrincipalLayout.createSequentialGroup()
                        .addComponent(Salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Cancelar)))
                .addContainerGap())
        );
        Painel_PrincipalLayout.setVerticalGroup(
            Painel_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Painel_PrincipalLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(Painel_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Imagem, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(Painel_PrincipalLayout.createSequentialGroup()
                        .addGroup(Painel_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(T_Codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Codigo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(Painel_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(T_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Nome))
                        .addGap(18, 18, 18)
                        .addGroup(Painel_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(T_Quantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Quantidade))
                        .addGap(18, 18, 18)
                        .addGroup(Painel_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(T_Unidade, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Unidade))
                        .addGap(18, 18, 18)
                        .addGroup(Painel_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(T_Secao2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Secao))))
                .addGap(18, 18, 18)
                .addGroup(Painel_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(T_Preco_Custo, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P_Custo))
                .addGroup(Painel_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Painel_PrincipalLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                        .addGroup(Painel_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Cancelar)
                            .addComponent(Salvar))
                        .addGap(20, 20, 20))
                    .addGroup(Painel_PrincipalLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(Painel_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(T_Preco_Venda, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(P_Venda))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Painel_Principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Painel_Principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        iniciaDetalhes();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void iniciaDetalhes(){
        int i, codigo = Integer.parseInt(JOptionPane.showInputDialog("Entre com o código do produto desejado:"));
        DecimalFormat d = new DecimalFormat("0.00");
        estoque.carregarDados(estoque.getLista());
        for(i=0;i<estoque.getQuantidade();i++){
            if(estoque.getProduto(i).getCodigo()==codigo){
                Codigo.setText(String.valueOf(estoque.getProduto(i).getCodigo()));
                Nome.setText(estoque.getProduto(i).getNome());
                Quantidade.setText(String.valueOf(estoque.getProduto(i).getQuantidade()));
                Unidade.setText(estoque.getProduto(i).getUnidade());
                Secao.setText(String.valueOf(estoque.getProduto(i).getSecao()));
                P_Custo.setText(d.format(estoque.getProduto(i).getCusto()));
                P_Venda.setText(d.format(estoque.getProduto(i).getPreco()));
            }
        } 
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cancelar;
    private javax.swing.JLabel Codigo;
    private javax.swing.JLabel Imagem;
    private javax.swing.JInternalFrame Janela_Cadastra_Produto;
    private javax.swing.JLabel Nome;
    private javax.swing.JLabel P_Custo;
    private javax.swing.JLabel P_Venda;
    private javax.swing.JPanel Painel_Principal;
    private javax.swing.JLabel Quantidade;
    private javax.swing.JButton Salvar;
    private javax.swing.JLabel Secao;
    private javax.swing.JLabel T_Codigo;
    private javax.swing.JLabel T_Nome;
    private javax.swing.JLabel T_Preco_Custo;
    private javax.swing.JLabel T_Preco_Venda;
    private javax.swing.JLabel T_Quantidade;
    private javax.swing.JLabel T_Secao2;
    private javax.swing.JLabel T_Unidade;
    private javax.swing.JLabel Unidade;
    // End of variables declaration//GEN-END:variables
    private Estoque estoque;
}
