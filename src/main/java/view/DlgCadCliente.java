/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package view;

import control.BuscarCEP;
import control.FuncoesUteis;
import control.GerenciadorInterGrafica;
import java.awt.Color;
import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.Entity;
import javax.swing.ImageIcon;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import model.Cidade;
import model.Cliente;
import model.Endereco;

/**
 *
 * @author thais
 */

public class DlgCadCliente extends javax.swing.JDialog {

    private Cliente cliSelecionado = null;

    public DlgCadCliente(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    public DlgCadCliente() {
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jTextField7 = new javax.swing.JTextField();
        jFormattedTextField6 = new javax.swing.JFormattedTextField();
        lblNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        lblCpf = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblNum = new javax.swing.JLabel();
        cep = new javax.swing.JTextField();
        txtRua = new javax.swing.JTextField();
        txtComplemento = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cbCidade = new javax.swing.JComboBox<>();
        lblCEP = new javax.swing.JLabel();
        lblDtNasc = new javax.swing.JLabel();
        cpf = new javax.swing.JFormattedTextField();
        dtNasc = new javax.swing.JFormattedTextField();
        txtTelSecundario = new javax.swing.JTextField();
        txtTelPrimario = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        btnSalvar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        txtNumero = new javax.swing.JTextField();
        btnAlterar = new javax.swing.JButton();
        txtBairro = new javax.swing.JTextField();

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });

        jFormattedTextField6.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNome.setText("Nome");
        getContentPane().add(lblNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 55, 62, -1));

        txtNome.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(6, 92, 56), 1, true));
        getContentPane().add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(106, 52, 320, -1));

        lblCpf.setText("CPF");
        getContentPane().add(lblCpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 95, 37, -1));

        jLabel5.setText("Bairro");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 175, 76, -1));

        jLabel6.setText("Rua");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 215, 76, -1));

        jLabel7.setText("Complemento");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 255, -1, -1));

        lblNum.setText("Nº");
        getContentPane().add(lblNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(332, 255, 25, -1));

        cep.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(6, 92, 56), 1, true));
        cep.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                cepFocusLost(evt);
            }
        });
        cep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cepActionPerformed(evt);
            }
        });
        getContentPane().add(cep, new org.netbeans.lib.awtextra.AbsoluteConstraints(106, 132, 126, -1));

        txtRua.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(6, 92, 56), 1, true));
        txtRua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRuaActionPerformed(evt);
            }
        });
        getContentPane().add(txtRua, new org.netbeans.lib.awtextra.AbsoluteConstraints(104, 180, 330, -1));

        txtComplemento.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(6, 92, 56), 1, true));
        getContentPane().add(txtComplemento, new org.netbeans.lib.awtextra.AbsoluteConstraints(106, 252, 211, -1));

        jLabel10.setText("Tel Primario");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 295, 87, -1));

        jLabel11.setText("Tel Secundario");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(239, 295, -1, -1));

        jLabel9.setText("Cidade");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(252, 135, -1, -1));

        cbCidade.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(6, 92, 56), 1, true));
        cbCidade.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                cbCidadeComponentShown(evt);
            }
        });
        getContentPane().add(cbCidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(302, 132, 130, -1));

        lblCEP.setText("CEP");
        getContentPane().add(lblCEP, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 132, 37, -1));

        lblDtNasc.setText("Data de Nasc.");
        getContentPane().add(lblDtNasc, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 95, -1, -1));

        cpf.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(6, 92, 56), 1, true));
        try {
            cpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(cpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(106, 92, 126, -1));

        dtNasc.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(6, 92, 56), 1, true));
        try {
            dtNasc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        dtNasc.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(dtNasc, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 92, 90, -1));

        txtTelSecundario.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(6, 92, 56), 1, true));
        getContentPane().add(txtTelSecundario, new org.netbeans.lib.awtextra.AbsoluteConstraints(329, 292, 110, -1));

        txtTelPrimario.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(6, 92, 56), 1, true));
        getContentPane().add(txtTelPrimario, new org.netbeans.lib.awtextra.AbsoluteConstraints(106, 292, 127, -1));

        jPanel1.setBackground(new java.awt.Color(180, 206, 195));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnSalvar.setBackground(new java.awt.Color(41, 115, 84));
        btnSalvar.setForeground(new java.awt.Color(255, 255, 255));
        btnSalvar.setText("Salvar");
        btnSalvar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnCancelar.setBackground(new java.awt.Color(41, 115, 84));
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("Cancelar");
        btnCancelar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btnCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelarMouseClicked(evt);
            }
        });
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        txtNumero.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(6, 92, 56)));

        btnAlterar.setBackground(new java.awt.Color(41, 115, 84));
        btnAlterar.setForeground(new java.awt.Color(255, 255, 255));
        btnAlterar.setText("Alterar");
        btnAlterar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        txtBairro.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(6, 92, 56), 1, true));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(92, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(184, Short.MAX_VALUE)
                .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(107, 107, 107)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 450, 390));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtRuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRuaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRuaActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        limparCampos();
        this.setVisible(false);

    }//GEN-LAST:event_btnCancelarActionPerformed

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed
   
    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        
        String nome = txtNome.getText();
        String txtcpf = cpf.getText();
        String txtDtNasc = dtNasc.getText();
        String rua = txtRua.getText();
        
        Cidade cidade = (Cidade) cbCidade.getSelectedItem();

        String txtcep = cep.getText();
        String txtNum = txtNumero.getText();
        String complemento = txtComplemento.getText();
        String bairro = txtBairro.getText();
        String telPrimario = txtTelPrimario.getText();
        String telSecundario = txtTelSecundario.getText();
        
        if(validarCampos()){
            
            try {                
                Date dt = FuncoesUteis.strToDate(txtDtNasc);
                
                if ( cliSelecionado == null ) {
                    Cliente cli = GerenciadorInterGrafica.getInstance().getGerenciadorDominio().inserirCliente(nome, dt, txtcpf, rua, bairro, complemento, txtNum, txtcep, telPrimario, telSecundario, cidade);
                    JOptionPane.showMessageDialog(this,"Cliente " + cli.getIdCliente() + " inserido com sucesso.", "Cadastro Cliente", JOptionPane.INFORMATION_MESSAGE  );
                
                } else {
                    GerenciadorInterGrafica.getInstance().getGerenciadorDominio().alterarCliente(cliSelecionado.getIdCliente(), nome, dt, rua, rua, bairro, complemento, txtNum, txtcep, telPrimario, telSecundario, cidade);
                    JOptionPane.showMessageDialog(this,"Cliente " + cliSelecionado.getIdCliente() + " alterado com sucesso.", "Cadastro Cliente", JOptionPane.INFORMATION_MESSAGE  );
                }
                
            }catch (ParseException | ClassNotFoundException | SQLException ex) {
                JOptionPane.showMessageDialog(this,"Erro nos dados. " + ex.getMessage(), "ERRO Cadastro Cliente", JOptionPane.ERROR_MESSAGE  );
            }  
        }
        
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseClicked
        
    }//GEN-LAST:event_btnCancelarMouseClicked

    private void cbCidadeComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_cbCidadeComponentShown

    }//GEN-LAST:event_cbCidadeComponentShown
    
    private void cepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cepActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cepActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        GerenciadorInterGrafica.getInstance().carregarCombo(cbCidade, Cidade.class);
    }//GEN-LAST:event_formComponentShown

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        cliSelecionado = GerenciadorInterGrafica.getInstance().abrirListarCliente();
//      nas eta reconhecendo o endereco
        try {
            preencherCampos(cliSelecionado);
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(this,"Erro nos dados. " + ex.getMessage(), "ERRO Cadastro Cliente", JOptionPane.ERROR_MESSAGE  );
        }
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void cepFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cepFocusLost
        try {
            Endereco ender;
            ender = BuscarCEP.consultarCEP(cep.getText() );
            if (ender != null ) {
                txtRua.setText( ender.getRua());
                txtBairro.setText(ender.getBairro() );
                cbCidade.setSelectedItem(ender.getCidade() );
            } else {
                JOptionPane.showMessageDialog(this, "CEP não encontrado");
            }
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "CEP não encontrado", "Erro CEP", JOptionPane.ERROR_MESSAGE);
        }
            
    }//GEN-LAST:event_cepFocusLost

    private boolean validarCampos() {
        String msgErro = "";
        
        lblNome.setForeground(Color.black);
        lblCEP.setForeground(Color.black); 
        lblNum.setForeground(Color.black);
        lblCpf.setForeground(Color.black); 
        lblDtNasc.setForeground(Color.black); 
        
        if ( txtNome.getText().isEmpty() ) {
            msgErro = msgErro + "Digite seu nome.\n";
            lblNome.setForeground(Color.red);            
        }
              
        if ( cep.getText().replace("-", "").trim().isEmpty() ) {
            msgErro = msgErro + "Digite seu CEP.\n";
            lblCEP.setForeground(Color.red);            
        }
        
        if ( FuncoesUteis.isCPF( cpf.getText() ) == false  ) {
            msgErro = msgErro + "CPF inválido.\n";
            lblCpf.setForeground(Color.red); 
        }
        try {
            int num = Integer.parseInt(txtNumero.getText() );
        }
        catch (NumberFormatException erro) {
            msgErro = msgErro + "Número inválido.\n";
            lblNum.setForeground(Color.red); 
        }
        catch (Exception erro) {
            msgErro = msgErro + erro.getMessage() + "\n";
            lblNum.setForeground(Color.red); 
        }
        
        try {
            Date txtdtNasc = FuncoesUteis.strToDate(dtNasc.getText() );
        }
        catch (ParseException ex) {
            msgErro = msgErro + "Data inválida.\n";
            lblDtNasc.setForeground(Color.red); 
        }
        catch (Exception erro) {
            msgErro = msgErro + erro.getMessage() + "\n";
            lblNum.setForeground(Color.red); 
        }
                
        if ( msgErro.isEmpty() ) {
            return true;
        } else {            
            JOptionPane.showMessageDialog(this, msgErro, "ERRO Cliente", JOptionPane.ERROR_MESSAGE  );
            return false;
        }
    }
    
    public void preencherCampos(Cliente cli) throws ParseException {
        if ( cli != null ) {
            System.out.println(cli.getNome());
            txtNome.setText( cli.getNome() );
            cpf.setText( cli.getCpf());
            dtNasc.setText( cli.getDtNascFormatada() );
            cep.setText( cli.getEndereco().getCep() );
            txtRua.setText( cli.getEndereco().getRua());
            txtNumero.setText( String.valueOf( cli.getEndereco().getNumero() ) );
            txtComplemento.setText( cli.getEndereco().getComplemento() );
            txtBairro.setText( cli.getEndereco().getBairro() );
            txtComplemento.setText( cli.getEndereco().getComplemento() );
            cbCidade.setSelectedItem( cli.getCidade() );
            txtTelPrimario.setText( cli.getTelPrimario());
            txtTelSecundario.setText( cli.getTelSecundario());
            
            habilitarBotoes();
        }
    }
    
    private void limparCampos() {           
            txtNome.setText( "" );
            cpf.setText( "" );
            dtNasc.setText( "" );
            cep.setText("");
            txtRua.setText( "");
            txtNumero.setText( "" );
            txtComplemento.setText( "" );
            txtBairro.setText( "" );
            txtComplemento.setText( "" );
            cbCidade.setSelectedIndex(0);
            txtTelPrimario.setText( "" );
            txtTelSecundario.setText( "");
            cliSelecionado = null;
            habilitarBotoes();
    }
    
    private void habilitarBotoes() {
        if ( cliSelecionado == null  ) {
            btnSalvar.setVisible(true);
            btnAlterar.setVisible(true);
        } else {
            btnSalvar.setVisible(true);
            btnAlterar.setVisible(false);
        }
    }
        
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DlgCadCliente dialog = new DlgCadCliente(new javax.swing.JFrame(), true);
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
    private javax.swing.JComboBox<String> cbCidade;
    private javax.swing.JTextField cep;
    private javax.swing.JFormattedTextField cpf;
    private javax.swing.JFormattedTextField dtNasc;
    private javax.swing.JFormattedTextField jFormattedTextField6;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JLabel lblCEP;
    private javax.swing.JLabel lblCpf;
    private javax.swing.JLabel lblDtNasc;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblNum;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JTextField txtComplemento;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtRua;
    private javax.swing.JTextField txtTelPrimario;
    private javax.swing.JTextField txtTelSecundario;
    // End of variables declaration//GEN-END:variables

  
}
