/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package view;

import control.ClienteAbstractTableModel;
import control.GerenciadorInterGrafica;
import java.awt.Dimension;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import model.Cliente;
import org.hibernate.HibernateException;

public class DlgListarCliente extends javax.swing.JDialog {
    
    private Cliente cliSelecionado = null;
    private DlgCadCliente dlgCadCliente;
    private ClienteAbstractTableModel cliTableModel;

    public DlgListarCliente(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        cliTableModel = new ClienteAbstractTableModel();
        tabelaCliente.setModel(cliTableModel);
        
        List<Cliente> lista;

        try {
            lista = GerenciadorInterGrafica.getInstance().getGerenciadorDominio().listar(Cliente.class);
            if ( lista.isEmpty() ) {
                JOptionPane.showMessageDialog(this,"Lista de Cliente vazia.", "Insira algum cliente", JOptionPane.INFORMATION_MESSAGE);
            } 
            cliTableModel.setLista(lista);
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(this,"Erro ao pesquisar. " + ex.getMessage(), "Pesquisar cliente", JOptionPane.ERROR_MESSAGE);
        }
        
        TableRowSorter<TableModel> sorter;
        sorter = new TableRowSorter<TableModel>(tabelaCliente.getModel() );
        tabelaCliente.setRowSorter(sorter);
    }
    
    public Cliente getCliSelecionado() {
        return cliSelecionado;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtPesq = new javax.swing.JTextField();
        pesquisar = new javax.swing.JButton();
        btCadastrar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        cmbTipo = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaCliente = new javax.swing.JTable();
        btnCancelar1 = new javax.swing.JButton();
        btnSelecionar = new javax.swing.JButton();
        btnRelatorio = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(900, 390));
        setSize(new java.awt.Dimension(900, 390));
        addHierarchyBoundsListener(new java.awt.event.HierarchyBoundsListener() {
            public void ancestorMoved(java.awt.event.HierarchyEvent evt) {
            }
            public void ancestorResized(java.awt.event.HierarchyEvent evt) {
                formAncestorResized(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(180, 206, 195));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jPanel1.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                jPanel1ComponentAdded(evt);
            }
        });

        txtPesq.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(6, 92, 56), 1, true));

        pesquisar.setBackground(new java.awt.Color(41, 115, 84));
        pesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/16x16/procurar (1).png"))); // NOI18N
        pesquisar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        pesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisarActionPerformed(evt);
            }
        });

        btCadastrar.setBackground(new java.awt.Color(41, 115, 84));
        btCadastrar.setForeground(new java.awt.Color(255, 255, 255));
        btCadastrar.setText("Cadastrar");
        btCadastrar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btCadastrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btCadastrarMousePressed(evt);
            }
        });
        btCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarActionPerformed(evt);
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

        btnCancelar.setBackground(new java.awt.Color(41, 115, 84));
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("Cancelar");
        btnCancelar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        cmbTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nome", "CFP" }));

        tabelaCliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(6, 92, 56)));
        tabelaCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tabelaCliente);

        btnCancelar1.setBackground(new java.awt.Color(41, 115, 84));
        btnCancelar1.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar1.setText("Cancelar");
        btnCancelar1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btnCancelar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelar1MouseClicked(evt);
            }
        });
        btnCancelar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelar1ActionPerformed(evt);
            }
        });

        btnSelecionar.setBackground(new java.awt.Color(41, 115, 84));
        btnSelecionar.setForeground(new java.awt.Color(255, 255, 255));
        btnSelecionar.setText("Selecionar");
        btnSelecionar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btnSelecionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelecionarActionPerformed(evt);
            }
        });

        btnRelatorio.setBackground(new java.awt.Color(41, 115, 84));
        btnRelatorio.setForeground(new java.awt.Color(255, 255, 255));
        btnRelatorio.setText("Relatório");
        btnRelatorio.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btnRelatorio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRelatorioMouseClicked(evt);
            }
        });
        btnRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRelatorioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addComponent(btnSelecionar, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancelar1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnRelatorio, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(435, 435, 435)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 655, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addComponent(cmbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtPesq, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(pesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtPesq, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cmbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(pesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSelecionar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRelatorio, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 710, 300));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarActionPerformed
        GerenciadorInterGrafica.getInstance().abrirCadCliente();
    }//GEN-LAST:event_btCadastrarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        
        int linha = tabelaCliente.getSelectedRow();
        if ( linha >= 0 ) {
            
            if ( JOptionPane.showConfirmDialog(this, "Deseja realmente excluir?", "Excluir cliente", JOptionPane.YES_NO_OPTION ) == JOptionPane.YES_OPTION ) {
                
                linha = tabelaCliente.convertRowIndexToModel(linha);
                Cliente cli = cliTableModel.getCliente(linha);
                try {                
                    GerenciadorInterGrafica.getInstance().getGerenciadorDominio().excluir(cli);
                } catch (HibernateException ex) {
                    JOptionPane.showMessageDialog(this,"Erro ao excluir cliente. " + ex.getMessage(), "Pesquisar cliente", JOptionPane.ERROR_MESSAGE);
                } 
                
                cliTableModel.remover(linha);            
            }
             
        } else {
            JOptionPane.showMessageDialog(this,"Selecione uma linha da tabela.", "Pesquisar cliente", JOptionPane.ERROR_MESSAGE);
            
        }
                
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void jPanel1ComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_jPanel1ComponentAdded

    }//GEN-LAST:event_jPanel1ComponentAdded

    private void formAncestorResized(java.awt.event.HierarchyEvent evt) {//GEN-FIRST:event_formAncestorResized

    }//GEN-LAST:event_formAncestorResized

    private void btCadastrarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btCadastrarMousePressed

    }//GEN-LAST:event_btCadastrarMousePressed

    private void pesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisarActionPerformed
        
        String pesq = txtPesq.getText();
        int tipo = cmbTipo.getSelectedIndex();
        List<Cliente> lista;
        
        try {
            lista = GerenciadorInterGrafica.getInstance().getGerenciadorDominio().pesquisarCliente(tipo, pesq);
            if ( lista.isEmpty() ) {
                JOptionPane.showMessageDialog(this,"Cliente não encontrado.", "Pesquisar cliente", JOptionPane.INFORMATION_MESSAGE);
            } 
            cliTableModel.setLista(lista);
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(this,"Erro ao pesquisar. " + ex.getMessage(), "Pesquisar cliente", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_pesquisarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed

    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnCancelar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelar1MouseClicked

    }//GEN-LAST:event_btnCancelar1MouseClicked

    private void btnCancelar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelar1ActionPerformed
        txtPesq.setText( "" );        
        this.setVisible(false);
    }//GEN-LAST:event_btnCancelar1ActionPerformed

    private void btnSelecionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelecionarActionPerformed
        int linha = tabelaCliente.getSelectedRow();
        if ( linha >= 0 ) {
            linha = tabelaCliente.convertRowIndexToModel(linha);
            cliSelecionado = cliTableModel.getCliente(linha);
            this.setVisible(false);
        } else {
            JOptionPane.showMessageDialog(this,"Selecione uma linha da tabela.", "Pesquisar cliente", JOptionPane.ERROR_MESSAGE);
            
        }
    }//GEN-LAST:event_btnSelecionarActionPerformed

    private void btnRelatorioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRelatorioMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRelatorioMouseClicked

    private void btnRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRelatorioActionPerformed
        String pesq = txtPesq.getText();
        int tipo = cmbTipo.getSelectedIndex();
        List<Cliente> lista;
        
        try {
            lista = GerenciadorInterGrafica.getInstance().getGerenciadorDominio().pesquisarCliente(tipo, pesq);
            GerenciadorInterGrafica.getInstance().getGerRelatorio().relComLista(lista, "relClientes.jasper");
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(this,"Erro ao pesquisar. " + ex.getMessage(), "Pesquisar cliente", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnRelatorioActionPerformed
    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DlgListarCliente dialog = new DlgListarCliente(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btCadastrar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCancelar1;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnRelatorio;
    private javax.swing.JButton btnSelecionar;
    private javax.swing.JComboBox<String> cmbTipo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton pesquisar;
    private javax.swing.JTable tabelaCliente;
    private javax.swing.JTextField txtPesq;
    // End of variables declaration//GEN-END:variables

}
