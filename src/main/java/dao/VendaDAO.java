/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Expression;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import model.Cliente;
import model.Venda;
import org.hibernate.HibernateException;
import org.hibernate.Session;

/**
 *
 * @author thais
 */
public class VendaDAO extends GenericDAO{
    private List<Venda> pesquisar(String pesq, int tipo ) throws HibernateException  {
        List<Venda> lista = new ArrayList();
        
        Session sessao = null;
        
        try {
            sessao = ConexaoHibernate.getSessionFactory().openSession();
            sessao.beginTransaction();

            CriteriaBuilder builder = sessao.getCriteriaBuilder();
            CriteriaQuery consulta = builder.createQuery(Venda.class);
            Root tabela = consulta.from(Venda.class);
           
            
            Predicate restricoes = null;
            Expression dia = null;

            switch(tipo) {
//                case 1: restricoes = builder.like(tabela.get("nome"), pesq+"%");
//                        break;
                case 1: dia = builder.function("day", Integer.class, tabela.get("data")  );
                        restricoes = builder.equal(dia, pesq);
                        break;
//                case 2: restricoes = builder.like(tabela.get("servico"), pesq+"%");                
//                        break;
                case 2: restricoes = builder.like(tabela.get("formaPag"), "%" + pesq+"%");                
                        break;
            }            

            consulta.where(restricoes);
            
            consulta.orderBy( builder.asc(tabela.get("data") ) );
            
            dia = builder.function("day", Integer.class, tabela.get("data")  );
            consulta.orderBy( builder.desc( dia ) );
            
            lista = sessao.createQuery(consulta).getResultList();
                  
            sessao.getTransaction().commit();              
            sessao.close();
        } catch( HibernateException erro) {
            if ( sessao != null ){
                sessao.getTransaction().rollback();
                sessao.close();
            }
            throw new HibernateException(erro);
        }
        

        return lista;   
        
    }
//    
//    public List<Venda> pesquisarPorCliente (String pesq) throws HibernateException {
//        return pesquisar(pesq,1);
//        
//    }
    
    public List<Venda> pesquisarPorData (String pesq) throws HibernateException {
        return pesquisar(pesq,1);        
    }
//    
//    public List<Venda> pesquisarPorServico (String pesq) throws HibernateException {
//        return pesquisar(pesq,2);        
//    }
    
    public List<Venda> pesquisarPorFormaDePagamento (String pesq) throws HibernateException {
        return pesquisar(pesq,2);
    }
    
    public List valorPorMes() {
        List lista = null;
        Session sessao = null;
        try {
            sessao = ConexaoHibernate.getSessionFactory().openSession();
            sessao.beginTransaction();

            CriteriaBuilder builder = sessao.getCriteriaBuilder();
            CriteriaQuery consulta = builder.createQuery( Object[].class );
            
            Root tabela = consulta.from(Venda.class);
            
            Expression mes = builder.function("month", Integer.class, tabela.get("data") );
            Expression ano = builder.function("year", Integer.class, tabela.get("data") );

            consulta.multiselect(mes, ano, builder.sum(tabela.get("valorTotalVenda")));
            consulta.groupBy(mes, ano);

            consulta.orderBy( builder.desc(ano), builder.desc(mes));
            
            lista = sessao.createQuery(consulta).getResultList();            

            sessao.getTransaction().commit();
            sessao.close();
        } catch (HibernateException ex) {
            if (sessao != null ) {
                sessao.getTransaction().rollback();          
                sessao.close();
            }
            throw new HibernateException(ex);
        }
        return lista;
        
    }
    
    public List valorPorCliente() {
        List lista = null;
        Session sessao = null;
        try {
            sessao = ConexaoHibernate.getSessionFactory().openSession();
            sessao.beginTransaction();

            CriteriaBuilder builder = sessao.getCriteriaBuilder();
            CriteriaQuery consulta = builder.createQuery( Object[].class );
            
            Root tabela = consulta.from(Venda.class);
            
            consulta.multiselect( tabela.get("cliente").get("nome"), builder.sum(tabela.get("valorTotalVenda")));
            consulta.groupBy( tabela.get("cliente").get("nome") );
                        
            consulta.orderBy( builder.asc(tabela.get("cliente").get("nome") )  );
            
            lista = sessao.createQuery(consulta).getResultList();            

            sessao.getTransaction().commit();
            sessao.close();
        } catch (HibernateException ex) {
            if (sessao != null ) {
                sessao.getTransaction().rollback();          
                sessao.close();
            }
            throw new HibernateException(ex);
        }
        return lista;
        
    }
    
}
