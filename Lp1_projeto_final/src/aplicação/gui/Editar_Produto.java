/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicação.gui;

import aplicação.ferramentas.ManipularImagem;
import aplicação.dados.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.Collections;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class Editar_Produto extends javax.swing.JInternalFrame {

    /**
     * Creates new form Janela_Cadastra_Produto
     *
     * @param codigo
     */
    public Editar_Produto(int codigo) {
        this.codigo = codigo;
        initComponents();
        iniciaDetalhes(codigo);
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
        Codigo = new javax.swing.JFormattedTextField();
        Nome = new javax.swing.JFormattedTextField();
        Venda = new javax.swing.JFormattedTextField();
        Quantidade = new javax.swing.JFormattedTextField();
        Custo = new javax.swing.JFormattedTextField();
        Unidade = new javax.swing.JComboBox<>();
        Secao = new javax.swing.JComboBox<>();
        Salvar = new javax.swing.JButton();
        Cancelar = new javax.swing.JButton();
        Selecionar_Imagem = new javax.swing.JButton();
        Imagem = new javax.swing.JLabel();

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
        setTitle("Editar Produto");

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

        Nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NomeActionPerformed(evt);
            }
        });

        Unidade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nenhum", "Ud (Unidade)", "Kg (Quilograma)", "g (Gramas)", "mg (Miligramas)", "L (Litro)", "mL (Mililitro)", "m (Metro)", "m² (Metro Quadrado)" }));
        Unidade.setSelectedItem(null);

        Secao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nenhum", "Bazar", "Bebida", "Biscoito", "Bomboniere", "Café & Cia", "Carnes", "Chá", "Congelado", "Diet & Light", "Feira", "Flores", "Frios e Laticínios", "Higiene e Perfumaria", "Leite & Iogurte", "Limpeza", "Massa", "Mercearia", "Mercearia Doce", "Molho & Condimento", "Orgânicos", "Padaria", "Pet Shop", "Vinho & Espumante e Cervejas Especiais" }));
        Secao.setSelectedItem(null);

        Salvar.setText("Salvar");
        Salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalvarActionPerformed(evt);
            }
        });

        Cancelar.setText("Cancelar");
        Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarActionPerformed(evt);
            }
        });

        Selecionar_Imagem.setText("Selecionar Imagem");
        Selecionar_Imagem.setAlignmentX(0.5F);
        Selecionar_Imagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Selecionar_ImagemActionPerformed(evt);
            }
        });

        Imagem.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout Painel_PrincipalLayout = new javax.swing.GroupLayout(Painel_Principal);
        Painel_Principal.setLayout(Painel_PrincipalLayout);
        Painel_PrincipalLayout.setHorizontalGroup(
            Painel_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Painel_PrincipalLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(Painel_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Painel_PrincipalLayout.createSequentialGroup()
                        .addComponent(T_Secao2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Secao, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(Painel_PrincipalLayout.createSequentialGroup()
                        .addComponent(T_Preco_Venda)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Venda))
                    .addGroup(Painel_PrincipalLayout.createSequentialGroup()
                        .addComponent(T_Nome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Nome))
                    .addGroup(Painel_PrincipalLayout.createSequentialGroup()
                        .addComponent(T_Codigo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Codigo))
                    .addGroup(Painel_PrincipalLayout.createSequentialGroup()
                        .addComponent(T_Quantidade)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Quantidade))
                    .addGroup(Painel_PrincipalLayout.createSequentialGroup()
                        .addComponent(T_Unidade)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Unidade, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(Painel_PrincipalLayout.createSequentialGroup()
                        .addComponent(T_Preco_Custo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Custo)))
                .addGap(18, 18, 18)
                .addGroup(Painel_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Selecionar_Imagem, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Painel_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Imagem, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(Painel_PrincipalLayout.createSequentialGroup()
                            .addComponent(Salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(Cancelar))))
                .addContainerGap())
        );
        Painel_PrincipalLayout.setVerticalGroup(
            Painel_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Painel_PrincipalLayout.createSequentialGroup()
                .addGroup(Painel_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Painel_PrincipalLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(Painel_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(T_Codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(Painel_PrincipalLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Selecionar_Imagem)))
                .addGroup(Painel_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Painel_PrincipalLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(Painel_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(T_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(Painel_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(T_Quantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Quantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(Painel_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(T_Unidade, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Unidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addGroup(Painel_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(T_Secao2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Secao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(Painel_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(T_Preco_Custo, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Custo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(Painel_PrincipalLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(Imagem, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(Painel_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(T_Preco_Venda, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Venda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cancelar)
                    .addComponent(Salvar))
                .addGap(20, 20, 20))
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

    public void iniciaDetalhes(int codigo) {

        for (Produto p : estoque.getLista()) {
            if (p.getCodigo() == codigo) {
                System.out.println("");
                Codigo.setText(String.valueOf(p.getCodigo()));
                Nome.setText(p.getNome());
                Custo.setText(Double.toString(p.getCusto()));
                Venda.setText(Double.toString(p.getPreco()));
                Quantidade.setText(String.valueOf(p.getQuantidade()));
                try {
                    ManipularImagem.exibiImagemLabel(p.getImagem(), Imagem);
                } catch (Exception e) {
                }

            }
        }
    }

    private boolean existeNaLista(int cod) {
        for (Produto produto : estoque.getLista()) {
            if (produto.getCodigo() == cod) {
                return true;
            }
        }
        return false;
    }

    private void Selecionar_ImagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Selecionar_ImagemActionPerformed
        JFileChooser fc = new JFileChooser();
        int res = fc.showOpenDialog(null);
        if (res == JFileChooser.APPROVE_OPTION) {
            File arquivo = fc.getSelectedFile();
            try {
                imagem = ManipularImagem.setImagemDimensao(arquivo.getAbsolutePath(), 160, 160);
                Imagem.setIcon(new ImageIcon(imagem));
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(rootPane, "Arquivo Inválido");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Voce nao selecionou nenhum arquivo.");
        }
    }//GEN-LAST:event_Selecionar_ImagemActionPerformed

    private void fecha_Janela() {
        this.dispose();
    }

    private void SalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalvarActionPerformed

        if (Secao.getSelectedItem() != null && Unidade.getSelectedItem() != null) {
            try {
                if (!existeNaLista(Integer.parseInt(Codigo.getText())) || codigo == Integer.parseInt(Codigo.getText())) {
                    for (Produto p : estoque.getLista()) {
                        if (p.getCodigo() == codigo) {
                            p.setCodigo(Integer.parseInt(Codigo.getText()));
                            p.setNome(Nome.getText());
                            p.setCusto(Double.parseDouble(Custo.getText()));
                            p.setPreco(Double.parseDouble(Venda.getText()));
                            p.setSecao(String.valueOf(Secao.getSelectedItem()));
                            p.setUnidade(String.valueOf(Unidade.getSelectedItem()));
                            p.setImagem(ManipularImagem.getImgBytes(imagem));
                            p.setQuantidade(Integer.parseInt(Quantidade.getText()));
                            //Collections.sort(estoque.getLista());
                            estoque.salvarDados(); // att o arquivo txt
                            fecha_Janela();
                            JOptionPane.showMessageDialog(rootPane, "Produto editado", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                            break;
                        }
                    }
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Código ja cadastrado", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(rootPane, "Porfavor digitar só números no campo de código", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Seção ou unidade vazia.", "Aviso", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_SalvarActionPerformed

    private void CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarActionPerformed
        fecha_Janela();
    }//GEN-LAST:event_CancelarActionPerformed

    private void NomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NomeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cancelar;
    private javax.swing.JFormattedTextField Codigo;
    private javax.swing.JFormattedTextField Custo;
    private javax.swing.JLabel Imagem;
    private javax.swing.JInternalFrame Janela_Cadastra_Produto;
    private javax.swing.JFormattedTextField Nome;
    private javax.swing.JPanel Painel_Principal;
    private javax.swing.JFormattedTextField Quantidade;
    private javax.swing.JButton Salvar;
    private javax.swing.JComboBox<String> Secao;
    private javax.swing.JButton Selecionar_Imagem;
    private javax.swing.JLabel T_Codigo;
    private javax.swing.JLabel T_Nome;
    private javax.swing.JLabel T_Preco_Custo;
    private javax.swing.JLabel T_Preco_Venda;
    private javax.swing.JLabel T_Quantidade;
    private javax.swing.JLabel T_Secao2;
    private javax.swing.JLabel T_Unidade;
    private javax.swing.JComboBox<String> Unidade;
    private javax.swing.JFormattedTextField Venda;
    // End of variables declaration//GEN-END:variables
    private BufferedImage imagem;
    private Estoque estoque = new Estoque();
    private int codigo;
}
