/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicação.gui;

import aplicação.dados.Estoque;
import aplicação.dados.Produto;
import aplicação.ferramentas.ManipularImagem;
import java.text.DecimalFormat;
import javax.swing.ImageIcon;
import static aplicação.gui.Main.Tela_Principal;
import aplicação.gui.Main;
import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class Detalhes_Produto extends javax.swing.JInternalFrame {

    /**
     * Creates new form Janela_Cadastra_Produto
     */
    public Detalhes_Produto(int codigo) {
        this.codigo = codigo;
        initComponents();
        iniciaDetalhes(codigo);
    }

    public void iniciaDetalhes(int codigo) {
        DecimalFormat d = new DecimalFormat("0.00");        
        for (Produto p : estoque.getLista()) {
            if (p.getCodigo() == codigo) {
                LabelCodigo.setText(String.valueOf(p.getCodigo()));
                LabelNome.setText(p.getNome());
                LabelSecao.setText(p.getSecao());
                LabelUnidade.setText(p.getUnidade());
                LabelCusto.setText(Double.toString(p.getCusto()));
                LabelVenda.setText(Double.toString(p.getPreco()));
                LabelQuantidade.setText(String.valueOf(p.getQuantidade()));
                try {
                    ManipularImagem.exibiImagemLabel(p.getImagem(), LabelImagem);
                } catch (Exception e) {
                    System.out.println("erro reden image");
                }
                
            }
        }
    }

    private void abrir_EditarProduto(int codigo) {
        Editar_Produto frame = new Editar_Produto(codigo);
        Tela_Principal.add(frame);
        frame.setVisible(true);
        this.dispose();
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
        Excluir = new javax.swing.JButton();
        LabelImagem = new javax.swing.JLabel();
        Codigo = new javax.swing.JLabel();
        Nome = new javax.swing.JLabel();
        Quantidade = new javax.swing.JLabel();
        Unidade = new javax.swing.JLabel();
        Secao = new javax.swing.JLabel();
        P_Venda = new javax.swing.JLabel();
        P_Custo = new javax.swing.JLabel();
        LabelCodigo = new javax.swing.JLabel();
        LabelNome = new javax.swing.JLabel();
        LabelQuantidade = new javax.swing.JLabel();
        LabelUnidade = new javax.swing.JLabel();
        LabelSecao = new javax.swing.JLabel();
        LabelCusto = new javax.swing.JLabel();
        LabelVenda = new javax.swing.JLabel();

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
        Salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalvarActionPerformed(evt);
            }
        });

        Excluir.setText("Excluir");
        Excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExcluirActionPerformed(evt);
            }
        });

        LabelImagem.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout Painel_PrincipalLayout = new javax.swing.GroupLayout(Painel_Principal);
        Painel_Principal.setLayout(Painel_PrincipalLayout);
        Painel_PrincipalLayout.setHorizontalGroup(
            Painel_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Painel_PrincipalLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(Painel_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(Painel_PrincipalLayout.createSequentialGroup()
                        .addComponent(T_Secao2)
                        .addGroup(Painel_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Painel_PrincipalLayout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(Secao))
                            .addGroup(Painel_PrincipalLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LabelSecao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(Painel_PrincipalLayout.createSequentialGroup()
                        .addComponent(T_Unidade)
                        .addGroup(Painel_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Painel_PrincipalLayout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(Unidade))
                            .addGroup(Painel_PrincipalLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LabelUnidade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(Painel_PrincipalLayout.createSequentialGroup()
                        .addComponent(T_Quantidade)
                        .addGroup(Painel_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Painel_PrincipalLayout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(Quantidade))
                            .addGroup(Painel_PrincipalLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LabelQuantidade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(Painel_PrincipalLayout.createSequentialGroup()
                        .addComponent(T_Nome)
                        .addGroup(Painel_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Painel_PrincipalLayout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(Nome))
                            .addGroup(Painel_PrincipalLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LabelNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(Painel_PrincipalLayout.createSequentialGroup()
                        .addComponent(T_Codigo)
                        .addGroup(Painel_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Painel_PrincipalLayout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(Codigo))
                            .addGroup(Painel_PrincipalLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LabelCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Painel_PrincipalLayout.createSequentialGroup()
                        .addGroup(Painel_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(Painel_PrincipalLayout.createSequentialGroup()
                                .addComponent(T_Preco_Venda)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LabelVenda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Painel_PrincipalLayout.createSequentialGroup()
                                .addComponent(T_Preco_Custo)
                                .addGroup(Painel_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(Painel_PrincipalLayout.createSequentialGroup()
                                        .addGap(46, 46, 46)
                                        .addComponent(P_Custo))
                                    .addGroup(Painel_PrincipalLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(LabelCusto, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(P_Venda)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(Painel_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelImagem, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Excluir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Salvar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        Painel_PrincipalLayout.setVerticalGroup(
            Painel_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Painel_PrincipalLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(Painel_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(Painel_PrincipalLayout.createSequentialGroup()
                        .addGroup(Painel_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(T_Codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Codigo)
                            .addComponent(LabelCodigo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(Painel_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(T_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Nome)
                            .addComponent(LabelNome))
                        .addGap(18, 18, 18)
                        .addGroup(Painel_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(T_Quantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Quantidade)
                            .addComponent(LabelQuantidade))
                        .addGap(18, 18, 18)
                        .addGroup(Painel_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(T_Unidade, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Unidade)
                            .addComponent(LabelUnidade))
                        .addGap(18, 18, 18)
                        .addGroup(Painel_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(T_Secao2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Secao)
                            .addComponent(LabelSecao)))
                    .addComponent(LabelImagem, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(Painel_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(T_Preco_Custo, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P_Custo)
                    .addComponent(Salvar)
                    .addComponent(LabelCusto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Painel_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Painel_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(T_Preco_Venda, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(P_Venda)
                        .addComponent(LabelVenda))
                    .addComponent(Excluir))
                .addContainerGap(46, Short.MAX_VALUE))
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

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalvarActionPerformed
        abrir_EditarProduto(codigo);
    }//GEN-LAST:event_SalvarActionPerformed

    private void ExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExcluirActionPerformed

        for (Produto p : estoque.getLista()) {
            if (p.getCodigo() == codigo) {
                this.dispose();
                estoque.getLista().remove(p);
                estoque.salvarDados();
                return;

            }
        }
        JOptionPane.showMessageDialog(null, "Codigo não encontrado");

    }//GEN-LAST:event_ExcluirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Codigo;
    private javax.swing.JButton Excluir;
    private javax.swing.JInternalFrame Janela_Cadastra_Produto;
    private javax.swing.JLabel LabelCodigo;
    private javax.swing.JLabel LabelCusto;
    private javax.swing.JLabel LabelImagem;
    private javax.swing.JLabel LabelNome;
    private javax.swing.JLabel LabelQuantidade;
    private javax.swing.JLabel LabelSecao;
    private javax.swing.JLabel LabelUnidade;
    private javax.swing.JLabel LabelVenda;
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
    private Estoque estoque = new Estoque();
    private int codigo;
}
