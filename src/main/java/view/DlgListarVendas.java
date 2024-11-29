/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package view;

import control.ClienteAbstractTableModel;
import control.GerenciadorInterGrafica;
import control.TipoServicoAbstractTableModel;
import control.VendaAbstractTableModel;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import model.Cliente;
import model.TipoServico;
import model.Venda;
import org.hibernate.HibernateException;

/**
 *
 * @author thais
 */
public class DlgListarVendas extends javax.swing.JDialog {

    private Venda vendaSelecionada = null;
    
    private VendaAbstractTableModel vendaTableModel;
    
    public DlgListarVendas(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        vendaTableModel = new VendaAbstractTableModel();
        tabelaVendas.setModel(vendaTableModel);

        List<Venda> lista;
        try {
            lista = GerenciadorInterGrafica.getInstance().getGerenciadorDominio().listar(Venda.class);
            if(lista.isEmpty()){
                JOptionPane.showMessageDialog(this,"Lista de Venda vazia.", "Insira alguma Venda primeiro", JOptionPane.INFORMATION_MESSAGE);                
            }
            vendaTableModel.setLista(lista);

        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(this,"Erro ao pesquisar. " + ex.getMessage(), "Pesquisar Venda", JOptionPane.ERROR_MESSAGE);
        }
        
        TableRowSorter<TableModel> sorter;
        sorter = new TableRowSorter<TableModel>(tabelaVendas.getModel() );
        tabelaVendas.setRowSorter(sorter);
    }

    public Venda getVendaSelecionada() {
        return vendaSelecionada;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        cbTipo = new javax.swing.JComboBox<>();
        pesquisar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaVendas = new javax.swing.JTable();
        txtPesq = new javax.swing.JTextField();
        btnCadastrar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(180, 206, 195));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        cbTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dia Servico", "Forma de Pagamento" }));

        pesquisar.setBackground(new java.awt.Color(41, 115, 84));
        pesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/16x16/procurar (1).png"))); // NOI18N
        pesquisar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        pesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisarActionPerformed(evt);
            }
        });

        tabelaVendas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tabelaVendas);

        txtPesq.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(6, 92, 56), 1, true));

        btnCadastrar.setBackground(new java.awt.Color(41, 115, 84));
        btnCadastrar.setForeground(new java.awt.Color(255, 255, 255));
        btnCadastrar.setText("Cadastrar");
        btnCadastrar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        btnCancelar.setBackground(new java.awt.Color(41, 115, 84));
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("Cancelar");
        btnCancelar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnExcluir.setBackground(new java.awt.Color(41, 115, 84));
        btnExcluir.setForeground(new java.awt.Color(255, 255, 255));
        btnExcluir.setText("Excluir");
        btnExcluir.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnEditar.setBackground(new java.awt.Color(41, 115, 84));
        btnEditar.setForeground(new java.awt.Color(255, 255, 255));
        btnEditar.setText("Selecionar");
        btnEditar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 802, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(18, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPesq)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(256, 256, 256))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtPesq, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnCadastrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 830, 280));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        GerenciadorInterGrafica.getInstance().abrirVenda();
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        int linha = tabelaVendas.getSelectedRow();
        if ( linha >= 0 ) {
            linha = tabelaVendas.convertRowIndexToModel(linha);
            vendaSelecionada = vendaTableModel.getVenda(linha);
            this.setVisible(false);
        } else {
            JOptionPane.showMessageDialog(this,"Selecione uma linha da tabela.", "Pesquisar Venda", JOptionPane.ERROR_MESSAGE);
            
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void pesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisarActionPerformed
        String pesq = txtPesq.getText();
        int tipo = cbTipo.getSelectedIndex();
        List<Venda> lista;
        
        try {
            lista = GerenciadorInterGrafica.getInstance().getGerenciadorDominio().pesquisarVenda(tipo, pesq);
            if ( lista.isEmpty() ) {
                JOptionPane.showMessageDialog(this,"Venda não encontrada.", "Pesquisar Venda", JOptionPane.INFORMATION_MESSAGE);
            } 
            vendaTableModel.setLista(lista);
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(this,"Erro ao pesquisar. " + ex.getMessage(), "Pesquisar Venda", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_pesquisarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        int linha = tabelaVendas.getSelectedRow();
        if ( linha >= 0 ) {
            
            if ( JOptionPane.showConfirmDialog(this, "Deseja realmente excluir?", "Excluir Venda", JOptionPane.YES_NO_OPTION ) == JOptionPane.YES_OPTION ) {
                
                linha = tabelaVendas.convertRowIndexToModel(linha);
                Venda venda = vendaTableModel.getVenda(linha);
                try {                
                    GerenciadorInterGrafica.getInstance().getGerenciadorDominio().excluir(venda);
                } catch (HibernateException ex) {
                    JOptionPane.showMessageDialog(this,"Erro ao excluir Venda. " + ex.getMessage(), "Pesquisar Venda", JOptionPane.ERROR_MESSAGE);
                } 
                
                vendaTableModel.remover(linha);            
            }
             
        } else {
            JOptionPane.showMessageDialog(this,"Selecione uma linha da tabela.", "Pesquisar Venda", JOptionPane.ERROR_MESSAGE);
            
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        txtPesq.setText("");
        setVisible(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

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
            java.util.logging.Logger.getLogger(DlgListarVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DlgListarVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DlgListarVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DlgListarVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DlgListarVendas dialog = new DlgListarVendas(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JComboBox<String> cbTipo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton pesquisar;
    private javax.swing.JTable tabelaVendas;
    private javax.swing.JTextField txtPesq;
    // End of variables declaration//GEN-END:variables
}
