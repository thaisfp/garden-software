package view;

import control.GerenciadorInterGrafica;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import model.Cliente;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author thais
 */
public class FrmPrincipal extends javax.swing.JFrame {

    public FrmPrincipal() {
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        btnCliente = new javax.swing.JButton();
        btnNovoServico = new javax.swing.JButton();
        btnListar = new javax.swing.JButton();
        btnVenda = new javax.swing.JButton();
        btnTipoServico = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        btnServicosAgendados = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jPanel5.setBackground(new java.awt.Color(6, 92, 56));
        jPanel5.setLayout(null);

        btnCliente.setBackground(new java.awt.Color(188, 211, 201));
        btnCliente.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnCliente.setForeground(new java.awt.Color(255, 255, 255));
        btnCliente.setText("Cliente        ");
        btnCliente.setBorder(null);
        btnCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClienteActionPerformed(evt);
            }
        });
        jPanel5.add(btnCliente);
        btnCliente.setBounds(-30, 200, 250, 30);

        btnNovoServico.setBackground(new java.awt.Color(188, 211, 201));
        btnNovoServico.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnNovoServico.setForeground(new java.awt.Color(255, 255, 255));
        btnNovoServico.setText("Novo Serviço");
        btnNovoServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoServicoActionPerformed(evt);
            }
        });
        jPanel5.add(btnNovoServico);
        btnNovoServico.setBounds(-30, 300, 240, 30);

        btnListar.setBackground(new java.awt.Color(6, 92, 56));
        btnListar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnListar.setForeground(new java.awt.Color(255, 255, 255));
        btnListar.setText("Listar ");
        jPanel5.add(btnListar);
        btnListar.setBounds(-10, 160, 230, 40);

        btnVenda.setBackground(new java.awt.Color(6, 92, 56));
        btnVenda.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnVenda.setForeground(new java.awt.Color(255, 255, 255));
        btnVenda.setText("Venda");
        jPanel5.add(btnVenda);
        btnVenda.setBounds(0, 260, 210, 40);

        btnTipoServico.setBackground(new java.awt.Color(188, 211, 201));
        btnTipoServico.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnTipoServico.setForeground(new java.awt.Color(255, 255, 255));
        btnTipoServico.setText("Tipo de Serviço        ");
        btnTipoServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTipoServicoActionPerformed(evt);
            }
        });
        jPanel5.add(btnTipoServico);
        btnTipoServico.setBounds(-10, 230, 250, 30);

        btnSair.setBackground(new java.awt.Color(6, 92, 56));
        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/16x16/sair.png"))); // NOI18N
        btnSair.setText("Sair");
        btnSair.setBorder(null);
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });
        jPanel5.add(btnSair);
        btnSair.setBounds(10, 510, 80, 30);

        btnServicosAgendados.setBackground(new java.awt.Color(188, 211, 201));
        btnServicosAgendados.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnServicosAgendados.setForeground(new java.awt.Color(255, 255, 255));
        btnServicosAgendados.setText("Serv. Agendados");
        btnServicosAgendados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnServicosAgendadosActionPerformed(evt);
            }
        });
        jPanel5.add(btnServicosAgendados);
        btnServicosAgendados.setBounds(-20, 330, 240, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logoAtuGrande.png"))); // NOI18N
        jLabel1.setText("jLabel1");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Listar / Cadastrar");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(121, 121, 121)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addContainerGap(44, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(64, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(467, 467, 467))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClienteActionPerformed
        GerenciadorInterGrafica.getInstance().abrirListarCliente();
    }//GEN-LAST:event_btnClienteActionPerformed

    private void btnNovoServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoServicoActionPerformed
        GerenciadorInterGrafica.getInstance().abrirVenda();
    }//GEN-LAST:event_btnNovoServicoActionPerformed

    private void btnTipoServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTipoServicoActionPerformed
        GerenciadorInterGrafica.getInstance().abrirListarTipoServico();
    }//GEN-LAST:event_btnTipoServicoActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnServicosAgendadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnServicosAgendadosActionPerformed
        GerenciadorInterGrafica.getInstance().abrirListarVendas();
    }//GEN-LAST:event_btnServicosAgendadosActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCliente;
    private javax.swing.JButton btnListar;
    private javax.swing.JButton btnNovoServico;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnServicosAgendados;
    private javax.swing.JButton btnTipoServico;
    private javax.swing.JButton btnVenda;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    // End of variables declaration//GEN-END:variables
}
