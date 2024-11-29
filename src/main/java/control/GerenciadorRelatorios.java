package control;

import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.query.JRHibernateQueryExecuterFactory;
import net.sf.jasperreports.view.JasperViewer;

public class GerenciadorRelatorios {
    
    
    public void relComConexao() {
        try {
            InputStream rel = getClass().getResourceAsStream("../relatorios/relClientes.jasper");

            
            Map parametros = new HashMap();
            
            parametros.put(JRHibernateQueryExecuterFactory.PARAMETER_HIBERNATE_SESSION,
                    dao.ConexaoHibernate.getSessionFactory().openSession() );          
        
            JasperPrint print;
            print = JasperFillManager.fillReport(rel, parametros);
            
            if ( print.getPages().size() > 0 ) {
                                                
                JasperViewer jrViewer = new JasperViewer(print, true);
                jrViewer.setVisible(true);
                
            } else {
                JOptionPane.showMessageDialog(null, "Relatório de clientes vazio.");
            }
        
        }
        catch(JRException erro){
            JOptionPane.showMessageDialog(null, "ERRO ao abrir relatório de clientes. " + erro.getMessage() );
            
        }
        
    }

    public void relComLista(List lista, String nome ) {
        try {
            InputStream rel = getClass().getResourceAsStream("../relatorio/" + nome);

            Map parametros = new HashMap();
               
            JRBeanCollectionDataSource dados = new JRBeanCollectionDataSource(lista);            
            JasperPrint print;
            print = JasperFillManager.fillReport(rel, parametros, dados);
           
            if ( print.getPages().size() > 0 ) {
                                                
                JasperViewer jrViewer = new JasperViewer(print, true);
                jrViewer.setVisible(true);
                
                JDialog viewer = new JDialog(new javax.swing.JFrame(),"Visualização do Relatório", true);
                viewer.setSize(800,600);
                viewer.setLocationRelativeTo(null);
                viewer.getContentPane().add(jrViewer.getContentPane());
                viewer.setVisible(true);
                
            } else {
                JOptionPane.showMessageDialog(null, "Relatório vazio.");
            }
        
        }
        catch(JRException erro){
            JOptionPane.showMessageDialog(null, "ERRO ao abrir relatório de clientes. " + erro.getMessage() );
            
        }
        
        
        
    }
    
}
