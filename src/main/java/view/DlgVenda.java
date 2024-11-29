/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package view;

import control.FuncoesUteis;
import control.GerenciadorInterGrafica;
//import control.ProdutoVendaAbstractTableModel;
import control.ServicoVendaAbstractTableModel;
import java.awt.Color;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
import model.Cidade;
import model.Cliente;
import model.TipoServico;
import model.Venda;
import org.hibernate.HibernateException;

/**
 *
 * @author thais
 */
public class DlgVenda extends javax.swing.JDialog {

    private Venda vendaSelecionada = null;
    private Cliente cliSelecionado;
    private TipoServico servSelecionado = null;
    private ServicoVendaAbstractTableModel servicoVendaTableModel;
    private Double contadorServico = 0.0;
    private String valorNaTela = "";
    
    public DlgVenda(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        cliSelecionado = null;

        servicoVendaTableModel = new ServicoVendaAbstractTableModel();
        tabelaServico.setModel((TableModel) servicoVendaTableModel);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jFormattedTextField4 = new javax.swing.JFormattedTextField();
        jTextField5 = new javax.swing.JTextField();
        lblCliente = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabelaServico = new javax.swing.JTable();
        btnAdicionarServ = new javax.swing.JButton();
        btnExcluirServ = new javax.swing.JButton();
        lblRua = new javax.swing.JLabel();
        txtRua = new javax.swing.JTextField();
        txtBairro = new javax.swing.JTextField();
        lblNumero = new javax.swing.JLabel();
        lblComplemento = new javax.swing.JLabel();
        txtComplemento = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        lblValorTotal = new javax.swing.JLabel();
        txtValorVenda = new javax.swing.JFormattedTextField();
        lblBairro = new javax.swing.JLabel();
        btnSalvar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        lblData = new javax.swing.JLabel();
        txtData = new javax.swing.JFormattedTextField();
        txtNumero = new javax.swing.JTextField();
        lblCidade = new javax.swing.JLabel();
        cbFormaPagamento = new javax.swing.JComboBox<>();
        lblFormaPag = new javax.swing.JLabel();
        txtCidade = new javax.swing.JTextField();
        btnAlterar = new javax.swing.JButton();
        lblHorario = new javax.swing.JLabel();
        txtHora = new javax.swing.JFormattedTextField();
        txtCliente = new javax.swing.JTextField();
        pesquisar = new javax.swing.JButton();
        txtRua1 = new javax.swing.JTextField();

        jButton1.setText("jButton1");

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        jFormattedTextField4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(6, 92, 56), 1, true));
        jFormattedTextField4.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));

        jTextField5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(6, 92, 56), 1, true));

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCliente.setText("Cliente");
        getContentPane().add(lblCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        jPanel1.setBackground(new java.awt.Color(180, 206, 195));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(6, 92, 56), 1, true), "Serviço"));

        tabelaServico.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(6, 92, 56), 1, true));
        tabelaServico.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(tabelaServico);

        btnAdicionarServ.setBackground(new java.awt.Color(41, 115, 84));
        btnAdicionarServ.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/16x16/botao-adicionar.png"))); // NOI18N
        btnAdicionarServ.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btnAdicionarServ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarServActionPerformed(evt);
            }
        });

        btnExcluirServ.setBackground(new java.awt.Color(41, 115, 84));
        btnExcluirServ.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/16x16/lixeira.png"))); // NOI18N
        btnExcluirServ.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btnExcluirServ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirServActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnExcluirServ, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdicionarServ, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 40, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(btnAdicionarServ, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnExcluirServ, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 360, -1));

        lblRua.setText("Rua");
        getContentPane().add(lblRua, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 40, 37, -1));

        txtRua.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(6, 92, 56), 1, true));
        getContentPane().add(txtRua, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 60, 208, 20));

        txtBairro.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(6, 92, 56), 1, true));
        getContentPane().add(txtBairro, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 120, 206, 20));

        lblNumero.setText("Número");
        getContentPane().add(lblNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 150, 55, -1));

        lblComplemento.setText("Complemento");
        getContentPane().add(lblComplemento, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 150, 92, -1));

        txtComplemento.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(6, 92, 56), 1, true));
        getContentPane().add(txtComplemento, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 170, 120, 20));

        jPanel5.setBackground(new java.awt.Color(180, 206, 195));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblValorTotal.setText("Valor Total Venda");
        jPanel5.add(lblValorTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 350, -1, -1));

        txtValorVenda.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(6, 92, 56), 1, true));
        txtValorVenda.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,###.##"))));
        txtValorVenda.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        txtValorVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValorVendaActionPerformed(evt);
            }
        });
        jPanel5.add(txtValorVenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 370, 178, 30));

        lblBairro.setText("Bairro");
        jPanel5.add(lblBairro, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 80, 37, -1));

        btnSalvar.setBackground(new java.awt.Color(41, 115, 84));
        btnSalvar.setForeground(new java.awt.Color(255, 255, 255));
        btnSalvar.setText("Salvar");
        btnSalvar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        jPanel5.add(btnSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 430, 70, 30));

        btnCancelar.setBackground(new java.awt.Color(41, 115, 84));
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("Cancelar");
        btnCancelar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jPanel5.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 430, 80, 30));

        lblData.setText("Data");
        jPanel5.add(lblData, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 43, -1));

        txtData.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(6, 92, 56), 1, true));
        try {
            txtData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtData.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel5.add(txtData, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 120, 20));

        txtNumero.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(6, 92, 56), 1, true));
        jPanel5.add(txtNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 150, 75, 20));

        lblCidade.setText("Cidade");
        jPanel5.add(lblCidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 180, 55, -1));

        cbFormaPagamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pix", "Dinheiro" }));
        cbFormaPagamento.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(6, 92, 56), 1, true));
        jPanel5.add(cbFormaPagamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 250, 210, -1));

        lblFormaPag.setText("Forma de Pagamento");
        jPanel5.add(lblFormaPag, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 230, 127, -1));

        txtCidade.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(6, 92, 56)));
        txtCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCidadeActionPerformed(evt);
            }
        });
        jPanel5.add(txtCidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 200, 210, -1));

        btnAlterar.setBackground(new java.awt.Color(41, 115, 84));
        btnAlterar.setForeground(new java.awt.Color(255, 255, 255));
        btnAlterar.setText("Alterar");
        btnAlterar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });
        jPanel5.add(btnAlterar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 430, 80, 30));

        lblHorario.setText("Horário");
        jPanel5.add(lblHorario, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, 43, -1));

        txtHora.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(6, 92, 56), 1, true));
        txtHora.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getTimeInstance(java.text.DateFormat.SHORT))));
        jPanel5.add(txtHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 300, 126, -1));

        txtCliente.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(6, 92, 56), 1, true));
        jPanel5.add(txtCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 290, 20));

        pesquisar.setBackground(new java.awt.Color(41, 115, 84));
        pesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/16x16/procurar (1).png"))); // NOI18N
        pesquisar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        pesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisarActionPerformed(evt);
            }
        });
        jPanel5.add(pesquisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 40, 50, -1));

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 650, 500));

        txtRua1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(6, 92, 56), 1, true));
        getContentPane().add(txtRua1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 60, 208, 20));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        limparCampos();
        setVisible(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnAdicionarServActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarServActionPerformed
        servSelecionado = GerenciadorInterGrafica.getInstance().abrirListarTipoServico();
        servicoVendaTableModel.adicionar(servSelecionado);
        tabelaServico.setModel(servicoVendaTableModel);
        contadorServico = contadorServico + servSelecionado.getValor();
        valorNaTela = String.valueOf(contadorServico);
        txtValorVenda.setText(valorNaTela);
    }//GEN-LAST:event_btnAdicionarServActionPerformed

    private void btnExcluirServActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirServActionPerformed
        int linha = tabelaServico.getSelectedRow();
        
        if(tabelaServico.getRowCount() == 0){
            JOptionPane.showMessageDialog(this, "A Tabela Está Vazia!", "ERRO!", JOptionPane.ERROR_MESSAGE);
            return;
        }else if (linha < 0 || linha >= tabelaServico.getRowCount()) {
            JOptionPane.showMessageDialog(this, "Selecione uma Linha da Tabela!", "ERRO!", JOptionPane.ERROR_MESSAGE);
            return;
        }else{
            double colunaValorTotal = servSelecionado.getValor();
            tabelaServico.removeColumnSelectionInterval(linha, linha);
            contadorServico = contadorServico - colunaValorTotal;
            valorNaTela = String.valueOf(contadorServico);
            txtValorVenda.setText(valorNaTela);
            JOptionPane.showMessageDialog(this, "Produto retirado com sucesso.");
        }
        
        servicoVendaTableModel.remover(linha);
        tabelaServico.setModel(servicoVendaTableModel);
    }//GEN-LAST:event_btnExcluirServActionPerformed

    private void txtCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCidadeActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed

        String cliente = vendaSelecionada.getCliente().getNome();
        String rua = txtRua.getText();
        String bairro = txtBairro.getText();
        String numero = txtNumero.getText();
        String cidade = txtCidade.getText();
        String complemento = txtComplemento.getText();
        String formaPag = (String) cbFormaPagamento.getSelectedItem();
        String data = txtData.getText();
        String hora = txtHora.getText();
        String valorTotal = txtValorVenda.getText();
        List<TipoServico> listaServicos = servicoVendaTableModel.getList();
        
        if(validarCampos()){
                        
            try {                
                Date dt = FuncoesUteis.strToDate(data);
                double valorTotalV = Double.parseDouble(valorTotal);
                if ( vendaSelecionada == null  ) {

                    Venda venda = GerenciadorInterGrafica.getInstance().getGerenciadorDominio().inserirVenda(dt, hora, formaPag, valorTotalV, vendaSelecionada.getCliente(), listaServicos);
                    JOptionPane.showMessageDialog(this,"Venda " + venda.getIdVenda() + " inserido com sucesso.", "Cadastro Venda", JOptionPane.INFORMATION_MESSAGE  );
                    limparCampos();
                } else {
                    GerenciadorInterGrafica.getInstance().getGerenciadorDominio().alterarVenda(vendaSelecionada.getIdVenda(), dt, hora, formaPag, valorTotalV, vendaSelecionada.getCliente(), listaServicos);
                    JOptionPane.showMessageDialog(this,"Venda " + vendaSelecionada.getIdVenda() + " alterado com sucesso.", "Cadastro Venda", JOptionPane.INFORMATION_MESSAGE  );
                    limparCampos();
                }
                
            }catch (ClassNotFoundException | SQLException ex) {
                JOptionPane.showMessageDialog(this,"Erro nos dados. " + ex.getMessage(), "ERRO Cadastro Venda", JOptionPane.ERROR_MESSAGE  );
            } catch (ParseException ex) {
                Logger.getLogger(DlgVenda.class.getName()).log(Level.SEVERE, null, ex);
            }  
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        vendaSelecionada = GerenciadorInterGrafica.getInstance().abrirListarVendas();
//      Precisa inserir novamente um cliente, pois o cliSelecionado fica null
        if(vendaSelecionada!= null){
            try {
                preencherCampos(vendaSelecionada);
            } catch (ParseException ex) {
                JOptionPane.showMessageDialog(this,"Erro nos dados. " + ex.getMessage(), "ERRO Selecionar Venda", JOptionPane.ERROR_MESSAGE  );
            }
        }else{
            System.out.println("VENDA SELECIONADA NULA");
        }
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void pesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisarActionPerformed
        cliSelecionado = GerenciadorInterGrafica.getInstance().abrirListarCliente();
        if ( cliSelecionado != null) {
            txtCliente.setText(cliSelecionado.getNome());
            txtRua.setText( cliSelecionado.getEndereco().getRua());
            txtNumero.setText( cliSelecionado.getEndereco().getNumero());
            txtComplemento.setText( cliSelecionado.getEndereco().getComplemento() );
            txtBairro.setText(cliSelecionado.getEndereco().getBairro());
            txtComplemento.setText( cliSelecionado.getEndereco().getComplemento() );
            txtCidade.setText(cliSelecionado.getCidade().toString());
        } else {
            txtCliente.setText("");
        }
    }//GEN-LAST:event_pesquisarActionPerformed

    private void txtValorVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValorVendaActionPerformed
        txtValorVenda.setText("");
        double valor = servSelecionado.getValor();
        String totalTexto = String.valueOf(valor);
        
        txtValorVenda.setText(totalTexto);
    }//GEN-LAST:event_txtValorVendaActionPerformed

    private boolean validarCampos() {
        String msgErro = "";
        
        lblCliente.setForeground(Color.black);
        lblRua.setForeground(Color.black); 
        lblNumero.setForeground(Color.black);
        lblBairro.setForeground(Color.black); 
        lblComplemento.setForeground(Color.black); 
        lblCidade.setForeground(Color.black);
        lblFormaPag.setForeground(Color.black);
        lblData.setForeground(Color.black);
        lblHorario.setForeground(Color.black);
        
        if ( txtCliente.getText().isEmpty() ) {
            msgErro = msgErro + "Insira um Cliente.\n";
            lblCliente.setForeground(Color.red);            
        }else if ( txtData.getText().isEmpty() ) {
            msgErro = msgErro + "Insira uma Data.\n";
            lblCliente.setForeground(Color.red);            
        }else if ( txtHora.getText().isEmpty() ) {
            msgErro = msgErro + "Insira um Horário.\n";
            lblCliente.setForeground(Color.red);            
        }

        try {
            Date txtDataServ = FuncoesUteis.strToDate(txtData.getText() );
        }
        catch (ParseException ex) {
            msgErro = msgErro + "Data inválida.\n";
            lblData.setForeground(Color.red); 
        }
        
        if ( msgErro.isEmpty() ) {
            return true;
        } else {            
            JOptionPane.showMessageDialog(this, msgErro, "ERRO Venda", JOptionPane.ERROR_MESSAGE  );
            return false;
        }
    }
    
    private void preencherCampos(Venda venda) throws ParseException {
        if ( venda != null ) {
            txtData.setText( venda.getDtNascFormatada());
            txtRua.setText( venda.getCliente().getEndereco().getRua());
            txtNumero.setText( venda.getCliente().getEndereco().getNumero());
            txtBairro.setText( venda.getCliente().getEndereco().getBairro());
            txtComplemento.setText( venda.getCliente().getEndereco().getComplemento() );
            txtValorVenda.setText(Double.toString(venda.getValorTotalVenda()));
            txtCliente.setText(vendaSelecionada.getCliente().getNome());
            txtCidade.setText(venda.getCliente().getCidade().toString());
            txtHora.setText(venda.getHora());
            
            List<TipoServico> listaServicos = vendaSelecionada.getTipoServico();
            for(TipoServico serv : listaServicos){
                servicoVendaTableModel.adicionar(serv);
            }

            habilitarBotoes();
        }
    }
    
    private void limparCampos() {           
            txtHora.setText( "" );
            txtData.setText( "" );
            txtRua.setText( "");
            txtNumero.setText( "" );
            txtComplemento.setText( "" );
            txtBairro.setText( "" );
            txtComplemento.setText( "" );
            txtCliente.setText("");
            cbFormaPagamento.setSelectedIndex(0);
            txtValorVenda.setText("");
            vendaSelecionada = null;
            habilitarBotoes();
    }
    
    private void habilitarBotoes() {
        if ( vendaSelecionada == null  ) {
            btnSalvar.setVisible(true);
            btnAlterar.setVisible(false);
        } else {
            btnSalvar.setVisible(true);
            btnAlterar.setVisible(false);
        }
    }
    
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
            java.util.logging.Logger.getLogger(DlgVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DlgVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DlgVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DlgVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DlgVenda dialog = new DlgVenda(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnAdicionarServ;
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnExcluirServ;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox<String> cbFormaPagamento;
    private javax.swing.JButton jButton1;
    private javax.swing.JFormattedTextField jFormattedTextField4;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JLabel lblBairro;
    private javax.swing.JLabel lblCidade;
    private javax.swing.JLabel lblCliente;
    private javax.swing.JLabel lblComplemento;
    private javax.swing.JLabel lblData;
    private javax.swing.JLabel lblFormaPag;
    private javax.swing.JLabel lblHorario;
    private javax.swing.JLabel lblNumero;
    private javax.swing.JLabel lblRua;
    private javax.swing.JLabel lblValorTotal;
    private javax.swing.JButton pesquisar;
    private javax.swing.JTable tabelaServico;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtCliente;
    private javax.swing.JTextField txtComplemento;
    private javax.swing.JFormattedTextField txtData;
    private javax.swing.JFormattedTextField txtHora;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtRua;
    private javax.swing.JTextField txtRua1;
    private javax.swing.JFormattedTextField txtValorVenda;
    // End of variables declaration//GEN-END:variables
}
