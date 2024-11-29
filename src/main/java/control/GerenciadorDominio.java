/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import dao.ClienteDAO;
import dao.ConexaoHibernate;
import dao.GenericDAO;
import dao.TipoServicoDAO;
import dao.VendaDAO;
import java.sql.SQLException;
import java.text.NumberFormat;
import java.util.Date;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.Cidade;
import model.Cliente;
import model.TipoServico;
import model.Venda;
import org.hibernate.HibernateException;



public class GerenciadorDominio {

    private ClienteDAO cliDAO;
    private GenericDAO genDAO;
    private TipoServicoDAO tipoServDAO;
    private VendaDAO vendaDAO;
    
    public GerenciadorDominio() throws ClassNotFoundException, SQLException {
        ConexaoHibernate.getSessionFactory();
        
        genDAO = new GenericDAO();
        cliDAO = new ClienteDAO();
        tipoServDAO = new TipoServicoDAO();
        vendaDAO = new VendaDAO();
    }
    
    public List listar(Class classe)throws SQLException, ClassNotFoundException{
        return genDAO.listar(classe);
    }
    
    //CLIENTE
    public Cliente inserirCliente(String nome, Date dtNasc, String cpf, String rua, String bairro,String complemento, String num, String cep,String telPrimario, 
                    String telSecundario, Cidade cidade) throws ClassNotFoundException, SQLException {
        
        Cliente cli = new Cliente(nome, dtNasc, cpf, rua, bairro, complemento, num, cep, telPrimario, telSecundario, cidade);
        cliDAO.inserir(cli);
        return cli;
    }
    
    public void alterarCliente(int idCliente, String nome, Date dtNasc, String cpf, String rua, String bairro,String complemento, String num, String cep,String telPrimario, 
                    String telSecundario, Cidade cidade) throws ClassNotFoundException, SQLException {
        
        Cliente cli = new Cliente(idCliente, nome, dtNasc, cpf, rua, bairro, complemento, num, cep, telPrimario, telSecundario, cidade);
        cliDAO.alterar(cli);
    }
    
    public List<Cliente> pesquisarCliente(int tipo, String pesq) throws ClassNotFoundException, SQLException{
        
        switch (tipo) {
            case 0: return cliDAO.pesquisarPorNome(pesq);
            case 1: return cliDAO.pesquisarPorCPF(pesq);
            default : return null;
        }

    }
    
    //TIPO DE SERVICO
    
    public TipoServico inserirTipoServico(String nome, double valor)  throws ClassNotFoundException, SQLException{
        
        TipoServico tipoServ =  new TipoServico(nome, valor);
        genDAO.inserir(tipoServ);
        return tipoServ;
        
    }
    
    public void alterarTipoServico(int idTipoServico, String nome, double valor)  throws ClassNotFoundException, SQLException{
        
        TipoServico tipoServ = new TipoServico(idTipoServico, nome, valor);
        genDAO.alterar(tipoServ);
        
    }
    
    public void excluir (Object obj) throws HibernateException {
        genDAO.excluir(obj);
    }
    
    public List<TipoServico> pesquisarTipoServico(int tipo, String pesq) throws ClassNotFoundException, SQLException{   
        switch (tipo) {
            case 0: return tipoServDAO.pesquisarPorNome(pesq);
            default : return null;
        }
    }
    
    //VENDA
    
    public Venda inserirVenda(Date data, String hora, String formaPag,
            double valorTotalVenda, Cliente cliente, 
            List<TipoServico> tipoServico)  throws ClassNotFoundException, SQLException{
        
        Venda venda =  new Venda(data, hora, formaPag, 
                valorTotalVenda, cliente, tipoServico);
        genDAO.inserir(venda);
        return venda;
        
    }

    public void alterarVenda(int idVenda, Date data, String hora, String formaPag, double valorTotalVenda, 
            Cliente cliente, List<TipoServico> tipoServico)  throws ClassNotFoundException, SQLException{
        
        Venda venda = new Venda(idVenda, data, hora, formaPag, valorTotalVenda, cliente, tipoServico);
        genDAO.alterar(venda);
        
    }
        
    public List<Venda> pesquisarVenda(int tipo, String pesq) throws ClassNotFoundException, SQLException{   
            switch (tipo) {
//            case 0: return vendaDAO.pesquisarPorCliente(pesq);
            case 0: return vendaDAO.pesquisarPorData(pesq);
//            case 1: return vendaDAO.pesquisarPorServico(pesq);
            case 1: return vendaDAO.pesquisarPorFormaDePagamento(pesq);
            default : return null;
        }    
    }
    
    public void relatorio(JTable tabela, int tipo) throws Exception {
        List<Object[]> lista = null;

        ((DefaultTableModel) tabela.getModel()).setRowCount(0);

        switch (tipo) {
            case 0:
                lista = cliDAO.nomeClientes();
                break;
            case 1:
                lista = vendaDAO.valorPorMes();
                break;
            case 2:
                lista = vendaDAO.valorPorCliente();
                break;
        }

        NumberFormat formato = NumberFormat.getCurrencyInstance();
     
        // Percorrer a LISTA
        if (lista != null) {

 
            for (Object[] obj : lista) {
                switch (tipo) {
                    case 'M':                       
                        obj[0] = obj[0].toString() + "/" + obj[1].toString();                        
                        obj[1] = formato.format( Double.parseDouble( obj[2].toString() ));
                        break;
                    case 'C':
                        obj[1] = formato.format( Double.parseDouble( obj[1].toString() ) );
                        break;
                        
                }

                ((DefaultTableModel) tabela.getModel()).addRow(obj);
            }

        }
    }
  
}
