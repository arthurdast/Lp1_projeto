/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicação.gui;

import aplicação.dados.Estoque;
import javax.swing.JOptionPane;

/**
 *
 * @author Grupo
 */
public class Main extends javax.swing.JFrame {

    

    /**
     * Creates new form Main
     */
    public Main() {
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

        Tela_Principal = new javax.swing.JDesktopPane();
        Botao_Consulta_Produto = new javax.swing.JButton();
        Botao_Edita_Produto = new javax.swing.JButton();
        Botao_Cadastra_Produto = new javax.swing.JButton();
        Menu_Titulo = new javax.swing.JLabel();
        Menu_Principal = new javax.swing.JMenuBar();
        Menu_Produtos = new javax.swing.JMenu();
        Menu_Cadastra_Produtos = new javax.swing.JMenuItem();
        Menu_Consulta_Produto = new javax.swing.JMenuItem();
        Menu_Edita_Produto = new javax.swing.JMenuItem();
        Menu_Sair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de Produtos");

        Tela_Principal.setBackground(new java.awt.Color(204, 204, 204));

        Botao_Consulta_Produto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplicação/gui/icones/ico_search.png"))); // NOI18N
        Botao_Consulta_Produto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao_Consulta_ProdutoActionPerformed(evt);
            }
        });

        Botao_Edita_Produto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplicação/gui/icones/ico_edit.png"))); // NOI18N
        Botao_Edita_Produto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao_Edita_ProdutoActionPerformed(evt);
            }
        });

        Botao_Cadastra_Produto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplicação/gui/icones/ico_add.png"))); // NOI18N
        Botao_Cadastra_Produto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao_Cadastra_ProdutoActionPerformed(evt);
            }
        });

        Menu_Titulo.setBackground(new java.awt.Color(204, 204, 204));
        Menu_Titulo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Menu_Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Menu_Titulo.setText("Bem Vindo! Selecione Sua Opção");
        Menu_Titulo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Menu_Titulo.setOpaque(true);

        Tela_Principal.setLayer(Botao_Consulta_Produto, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Tela_Principal.setLayer(Botao_Edita_Produto, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Tela_Principal.setLayer(Botao_Cadastra_Produto, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Tela_Principal.setLayer(Menu_Titulo, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout Tela_PrincipalLayout = new javax.swing.GroupLayout(Tela_Principal);
        Tela_Principal.setLayout(Tela_PrincipalLayout);
        Tela_PrincipalLayout.setHorizontalGroup(
            Tela_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Tela_PrincipalLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(Botao_Cadastra_Produto, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(228, 228, 228)
                .addComponent(Botao_Consulta_Produto, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Botao_Edita_Produto, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
            .addGroup(Tela_PrincipalLayout.createSequentialGroup()
                .addGap(178, 178, 178)
                .addComponent(Menu_Titulo, javax.swing.GroupLayout.DEFAULT_SIZE, 620, Short.MAX_VALUE)
                .addGap(178, 178, 178))
        );
        Tela_PrincipalLayout.setVerticalGroup(
            Tela_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Tela_PrincipalLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(Menu_Titulo, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                .addGap(300, 300, 300)
                .addGroup(Tela_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Botao_Edita_Produto, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Botao_Consulta_Produto, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Botao_Cadastra_Produto, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40))
        );

        Menu_Produtos.setText("Produto");
        Menu_Produtos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menu_ProdutosActionPerformed(evt);
            }
        });

        Menu_Cadastra_Produtos.setText("Cadastrar Produto");
        Menu_Cadastra_Produtos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menu_Cadastra_ProdutosActionPerformed(evt);
            }
        });
        Menu_Produtos.add(Menu_Cadastra_Produtos);

        Menu_Consulta_Produto.setText("Consultar Produto");
        Menu_Consulta_Produto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menu_Consulta_ProdutoActionPerformed(evt);
            }
        });
        Menu_Produtos.add(Menu_Consulta_Produto);

        Menu_Edita_Produto.setText("Editar Produto");
        Menu_Edita_Produto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menu_Edita_ProdutoActionPerformed(evt);
            }
        });
        Menu_Produtos.add(Menu_Edita_Produto);

        Menu_Sair.setText("Sair");
        Menu_Produtos.add(Menu_Sair);

        Menu_Principal.add(Menu_Produtos);

        setJMenuBar(Menu_Principal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Tela_Principal)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Tela_Principal)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void abrir_cadastraProduto() {
        Cadastra_Produto frame = new Cadastra_Produto();
        Tela_Principal.add(frame);
        frame.setVisible(true);
    }

    private void abrir_consultaProduto() {
        Consulta_Produto frame = new Consulta_Produto();
        Tela_Principal.add(frame);
        frame.setVisible(true);
    }

    private void abrir_detalhesProduto() {
        Detalhes_Produto frame = new Detalhes_Produto(Integer.parseInt(JOptionPane.showInputDialog("Entre com o código do produto a ser editado:")));
        Tela_Principal.add(frame);
        frame.setVisible(true);
    }

    private void Menu_Consulta_ProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menu_Consulta_ProdutoActionPerformed
        abrir_consultaProduto();
    }//GEN-LAST:event_Menu_Consulta_ProdutoActionPerformed

    private void Botao_Cadastra_ProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao_Cadastra_ProdutoActionPerformed
        abrir_cadastraProduto();
    }//GEN-LAST:event_Botao_Cadastra_ProdutoActionPerformed

    private void Menu_Cadastra_ProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menu_Cadastra_ProdutosActionPerformed
        abrir_cadastraProduto();
    }//GEN-LAST:event_Menu_Cadastra_ProdutosActionPerformed

    private void Botao_Consulta_ProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao_Consulta_ProdutoActionPerformed
        abrir_consultaProduto();
    }//GEN-LAST:event_Botao_Consulta_ProdutoActionPerformed

    private void Botao_Edita_ProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao_Edita_ProdutoActionPerformed
        abrir_detalhesProduto();
    }//GEN-LAST:event_Botao_Edita_ProdutoActionPerformed

    private void Menu_Edita_ProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menu_Edita_ProdutoActionPerformed
        abrir_detalhesProduto();
    }//GEN-LAST:event_Menu_Edita_ProdutoActionPerformed

    private void Menu_ProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menu_ProdutosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Menu_ProdutosActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Botao_Cadastra_Produto;
    private javax.swing.JButton Botao_Consulta_Produto;
    private javax.swing.JButton Botao_Edita_Produto;
    private javax.swing.JMenuItem Menu_Cadastra_Produtos;
    private javax.swing.JMenuItem Menu_Consulta_Produto;
    private javax.swing.JMenuItem Menu_Edita_Produto;
    private javax.swing.JMenuBar Menu_Principal;
    private javax.swing.JMenu Menu_Produtos;
    private javax.swing.JMenuItem Menu_Sair;
    private javax.swing.JLabel Menu_Titulo;
    protected static javax.swing.JDesktopPane Tela_Principal;
    // End of variables declaration//GEN-END:variables
}
