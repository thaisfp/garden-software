/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import java.awt.Frame;
import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import model.Cliente;
import model.TipoServico;
import model.Venda;
import view.DlgCadCliente;
import view.DlgCadTipoServico;
import view.DlgListarCliente;
import view.DlgListarVendas;
import view.DlgListarTipoServico;
import view.DlgRelatorio;
import view.DlgVenda;
import view.FrmPrincipal;

/**
 *
 * @author thais
 */
public class GerenciadorInterGrafica {
    
    private FrmPrincipal frmPrinc = null;
    private DlgCadCliente cadCli = null;
    private DlgCadTipoServico cadTipoServ = null;
    private DlgListarTipoServico listaTipoServ = null;
    private DlgListarCliente listaCli = null;
    private DlgListarVendas listaVenda = null;
    private DlgVenda venda = null;

        
    private static GerenciadorInterGrafica myInstance = new GerenciadorInterGrafica();
    GerenciadorDominio gerDom;   
    GerenciadorRelatorios gerRel;  
    
    private GerenciadorInterGrafica() {
        
        try {
            gerDom = new GerenciadorDominio();
            gerRel = new GerenciadorRelatorios();

            
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(frmPrinc, "Erro de classe. " + ex.getMessage() );
            System.exit(0);
                    
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(frmPrinc, "Erro de SQL. " + ex.getMessage() );
            System.exit(0);
        }
       
    }
    
    public static GerenciadorInterGrafica getInstance() {
        return myInstance;       
    }
    
    public GerenciadorDominio getGerenciadorDominio() {
        return gerDom;       
    }
    
    public GerenciadorRelatorios getGerRelatorio() {
        return gerRel;
    }
    
    private JDialog abrirJanela(java.awt.Frame parent, JDialog dlg, Class classe) {
        if (dlg == null){     
            try {
                dlg = (JDialog) classe.getConstructor(Frame.class, boolean.class).newInstance(parent,true);
            } catch (NoSuchMethodException | SecurityException | InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException ex) {
                JOptionPane.showMessageDialog(parent, "Erro ao abrir a janela " + classe.getName() );
            } 
        }        
        dlg.setVisible(true); 
        return dlg;
    }
    
    public void abrirJanelaPrincipal() {
        if ( frmPrinc == null ) {
            frmPrinc = new FrmPrincipal();
        }
        frmPrinc.setVisible(true);
    }
   
    public void abrirCadCliente(){
        cadCli = (DlgCadCliente) abrirJanela (frmPrinc, cadCli, DlgCadCliente.class);
    }
    
    public void abrirCadTipoServico(){
        cadTipoServ = (DlgCadTipoServico) abrirJanela (frmPrinc, cadTipoServ, DlgCadTipoServico.class);
    }
    
    public Cliente abrirListarCliente(){
        listaCli = (DlgListarCliente) abrirJanela(frmPrinc, listaCli, DlgListarCliente.class  );
        return listaCli.getCliSelecionado();    
    }
    
    public TipoServico abrirListarTipoServico(){
        listaTipoServ = (DlgListarTipoServico) abrirJanela (frmPrinc, listaTipoServ, DlgListarTipoServico.class);
        return listaTipoServ.getTipoServSelecionado();
    }
    
    public Venda abrirListarVendas(){
        listaVenda = (DlgListarVendas) abrirJanela (frmPrinc, listaVenda, DlgListarVendas.class);
        return listaVenda.getVendaSelecionada();
    }
    
    public void abrirVenda(){
        venda = (DlgVenda) abrirJanela (frmPrinc, venda, DlgVenda.class);
    }
    
    public void carregarCombo(JComboBox combo, Class classe) {
        try {
            List lista = GerenciadorInterGrafica.getInstance().getGerenciadorDominio().listar(classe);
            combo.setModel( new DefaultComboBoxModel(lista.toArray() ) );
            
            
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(cadCli, "Erro ao carregar combo CIDADE. " + ex.getMessage() );
        }
        
    }
    
    public static void main(String args[]) {
        
        GerenciadorInterGrafica.getInstance().abrirJanelaPrincipal();
    }
    
}