/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package view;

import control.FuncoesUteis;
import control.GerenciadorInterGrafica;
import java.awt.Color;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import model.Cidade;
import model.Cliente;
import model.TipoServico;
import model.Venda;

/**
 *
 * @author thais
 */
public class DlgCadTipoServico extends javax.swing.JDialog {

    private List<Venda> venda = new ArrayList();
    
    
    private TipoServico tipoServSelecionado = null;
    
    public DlgCadTipoServico(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
//        equipUtilizadoTableModel = new EquipamentosUtilizadosAbstractTableModel();
//        tabelaEquipUtilizados.setModel(equipUtilizadoTableModel);
//        
//        List<Equipamento> lista;
//
//        try {
//            lista = GerenciadorInterGrafica.getInstance().getGerenciadorDominio().listar(Equipamento.class);
//            if ( lista.isEmpty() ) {
//                JOptionPane.showMessageDialog(this,"Lista de Cliente vazia.", "Insira algum cliente", JOptionPane.INFORMATION_MESSAGE);
//            } 
//            equipUtilizadoTableModel.setLista(lista);
//        } catch (ClassNotFoundException | SQLException ex) {
//            JOptionPane.showMessageDialog(this,"Erro ao pesquisar. " + ex.getMessage(), "Pesquisar cliente", JOptionPane.ERROR_MESSAGE);
//        }
//        
//        TableRowSorter<TableModel> sorter;
//        sorter = new TableRowSorter<TableModel>(tabelaEquipUtilizados.getModel() );
//        tabelaEquipUtilizados.setRowSorter(sorter);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jPanel1 = new javax.swing.JPanel();
        txtValor = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        lblValor = new javax.swing.JLabel();
        txtServico = new javax.swing.JTextField();
        lblServico = new javax.swing.JLabel();

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(180, 206, 195));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtValor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(6, 92, 56)));

        btnCancelar.setBackground(new java.awt.Color(41, 115, 84));
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("Cancelar");
        btnCancelar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnSalvar.setBackground(new java.awt.Color(41, 115, 84));
        btnSalvar.setForeground(new java.awt.Color(255, 255, 255));
        btnSalvar.setText("Salvar");
        btnSalvar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnAlterar.setBackground(new java.awt.Color(41, 115, 84));
        btnAlterar.setForeground(new java.awt.Color(255, 255, 255));
        btnAlterar.setText("Alterar");
        btnAlterar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        lblValor.setText("Valor");

        txtServico.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(6, 92, 56), 1, true));

        lblServico.setText("Serviço");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblValor, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblServico, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtServico, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(67, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtServico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblServico))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblValor)
                    .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 460, 150));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        
        String nome = txtServico.getText();
        String valor = txtValor.getText();
        
      
        if(validarCampos()){
            
            try {                
                double v = Double.parseDouble(txtValor.getText());
                
                if ( tipoServSelecionado == null ) {
                    TipoServico tipoServ = GerenciadorInterGrafica.getInstance().getGerenciadorDominio().inserirTipoServico(nome, v);
                    JOptionPane.showMessageDialog(this,"Tipo de Serviço " + tipoServ.getIdTipoServico() + " inserido com sucesso.", "Cadastro Tipo de Serviço", JOptionPane.INFORMATION_MESSAGE  );
                
                } else {
                    GerenciadorInterGrafica.getInstance().getGerenciadorDominio().alterarTipoServico(tipoServSelecionado.getIdTipoServico(), nome, v);
                    JOptionPane.showMessageDialog(this,"Tipo de Servico " + tipoServSelecionado.getIdTipoServico() + " alterado com sucesso.", "Cadastro Tipo de Serviço", JOptionPane.INFORMATION_MESSAGE  );
                }
                
            }catch (ClassNotFoundException | SQLException ex) {
                JOptionPane.showMessageDialog(this,"Erro nos dados. " + ex.getMessage(), "ERRO Cadastro Tipo de Serviço", JOptionPane.ERROR_MESSAGE  );
            }  
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        limparCampos();
        setVisible(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        tipoServSelecionado = GerenciadorInterGrafica.getInstance().abrirListarTipoServico();
        try {
            preencherCampos(tipoServSelecionado);
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(this,"Erro nos dados. " + ex.getMessage(), "ERRO Alterar Serviço", JOptionPane.ERROR_MESSAGE  );
        }
    }//GEN-LAST:event_btnAlterarActionPerformed

    private boolean validarCampos() {
        String msgErro = "";
        
        lblServico.setForeground(Color.black);
        lblValor.setForeground(Color.black); 
       
        if ( txtServico.getText().isEmpty() ) {
            msgErro = msgErro + "Digite o nome do Serviço.\n";
            lblServico.setForeground(Color.red);            
        }

        try {
            double valor = Double.parseDouble(txtValor.getText());
        }
        catch (NumberFormatException erro) {
            msgErro = msgErro + "Valor inválido.\n";
            lblValor.setForeground(Color.red); 
        }
        catch (Exception erro) {
            msgErro = msgErro + erro.getMessage() + "\n";
            lblValor.setForeground(Color.red); 
        }
                
        if ( msgErro.isEmpty() ) {
            return true;
        } else {            
            JOptionPane.showMessageDialog(this, msgErro, "ERRO Tipo de Serviço", JOptionPane.ERROR_MESSAGE  );
            return false;
        }
    }
    
    private void preencherCampos(TipoServico tipoServ) throws ParseException {
        if ( tipoServ != null ) {
            txtServico.setText( tipoServ.getNome() );
            txtValor.setText(Double.toString(tipoServ.getValor()));
                        
            habilitarBotoes();
        }
    }
    
    private void limparCampos() {           
            txtServico.setText( "" );
            txtValor.setText( "" );

            habilitarBotoes();
    }
    
    private void habilitarBotoes() {
        if ( tipoServSelecionado == null  ) {
            btnSalvar.setVisible(true);
            btnAlterar.setVisible(false);
        } else {
            btnSalvar.setVisible(true);
            btnAlterar.setVisible(false);
        }
    }
    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DlgCadTipoServico dialog = new DlgCadTipoServico(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblServico;
    private javax.swing.JLabel lblValor;
    private javax.swing.JTextField txtServico;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
}
