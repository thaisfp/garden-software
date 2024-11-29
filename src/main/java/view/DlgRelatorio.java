/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package view;

import control.GerenciadorInterGrafica;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author thais
 */
public class DlgRelatorio extends javax.swing.JDialog {

    /**
     * Creates new form DlgRelatorio
     */
    public DlgRelatorio(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        TableRowSorter<TableModel> sorter;
        sorter = new TableRowSorter<TableModel>(tblClientes.getModel() );
        tblClientes.setRowSorter(sorter);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        cbRelatorio = new javax.swing.JComboBox<>();
        pesqRel = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblClientes = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(180, 206, 195));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        cbRelatorio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Clientes", "Valor Por Mês", "Valor Por Cliente", "Clientes Por Bairro" }));
        cbRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbRelatorioActionPerformed(evt);
            }
        });

        pesqRel.setBackground(new java.awt.Color(41, 115, 84));
        pesqRel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/16x16/procurar (1).png"))); // NOI18N
        pesqRel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        pesqRel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesqRelActionPerformed(evt);
            }
        });

        tblClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cliente", "Valor"
            }
        ));
        jScrollPane1.setViewportView(tblClientes);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 490, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cbRelatorio, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pesqRel, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbRelatorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pesqRel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pesqRelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesqRelActionPerformed
        try {
            int tipo = cbRelatorio.getSelectedIndex();

            GerenciadorInterGrafica.getInstance().getGerenciadorDominio().relatorio(tblClientes, tipo); 
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_pesqRelActionPerformed

    private void cbRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbRelatorioActionPerformed
        int tipo = cbRelatorio.getSelectedIndex();
        
        switch (tipo) {
            case 0:
                ( (DefaultTableModel) tblClientes.getModel() ).setColumnIdentifiers( new Object[] {"Cliente"} );
                break;
            case 1:
                ( (DefaultTableModel) tblClientes.getModel() ).setColumnIdentifiers( new Object[] {"Mês", "Ano","Total"} );
                break;
            case 2:
                ( (DefaultTableModel) tblClientes.getModel() ).setColumnIdentifiers( new Object[] {"Cliente","Total"} );  
                break;
            case 3:
                ( (DefaultTableModel) tblClientes.getModel() ).setColumnIdentifiers( new Object[] {"Bairro","Cliente","Total"} );
                break;
        }
                
    }//GEN-LAST:event_cbRelatorioActionPerformed

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
            java.util.logging.Logger.getLogger(DlgRelatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DlgRelatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DlgRelatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DlgRelatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DlgRelatorio dialog = new DlgRelatorio(new javax.swing.JFrame(), true);
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
    private javax.swing.JComboBox<String> cbRelatorio;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton pesqRel;
    private javax.swing.JTable tblClientes;
    // End of variables declaration//GEN-END:variables
}
