/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package view;

import control.GerenciadorInterGrafica;
import control.TipoServicoAbstractTableModel;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import model.Cliente;
import model.TipoServico;
import org.hibernate.HibernateException;

/**
 *
 * @author thais
 */
public class DlgListarTipoServico extends javax.swing.JDialog {

    private TipoServico tipoServSelecionado = null;
    
    private TipoServicoAbstractTableModel tipoServTableModel;
    
    public DlgListarTipoServico(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        tipoServTableModel = new TipoServicoAbstractTableModel();
        tabelaTipoServico.setModel(tipoServTableModel);

        List<TipoServico> lista;
        try {
            lista = GerenciadorInterGrafica.getInstance().getGerenciadorDominio().listar(TipoServico.class);
            if(lista.isEmpty()){
                JOptionPane.showMessageDialog(this,"Lista de Servico vazia.", "Insira algum Servico", JOptionPane.INFORMATION_MESSAGE);                
            }
            tipoServTableModel.setLista(lista);

        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(this,"Erro ao pesquisar. " + ex.getMessage(), "Pesquisar Servico", JOptionPane.ERROR_MESSAGE);
        }
        
        TableRowSorter<TableModel> sorter;
        sorter = new TableRowSorter<TableModel>(tabelaTipoServico.getModel() );
        tabelaTipoServico.setRowSorter(sorter);
    }

    public TipoServico getTipoServSelecionado() {
        return tipoServSelecionado;
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtPesq = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        btnCadastrar = new javax.swing.JButton();
        btnSelecionar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        cbTipo = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaTipoServico = new javax.swing.JTable();
        pesquisar = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtPesq.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(6, 92, 56), 1, true));
        getContentPane().add(txtPesq, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 40, 480, 20));

        jPanel2.setBackground(new java.awt.Color(180, 206, 195));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCadastrar.setBackground(new java.awt.Color(41, 115, 84));
        btnCadastrar.setForeground(new java.awt.Color(255, 255, 255));
        btnCadastrar.setText("Cadastrar");
        btnCadastrar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });
        jPanel2.add(btnCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 20, 60, 20));

        btnSelecionar.setBackground(new java.awt.Color(41, 115, 84));
        btnSelecionar.setForeground(new java.awt.Color(255, 255, 255));
        btnSelecionar.setText("Selecionar");
        btnSelecionar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btnSelecionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelecionarActionPerformed(evt);
            }
        });
        jPanel2.add(btnSelecionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 230, 80, 30));

        btnExcluir.setBackground(new java.awt.Color(41, 115, 84));
        btnExcluir.setForeground(new java.awt.Color(255, 255, 255));
        btnExcluir.setText("Excluir");
        btnExcluir.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });
        jPanel2.add(btnExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 230, 70, 30));

        btnCancelar.setBackground(new java.awt.Color(41, 115, 84));
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("Cancelar");
        btnCancelar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jPanel2.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 230, 80, 30));

        cbTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nome" }));
        jPanel2.add(cbTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        tabelaTipoServico.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tabelaTipoServico);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 740, 170));

        pesquisar.setBackground(new java.awt.Color(41, 115, 84));
        pesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/16x16/procurar (1).png"))); // NOI18N
        pesquisar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        pesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisarActionPerformed(evt);
            }
        });
        jPanel2.add(pesquisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 20, 30, 20));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 800, 280));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        GerenciadorInterGrafica.getInstance().abrirCadTipoServico();
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnSelecionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelecionarActionPerformed
        int linha = tabelaTipoServico.getSelectedRow();
        if ( linha >= 0 ) {
            linha = tabelaTipoServico.convertRowIndexToModel(linha);
            tipoServSelecionado = tipoServTableModel.getTipoServico(linha);
            this.setVisible(false);
        } else {
            JOptionPane.showMessageDialog(this,"Selecione uma linha da tabela.", "Pesquisar Serviço", JOptionPane.ERROR_MESSAGE);
            
        }
    }//GEN-LAST:event_btnSelecionarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        int linha = tabelaTipoServico.getSelectedRow();
        if ( linha >= 0 ) {
            
            if ( JOptionPane.showConfirmDialog(this, "Deseja realmente excluir?", "Excluir Tipo de Serviço", JOptionPane.YES_NO_OPTION ) == JOptionPane.YES_OPTION ) {
                
                linha = tabelaTipoServico.convertRowIndexToModel(linha);
                TipoServico tipoServ = tipoServTableModel.getTipoServico(linha);
                try {                
                    GerenciadorInterGrafica.getInstance().getGerenciadorDominio().excluir(tipoServ);
                } catch (HibernateException ex) {
                    JOptionPane.showMessageDialog(this,"Erro ao excluir Tipo de Serviço. " + ex.getMessage(), "Pesquisar Tipo de Serviço", JOptionPane.ERROR_MESSAGE);
                } 
                
                tipoServTableModel.remover(linha);            
            }
             
        } else {
            JOptionPane.showMessageDialog(this,"Selecione uma linha da tabela.", "Pesquisar Tipo de Serviço", JOptionPane.ERROR_MESSAGE);
            
        }
             
        
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void pesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisarActionPerformed
        String pesq = txtPesq.getText();
        int tipo = cbTipo.getSelectedIndex();
        List<TipoServico> lista;

        try {
            lista = GerenciadorInterGrafica.getInstance().getGerenciadorDominio().pesquisarTipoServico(tipo, pesq);
            if ( lista.isEmpty() ) {
                JOptionPane.showMessageDialog(this,"Tipo de Serviço não encontrado.", "Pesquisar Tipo de Serviço", JOptionPane.INFORMATION_MESSAGE);
            }
            tipoServTableModel.setLista(lista);
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(this,"Erro ao pesquisar. " + ex.getMessage(), "Pesquisar Tipo de Serviço", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_pesquisarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        txtPesq.setText( "" );        
        this.setVisible(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    public static void main(String args[]) {
    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DlgListarTipoServico dialog = new DlgListarTipoServico(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnSelecionar;
    private javax.swing.JComboBox<String> cbTipo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton pesquisar;
    private javax.swing.JTable tabelaTipoServico;
    private javax.swing.JTextField txtPesq;
    // End of variables declaration//GEN-END:variables
}
