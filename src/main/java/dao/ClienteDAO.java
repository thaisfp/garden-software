/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Expression;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import model.Cliente;
import org.hibernate.HibernateException;
import org.hibernate.Session;

/**
 *
 * @author thais
 */
public class ClienteDAO extends GenericDAO {
    
    private List<Cliente> pesquisar(String pesq, int tipo ) throws HibernateException  {
        List<Cliente> lista = new ArrayList();
        
        Session sessao = null;
        
        try {
            sessao = ConexaoHibernate.getSessionFactory().openSession();
            sessao.beginTransaction();

            //OPERAÇÕES
            CriteriaBuilder builder = sessao.getCriteriaBuilder();
            CriteriaQuery consulta = builder.createQuery(Cliente.class);
            Root tabela = consulta.from(Cliente.class);
            
            // Restrições
            Predicate restricoes = null;
            Expression mes = null;
            switch(tipo) {
                case 1: restricoes = builder.like(tabela.get("nome"), pesq+"%");
                        break;
                case 2: restricoes = builder.like(tabela.get("endereco").get("bairro"), pesq+"%");
                        break;
                case 3: restricoes = builder.like(tabela.get("cpf"), pesq);                
                        break;
                case 4: mes = builder.function("month", Integer.class, tabela.get("dtNasc")  );
                        restricoes = builder.equal(mes, pesq);
                                                            
            }            

            consulta.where(restricoes);
            
            // Ordenar por nome
            //consulta.orderBy( builder.asc(tabela.get("nome") ) );
            
            // Ordenar por mês
            mes = builder.function("month", Integer.class, tabela.get("dtNasc")  );
            consulta.orderBy( builder.desc( mes ) );
            
            // EXECUTAR
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
    
    public List<Cliente> pesquisarPorNome (String pesq) throws HibernateException {
        return pesquisar(pesq,1);
        
    }
    
    public List<Cliente> pesquisarPorBairro (String pesq) throws HibernateException {
        return pesquisar(pesq,2);        
    }
    
    public List<Cliente> pesquisarPorCPF (String pesq) throws HibernateException {
        return pesquisar(pesq,3);        
    }
    
    public List<Cliente> pesquisarPorMes (String pesq) throws HibernateException {
        return pesquisar(pesq,4);
    }
    
    
    public List contPorBairro() {
        List lista = null;
        Session sessao = null;
        try {
            sessao = ConexaoHibernate.getSessionFactory().openSession();
            sessao.beginTransaction();

            CriteriaBuilder builder = sessao.getCriteriaBuilder();
            CriteriaQuery consulta = builder.createQuery( Object[].class );
            
            Root tabela = consulta.from(Cliente.class);
            
            consulta.multiselect( tabela.get("endereco").get("bairro"), builder.count(tabela.get("idCliente")) );
            consulta.groupBy( tabela.get("idCliente"));
            
            consulta.orderBy( builder.asc(tabela.get("endereco").get("bairro") )  );
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
    
    public List nomeClientes() {
        List lista = null;
        Session sessao = null;
        try {
            sessao = ConexaoHibernate.getSessionFactory().openSession();
            sessao.beginTransaction();

            CriteriaBuilder builder = sessao.getCriteriaBuilder();
            CriteriaQuery consulta = builder.createQuery( Object[].class );
            
            Root tabela = consulta.from(Cliente.class);
            
            consulta.multiselect( tabela.get("nome"), builder.count(tabela.get("idCliente")) );
            consulta.groupBy( tabela.get("idCliente"));
            
            consulta.orderBy( builder.asc(tabela.get("nome") )  );
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

